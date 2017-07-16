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

package com.glaf.base.modules.sys.web.springmvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.glaf.base.modules.sys.model.SysTree;
import com.glaf.base.modules.sys.model.SysUser;
import com.glaf.base.modules.sys.model.TreePermission;
import com.glaf.base.modules.sys.query.SysUserQuery;
import com.glaf.base.modules.sys.query.TreePermissionQuery;
import com.glaf.base.modules.sys.service.SysTreeService;
import com.glaf.base.modules.sys.service.SysUserService;
import com.glaf.base.modules.sys.service.TreePermissionService;
import com.glaf.core.base.BaseTree;
import com.glaf.core.base.TreeModel;
import com.glaf.core.config.ViewProperties;
import com.glaf.core.identity.User;
import com.glaf.core.tree.helper.JacksonTreeHelper;
import com.glaf.core.util.PageResult;
import com.glaf.core.util.ParamUtils;
import com.glaf.core.util.RequestUtils;
import com.glaf.core.util.ResponseUtils;
import com.glaf.core.util.StringTools;
import com.glaf.core.util.Tools;

/**
 * 
 * SpringMVC控制器
 *
 */

@Controller("/sys/treePermission")
@RequestMapping("/sys/treePermission")
public class TreePermissionController {
	protected static final Log logger = LogFactory.getLog(TreePermissionController.class);

	protected TreePermissionService treePermissionService;

	protected SysTreeService sysTreeService;

	protected SysUserService sysUserService;

	public TreePermissionController() {

	}

