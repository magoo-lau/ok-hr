package com.glaf.hr.personal.service;


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

import com.glaf.hr.personal.mapper.*;
import com.glaf.hr.personal.domain.*;
import com.glaf.hr.personal.query.*;

@Service("com.glaf.hr.personal.service.staffInfoService")
@Transactional(readOnly = true) 
public class StaffInfoServiceImpl implements StaffInfoService {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
 
        protected EntityDAO entityDAO;

	protected IdGenerator idGenerator;

	protected JdbcTemplate jdbcTemplate;

	protected SqlSessionTemplate sqlSessionTemplate;

	protected StaffInfoMapper staffInfoMapper;

	public StaffInfoServiceImpl() {

	}


        @Transactional
	public void bulkInsert(List<StaffInfo> list) {
		for (StaffInfo staffInfo : list) {
		   if (StringUtils.isEmpty(staffInfo.getId())) {
			staffInfo.setId(idGenerator.getNextId("HR_STAFF_INFO"));
		   }
		}
		
		int batch_size = 50;
                List<StaffInfo> rows = new ArrayList<StaffInfo>(batch_size);

		for (StaffInfo bean : list) {
			rows.add(bean);
			if (rows.size() > 0 && rows.size() % batch_size == 0) {
				if (StringUtils.equals(DBUtils.ORACLE, DBConnectionFactory.getDatabaseType())) {
					staffInfoMapper.bulkInsertStaffInfo_oracle(rows);
				} else {
					staffInfoMapper.bulkInsertStaffInfo(rows);
				}
				rows.clear();
			}
		}

		if (rows.size() > 0) {
			if (StringUtils.equals(DBUtils.ORACLE, DBConnectionFactory.getDatabaseType())) {
				staffInfoMapper.bulkInsertStaffInfo_oracle(rows);
			} else {
				staffInfoMapper.bulkInsertStaffInfo(rows);
			}
			rows.clear();
		}
	}


	@Transactional
	public void deleteById(String id) {
	     if(id != null ){
		staffInfoMapper.deleteStaffInfoById(id);
	     }
	}

	@Transactional
	public void deleteByIds(List<String> ids) {
	    if(ids != null && !ids.isEmpty()){
		for(String id : ids){
		    staffInfoMapper.deleteStaffInfoById(id);
		}
	    }
	}

	public int count(StaffInfoQuery query) {
		return staffInfoMapper.getStaffInfoCount(query);
	}

	public List<StaffInfo> list(StaffInfoQuery query) {
		List<StaffInfo> list = staffInfoMapper.getStaffInfos(query);
		return list;
	}

    /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */     
	public int getStaffInfoCountByQueryCriteria(StaffInfoQuery query) {
		return staffInfoMapper.getStaffInfoCount(query);
	}

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	public List<StaffInfo> getStaffInfosByQueryCriteria(int start, int pageSize,
			StaffInfoQuery query) {
		RowBounds rowBounds = new RowBounds(start, pageSize);
		List<StaffInfo> rows = sqlSessionTemplate.selectList(
				"getStaffInfos", query, rowBounds);
		return rows;
	}


	public StaffInfo getStaffInfo(String id) {
	        if(id == null){
		    return null;
		}
		StaffInfo staffInfo = staffInfoMapper.getStaffInfoById(id);
		return staffInfo;
	}

	@Transactional
	public void save(StaffInfo staffInfo) {
           if (StringUtils.isEmpty(staffInfo.getId())) {
	        staffInfo.setId(UUID32.getUUID());
		//staffInfo.setCreateTime(new Date());
		//staffInfo.setDeleteFlag(0);
		staffInfoMapper.insertStaffInfo(staffInfo);
	       } else {
		staffInfoMapper.updateStaffInfo(staffInfo);
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

	@javax.annotation.Resource(name = "com.glaf.hr.personal.mapper.StaffInfoMapper")
	public void setStaffInfoMapper(StaffInfoMapper staffInfoMapper) {
		this.staffInfoMapper = staffInfoMapper;
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
