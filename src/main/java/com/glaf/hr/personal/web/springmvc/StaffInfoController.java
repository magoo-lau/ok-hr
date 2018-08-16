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

package com.glaf.hr.personal.web.springmvc;

import java.io.IOException;
import java.util.*;
 
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.alibaba.fastjson.*;
 
import com.glaf.core.config.ViewProperties;
import com.glaf.core.identity.*;
import com.glaf.core.security.*;
import com.glaf.core.util.*;
 
import com.glaf.hr.personal.domain.*;
import com.glaf.hr.personal.query.*;
import com.glaf.hr.personal.service.*;
import com.glaf.hr.personal.util.*;

/**
 * 
 * SpringMVC控制器
 *
 */

@Controller("/hr/staffInfo")
@RequestMapping("/hr/staffInfo")
public class StaffInfoController {
	protected static final Log logger = LogFactory.getLog(StaffInfoController.class);

	protected StaffInfoService staffInfoService;

	public StaffInfoController() {

	}

        @javax.annotation.Resource(name = "com.glaf.hr.personal.service.staffInfoService")
	public void setStaffInfoService(StaffInfoService staffInfoService) {
		this.staffInfoService = staffInfoService;
	}

 

        @ResponseBody
	@RequestMapping("/saveStaffInfo")
	public byte[] saveStaffInfo(HttpServletRequest request) { 
	        LoginContext loginContext = RequestUtils.getLoginContext(request);
		    String actorId =  loginContext.getActorId();
	        Map<String, Object> params = RequestUtils.getParameterMap(request);
		StaffInfo staffInfo = new StaffInfo();
		try {
		    Tools.populate(staffInfo, params);
                    staffInfo.setCode(request.getParameter("code"));
                    staffInfo.setName(request.getParameter("name"));
                    staffInfo.setSex(request.getParameter("sex"));
                    staffInfo.setDeptId(request.getParameter("deptId"));
                    staffInfo.setDepartment(request.getParameter("department"));
                    staffInfo.setPost(request.getParameter("post"));
                    staffInfo.setEntryDate(RequestUtils.getDate(request, "entryDate"));
                    staffInfo.setUserId(request.getParameter("userId"));
                    staffInfo.setStaffStatus(request.getParameter("staffStatus"));
                    staffInfo.setBecomerDate(RequestUtils.getDate(request, "becomerDate"));
                    staffInfo.setProfessionType(request.getParameter("professionType"));
                    staffInfo.setEmploymentForm(request.getParameter("employmentForm"));
                    staffInfo.setCardNo(request.getParameter("cardNo"));
                    staffInfo.setBirthday(RequestUtils.getDate(request, "birthday"));
                    staffInfo.setAge(RequestUtils.getInt(request, "age"));
                    staffInfo.setNativePlace(request.getParameter("nativePlace"));
                    staffInfo.setPoliticalStatus(request.getParameter("politicalStatus"));
                    staffInfo.setNation(request.getParameter("nation"));
                    staffInfo.setMaritalStatus(request.getParameter("maritalStatus"));
                    staffInfo.setRegisteredResidence(request.getParameter("registeredResidence"));
                    staffInfo.setCardNoExpire(request.getParameter("cardNoExpire"));
                    staffInfo.setMobileTelphone(request.getParameter("mobileTelphone"));
                    staffInfo.setEmail(request.getParameter("email"));
                    staffInfo.setHomeAddress(request.getParameter("homeAddress"));
                    staffInfo.setEducationalBackground(request.getParameter("educationalBackground"));
                    staffInfo.setDegree(request.getParameter("degree"));
                    staffInfo.setGraduateInstitutions(request.getParameter("graduateInstitutions"));
                    staffInfo.setProfession(request.getParameter("profession"));
                    staffInfo.setGraduationTime(RequestUtils.getDate(request, "graduationTime"));
                    staffInfo.setForeignLanguage(request.getParameter("foreignLanguage"));
                    staffInfo.setTechnicalTitle(request.getParameter("technicalTitle"));
                    staffInfo.setEducationalExperience(request.getParameter("educationalExperience"));
                    staffInfo.setWorkExperience(request.getParameter("workExperience"));
                    staffInfo.setTenantId(request.getParameter("tenantId"));
                    staffInfo.setTenantName(request.getParameter("tenantName"));
                    staffInfo.setDeleteFlag(RequestUtils.getInt(request, "deleteFlag"));
                    staffInfo.setTopid(request.getParameter("topid"));
                    staffInfo.setParentId(RequestUtils.getLong(request, "parentId"));
                    staffInfo.setTreeId(request.getParameter("treeId"));
                    staffInfo.setIndexId(RequestUtils.getLong(request, "indexId"));
                    staffInfo.setListno(RequestUtils.getLong(request, "listno"));
                    staffInfo.setCreatedate(RequestUtils.getDate(request, "createdate"));
                    staffInfo.setUpdatedate(RequestUtils.getDate(request, "updatedate"));
                    staffInfo.setLessessid(request.getParameter("lessessid"));
                    staffInfo.setCreater(request.getParameter("creater"));
                    staffInfo.setUpdater(request.getParameter("updater"));
		    //staffInfo.setCreateBy(actorId);
			//staffInfo.setUpdateBy(actorId);
			//staffInfo.setTenantId(loginContext.getTenantId());

		    this.staffInfoService.save(staffInfo);

		    return ResponseUtils.responseJsonResult(true);
		} catch (Exception ex) {
		    ex.printStackTrace();
		    logger.error(ex);
		}
		return ResponseUtils.responseJsonResult(false);
	}


 