	/**
	 * 显示授权页面
	 * 
	 * @param request
	 * @param modelMap
	 * @return
	 */
	@RequestMapping("/privilege")
	public ModelAndView privilege(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);
		String userId = request.getParameter("userId");
		SysUser user = sysUserService.findById(userId);
		request.setAttribute("user", user);
		return new ModelAndView("/sys/treePermission/privilege", modelMap);
	}

	@ResponseBody
	@RequestMapping("/saveTreePermission")
	public byte[] saveTreePermission(HttpServletRequest request) {
		User user = RequestUtils.getUser(request);
		String actorId = user.getActorId();
		String userId = request.getParameter("userId");
		String privilege = request.getParameter("privilege");
		String objectIds = request.getParameter("nodeIds");

		if (StringUtils.isNotEmpty(userId)) {
			try {
				List<TreePermission> treePermissions = new ArrayList<TreePermission>();
				List<Long> nodeIds = StringTools.splitToLong(objectIds);
				for (Long nodeId : nodeIds) {
					TreePermission p = new TreePermission();
					p.setNodeId(nodeId);
					p.setPrivilege(privilege);
					p.setUserId(userId);
					p.setCreateBy(actorId);
					treePermissions.add(p);
				}
				treePermissionService.saveAll(userId, privilege, treePermissions);
				return ResponseUtils.responseJsonResult(true);
			} catch (Exception ex) {
				ex.printStackTrace();
				logger.error(ex);
			}
		}
		return ResponseUtils.responseJsonResult(false);
	}

	@javax.annotation.Resource
	public void setSysTreeService(SysTreeService sysTreeService) {
		this.sysTreeService = sysTreeService;
	}

	@javax.annotation.Resource
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}

	@javax.annotation.Resource
	public void setTreePermissionService(TreePermissionService treePermissionService) {
		this.treePermissionService = treePermissionService;
	}

	@ResponseBody
	@RequestMapping("/treeJson")
	public byte[] treeJson(HttpServletRequest request, HttpServletResponse response) throws IOException {
		logger.debug("------------------------treeJson--------------------");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		RequestUtils.setRequestParameterToAttribute(request);
		List<Long> selected = new ArrayList<Long>();

		SysTree root = null;
		long parentId = RequestUtils.getLong(request, "parentId");
		String nodeCode = request.getParameter("nodeCode");
		if (StringUtils.isNotEmpty(nodeCode)) {
			root = sysTreeService.getSysTreeByCode(nodeCode);
		} else if (parentId > 0) {
			root = sysTreeService.findById(parentId);
		}

		String userId = request.getParameter("userId");
		TreePermissionQuery query = new TreePermissionQuery();
		query.userId(userId);
		List<TreePermission> perms = treePermissionService.list(query);
		if (perms != null && !perms.isEmpty()) {
			for (TreePermission p : perms) {
				selected.add(p.getNodeId());
			}
		}

		List<SysTree> trees = null;
		if (root != null) {
			trees = sysTreeService.getSysTreeListWithChildren(root.getId());
		} else {
			trees = sysTreeService.getAllSysTreeList();
		}

		List<TreeModel> treeModels = new ArrayList<TreeModel>();
		if (trees != null && !trees.isEmpty()) {
			for (SysTree t : trees) {
				TreeModel tree = new BaseTree();
				tree.setId(t.getId());
				tree.setParentId(t.getParentId());
				tree.setName(t.getName());
				tree.setTreeId(t.getTreeId());
				tree.setIcon(t.getIcon());
				tree.setIconCls(t.getIcon());
				tree.setDiscriminator(t.getDiscriminator());
				tree.setCode(t.getCode());
				tree.setSortNo(t.getSort());
				tree.setLevel(t.getLevel());
				Map<String, Object> dataMap = new HashMap<String, Object>();
				String url = t.getUrl();
				if (StringUtils.isNotEmpty(url)) {
					if (!(url.toLowerCase().startsWith("http://") || url.toLowerCase().startsWith("https://"))) {
						if (url.startsWith("/")) {
							url = request.getContextPath() + url;
						} else {
							url = request.getContextPath() + "/" + url;
						}
					}
					if (url.indexOf("?") != -1) {
						url = url + "&time=" + System.currentTimeMillis();
					} else {
						url = url + "?time=" + System.currentTimeMillis();
					}
				}
				dataMap.put("url", url);
				if (selected.contains(t.getId())) {
					tree.setChecked(true);
					dataMap.put("checked", true);
				} else {
					dataMap.put("checked", false);
				}
				tree.setDataMap(dataMap);

				treeModels.add(tree);
			}
		}

		JacksonTreeHelper treeHelper = new JacksonTreeHelper();
		ArrayNode responseJSON = treeHelper.getTreeArrayNode(treeModels);
		try {
			return responseJSON.toString().getBytes("UTF-8");
		} catch (IOException e) {
			return responseJSON.toString().getBytes();
		}

	}

	@RequestMapping("/userjson")
	@ResponseBody
	public byte[] userjson(HttpServletRequest request) throws IOException {
		Map<String, Object> params = RequestUtils.getParameterMap(request);
		SysUserQuery query = new SysUserQuery();
		Tools.populate(query, params);
		query.setDeleteFlag(0);
		query.setUserType(0);

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
			limit = PageResult.DEFAULT_PAGE_SIZE;
		}

		JSONObject result = new JSONObject();
		int total = sysUserService.getSysUserCountByQueryCriteria(query);
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

			List<SysUser> list = sysUserService.getSysUsersByQueryCriteria(start, limit, query);

			if (list != null && !list.isEmpty()) {
				JSONArray rowsJSON = new JSONArray();

				result.put("rows", rowsJSON);

				for (SysUser sysUser : list) {
					JSONObject rowJSON = sysUser.toJsonObject();
					rowJSON.put("id", sysUser.getId());
					rowJSON.put("userId", sysUser.getUserId());
					rowJSON.put("startIndex", ++start);
					rowJSON.remove("token");
					rowsJSON.add(rowJSON);
				}

			}
		} else {
			result.put("total", total);
			result.put("totalCount", total);
			JSONArray rowsJSON = new JSONArray();
			result.put("rows", rowsJSON);
		}
		return result.toString().getBytes("UTF-8");
	}

	@RequestMapping("/userlist")
	public ModelAndView userlist(HttpServletRequest request, ModelMap modelMap) {
		RequestUtils.setRequestParameterToAttribute(request);

		String x_view = ViewProperties.getString("treePermission.userlist");
		if (StringUtils.isNotEmpty(x_view)) {
			return new ModelAndView(x_view, modelMap);
		}

		String view = request.getParameter("view");
		if (StringUtils.isNotEmpty(view)) {
			return new ModelAndView(view, modelMap);
		}

		return new ModelAndView("/sys/treePermission/userlist", modelMap);
	}

}
