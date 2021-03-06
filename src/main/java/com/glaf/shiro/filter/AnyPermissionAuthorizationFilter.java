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
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.glaf.shiro.filter;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.*;

/**
 * 拥有任何一个权限即可访问
 * 
 */
public class AnyPermissionAuthorizationFilter extends AuthorizationFilter {

	private static final Log logger = LogFactory
			.getLog(AnyPermissionAuthorizationFilter.class);

	public boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws IOException {

		Subject subject = getSubject(request, response);
		String[] perms = (String[]) mappedValue;

		boolean isAccessAllowed = false;
		if (perms != null && perms.length > 0) {
			for (String p : perms) {
				logger.debug("perm item:" + p);
			}
			if (perms.length == 1) {
				if (subject.isPermitted(perms[0])) {
					isAccessAllowed = true;
				}
			} else {
				for (String perm : perms) {
					if (subject.hasRole(perm)) {
						isAccessAllowed = true;
						break;
					}
					if (subject.isPermitted(perm)) {
						isAccessAllowed = true;
						break;
					}
				}
			}
		}

		return isAccessAllowed;
	}
}
