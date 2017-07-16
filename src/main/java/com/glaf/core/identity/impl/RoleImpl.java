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

package com.glaf.core.identity.impl;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.identity.Role;
import com.glaf.core.identity.util.RoleJsonFactory;

public class RoleImpl implements Role {

	private static final long serialVersionUID = 1L;

	protected String id;

	protected String code;

	protected String name;

	protected String type;

	protected int sort;

	protected int locked;

	protected int accessLevel;

	protected int roleuse;

	protected int listno;

	protected String remark;

	public RoleImpl() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleImpl other = (RoleImpl) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public int getAccessLevel() {
		return accessLevel;
	}

	public String getCode() {
		return code;
	}

	public String getId() {
		return id;
	}

	public int getListno() {
		return listno;
	}

	public int getLocked() {
		return locked;
	}

	public String getName() {
		return name;
	}

	public String getRemark() {
		return remark;
	}

	public String getRoleId() {
		return id;
	}

	public int getRoleuse() {
		return roleuse;
	}

	public int getSort() {
		return sort;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public Role jsonToObject(JSONObject jsonObject) {
		return RoleJsonFactory.jsonToObject(jsonObject);
	}

	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setListno(int listno) {
		this.listno = listno;
	}

	public void setLocked(int locked) {
		this.locked = locked;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setRoleId(String roleId) {
		this.id = roleId;
	}

	public void setRoleuse(int roleuse) {
		this.roleuse = roleuse;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public void setType(String type) {
		this.type = type;
	}

	public JSONObject toJsonObject() {
		return RoleJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return RoleJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}