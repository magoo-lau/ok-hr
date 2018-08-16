package com.glaf.hr.personal.domain;

import java.io.*;
import java.util.*;
import javax.persistence.*;
import com.alibaba.fastjson.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.glaf.core.base.*;
import com.glaf.core.util.DateUtils;
import com.glaf.hr.personal.util.*;

/**
 * 
 * 实体对象
 *
 */

@Entity
@Table(name = "HR_STAFF_INFO")
public class StaffInfo implements Serializable, JSONable {
        private static final long serialVersionUID = 1L;

        @Id
		@Column(name = "ID_", length = 64, nullable = false)
        protected String id;

        /**
         * 工号
         */
        @Column(name = "CODE_", length=100) 
        protected String code;

        /**
         * 姓名
         */
        @Column(name = "NAME_", length=100) 
        protected String name;

        /**
         * 性别
         */
        @Column(name = "SEX_", length=100) 
        protected String sex;

        /**
         * 部门ID
         */
        @Column(name = "DEPT_ID_", length=100) 
        protected String deptId;

        /**
         * 部门
         */
        @Column(name = "DEPARTMENT_", length=100) 
        protected String department;

        /**
         * 职务
         */
        @Column(name = "POST_", length=100) 
        protected String post;

        /**
         * 入职时间
         */
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "ENTRY_DATE_")	
        protected Date entryDate;

        /**
         * 关联用户ID
         */
        @Column(name = "USER_ID_", length=100) 
        protected String userId;

        /**
         * 试用转正
         */
        @Column(name = "STAFF_STATUS_", length=100) 
        protected String staffStatus;

        /**
         * 转正日期
         */
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "BECOMER_DATE_")	
        protected Date becomerDate;

        /**
         * 在职类别
         */
        @Column(name = "PROFESSION_TYPE_", length=100) 
        protected String professionType;

        /**
         * 用工形式
         */
        @Column(name = "EMPLOYMENT_FORM_", length=100) 
        protected String employmentForm;

        /**
         * 身份证号码
         */
        @Column(name = "CARD_NO_", length=100) 
        protected String cardNo;

        /**
         * 出生日期
         */
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "BIRTHDAY_")	
        protected Date birthday;

        /**
         * 年龄
         */
        @Column(name = "AGE_")
        protected Integer age;

        /**
         * 籍贯
         */
        @Column(name = "NATIVE_PLACE_", length=100) 
        protected String nativePlace;

        /**
         * 政治面貌
         */
        @Column(name = "POLITICAL_STATUS_", length=100) 
        protected String politicalStatus;

        /**
         * 民族
         */
        @Column(name = "NATION_", length=100) 
        protected String nation;

        /**
         * 婚姻状况
         */
        @Column(name = "MARITAL_STATUS_", length=10) 
        protected String maritalStatus;

        /**
         * 户口所在地
         */
        @Column(name = "REGISTERED_RESIDENCE_", length=100) 
        protected String registeredResidence;

        /**
         * 身份证到期
         */
        @Column(name = "CARD_NO_EXPIRE_", length=100) 
        protected String cardNoExpire;

        /**
         * 移动电话
         */
        @Column(name = "MOBILE_TELPHONE_", length=100) 
        protected String mobileTelphone;

        /**
         * 电子邮箱
         */
        @Column(name = "EMAIL_", length=100) 
        protected String email;

        /**
         * 家庭住址
         */
        @Column(name = "HOME_ADDRESS_", length=100) 
        protected String homeAddress;

        /**
         * 学历
         */
        @Column(name = "EDUCATIONAL_BACKGROUND_", length=100) 
        protected String educationalBackground;

        /**
         * 学位
         */
        @Column(name = "DEGREE_", length=100) 
        protected String degree;

        /**
         * 毕业院校
         */
        @Column(name = "GRADUATE_INSTITUTIONS_", length=100) 
        protected String graduateInstitutions;

        /**
         * 专业
         */
        @Column(name = "PROFESSION_", length=100) 
        protected String profession;

        /**
         * 毕业时间
         */
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "GRADUATION_TIME_")	
        protected Date graduationTime;

        /**
         * 外语水平
         */
        @Column(name = "FOREIGN_LANGUAGE_", length=100) 
        protected String foreignLanguage;

        /**
         * 技术职称
         */
        @Column(name = "TECHNICAL_TITLE_", length=100) 
        protected String technicalTitle;

        /**
         * 教育经历
         */
        @Column(name = "EDUCATIONAL_EXPERIENCE_", length=100) 
        protected String educationalExperience;

        /**
         * 工作经历
         */
        @Column(name = "WORK_EXPERIENCE_", length=100) 
        protected String workExperience;

        /**
         * 租户ID
         */
        @Column(name = "TENANT_ID_", length=64) 
        protected String tenantId;

        /**
         * 租户名
         */
        @Column(name = "TENANT_NAME_", length=64) 
        protected String tenantName;

        /**
         * 删除标识
         */
        @Column(name = "DELETE_FLAG_")
        protected Integer deleteFlag;

        /**
         * 主从标识
         */
        @Column(name = "TOPID", length=50) 
        protected String topid;

        /**
         * 父亲ID
         */
        @Column(name = "PARENT_ID")	 
        protected Long parentId;

        /**
         * 树形编码
         */
        @Column(name = "TREE_ID", length=200) 
        protected String treeId;

        /**
         * 当前ID
         */
        @Column(name = "INDEX_ID")	 
        protected Long indexId;

        /**
         * 排序号
         */
        @Column(name = "LISTNO")	 
        protected Long listno;

        /**
         * 创建时间
         */
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "CREATEDATE")	
        protected Date createdate;

        /**
         * 修改时间
         */
        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "UPDATEDATE")	
        protected Date updatedate;

        /**
         * 下级ID
         */
        @Column(name = "LESSESSID", length=50) 
        protected String lessessid;

        /**
         * 创建人
         */
        @Column(name = "CREATER", length=50) 
        protected String creater;

        /**
         * 修改人
         */
        @Column(name = "UPDATER", length=50) 
        protected String updater;


         
	public StaffInfo() {

	}

	public String getId(){
	    return this.id;
	}

	public void setId(String id) {
	    this.id = id; 
	}


        public String getCode(){
	    return this.code;
	}
        public String getName(){
	    return this.name;
	}
        public String getSex(){
	    return this.sex;
	}
        public String getDeptId(){
	    return this.deptId;
	}
        public String getDepartment(){
	    return this.department;
	}
        public String getPost(){
	    return this.post;
	}
	public Date getEntryDate(){
	    return this.entryDate;
	}
	public String getEntryDateString(){
	    if(this.entryDate != null){
	        return DateUtils.getDateTime(this.entryDate);
	    }
	    return "";
	}
        public String getUserId(){
	    return this.userId;
	}
        public String getStaffStatus(){
	    return this.staffStatus;
	}
	public Date getBecomerDate(){
	    return this.becomerDate;
	}
	public String getBecomerDateString(){
	    if(this.becomerDate != null){
	        return DateUtils.getDateTime(this.becomerDate);
	    }
	    return "";
	}
        public String getProfessionType(){
	    return this.professionType;
	}
        public String getEmploymentForm(){
	    return this.employmentForm;
	}
        public String getCardNo(){
	    return this.cardNo;
	}
	public Date getBirthday(){
	    return this.birthday;
	}
	public String getBirthdayString(){
	    if(this.birthday != null){
	        return DateUtils.getDateTime(this.birthday);
	    }
	    return "";
	}
        public Integer getAge(){
	    return this.age;
	}
        public String getNativePlace(){
	    return this.nativePlace;
	}
        public String getPoliticalStatus(){
	    return this.politicalStatus;
	}
        public String getNation(){
	    return this.nation;
	}
        public String getMaritalStatus(){
	    return this.maritalStatus;
	}
        public String getRegisteredResidence(){
	    return this.registeredResidence;
	}
        public String getCardNoExpire(){
	    return this.cardNoExpire;
	}
        public String getMobileTelphone(){
	    return this.mobileTelphone;
	}
        public String getEmail(){
	    return this.email;
	}
        public String getHomeAddress(){
	    return this.homeAddress;
	}
        public String getEducationalBackground(){
	    return this.educationalBackground;
	}
        public String getDegree(){
	    return this.degree;
	}
        public String getGraduateInstitutions(){
	    return this.graduateInstitutions;
	}
        public String getProfession(){
	    return this.profession;
	}
	public Date getGraduationTime(){
	    return this.graduationTime;
	}
	public String getGraduationTimeString(){
	    if(this.graduationTime != null){
	        return DateUtils.getDateTime(this.graduationTime);
	    }
	    return "";
	}
        public String getForeignLanguage(){
	    return this.foreignLanguage;
	}
        public String getTechnicalTitle(){
	    return this.technicalTitle;
	}
        public String getEducationalExperience(){
	    return this.educationalExperience;
	}
        public String getWorkExperience(){
	    return this.workExperience;
	}
        public String getTenantId(){
	    return this.tenantId;
	}
        public String getTenantName(){
	    return this.tenantName;
	}
        public Integer getDeleteFlag(){
	    return this.deleteFlag;
	}
        public String getTopid(){
	    return this.topid;
	}
        public Long getParentId(){
	    return this.parentId;
	}
        public String getTreeId(){
	    return this.treeId;
	}
        public Long getIndexId(){
	    return this.indexId;
	}
        public Long getListno(){
	    return this.listno;
	}
	public Date getCreatedate(){
	    return this.createdate;
	}
	public String getCreatedateString(){
	    if(this.createdate != null){
	        return DateUtils.getDateTime(this.createdate);
	    }
	    return "";
	}
	public Date getUpdatedate(){
	    return this.updatedate;
	}
	public String getUpdatedateString(){
	    if(this.updatedate != null){
	        return DateUtils.getDateTime(this.updatedate);
	    }
	    return "";
	}
        public String getLessessid(){
	    return this.lessessid;
	}
        public String getCreater(){
	    return this.creater;
	}
        public String getUpdater(){
	    return this.updater;
	}


        public void setCode(String code) {
	    this.code = code; 
	}
        public void setName(String name) {
	    this.name = name; 
	}
        public void setSex(String sex) {
	    this.sex = sex; 
	}
        public void setDeptId(String deptId) {
	    this.deptId = deptId; 
	}
        public void setDepartment(String department) {
	    this.department = department; 
	}
        public void setPost(String post) {
	    this.post = post; 
	}
        public void setEntryDate(Date entryDate) {
	    this.entryDate = entryDate; 
	}
        public void setUserId(String userId) {
	    this.userId = userId; 
	}
        public void setStaffStatus(String staffStatus) {
	    this.staffStatus = staffStatus; 
	}
        public void setBecomerDate(Date becomerDate) {
	    this.becomerDate = becomerDate; 
	}
        public void setProfessionType(String professionType) {
	    this.professionType = professionType; 
	}
        public void setEmploymentForm(String employmentForm) {
	    this.employmentForm = employmentForm; 
	}
        public void setCardNo(String cardNo) {
	    this.cardNo = cardNo; 
	}
        public void setBirthday(Date birthday) {
	    this.birthday = birthday; 
	}
        public void setAge(Integer age) {
	    this.age = age; 
	}
        public void setNativePlace(String nativePlace) {
	    this.nativePlace = nativePlace; 
	}
        public void setPoliticalStatus(String politicalStatus) {
	    this.politicalStatus = politicalStatus; 
	}
        public void setNation(String nation) {
	    this.nation = nation; 
	}
        public void setMaritalStatus(String maritalStatus) {
	    this.maritalStatus = maritalStatus; 
	}
        public void setRegisteredResidence(String registeredResidence) {
	    this.registeredResidence = registeredResidence; 
	}
        public void setCardNoExpire(String cardNoExpire) {
	    this.cardNoExpire = cardNoExpire; 
	}
        public void setMobileTelphone(String mobileTelphone) {
	    this.mobileTelphone = mobileTelphone; 
	}
        public void setEmail(String email) {
	    this.email = email; 
	}
        public void setHomeAddress(String homeAddress) {
	    this.homeAddress = homeAddress; 
	}
        public void setEducationalBackground(String educationalBackground) {
	    this.educationalBackground = educationalBackground; 
	}
        public void setDegree(String degree) {
	    this.degree = degree; 
	}
        public void setGraduateInstitutions(String graduateInstitutions) {
	    this.graduateInstitutions = graduateInstitutions; 
	}
        public void setProfession(String profession) {
	    this.profession = profession; 
	}
        public void setGraduationTime(Date graduationTime) {
	    this.graduationTime = graduationTime; 
	}
        public void setForeignLanguage(String foreignLanguage) {
	    this.foreignLanguage = foreignLanguage; 
	}
        public void setTechnicalTitle(String technicalTitle) {
	    this.technicalTitle = technicalTitle; 
	}
        public void setEducationalExperience(String educationalExperience) {
	    this.educationalExperience = educationalExperience; 
	}
        public void setWorkExperience(String workExperience) {
	    this.workExperience = workExperience; 
	}
        public void setTenantId(String tenantId) {
	    this.tenantId = tenantId; 
	}
        public void setTenantName(String tenantName) {
	    this.tenantName = tenantName; 
	}
        public void setDeleteFlag(Integer deleteFlag) {
	    this.deleteFlag = deleteFlag; 
	}
        public void setTopid(String topid) {
	    this.topid = topid; 
	}
        public void setParentId(Long parentId) {
	    this.parentId = parentId; 
	}
        public void setTreeId(String treeId) {
	    this.treeId = treeId; 
	}
        public void setIndexId(Long indexId) {
	    this.indexId = indexId; 
	}
        public void setListno(Long listno) {
	    this.listno = listno; 
	}
        public void setCreatedate(Date createdate) {
	    this.createdate = createdate; 
	}
        public void setUpdatedate(Date updatedate) {
	    this.updatedate = updatedate; 
	}
        public void setLessessid(String lessessid) {
	    this.lessessid = lessessid; 
	}
        public void setCreater(String creater) {
	    this.creater = creater; 
	}
        public void setUpdater(String updater) {
	    this.updater = updater; 
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StaffInfo other = (StaffInfo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((id == null) ? 0 : id.hashCode());
		return result;
	}


	public StaffInfo jsonToObject(JSONObject jsonObject) {
            return StaffInfoJsonFactory.jsonToObject(jsonObject);
	}


	public JSONObject toJsonObject() {
            return StaffInfoJsonFactory.toJsonObject(this);
	}

	public ObjectNode toObjectNode(){
            return StaffInfoJsonFactory.toObjectNode(this);
	}

        @Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}
