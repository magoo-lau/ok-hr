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

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.base.modules.sys.mapper.IdentityTokenMapper;
import com.glaf.base.modules.sys.model.IdentityToken;
import com.glaf.base.modules.sys.query.IdentityTokenQuery;
import com.glaf.base.modules.sys.service.IdentityTokenService;
import com.glaf.core.dao.EntityDAO;
import com.glaf.core.id.IdGenerator;
import com.glaf.core.util.UUID32;

@Service("com.glaf.base.modules.sys.service.identityTokenService")
@Transactional(readOnly = true)
public class IdentityTokenServiceImpl implements IdentityTokenService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected JdbcTemplate jdbcTemplate;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected IdentityTokenMapper identityTokenMapper;

	public IdentityTokenServiceImpl() {

	}

	public int count(IdentityTokenQuery query) {
		return identityTokenMapper.getIdentityTokenCount(query);
	}

	@Transactional
	public void deleteById(String id) {
		if (id != null) {
			identityTokenMapper.deleteIdentityTokenById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<String> ids) {
		if (ids != null && !ids.isEmpty()) {
			for (String id : ids) {
				identityTokenMapper.deleteIdentityTokenById(id);
			}
		}
	}

	public IdentityToken getIdentityToken(String id) {
		if (id == null) {
			return null;
		}
		IdentityToken identityToken = identityTokenMapper.getIdentityTokenById(id);
		return identityToken;
	}

	public IdentityToken getIdentityTokenByToken(String token) {
		if (token == null) {
			return null;
		}
		IdentityToken identityToken = identityTokenMapper.getIdentityTokenByToken(token);
		return identityToken;
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getIdentityTokenCountByQueryCriteria(IdentityTokenQuery query) {
		return identityTokenMapper.getIdentityTokenCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<IdentityToken> getIdentityTokensByQueryCriteria(int start, int pageSize, IdentityTokenQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<IdentityToken> rows = sqlSessionTemplate.selectList("getIdentityTokens", query, rowBounds);
		return rows;
	}

	public List<IdentityToken> list(IdentityTokenQuery query) {
		List<IdentityToken> list = identityTokenMapper.getIdentityTokens(query);
		return list;
	}

	@Transactional
	public void save(IdentityToken identityToken) {
		if (StringUtils.isEmpty(identityToken.getId())) {
			identityToken.setId(UUID32.getUUID());
			identityToken.setCreateTime(new Date());
			identityToken.setTimeMillis(System.currentTimeMillis());
			identityTokenMapper.insertIdentityToken(identityToken);
		} else {
			IdentityToken model = identityTokenMapper.getIdentityTokenById(identityToken.getId());
			if (model == null) {
				identityToken.setCreateTime(new Date());
				identityToken.setTimeMillis(System.currentTimeMillis());
				identityTokenMapper.insertIdentityToken(identityToken);
			} else {
				identityToken.setCreateTime(new Date());
				identityToken.setTimeMillis(System.currentTimeMillis());
				identityTokenMapper.updateIdentityToken(identityToken);
			}
		}
	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
	}

	@javax.annotation.Resource(name = "com.glaf.base.modules.sys.mapper.IdentityTokenMapper")
	public void setIdentityTokenMapper(IdentityTokenMapper identityTokenMapper) {
		this.identityTokenMapper = identityTokenMapper;
	}

	@javax.annotation.Resource
	public void setIdGenerator(IdGenerator idGenerator) {
		this.idGenerator = idGenerator;
	}

	@javax.annotation.Resource
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@javax.annotation.Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
