/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.glaf.base.modules.sys.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.config.BaseConfiguration;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.service.AuthorizeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.core.config.Configuration;

@Service("authorizeService")
@Transactional
public class AuthorizeServiceImpl implements AuthorizeService {
	private static final Log logger = LogFactory.getLog(AuthorizeServiceImpl.class);

	protected static Configuration conf = BaseConfiguration.create();

	protected SysUserService sysUserService;

	/**
	 * 用户登陆
	 * 
	 * @param userId
	 * @param password
	 * @return
	 */
	@Transactional
	public SysUser authorize(String userId, String password) {
		SysUser bean = sysUserService.findByAccount(userId);
		if (bean != null) {
			if (bean.getLocked() == 1) {// 帐号禁止
				return null;
			}
			if (!bean.isSystemAdministrator()) {
				/**
				 * 当登录重试次数大于系统默认的重试次数并且登录时间间隔没有达到系统默认的时间间隔，登录失败
				 */
				if (bean.getLoginRetry() > conf.getInt("login.retryCount", 10)) {
					if (bean.getLockLoginTime() != null) {
						if (System.currentTimeMillis() - bean.getLockLoginTime().getTime() < 60 * 1000
								* conf.getInt("login.retryMinutes", 30)) {
							sysUserService.loginFailure(userId);
							return null;
						}
					} else {
						return null;
					}
				}
			}
			boolean success = sysUserService.checkPassword(userId, password);
			if (!success) {// 密码不匹配
				logger.debug(userId + "密码不匹配!");
				sysUserService.loginFailure(userId);
				bean = null;
			}
		}
		return bean;
	}

	/**
	 * 用户登陆
	 * 
	 * @param userId
	 * @param pwd
	 * @return
	 */
	@Transactional
	public SysUser login(String userId) {
		SysUser bean = sysUserService.findByAccountWithAll(userId);
		if (bean != null) {
		}
		return bean;
	}

	/**
	 * 用户登陆
	 * 
	 * @param userId
	 * @param password
	 * @return
	 */
	@Transactional
	public SysUser login(String userId, String password) {
		SysUser bean = sysUserService.findByAccountWithAll(userId);
		if (bean != null) {
			if (bean.getLocked() == 1) {// 帐号禁止
				return null;
			}
			if (!bean.isSystemAdministrator()) {
				/**
				 * 当登录重试次数大于系统默认的重试次数并且登录时间间隔没有达到系统默认的时间间隔，登录失败
				 */
				if (bean.getLoginRetry() > conf.getInt("login.retryCount", 5)) {
					if (bean.getLockLoginTime() != null) {
						if (System.currentTimeMillis() - bean.getLockLoginTime().getTime() < 60 * 1000
								* conf.getInt("login.retryMinutes", 30)) {
							sysUserService.loginFailure(userId);
							return null;
						}
					}
				}
			}
			boolean success = sysUserService.checkPassword(userId, password);
			if (!success) {// 密码不匹配
				sysUserService.loginFailure(userId);
				bean = null;
			} else if (bean.getAccountType() != 1) {

			}
		}
		return bean;
	}

	@Resource
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

}