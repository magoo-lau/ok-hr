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

import java.util.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glaf.core.id.*;
import com.glaf.core.dao.*;
import com.glaf.core.jdbc.DBConnectionFactory;
import com.glaf.core.util.*;

import com.glaf.base.modules.sys.mapper.*;
import com.glaf.base.modules.sys.model.*;
import com.glaf.base.modules.sys.query.*;
import com.glaf.base.modules.sys.service.TenantConfigService;

@Service("tenantConfigService")
@Transactional(readOnly = true)
public class TenantConfigServiceImpl implements TenantConfigService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());

	protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected JdbcTemplate jdbcTemplate;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected TenantConfigMapper tenantConfigMapper;

	public TenantConfigServiceImpl() {

	}

	@Transactional
	public void bulkInsert(List<TenantConfig> list) {
		for (TenantConfig tenantConfig : list) {
			if (tenantConfig.getId() == 0) {
				tenantConfig.setId(idGenerator.nextId("SYS_TENANT_CONFIG"));
			}
		}

		int batch_size = 100;
		List<TenantConfig> rows = new ArrayList<TenantConfig>(batch_size);

		for (TenantConfig bean : list) {
			rows.add(bean);
			if (rows.size() > 0 && rows.size() % 100 == 0) {
				if (StringUtils.equals(DBUtils.ORACLE, DBConnectionFactory.getDatabaseType())) {
					tenantConfigMapper.bulkInsertTenantConfig_oracle(rows);
				} else {
					tenantConfigMapper.bulkInsertTenantConfig(rows);
				}
				rows.clear();
			}
		}

		if (rows.size() > 0) {
			if (StringUtils.equals(DBUtils.ORACLE, DBConnectionFactory.getDatabaseType())) {
				tenantConfigMapper.bulkInsertTenantConfig_oracle(rows);
			} else {
				tenantConfigMapper.bulkInsertTenantConfig(rows);
			}
			rows.clear();
		}
	}

	public int count(TenantConfigQuery query) {
		return tenantConfigMapper.getTenantConfigCount(query);
	}

	@Transactional
	public void deleteById(Long id) {
		if (id != null) {
			tenantConfigMapper.deleteTenantConfigById(id);
		}
	}

	@Transactional
	public void deleteByIds(List<Long> ids) {
		if (ids != null && !ids.isEmpty()) {
			for (Long id : ids) {
				tenantConfigMapper.deleteTenantConfigById(id);
			}
		}
	}

	public TenantConfig getTenantConfig(Long id) {
		if (id == null) {
			return null;
		}
		TenantConfig tenantConfig = tenantConfigMapper.getTenantConfigById(id);
		return tenantConfig;
	}

	public TenantConfig getTenantConfigByTenantId(String tenantId) {
		return tenantConfigMapper.getTenantConfigByTenantId(tenantId);
	}

	/**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	public int getTenantConfigCountByQueryCriteria(TenantConfigQuery query) {
		return tenantConfigMapper.getTenantConfigCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<TenantConfig> getTenantConfigsByQueryCriteria(int start, int pageSize, TenantConfigQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<TenantConfig> rows = sqlSessionTemplate.selectList("getTenantConfigs", query, rowBounds);
		return rows;
	}

	public List<TenantConfig> list(TenantConfigQuery query) {
		List<TenantConfig> list = tenantConfigMapper.getTenantConfigs(query);
		return list;
	}

	@Transactional
	public void save(TenantConfig tenantConfig) {
		if (tenantConfig.getId() == 0) {
			tenantConfig.setId(idGenerator.nextId("SYS_TENANT_CONFIG"));
			tenantConfig.setCreateTime(new Date());
			tenantConfigMapper.insertTenantConfig(tenantConfig);
		} else {
			tenantConfigMapper.updateTenantConfig(tenantConfig);
		}

	}

	@javax.annotation.Resource
	public void setEntityDAO(EntityDAO entityDAO) {
		this.entityDAO = entityDAO;
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

	@javax.annotation.Resource
	public void setTenantConfigMapper(TenantConfigMapper tenantConfigMapper) {
		this.tenantConfigMapper = tenantConfigMapper;
	}

}
