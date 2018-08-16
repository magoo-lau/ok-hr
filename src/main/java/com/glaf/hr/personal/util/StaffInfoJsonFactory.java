package com.glaf.hr.personal.util;

import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode; 
import com.glaf.core.base.*;
import com.glaf.core.util.DateUtils;
import com.glaf.hr.personal.domain.*;


/**
 * 
 * JSON工厂类
 *
 */
public class StaffInfoJsonFactory {

	public static StaffInfo jsonToObject(JSONObject jsonObject) {
            StaffInfo model = new StaffInfo();
            if (jsonObject.containsKey("id")) {
		    model.setId(jsonObject.getString("id"));
		}
		if (jsonObject.containsKey("code")) {
			model.setCode(jsonObject.getString("code"));
		}
		if (jsonObject.containsKey("name")) {
			model.setName(jsonObject.getString("name"));
		}
		if (jsonObject.containsKey("sex")) {
			model.setSex(jsonObject.getString("sex"));
		}
		if (jsonObject.containsKey("deptId")) {
			model.setDeptId(jsonObject.getString("deptId"));
		}
		if (jsonObject.containsKey("department")) {
			model.setDepartment(jsonObject.getString("department"));
		}
		if (jsonObject.containsKey("post")) {
			model.setPost(jsonObject.getString("post"));
		}
		if (jsonObject.containsKey("entryDate")) {
			model.setEntryDate(jsonObject.getDate("entryDate"));
		}
		if (jsonObject.containsKey("userId")) {
			model.setUserId(jsonObject.getString("userId"));
		}
		if (jsonObject.containsKey("staffStatus")) {
			model.setStaffStatus(jsonObject.getString("staffStatus"));
		}
		if (jsonObject.containsKey("becomerDate")) {
			model.setBecomerDate(jsonObject.getDate("becomerDate"));
		}
		if (jsonObject.containsKey("professionType")) {
			model.setProfessionType(jsonObject.getString("professionType"));
		}
		if (jsonObject.containsKey("employmentForm")) {
			model.setEmploymentForm(jsonObject.getString("employmentForm"));
		}
		if (jsonObject.containsKey("cardNo")) {
			model.setCardNo(jsonObject.getString("cardNo"));
		}
		if (jsonObject.containsKey("birthday")) {
			model.setBirthday(jsonObject.getDate("birthday"));
		}
		if (jsonObject.containsKey("age")) {
			model.setAge(jsonObject.getInteger("age"));
		}
		if (jsonObject.containsKey("nativePlace")) {
			model.setNativePlace(jsonObject.getString("nativePlace"));
		}
		if (jsonObject.containsKey("politicalStatus")) {
			model.setPoliticalStatus(jsonObject.getString("politicalStatus"));
		}
		if (jsonObject.containsKey("nation")) {
			model.setNation(jsonObject.getString("nation"));
		}
		if (jsonObject.containsKey("maritalStatus")) {
			model.setMaritalStatus(jsonObject.getString("maritalStatus"));
		}
		if (jsonObject.containsKey("registeredResidence")) {
			model.setRegisteredResidence(jsonObject.getString("registeredResidence"));
		}
		if (jsonObject.containsKey("cardNoExpire")) {
			model.setCardNoExpire(jsonObject.getString("cardNoExpire"));
		}
		if (jsonObject.containsKey("mobileTelphone")) {
			model.setMobileTelphone(jsonObject.getString("mobileTelphone"));
		}
		if (jsonObject.containsKey("email")) {
			model.setEmail(jsonObject.getString("email"));
		}
		if (jsonObject.containsKey("homeAddress")) {
			model.setHomeAddress(jsonObject.getString("homeAddress"));
		}
		if (jsonObject.containsKey("educationalBackground")) {
			model.setEducationalBackground(jsonObject.getString("educationalBackground"));
		}
		if (jsonObject.containsKey("degree")) {
			model.setDegree(jsonObject.getString("degree"));
		}
		if (jsonObject.containsKey("graduateInstitutions")) {
			model.setGraduateInstitutions(jsonObject.getString("graduateInstitutions"));
		}
		if (jsonObject.containsKey("profession")) {
			model.setProfession(jsonObject.getString("profession"));
		}
		if (jsonObject.containsKey("graduationTime")) {
			model.setGraduationTime(jsonObject.getDate("graduationTime"));
		}
		if (jsonObject.containsKey("foreignLanguage")) {
			model.setForeignLanguage(jsonObject.getString("foreignLanguage"));
		}
		if (jsonObject.containsKey("technicalTitle")) {
			model.setTechnicalTitle(jsonObject.getString("technicalTitle"));
		}
		if (jsonObject.containsKey("educationalExperience")) {
			model.setEducationalExperience(jsonObject.getString("educationalExperience"));
		}
		if (jsonObject.containsKey("workExperience")) {
			model.setWorkExperience(jsonObject.getString("workExperience"));
		}
		if (jsonObject.containsKey("tenantId")) {
			model.setTenantId(jsonObject.getString("tenantId"));
		}
		if (jsonObject.containsKey("tenantName")) {
			model.setTenantName(jsonObject.getString("tenantName"));
		}
		if (jsonObject.containsKey("deleteFlag")) {
			model.setDeleteFlag(jsonObject.getInteger("deleteFlag"));
		}
		if (jsonObject.containsKey("topid")) {
			model.setTopid(jsonObject.getString("topid"));
		}
		if (jsonObject.containsKey("parentId")) {
			model.setParentId(jsonObject.getLong("parentId"));
		}
		if (jsonObject.containsKey("treeId")) {
			model.setTreeId(jsonObject.getString("treeId"));
		}
		if (jsonObject.containsKey("indexId")) {
			model.setIndexId(jsonObject.getLong("indexId"));
		}
		if (jsonObject.containsKey("listno")) {
			model.setListno(jsonObject.getLong("listno"));
		}
		if (jsonObject.containsKey("createdate")) {
			model.setCreatedate(jsonObject.getDate("createdate"));
		}
		if (jsonObject.containsKey("updatedate")) {
			model.setUpdatedate(jsonObject.getDate("updatedate"));
		}
		if (jsonObject.containsKey("lessessid")) {
			model.setLessessid(jsonObject.getString("lessessid"));
		}
		if (jsonObject.containsKey("creater")) {
			model.setCreater(jsonObject.getString("creater"));
		}
		if (jsonObject.containsKey("updater")) {
			model.setUpdater(jsonObject.getString("updater"));
		}

            return model;
	}

