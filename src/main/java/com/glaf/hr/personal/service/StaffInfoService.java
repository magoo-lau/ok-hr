package com.glaf.hr.personal.service;

import java.util.*;
import org.springframework.transaction.annotation.Transactional;
 
import com.glaf.hr.personal.domain.*;
import com.glaf.hr.personal.query.*;

 
@Transactional(readOnly = true)
public interface StaffInfoService {

	@Transactional
	void bulkInsert(List<StaffInfo> list);
	 
         /**
	 * 根据主键删除记录
	 * 
	 * @return
	 */
	@Transactional
	void deleteById(String id);

        /**
	 * 根据主键删除多条记录
	 * 
	 * @return
	 */
	@Transactional
	 void deleteByIds(List<String> ids);

          /**
	 * 根据查询参数获取记录列表
	 * 
	 * @return
	 */
	 List<StaffInfo> list(StaffInfoQuery query);

         /**
	 * 根据查询参数获取记录总数
	 * 
	 * @return
	 */
	 int getStaffInfoCountByQueryCriteria(StaffInfoQuery query);

	/**
	 * 根据查询参数获取一页的数据
	 * 
	 * @return
	 */
	 List<StaffInfo> getStaffInfosByQueryCriteria(int start, int pageSize,
			StaffInfoQuery query) ;

         /**
	 * 根据主键获取一条记录
	 * 
	 * @return
	 */
	 StaffInfo getStaffInfo(String id);

        /**
	 * 保存一条记录
	 * 
	 * @return
	 */
	@Transactional
	 void save(StaffInfo staffInfo);

}