    @ResponseBody
    @RequestMapping("/delete")
	public byte[] delete(HttpServletRequest request, ModelMap modelMap) {
		LoginContext loginContext = RequestUtils.getLoginContext(request);
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		String id = RequestUtils.getString(request, "id");
		String ids = request.getParameter("ids");
		if (StringUtils.isNotEmpty(ids)) {
			StringTokenizer token = new StringTokenizer(ids, ",");
			while (token.hasMoreTokens()) {
				String x = token.nextToken();
				if (StringUtils.isNotEmpty(x)) {
					StaffInfo staffInfo = staffInfoService.getStaffInfo(String.valueOf(x));
					if (staffInfo != null && (StringUtils.equals(staffInfo.getCreater(), loginContext.getActorId()) || loginContext.isSystemAdministrator())) {
						staffInfo.setDeleteFlag(1);
						staffInfoService.save(staffInfo);
					}
				}
			}
		     return ResponseUtils.responseResult(true);
		} else if (id != null) {
			StaffInfo staffInfo = staffInfoService
					.getStaffInfo(String.valueOf(id));
			if (staffInfo != null && ( StringUtils.equals(staffInfo.getCreater(), loginContext.getActorId()) || loginContext.isSystemAdministrator())) {
				staffInfo.setDeleteFlag(1);
				staffInfoService.save(staffInfo);
				return ResponseUtils.responseResult(true);
			}
		}
		return ResponseUtils.responseResult(false);
	}

    
        @RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request, ModelMap modelMap) {
		LoginContext loginContext = RequestUtils.getLoginContext(request);
		String actorId =  loginContext.getActorId();
		RequestUtils.setRequestParameterToAttribute(request);
		 
		Map<String, Object> params = RequestUtils.getParameterMap(request);
                StaffInfo staffInfo = staffInfoService.getStaffInfo(request.getParameter("id"));
		if(staffInfo != null) {
		    request.setAttribute("staffInfo", staffInfo);
		}
	

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		String x_view = ViewProperties.getString("staffInfo.edit");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		return new ModelAndView("/hr/staffInfo/edit", modelMap);
	}

        @RequestMapping("/query")
	public ModelAndView query(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}
		String x_view = ViewProperties.getString("staffInfo.query");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}
		return new ModelAndView("/hr/staffInfo/query", modelMap);
	}

	@RequestMapping("/json")
	@ResponseBody
	public byte[] json(HttpServletRequest request, ModelMap modelMap) throws IOException {
	        LoginContext loginContext = RequestUtils.getLoginContext(request);
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		StaffInfoQuery query = new StaffInfoQuery();
		Tools.populate(query, params);
		query.deleteFlag(0);
		query.setActorId(loginContext.getActorId());
		query.setLoginContext(loginContext);
		
        if (!loginContext.isSystemAdministrator()) {
			query.tenantId(loginContext.getTenantId());
		}

		int start = 0;
		int limit = 10;
		String orderName = null;
		String order = null;
	 
		int pageNo = ParamUtils.getInt(params, "page");
		limit = ParamUtils.getInt(params, "rows");
		start = (pageNo - 1) * limit;
		orderName = ParamUtils.getString(params, "sortName");
		order = ParamUtils.getString(params, "sortOrder");
		 

		if (start < 0) {
			start = 0;
		}

		if (limit <= 0) {
			limit = Paging.DEFAULT_PAGE_SIZE;
		}

		JSONObject result = new JSONObject();
		int total = staffInfoService.getStaffInfoCountByQueryCriteria(query);
		if (total > 0) {
			result.put("total", total);
			result.put("totalCount", total);
			result.put("totalRecords", total);
			result.put("start", start);
			result.put("startIndex", start);
			result.put("limit", limit);
			result.put("pageSize", limit);

            if (StringUtils.isNotEmpty(orderName)) {
				query.setSortOrder(orderName);
				if (StringUtils.equals(order, "desc")) {
					query.setSortOrder(" desc ");
				}
			}

			Map<String, User> userMap = IdentityFactory.getUserMap();
			List<StaffInfo> list = staffInfoService.getStaffInfosByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();
				 
				result.put("rows", rowsJSON);
				 
				for (StaffInfo staffInfo : list) {
					JSONObject rowJSON = staffInfo.toJsonObject();
					rowJSON.put("id", staffInfo.getId());
					rowJSON.put("rowId", staffInfo.getId());
					rowJSON.put("staffInfoId", staffInfo.getId());
                    rowJSON.put("startIndex", ++start);
 					rowsJSON.add(rowJSON);
				}

			}
		} else {
			JSONArray rowsJSON = new JSONArray();
			result.put("rows", rowsJSON);
			result.put("total", total);
		}
		return result.toJSONString().getBytes("UTF-8");
	}


        @RequestMapping 
	public ModelAndView list(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}
 

		return new ModelAndView("/hr/staffInfo/list", modelMap);
	}

}