	public static JSONObject toJsonObject(StaffInfo model) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
		if (model.getCode() != null) {
			jsonObject.put("code", model.getCode());
		} 
		if (model.getName() != null) {
			jsonObject.put("name", model.getName());
		} 
		if (model.getSex() != null) {
			jsonObject.put("sex", model.getSex());
		} 
		if (model.getDeptId() != null) {
			jsonObject.put("deptId", model.getDeptId());
		} 
		if (model.getDepartment() != null) {
			jsonObject.put("department", model.getDepartment());
		} 
		if (model.getPost() != null) {
			jsonObject.put("post", model.getPost());
		} 
                if (model.getEntryDate() != null) {
                      jsonObject.put("entryDate", DateUtils.getDate(model.getEntryDate()));
		      jsonObject.put("entryDate_date", DateUtils.getDate(model.getEntryDate()));
		      jsonObject.put("entryDate_datetime", DateUtils.getDateTime(model.getEntryDate()));
                }
		if (model.getUserId() != null) {
			jsonObject.put("userId", model.getUserId());
		} 
		if (model.getStaffStatus() != null) {
			jsonObject.put("staffStatus", model.getStaffStatus());
		} 
                if (model.getBecomerDate() != null) {
                      jsonObject.put("becomerDate", DateUtils.getDate(model.getBecomerDate()));
		      jsonObject.put("becomerDate_date", DateUtils.getDate(model.getBecomerDate()));
		      jsonObject.put("becomerDate_datetime", DateUtils.getDateTime(model.getBecomerDate()));
                }
		if (model.getProfessionType() != null) {
			jsonObject.put("professionType", model.getProfessionType());
		} 
		if (model.getEmploymentForm() != null) {
			jsonObject.put("employmentForm", model.getEmploymentForm());
		} 
		if (model.getCardNo() != null) {
			jsonObject.put("cardNo", model.getCardNo());
		} 
                if (model.getBirthday() != null) {
                      jsonObject.put("birthday", DateUtils.getDate(model.getBirthday()));
		      jsonObject.put("birthday_date", DateUtils.getDate(model.getBirthday()));
		      jsonObject.put("birthday_datetime", DateUtils.getDateTime(model.getBirthday()));
                }
        jsonObject.put("age", model.getAge());
		if (model.getNativePlace() != null) {
			jsonObject.put("nativePlace", model.getNativePlace());
		} 
		if (model.getPoliticalStatus() != null) {
			jsonObject.put("politicalStatus", model.getPoliticalStatus());
		} 
		if (model.getNation() != null) {
			jsonObject.put("nation", model.getNation());
		} 
		if (model.getMaritalStatus() != null) {
			jsonObject.put("maritalStatus", model.getMaritalStatus());
		} 
		if (model.getRegisteredResidence() != null) {
			jsonObject.put("registeredResidence", model.getRegisteredResidence());
		} 
		if (model.getCardNoExpire() != null) {
			jsonObject.put("cardNoExpire", model.getCardNoExpire());
		} 
		if (model.getMobileTelphone() != null) {
			jsonObject.put("mobileTelphone", model.getMobileTelphone());
		} 
		if (model.getEmail() != null) {
			jsonObject.put("email", model.getEmail());
		} 
		if (model.getHomeAddress() != null) {
			jsonObject.put("homeAddress", model.getHomeAddress());
		} 
		if (model.getEducationalBackground() != null) {
			jsonObject.put("educationalBackground", model.getEducationalBackground());
		} 
		if (model.getDegree() != null) {
			jsonObject.put("degree", model.getDegree());
		} 
		if (model.getGraduateInstitutions() != null) {
			jsonObject.put("graduateInstitutions", model.getGraduateInstitutions());
		} 
		if (model.getProfession() != null) {
			jsonObject.put("profession", model.getProfession());
		} 
                if (model.getGraduationTime() != null) {
                      jsonObject.put("graduationTime", DateUtils.getDate(model.getGraduationTime()));
		      jsonObject.put("graduationTime_date", DateUtils.getDate(model.getGraduationTime()));
		      jsonObject.put("graduationTime_datetime", DateUtils.getDateTime(model.getGraduationTime()));
                }
		if (model.getForeignLanguage() != null) {
			jsonObject.put("foreignLanguage", model.getForeignLanguage());
		} 
		if (model.getTechnicalTitle() != null) {
			jsonObject.put("technicalTitle", model.getTechnicalTitle());
		} 
		if (model.getEducationalExperience() != null) {
			jsonObject.put("educationalExperience", model.getEducationalExperience());
		} 
		if (model.getWorkExperience() != null) {
			jsonObject.put("workExperience", model.getWorkExperience());
		} 
		if (model.getTenantId() != null) {
			jsonObject.put("tenantId", model.getTenantId());
		} 
		if (model.getTenantName() != null) {
			jsonObject.put("tenantName", model.getTenantName());
		} 
        jsonObject.put("deleteFlag", model.getDeleteFlag());
		if (model.getTopid() != null) {
			jsonObject.put("topid", model.getTopid());
		} 
        jsonObject.put("parentId", model.getParentId());
		if (model.getTreeId() != null) {
			jsonObject.put("treeId", model.getTreeId());
		} 
        jsonObject.put("indexId", model.getIndexId());
        jsonObject.put("listno", model.getListno());
                if (model.getCreatedate() != null) {
                      jsonObject.put("createdate", DateUtils.getDate(model.getCreatedate()));
		      jsonObject.put("createdate_date", DateUtils.getDate(model.getCreatedate()));
		      jsonObject.put("createdate_datetime", DateUtils.getDateTime(model.getCreatedate()));
                }
                if (model.getUpdatedate() != null) {
                      jsonObject.put("updatedate", DateUtils.getDate(model.getUpdatedate()));
		      jsonObject.put("updatedate_date", DateUtils.getDate(model.getUpdatedate()));
		      jsonObject.put("updatedate_datetime", DateUtils.getDateTime(model.getUpdatedate()));
                }
		if (model.getLessessid() != null) {
			jsonObject.put("lessessid", model.getLessessid());
		} 
		if (model.getCreater() != null) {
			jsonObject.put("creater", model.getCreater());
		} 
		if (model.getUpdater() != null) {
			jsonObject.put("updater", model.getUpdater());
		} 
		return jsonObject;
	}


	public static ObjectNode toObjectNode(StaffInfo model){
                ObjectNode jsonObject = new ObjectMapper().createObjectNode();
		jsonObject.put("id", model.getId());
		jsonObject.put("_id_", model.getId());
		jsonObject.put("_oid_", model.getId());
                if (model.getCode() != null) {
                     jsonObject.put("code", model.getCode());
                } 
                if (model.getName() != null) {
                     jsonObject.put("name", model.getName());
                } 
                if (model.getSex() != null) {
                     jsonObject.put("sex", model.getSex());
                } 
                if (model.getDeptId() != null) {
                     jsonObject.put("deptId", model.getDeptId());
                } 
                if (model.getDepartment() != null) {
                     jsonObject.put("department", model.getDepartment());
                } 
                if (model.getPost() != null) {
                     jsonObject.put("post", model.getPost());
                } 
                if (model.getEntryDate() != null) {
                      jsonObject.put("entryDate", DateUtils.getDate(model.getEntryDate()));
		      jsonObject.put("entryDate_date", DateUtils.getDate(model.getEntryDate()));
		      jsonObject.put("entryDate_datetime", DateUtils.getDateTime(model.getEntryDate()));
                }
                if (model.getUserId() != null) {
                     jsonObject.put("userId", model.getUserId());
                } 
                if (model.getStaffStatus() != null) {
                     jsonObject.put("staffStatus", model.getStaffStatus());
                } 
                if (model.getBecomerDate() != null) {
                      jsonObject.put("becomerDate", DateUtils.getDate(model.getBecomerDate()));
		      jsonObject.put("becomerDate_date", DateUtils.getDate(model.getBecomerDate()));
		      jsonObject.put("becomerDate_datetime", DateUtils.getDateTime(model.getBecomerDate()));
                }
                if (model.getProfessionType() != null) {
                     jsonObject.put("professionType", model.getProfessionType());
                } 
                if (model.getEmploymentForm() != null) {
                     jsonObject.put("employmentForm", model.getEmploymentForm());
                } 
                if (model.getCardNo() != null) {
                     jsonObject.put("cardNo", model.getCardNo());
                } 
                if (model.getBirthday() != null) {
                      jsonObject.put("birthday", DateUtils.getDate(model.getBirthday()));
		      jsonObject.put("birthday_date", DateUtils.getDate(model.getBirthday()));
		      jsonObject.put("birthday_datetime", DateUtils.getDateTime(model.getBirthday()));
                }
                jsonObject.put("age", model.getAge());
                if (model.getNativePlace() != null) {
                     jsonObject.put("nativePlace", model.getNativePlace());
                } 
                if (model.getPoliticalStatus() != null) {
                     jsonObject.put("politicalStatus", model.getPoliticalStatus());
                } 
                if (model.getNation() != null) {
                     jsonObject.put("nation", model.getNation());
                } 
                if (model.getMaritalStatus() != null) {
                     jsonObject.put("maritalStatus", model.getMaritalStatus());
                } 
                if (model.getRegisteredResidence() != null) {
                     jsonObject.put("registeredResidence", model.getRegisteredResidence());
                } 
                if (model.getCardNoExpire() != null) {
                     jsonObject.put("cardNoExpire", model.getCardNoExpire());
                } 
                if (model.getMobileTelphone() != null) {
                     jsonObject.put("mobileTelphone", model.getMobileTelphone());
                } 
                if (model.getEmail() != null) {
                     jsonObject.put("email", model.getEmail());
                } 
                if (model.getHomeAddress() != null) {
                     jsonObject.put("homeAddress", model.getHomeAddress());
                } 
                if (model.getEducationalBackground() != null) {
                     jsonObject.put("educationalBackground", model.getEducationalBackground());
                } 
                if (model.getDegree() != null) {
                     jsonObject.put("degree", model.getDegree());
                } 
                if (model.getGraduateInstitutions() != null) {
                     jsonObject.put("graduateInstitutions", model.getGraduateInstitutions());
                } 
                if (model.getProfession() != null) {
                     jsonObject.put("profession", model.getProfession());
                } 
                if (model.getGraduationTime() != null) {
                      jsonObject.put("graduationTime", DateUtils.getDate(model.getGraduationTime()));
		      jsonObject.put("graduationTime_date", DateUtils.getDate(model.getGraduationTime()));
		      jsonObject.put("graduationTime_datetime", DateUtils.getDateTime(model.getGraduationTime()));
                }
                if (model.getForeignLanguage() != null) {
                     jsonObject.put("foreignLanguage", model.getForeignLanguage());
                } 
                if (model.getTechnicalTitle() != null) {
                     jsonObject.put("technicalTitle", model.getTechnicalTitle());
                } 
                if (model.getEducationalExperience() != null) {
                     jsonObject.put("educationalExperience", model.getEducationalExperience());
                } 
                if (model.getWorkExperience() != null) {
                     jsonObject.put("workExperience", model.getWorkExperience());
                } 
                if (model.getTenantId() != null) {
                     jsonObject.put("tenantId", model.getTenantId());
                } 
                if (model.getTenantName() != null) {
                     jsonObject.put("tenantName", model.getTenantName());
                } 
                jsonObject.put("deleteFlag", model.getDeleteFlag());
                if (model.getTopid() != null) {
                     jsonObject.put("topid", model.getTopid());
                } 
                jsonObject.put("parentId", model.getParentId());
                if (model.getTreeId() != null) {
                     jsonObject.put("treeId", model.getTreeId());
                } 
                jsonObject.put("indexId", model.getIndexId());
                jsonObject.put("listno", model.getListno());
                if (model.getCreatedate() != null) {
                      jsonObject.put("createdate", DateUtils.getDate(model.getCreatedate()));
		      jsonObject.put("createdate_date", DateUtils.getDate(model.getCreatedate()));
		      jsonObject.put("createdate_datetime", DateUtils.getDateTime(model.getCreatedate()));
                }
                if (model.getUpdatedate() != null) {
                      jsonObject.put("updatedate", DateUtils.getDate(model.getUpdatedate()));
		      jsonObject.put("updatedate_date", DateUtils.getDate(model.getUpdatedate()));
		      jsonObject.put("updatedate_datetime", DateUtils.getDateTime(model.getUpdatedate()));
                }
                if (model.getLessessid() != null) {
                     jsonObject.put("lessessid", model.getLessessid());
                } 
                if (model.getCreater() != null) {
                     jsonObject.put("creater", model.getCreater());
                } 
                if (model.getUpdater() != null) {
                     jsonObject.put("updater", model.getUpdater());
                } 
                return jsonObject;
	}

	
	public static JSONArray listToArray(java.util.List<StaffInfo> list) {
		JSONArray array = new JSONArray();
		if (list != null && !list.isEmpty()) {
			for (StaffInfo model : list) {
				JSONObject jsonObject = model.toJsonObject();
				array.add(jsonObject);
			}
		}
		return array;
	}

	public static java.util.List<StaffInfo> arrayToList(JSONArray array) {
		java.util.List<StaffInfo> list = new java.util.ArrayList<StaffInfo>();
		for (int i = 0, len = array.size(); i < len; i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			StaffInfo model = jsonToObject(jsonObject);
			list.add(model);
		}
		return list;
	}


	private StaffInfoJsonFactory() {

	}

}
