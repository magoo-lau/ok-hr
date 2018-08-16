package com.glaf.hr.personal.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.glaf.hr.personal.domain.*;
import com.glaf.hr.personal.query.*;

/**
 * 
 * Mapper接口
 *
 */

@Component("com.glaf.hr.personal.mapper.StaffInfoMapper")
public interface StaffInfoMapper {

	void bulkInsertStaffInfo(List<StaffInfo> list);

	void bulkInsertStaffInfo_oracle(List<StaffInfo> list);

	void deleteStaffInfos(StaffInfoQuery query);

	void deleteStaffInfoById(String id);

	StaffInfo getStaffInfoById(String id);

	int getStaffInfoCount(StaffInfoQuery query);

	List<StaffInfo> getStaffInfos(StaffInfoQuery query);

	void insertStaffInfo(StaffInfo model);

	void updateStaffInfo(StaffInfo model);

}
