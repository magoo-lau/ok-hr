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

package com.glaf.base.modules.sys.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.glaf.core.base.JSONable;
import com.glaf.base.modules.sys.util.MembershipJsonFactory;

@Entity
@Table(name = "SYS_MEMBERSHIP")
public class Membership implements Serializable, JSONable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_", nullable = false)
	protected long id;

	/**
	 * 所属租户
	 */
	@Column(name = "TENANTID_", length = 50)
	protected String tenantId;

	/**
	 * 用户账号
	 */
	@Column(name = "ACTORID_", length = 50)
	protected String actorId;

	/**
	 * 扩展属性
	 */
	@Column(name = "ATTRIBUTE_", length = 500)
	protected String attribute;

	/**
	 * 修改人
	 */
	@Column(name = "MODIFYBY_", length = 50)
	protected String modifyBy;

	/**
	 * 修改日期
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFYDATE_")
	protected Date modifyDate;

	/**
	 * 节点编号
	 */
	@Column(name = "NODEID_")
	protected long nodeId;

	/**
	 * 目标Id
	 */
	@Column(name = "OBJECTID_", length = 200)
	protected String objectId;

	/**
	 * 目标值
	 */
	@Column(name = "OBJECTVALUE_", length = 500)
	protected String objectValue;

	/**
	 * 角色编号
	 */
	@Column(name = "ROLEID_", length = 50)
	protected String roleId;

	/**
	 * 上级领导
	 */
	@Column(name = "SUPERIORID_", length = 50)
	protected String superiorId;

	/**
	 * 类型
	 */
	@Column(name = "TYPE_", length = 50, nullable = false)
	protected String type;

	public Membership() {

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Membership other = (Membership) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String getActorId() {
		return this.actorId;
	}

	public String getAttribute() {
		return this.attribute;
	}

	public long getId() {
		return this.id;
	}

	public String getModifyBy() {
		return this.modifyBy;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public long getNodeId() {
		return this.nodeId;
	}

	public String getObjectId() {
		return this.objectId;
	}

	public String getObjectValue() {
		return this.objectValue;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public String getSuperiorId() {
		return this.superiorId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	public Membership jsonToObject(JSONObject jsonObject) {
		return MembershipJsonFactory.jsonToObject(jsonObject);
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public void setNodeId(long nodeId) {
		this.nodeId = nodeId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}

	public void setObjectValue(String objectValue) {
		this.objectValue = objectValue;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public void setSuperiorId(String superiorId) {
		this.superiorId = superiorId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public void setType(String type) {
		this.type = type;
	}

	public JSONObject toJsonObject() {
		return MembershipJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode() {
		return MembershipJsonFactory.toObjectNode(this);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
