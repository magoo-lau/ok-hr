package com.glaf.hr.personal.query;

import java.util.*;
import com.glaf.core.query.DataQuery;

public class StaffInfoQuery extends DataQuery {
        private static final long serialVersionUID = 1L;
	protected List<String> ids;
	protected Collection<String> appActorIds;
  	protected String code;
  	protected String codeLike;
  	protected List<String> codes;
  	protected String name;
  	protected String nameLike;
  	protected List<String> names;
  	protected String sex;
  	protected String sexLike;
  	protected List<String> sexs;
  	protected String deptId;
  	protected String deptIdLike;
  	protected List<String> deptIds;
  	protected String department;
  	protected String departmentLike;
  	protected List<String> departments;
  	protected String post;
  	protected String postLike;
  	protected List<String> posts;
        protected Date entryDateGreaterThanOrEqual;
  	protected Date entryDateLessThanOrEqual;
  	protected String userId;
  	protected String userIdLike;
  	protected List<String> userIds;
  	protected String staffStatus;
  	protected String staffStatusLike;
  	protected List<String> staffStatuss;
        protected Date becomerDateGreaterThanOrEqual;
  	protected Date becomerDateLessThanOrEqual;
  	protected String professionType;
  	protected String professionTypeLike;
  	protected List<String> professionTypes;
  	protected String employmentForm;
  	protected String employmentFormLike;
  	protected List<String> employmentForms;
  	protected String cardNo;
  	protected String cardNoLike;
  	protected List<String> cardNos;
        protected Date birthdayGreaterThanOrEqual;
  	protected Date birthdayLessThanOrEqual;
  	protected Integer age;
  	protected Integer ageGreaterThanOrEqual;
  	protected Integer ageLessThanOrEqual;
  	protected List<Integer> ages;
  	protected String nativePlace;
  	protected String nativePlaceLike;
  	protected List<String> nativePlaces;
  	protected String politicalStatus;
  	protected String politicalStatusLike;
  	protected List<String> politicalStatuss;
  	protected String nation;
  	protected String nationLike;
  	protected List<String> nations;
  	protected String maritalStatus;
  	protected String maritalStatusLike;
  	protected List<String> maritalStatuss;
  	protected String registeredResidence;
  	protected String registeredResidenceLike;
  	protected List<String> registeredResidences;
  	protected String cardNoExpire;
  	protected String cardNoExpireLike;
  	protected List<String> cardNoExpires;
  	protected String mobileTelphone;
  	protected String mobileTelphoneLike;
  	protected List<String> mobileTelphones;
  	protected String email;
  	protected String emailLike;
  	protected List<String> emails;
  	protected String homeAddress;
  	protected String homeAddressLike;
  	protected List<String> homeAddresss;
  	protected String educationalBackground;
  	protected String educationalBackgroundLike;
  	protected List<String> educationalBackgrounds;
  	protected String degree;
  	protected String degreeLike;
  	protected List<String> degrees;
  	protected String graduateInstitutions;
  	protected String graduateInstitutionsLike;
  	protected List<String> graduateInstitutionss;
  	protected String profession;
  	protected String professionLike;
  	protected List<String> professions;
        protected Date graduationTimeGreaterThanOrEqual;
  	protected Date graduationTimeLessThanOrEqual;
  	protected String foreignLanguage;
  	protected String foreignLanguageLike;
  	protected List<String> foreignLanguages;
  	protected String technicalTitle;
  	protected String technicalTitleLike;
  	protected List<String> technicalTitles;
  	protected String educationalExperience;
  	protected String educationalExperienceLike;
  	protected List<String> educationalExperiences;
  	protected String workExperience;
  	protected String workExperienceLike;
  	protected List<String> workExperiences;
  	protected String tenantId;
  	protected String tenantIdLike;
  	protected List<String> tenantIds;
  	protected String tenantName;
  	protected String tenantNameLike;
  	protected List<String> tenantNames;
  	protected Integer deleteFlag;
  	protected Integer deleteFlagGreaterThanOrEqual;
  	protected Integer deleteFlagLessThanOrEqual;
  	protected List<Integer> deleteFlags;
  	protected String topid;
  	protected String topidLike;
  	protected List<String> topids;
  	protected Long parentId;
  	protected Long parentIdGreaterThanOrEqual;
  	protected Long parentIdLessThanOrEqual;
  	protected List<Long> parentIds;
  	protected String treeId;
  	protected String treeIdLike;
  	protected List<String> treeIds;
  	protected Long indexId;
  	protected Long indexIdGreaterThanOrEqual;
  	protected Long indexIdLessThanOrEqual;
  	protected List<Long> indexIds;
  	protected Long listno;
  	protected Long listnoGreaterThanOrEqual;
  	protected Long listnoLessThanOrEqual;
  	protected List<Long> listnos;
        protected Date createdateGreaterThanOrEqual;
  	protected Date createdateLessThanOrEqual;
        protected Date updatedateGreaterThanOrEqual;
  	protected Date updatedateLessThanOrEqual;
  	protected String lessessid;
  	protected String lessessidLike;
  	protected List<String> lessessids;
  	protected String creater;
  	protected String createrLike;
  	protected List<String> creaters;
  	protected String updater;
  	protected String updaterLike;
  	protected List<String> updaters;

    public StaffInfoQuery() {

    }

    public Collection<String> getAppActorIds() {
	return appActorIds;
    }

    public void setAppActorIds(Collection<String> appActorIds) {
	this.appActorIds = appActorIds;
    }


    public String getCode(){
        return code;
    }

    public String getCodeLike(){
	    if (codeLike != null && codeLike.trim().length() > 0) {
		if (!codeLike.startsWith("%")) {
		    codeLike = "%" + codeLike;
		}
		if (!codeLike.endsWith("%")) {
		   codeLike = codeLike + "%";
		}
	    }
	return codeLike;
    }

    public List<String> getCodes(){
	return codes;
    }


    public String getName(){
        return name;
    }

    public String getNameLike(){
	    if (nameLike != null && nameLike.trim().length() > 0) {
		if (!nameLike.startsWith("%")) {
		    nameLike = "%" + nameLike;
		}
		if (!nameLike.endsWith("%")) {
		   nameLike = nameLike + "%";
		}
	    }
	return nameLike;
    }

    public List<String> getNames(){
	return names;
    }


    public String getSex(){
        return sex;
    }

    public String getSexLike(){
	    if (sexLike != null && sexLike.trim().length() > 0) {
		if (!sexLike.startsWith("%")) {
		    sexLike = "%" + sexLike;
		}
		if (!sexLike.endsWith("%")) {
		   sexLike = sexLike + "%";
		}
	    }
	return sexLike;
    }

    public List<String> getSexs(){
	return sexs;
    }


    public String getDeptId(){
        return deptId;
    }

    public String getDeptIdLike(){
	    if (deptIdLike != null && deptIdLike.trim().length() > 0) {
		if (!deptIdLike.startsWith("%")) {
		    deptIdLike = "%" + deptIdLike;
		}
		if (!deptIdLike.endsWith("%")) {
		   deptIdLike = deptIdLike + "%";
		}
	    }
	return deptIdLike;
    }

    public List<String> getDeptIds(){
	return deptIds;
    }


    public String getDepartment(){
        return department;
    }

    public String getDepartmentLike(){
	    if (departmentLike != null && departmentLike.trim().length() > 0) {
		if (!departmentLike.startsWith("%")) {
		    departmentLike = "%" + departmentLike;
		}
		if (!departmentLike.endsWith("%")) {
		   departmentLike = departmentLike + "%";
		}
	    }
	return departmentLike;
    }

    public List<String> getDepartments(){
	return departments;
    }


    public String getPost(){
        return post;
    }

    public String getPostLike(){
	    if (postLike != null && postLike.trim().length() > 0) {
		if (!postLike.startsWith("%")) {
		    postLike = "%" + postLike;
		}
		if (!postLike.endsWith("%")) {
		   postLike = postLike + "%";
		}
	    }
	return postLike;
    }

    public List<String> getPosts(){
	return posts;
    }


    public Date getEntryDateGreaterThanOrEqual(){
        return entryDateGreaterThanOrEqual;
    }

    public Date getEntryDateLessThanOrEqual(){
	return entryDateLessThanOrEqual;
    }


    public String getUserId(){
        return userId;
    }

    public String getUserIdLike(){
	    if (userIdLike != null && userIdLike.trim().length() > 0) {
		if (!userIdLike.startsWith("%")) {
		    userIdLike = "%" + userIdLike;
		}
		if (!userIdLike.endsWith("%")) {
		   userIdLike = userIdLike + "%";
		}
	    }
	return userIdLike;
    }

    public List<String> getUserIds(){
	return userIds;
    }


    public String getStaffStatus(){
        return staffStatus;
    }

    public String getStaffStatusLike(){
	    if (staffStatusLike != null && staffStatusLike.trim().length() > 0) {
		if (!staffStatusLike.startsWith("%")) {
		    staffStatusLike = "%" + staffStatusLike;
		}
		if (!staffStatusLike.endsWith("%")) {
		   staffStatusLike = staffStatusLike + "%";
		}
	    }
	return staffStatusLike;
    }

    public List<String> getStaffStatuss(){
	return staffStatuss;
    }


    public Date getBecomerDateGreaterThanOrEqual(){
        return becomerDateGreaterThanOrEqual;
    }

    public Date getBecomerDateLessThanOrEqual(){
	return becomerDateLessThanOrEqual;
    }


    public String getProfessionType(){
        return professionType;
    }

    public String getProfessionTypeLike(){
	    if (professionTypeLike != null && professionTypeLike.trim().length() > 0) {
		if (!professionTypeLike.startsWith("%")) {
		    professionTypeLike = "%" + professionTypeLike;
		}
		if (!professionTypeLike.endsWith("%")) {
		   professionTypeLike = professionTypeLike + "%";
		}
	    }
	return professionTypeLike;
    }

    public List<String> getProfessionTypes(){
	return professionTypes;
    }


    public String getEmploymentForm(){
        return employmentForm;
    }

    public String getEmploymentFormLike(){
	    if (employmentFormLike != null && employmentFormLike.trim().length() > 0) {
		if (!employmentFormLike.startsWith("%")) {
		    employmentFormLike = "%" + employmentFormLike;
		}
		if (!employmentFormLike.endsWith("%")) {
		   employmentFormLike = employmentFormLike + "%";
		}
	    }
	return employmentFormLike;
    }

    public List<String> getEmploymentForms(){
	return employmentForms;
    }


    public String getCardNo(){
        return cardNo;
    }

    public String getCardNoLike(){
	    if (cardNoLike != null && cardNoLike.trim().length() > 0) {
		if (!cardNoLike.startsWith("%")) {
		    cardNoLike = "%" + cardNoLike;
		}
		if (!cardNoLike.endsWith("%")) {
		   cardNoLike = cardNoLike + "%";
		}
	    }
	return cardNoLike;
    }

    public List<String> getCardNos(){
	return cardNos;
    }


    public Date getBirthdayGreaterThanOrEqual(){
        return birthdayGreaterThanOrEqual;
    }

    public Date getBirthdayLessThanOrEqual(){
	return birthdayLessThanOrEqual;
    }


    public Integer getAge(){
        return age;
    }

    public Integer getAgeGreaterThanOrEqual(){
        return ageGreaterThanOrEqual;
    }

    public Integer getAgeLessThanOrEqual(){
	return ageLessThanOrEqual;
    }

    public List<Integer> getAges(){
	return ages;
    }

    public String getNativePlace(){
        return nativePlace;
    }

    public String getNativePlaceLike(){
	    if (nativePlaceLike != null && nativePlaceLike.trim().length() > 0) {
		if (!nativePlaceLike.startsWith("%")) {
		    nativePlaceLike = "%" + nativePlaceLike;
		}
		if (!nativePlaceLike.endsWith("%")) {
		   nativePlaceLike = nativePlaceLike + "%";
		}
	    }
	return nativePlaceLike;
    }

    public List<String> getNativePlaces(){
	return nativePlaces;
    }


    public String getPoliticalStatus(){
        return politicalStatus;
    }

    public String getPoliticalStatusLike(){
	    if (politicalStatusLike != null && politicalStatusLike.trim().length() > 0) {
		if (!politicalStatusLike.startsWith("%")) {
		    politicalStatusLike = "%" + politicalStatusLike;
		}
		if (!politicalStatusLike.endsWith("%")) {
		   politicalStatusLike = politicalStatusLike + "%";
		}
	    }
	return politicalStatusLike;
    }

    public List<String> getPoliticalStatuss(){
	return politicalStatuss;
    }


    public String getNation(){
        return nation;
    }

    public String getNationLike(){
	    if (nationLike != null && nationLike.trim().length() > 0) {
		if (!nationLike.startsWith("%")) {
		    nationLike = "%" + nationLike;
		}
		if (!nationLike.endsWith("%")) {
		   nationLike = nationLike + "%";
		}
	    }
	return nationLike;
    }

    public List<String> getNations(){
	return nations;
    }


    public String getMaritalStatus(){
        return maritalStatus;
    }

    public String getMaritalStatusLike(){
	    if (maritalStatusLike != null && maritalStatusLike.trim().length() > 0) {
		if (!maritalStatusLike.startsWith("%")) {
		    maritalStatusLike = "%" + maritalStatusLike;
		}
		if (!maritalStatusLike.endsWith("%")) {
		   maritalStatusLike = maritalStatusLike + "%";
		}
	    }
	return maritalStatusLike;
    }

    public List<String> getMaritalStatuss(){
	return maritalStatuss;
    }


    public String getRegisteredResidence(){
        return registeredResidence;
    }

    public String getRegisteredResidenceLike(){
	    if (registeredResidenceLike != null && registeredResidenceLike.trim().length() > 0) {
		if (!registeredResidenceLike.startsWith("%")) {
		    registeredResidenceLike = "%" + registeredResidenceLike;
		}
		if (!registeredResidenceLike.endsWith("%")) {
		   registeredResidenceLike = registeredResidenceLike + "%";
		}
	    }
	return registeredResidenceLike;
    }

    public List<String> getRegisteredResidences(){
	return registeredResidences;
    }


    public String getCardNoExpire(){
        return cardNoExpire;
    }

    public String getCardNoExpireLike(){
	    if (cardNoExpireLike != null && cardNoExpireLike.trim().length() > 0) {
		if (!cardNoExpireLike.startsWith("%")) {
		    cardNoExpireLike = "%" + cardNoExpireLike;
		}
		if (!cardNoExpireLike.endsWith("%")) {
		   cardNoExpireLike = cardNoExpireLike + "%";
		}
	    }
	return cardNoExpireLike;
    }

    public List<String> getCardNoExpires(){
	return cardNoExpires;
    }


    public String getMobileTelphone(){
        return mobileTelphone;
    }

    public String getMobileTelphoneLike(){
	    if (mobileTelphoneLike != null && mobileTelphoneLike.trim().length() > 0) {
		if (!mobileTelphoneLike.startsWith("%")) {
		    mobileTelphoneLike = "%" + mobileTelphoneLike;
		}
		if (!mobileTelphoneLike.endsWith("%")) {
		   mobileTelphoneLike = mobileTelphoneLike + "%";
		}
	    }
	return mobileTelphoneLike;
    }

    public List<String> getMobileTelphones(){
	return mobileTelphones;
    }


    public String getEmail(){
        return email;
    }

    public String getEmailLike(){
	    if (emailLike != null && emailLike.trim().length() > 0) {
		if (!emailLike.startsWith("%")) {
		    emailLike = "%" + emailLike;
		}
		if (!emailLike.endsWith("%")) {
		   emailLike = emailLike + "%";
		}
	    }
	return emailLike;
    }

    public List<String> getEmails(){
	return emails;
    }


    public String getHomeAddress(){
        return homeAddress;
    }

    public String getHomeAddressLike(){
	    if (homeAddressLike != null && homeAddressLike.trim().length() > 0) {
		if (!homeAddressLike.startsWith("%")) {
		    homeAddressLike = "%" + homeAddressLike;
		}
		if (!homeAddressLike.endsWith("%")) {
		   homeAddressLike = homeAddressLike + "%";
		}
	    }
	return homeAddressLike;
    }

    public List<String> getHomeAddresss(){
	return homeAddresss;
    }


    public String getEducationalBackground(){
        return educationalBackground;
    }

    public String getEducationalBackgroundLike(){
	    if (educationalBackgroundLike != null && educationalBackgroundLike.trim().length() > 0) {
		if (!educationalBackgroundLike.startsWith("%")) {
		    educationalBackgroundLike = "%" + educationalBackgroundLike;
		}
		if (!educationalBackgroundLike.endsWith("%")) {
		   educationalBackgroundLike = educationalBackgroundLike + "%";
		}
	    }
	return educationalBackgroundLike;
    }

    public List<String> getEducationalBackgrounds(){
	return educationalBackgrounds;
    }


    public String getDegree(){
        return degree;
    }

    public String getDegreeLike(){
	    if (degreeLike != null && degreeLike.trim().length() > 0) {
		if (!degreeLike.startsWith("%")) {
		    degreeLike = "%" + degreeLike;
		}
		if (!degreeLike.endsWith("%")) {
		   degreeLike = degreeLike + "%";
		}
	    }
	return degreeLike;
    }

    public List<String> getDegrees(){
	return degrees;
    }


    public String getGraduateInstitutions(){
        return graduateInstitutions;
    }

    public String getGraduateInstitutionsLike(){
	    if (graduateInstitutionsLike != null && graduateInstitutionsLike.trim().length() > 0) {
		if (!graduateInstitutionsLike.startsWith("%")) {
		    graduateInstitutionsLike = "%" + graduateInstitutionsLike;
		}
		if (!graduateInstitutionsLike.endsWith("%")) {
		   graduateInstitutionsLike = graduateInstitutionsLike + "%";
		}
	    }
	return graduateInstitutionsLike;
    }

    public List<String> getGraduateInstitutionss(){
	return graduateInstitutionss;
    }


    public String getProfession(){
        return profession;
    }

    public String getProfessionLike(){
	    if (professionLike != null && professionLike.trim().length() > 0) {
		if (!professionLike.startsWith("%")) {
		    professionLike = "%" + professionLike;
		}
		if (!professionLike.endsWith("%")) {
		   professionLike = professionLike + "%";
		}
	    }
	return professionLike;
    }

    public List<String> getProfessions(){
	return professions;
    }


    public Date getGraduationTimeGreaterThanOrEqual(){
        return graduationTimeGreaterThanOrEqual;
    }

    public Date getGraduationTimeLessThanOrEqual(){
	return graduationTimeLessThanOrEqual;
    }


    public String getForeignLanguage(){
        return foreignLanguage;
    }

    public String getForeignLanguageLike(){
	    if (foreignLanguageLike != null && foreignLanguageLike.trim().length() > 0) {
		if (!foreignLanguageLike.startsWith("%")) {
		    foreignLanguageLike = "%" + foreignLanguageLike;
		}
		if (!foreignLanguageLike.endsWith("%")) {
		   foreignLanguageLike = foreignLanguageLike + "%";
		}
	    }
	return foreignLanguageLike;
    }

    public List<String> getForeignLanguages(){
	return foreignLanguages;
    }


    public String getTechnicalTitle(){
        return technicalTitle;
    }

    public String getTechnicalTitleLike(){
	    if (technicalTitleLike != null && technicalTitleLike.trim().length() > 0) {
		if (!technicalTitleLike.startsWith("%")) {
		    technicalTitleLike = "%" + technicalTitleLike;
		}
		if (!technicalTitleLike.endsWith("%")) {
		   technicalTitleLike = technicalTitleLike + "%";
		}
	    }
	return technicalTitleLike;
    }

    public List<String> getTechnicalTitles(){
	return technicalTitles;
    }


    public String getEducationalExperience(){
        return educationalExperience;
    }

    public String getEducationalExperienceLike(){
	    if (educationalExperienceLike != null && educationalExperienceLike.trim().length() > 0) {
		if (!educationalExperienceLike.startsWith("%")) {
		    educationalExperienceLike = "%" + educationalExperienceLike;
		}
		if (!educationalExperienceLike.endsWith("%")) {
		   educationalExperienceLike = educationalExperienceLike + "%";
		}
	    }
	return educationalExperienceLike;
    }

    public List<String> getEducationalExperiences(){
	return educationalExperiences;
    }


    public String getWorkExperience(){
        return workExperience;
    }

    public String getWorkExperienceLike(){
	    if (workExperienceLike != null && workExperienceLike.trim().length() > 0) {
		if (!workExperienceLike.startsWith("%")) {
		    workExperienceLike = "%" + workExperienceLike;
		}
		if (!workExperienceLike.endsWith("%")) {
		   workExperienceLike = workExperienceLike + "%";
		}
	    }
	return workExperienceLike;
    }

    public List<String> getWorkExperiences(){
	return workExperiences;
    }


    public String getTenantId(){
        return tenantId;
    }

    public String getTenantIdLike(){
	    if (tenantIdLike != null && tenantIdLike.trim().length() > 0) {
		if (!tenantIdLike.startsWith("%")) {
		    tenantIdLike = "%" + tenantIdLike;
		}
		if (!tenantIdLike.endsWith("%")) {
		   tenantIdLike = tenantIdLike + "%";
		}
	    }
	return tenantIdLike;
    }

    public List<String> getTenantIds(){
	return tenantIds;
    }


    public String getTenantName(){
        return tenantName;
    }

    public String getTenantNameLike(){
	    if (tenantNameLike != null && tenantNameLike.trim().length() > 0) {
		if (!tenantNameLike.startsWith("%")) {
		    tenantNameLike = "%" + tenantNameLike;
		}
		if (!tenantNameLike.endsWith("%")) {
		   tenantNameLike = tenantNameLike + "%";
		}
	    }
	return tenantNameLike;
    }

    public List<String> getTenantNames(){
	return tenantNames;
    }


    public Integer getDeleteFlag(){
        return deleteFlag;
    }

    public Integer getDeleteFlagGreaterThanOrEqual(){
        return deleteFlagGreaterThanOrEqual;
    }

    public Integer getDeleteFlagLessThanOrEqual(){
	return deleteFlagLessThanOrEqual;
    }

    public List<Integer> getDeleteFlags(){
	return deleteFlags;
    }

    public String getTopid(){
        return topid;
    }

    public String getTopidLike(){
	    if (topidLike != null && topidLike.trim().length() > 0) {
		if (!topidLike.startsWith("%")) {
		    topidLike = "%" + topidLike;
		}
		if (!topidLike.endsWith("%")) {
		   topidLike = topidLike + "%";
		}
	    }
	return topidLike;
    }

    public List<String> getTopids(){
	return topids;
    }


    public Long getParentId(){
        return parentId;
    }

    public Long getParentIdGreaterThanOrEqual(){
        return parentIdGreaterThanOrEqual;
    }

    public Long getParentIdLessThanOrEqual(){
	return parentIdLessThanOrEqual;
    }

    public List<Long> getParentIds(){
	return parentIds;
    }

    public String getTreeId(){
        return treeId;
    }

    public String getTreeIdLike(){
	    if (treeIdLike != null && treeIdLike.trim().length() > 0) {
		if (!treeIdLike.startsWith("%")) {
		    treeIdLike = "%" + treeIdLike;
		}
		if (!treeIdLike.endsWith("%")) {
		   treeIdLike = treeIdLike + "%";
		}
	    }
	return treeIdLike;
    }

    public List<String> getTreeIds(){
	return treeIds;
    }


    public Long getIndexId(){
        return indexId;
    }

    public Long getIndexIdGreaterThanOrEqual(){
        return indexIdGreaterThanOrEqual;
    }

    public Long getIndexIdLessThanOrEqual(){
	return indexIdLessThanOrEqual;
    }

    public List<Long> getIndexIds(){
	return indexIds;
    }

    public Long getListno(){
        return listno;
    }

    public Long getListnoGreaterThanOrEqual(){
        return listnoGreaterThanOrEqual;
    }

    public Long getListnoLessThanOrEqual(){
	return listnoLessThanOrEqual;
    }

    public List<Long> getListnos(){
	return listnos;
    }

    public Date getCreatedateGreaterThanOrEqual(){
        return createdateGreaterThanOrEqual;
    }

    public Date getCreatedateLessThanOrEqual(){
	return createdateLessThanOrEqual;
    }


    public Date getUpdatedateGreaterThanOrEqual(){
        return updatedateGreaterThanOrEqual;
    }

    public Date getUpdatedateLessThanOrEqual(){
	return updatedateLessThanOrEqual;
    }


    public String getLessessid(){
        return lessessid;
    }

    public String getLessessidLike(){
	    if (lessessidLike != null && lessessidLike.trim().length() > 0) {
		if (!lessessidLike.startsWith("%")) {
		    lessessidLike = "%" + lessessidLike;
		}
		if (!lessessidLike.endsWith("%")) {
		   lessessidLike = lessessidLike + "%";
		}
	    }
	return lessessidLike;
    }

    public List<String> getLessessids(){
	return lessessids;
    }


    public String getCreater(){
        return creater;
    }

    public String getCreaterLike(){
	    if (createrLike != null && createrLike.trim().length() > 0) {
		if (!createrLike.startsWith("%")) {
		    createrLike = "%" + createrLike;
		}
		if (!createrLike.endsWith("%")) {
		   createrLike = createrLike + "%";
		}
	    }
	return createrLike;
    }

    public List<String> getCreaters(){
	return creaters;
    }


    public String getUpdater(){
        return updater;
    }

    public String getUpdaterLike(){
	    if (updaterLike != null && updaterLike.trim().length() > 0) {
		if (!updaterLike.startsWith("%")) {
		    updaterLike = "%" + updaterLike;
		}
		if (!updaterLike.endsWith("%")) {
		   updaterLike = updaterLike + "%";
		}
	    }
	return updaterLike;
    }

    public List<String> getUpdaters(){
	return updaters;
    }


 

    public void setCode(String code){
        this.code = code;
    }

    public void setCodeLike( String codeLike){
	this.codeLike = codeLike;
    }

    public void setCodes(List<String> codes){
        this.codes = codes;
    }


    public void setName(String name){
        this.name = name;
    }

    public void setNameLike( String nameLike){
	this.nameLike = nameLike;
    }

    public void setNames(List<String> names){
        this.names = names;
    }


    public void setSex(String sex){
        this.sex = sex;
    }

    public void setSexLike( String sexLike){
	this.sexLike = sexLike;
    }

    public void setSexs(List<String> sexs){
        this.sexs = sexs;
    }


    public void setDeptId(String deptId){
        this.deptId = deptId;
    }

    public void setDeptIdLike( String deptIdLike){
	this.deptIdLike = deptIdLike;
    }

    public void setDeptIds(List<String> deptIds){
        this.deptIds = deptIds;
    }


    public void setDepartment(String department){
        this.department = department;
    }

    public void setDepartmentLike( String departmentLike){
	this.departmentLike = departmentLike;
    }

    public void setDepartments(List<String> departments){
        this.departments = departments;
    }


    public void setPost(String post){
        this.post = post;
    }

    public void setPostLike( String postLike){
	this.postLike = postLike;
    }

    public void setPosts(List<String> posts){
        this.posts = posts;
    }


    public void setEntryDateGreaterThanOrEqual(Date entryDateGreaterThanOrEqual){
        this.entryDateGreaterThanOrEqual = entryDateGreaterThanOrEqual;
    }

    public void setEntryDateLessThanOrEqual(Date entryDateLessThanOrEqual){
	this.entryDateLessThanOrEqual = entryDateLessThanOrEqual;
    }


    public void setUserId(String userId){
        this.userId = userId;
    }

    public void setUserIdLike( String userIdLike){
	this.userIdLike = userIdLike;
    }

    public void setUserIds(List<String> userIds){
        this.userIds = userIds;
    }


    public void setStaffStatus(String staffStatus){
        this.staffStatus = staffStatus;
    }

    public void setStaffStatusLike( String staffStatusLike){
	this.staffStatusLike = staffStatusLike;
    }

    public void setStaffStatuss(List<String> staffStatuss){
        this.staffStatuss = staffStatuss;
    }


    public void setBecomerDateGreaterThanOrEqual(Date becomerDateGreaterThanOrEqual){
        this.becomerDateGreaterThanOrEqual = becomerDateGreaterThanOrEqual;
    }

    public void setBecomerDateLessThanOrEqual(Date becomerDateLessThanOrEqual){
	this.becomerDateLessThanOrEqual = becomerDateLessThanOrEqual;
    }


    public void setProfessionType(String professionType){
        this.professionType = professionType;
    }

    public void setProfessionTypeLike( String professionTypeLike){
	this.professionTypeLike = professionTypeLike;
    }

    public void setProfessionTypes(List<String> professionTypes){
        this.professionTypes = professionTypes;
    }


    public void setEmploymentForm(String employmentForm){
        this.employmentForm = employmentForm;
    }

    public void setEmploymentFormLike( String employmentFormLike){
	this.employmentFormLike = employmentFormLike;
    }

    public void setEmploymentForms(List<String> employmentForms){
        this.employmentForms = employmentForms;
    }


    public void setCardNo(String cardNo){
        this.cardNo = cardNo;
    }

    public void setCardNoLike( String cardNoLike){
	this.cardNoLike = cardNoLike;
    }

    public void setCardNos(List<String> cardNos){
        this.cardNos = cardNos;
    }


    public void setBirthdayGreaterThanOrEqual(Date birthdayGreaterThanOrEqual){
        this.birthdayGreaterThanOrEqual = birthdayGreaterThanOrEqual;
    }

    public void setBirthdayLessThanOrEqual(Date birthdayLessThanOrEqual){
	this.birthdayLessThanOrEqual = birthdayLessThanOrEqual;
    }


    public void setAge(Integer age){
        this.age = age;
    }

    public void setAgeGreaterThanOrEqual(Integer ageGreaterThanOrEqual){
        this.ageGreaterThanOrEqual = ageGreaterThanOrEqual;
    }

    public void setAgeLessThanOrEqual(Integer ageLessThanOrEqual){
	this.ageLessThanOrEqual = ageLessThanOrEqual;
    }

    public void setAges(List<Integer> ages){
        this.ages = ages;
    }


    public void setNativePlace(String nativePlace){
        this.nativePlace = nativePlace;
    }

    public void setNativePlaceLike( String nativePlaceLike){
	this.nativePlaceLike = nativePlaceLike;
    }

    public void setNativePlaces(List<String> nativePlaces){
        this.nativePlaces = nativePlaces;
    }


    public void setPoliticalStatus(String politicalStatus){
        this.politicalStatus = politicalStatus;
    }

    public void setPoliticalStatusLike( String politicalStatusLike){
	this.politicalStatusLike = politicalStatusLike;
    }

    public void setPoliticalStatuss(List<String> politicalStatuss){
        this.politicalStatuss = politicalStatuss;
    }


    public void setNation(String nation){
        this.nation = nation;
    }

    public void setNationLike( String nationLike){
	this.nationLike = nationLike;
    }

    public void setNations(List<String> nations){
        this.nations = nations;
    }


    public void setMaritalStatus(String maritalStatus){
        this.maritalStatus = maritalStatus;
    }

    public void setMaritalStatusLike( String maritalStatusLike){
	this.maritalStatusLike = maritalStatusLike;
    }

    public void setMaritalStatuss(List<String> maritalStatuss){
        this.maritalStatuss = maritalStatuss;
    }


    public void setRegisteredResidence(String registeredResidence){
        this.registeredResidence = registeredResidence;
    }

    public void setRegisteredResidenceLike( String registeredResidenceLike){
	this.registeredResidenceLike = registeredResidenceLike;
    }

    public void setRegisteredResidences(List<String> registeredResidences){
        this.registeredResidences = registeredResidences;
    }


    public void setCardNoExpire(String cardNoExpire){
        this.cardNoExpire = cardNoExpire;
    }

    public void setCardNoExpireLike( String cardNoExpireLike){
	this.cardNoExpireLike = cardNoExpireLike;
    }

    public void setCardNoExpires(List<String> cardNoExpires){
        this.cardNoExpires = cardNoExpires;
    }


    public void setMobileTelphone(String mobileTelphone){
        this.mobileTelphone = mobileTelphone;
    }

    public void setMobileTelphoneLike( String mobileTelphoneLike){
	this.mobileTelphoneLike = mobileTelphoneLike;
    }

    public void setMobileTelphones(List<String> mobileTelphones){
        this.mobileTelphones = mobileTelphones;
    }


    public void setEmail(String email){
        this.email = email;
    }

    public void setEmailLike( String emailLike){
	this.emailLike = emailLike;
    }

    public void setEmails(List<String> emails){
        this.emails = emails;
    }


    public void setHomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }

    public void setHomeAddressLike( String homeAddressLike){
	this.homeAddressLike = homeAddressLike;
    }

    public void setHomeAddresss(List<String> homeAddresss){
        this.homeAddresss = homeAddresss;
    }


    public void setEducationalBackground(String educationalBackground){
        this.educationalBackground = educationalBackground;
    }

    public void setEducationalBackgroundLike( String educationalBackgroundLike){
	this.educationalBackgroundLike = educationalBackgroundLike;
    }

    public void setEducationalBackgrounds(List<String> educationalBackgrounds){
        this.educationalBackgrounds = educationalBackgrounds;
    }


    public void setDegree(String degree){
        this.degree = degree;
    }

    public void setDegreeLike( String degreeLike){
	this.degreeLike = degreeLike;
    }

    public void setDegrees(List<String> degrees){
        this.degrees = degrees;
    }


    public void setGraduateInstitutions(String graduateInstitutions){
        this.graduateInstitutions = graduateInstitutions;
    }

    public void setGraduateInstitutionsLike( String graduateInstitutionsLike){
	this.graduateInstitutionsLike = graduateInstitutionsLike;
    }

    public void setGraduateInstitutionss(List<String> graduateInstitutionss){
        this.graduateInstitutionss = graduateInstitutionss;
    }


    public void setProfession(String profession){
        this.profession = profession;
    }

    public void setProfessionLike( String professionLike){
	this.professionLike = professionLike;
    }

    public void setProfessions(List<String> professions){
        this.professions = professions;
    }


    public void setGraduationTimeGreaterThanOrEqual(Date graduationTimeGreaterThanOrEqual){
        this.graduationTimeGreaterThanOrEqual = graduationTimeGreaterThanOrEqual;
    }

    public void setGraduationTimeLessThanOrEqual(Date graduationTimeLessThanOrEqual){
	this.graduationTimeLessThanOrEqual = graduationTimeLessThanOrEqual;
    }


    public void setForeignLanguage(String foreignLanguage){
        this.foreignLanguage = foreignLanguage;
    }

    public void setForeignLanguageLike( String foreignLanguageLike){
	this.foreignLanguageLike = foreignLanguageLike;
    }

    public void setForeignLanguages(List<String> foreignLanguages){
        this.foreignLanguages = foreignLanguages;
    }


    public void setTechnicalTitle(String technicalTitle){
        this.technicalTitle = technicalTitle;
    }

    public void setTechnicalTitleLike( String technicalTitleLike){
	this.technicalTitleLike = technicalTitleLike;
    }

    public void setTechnicalTitles(List<String> technicalTitles){
        this.technicalTitles = technicalTitles;
    }


    public void setEducationalExperience(String educationalExperience){
        this.educationalExperience = educationalExperience;
    }

    public void setEducationalExperienceLike( String educationalExperienceLike){
	this.educationalExperienceLike = educationalExperienceLike;
    }

    public void setEducationalExperiences(List<String> educationalExperiences){
        this.educationalExperiences = educationalExperiences;
    }


    public void setWorkExperience(String workExperience){
        this.workExperience = workExperience;
    }

    public void setWorkExperienceLike( String workExperienceLike){
	this.workExperienceLike = workExperienceLike;
    }

    public void setWorkExperiences(List<String> workExperiences){
        this.workExperiences = workExperiences;
    }


    public void setTenantId(String tenantId){
        this.tenantId = tenantId;
    }

    public void setTenantIdLike( String tenantIdLike){
	this.tenantIdLike = tenantIdLike;
    }

    public void setTenantIds(List<String> tenantIds){
        this.tenantIds = tenantIds;
    }


    public void setTenantName(String tenantName){
        this.tenantName = tenantName;
    }

    public void setTenantNameLike( String tenantNameLike){
	this.tenantNameLike = tenantNameLike;
    }

    public void setTenantNames(List<String> tenantNames){
        this.tenantNames = tenantNames;
    }


    public void setDeleteFlag(Integer deleteFlag){
        this.deleteFlag = deleteFlag;
    }

    public void setDeleteFlagGreaterThanOrEqual(Integer deleteFlagGreaterThanOrEqual){
        this.deleteFlagGreaterThanOrEqual = deleteFlagGreaterThanOrEqual;
    }

    public void setDeleteFlagLessThanOrEqual(Integer deleteFlagLessThanOrEqual){
	this.deleteFlagLessThanOrEqual = deleteFlagLessThanOrEqual;
    }

    public void setDeleteFlags(List<Integer> deleteFlags){
        this.deleteFlags = deleteFlags;
    }


    public void setTopid(String topid){
        this.topid = topid;
    }

    public void setTopidLike( String topidLike){
	this.topidLike = topidLike;
    }

    public void setTopids(List<String> topids){
        this.topids = topids;
    }


    public void setParentId(Long parentId){
        this.parentId = parentId;
    }

    public void setParentIdGreaterThanOrEqual(Long parentIdGreaterThanOrEqual){
        this.parentIdGreaterThanOrEqual = parentIdGreaterThanOrEqual;
    }

    public void setParentIdLessThanOrEqual(Long parentIdLessThanOrEqual){
	this.parentIdLessThanOrEqual = parentIdLessThanOrEqual;
    }

    public void setParentIds(List<Long> parentIds){
        this.parentIds = parentIds;
    }


    public void setTreeId(String treeId){
        this.treeId = treeId;
    }

    public void setTreeIdLike( String treeIdLike){
	this.treeIdLike = treeIdLike;
    }

    public void setTreeIds(List<String> treeIds){
        this.treeIds = treeIds;
    }


    public void setIndexId(Long indexId){
        this.indexId = indexId;
    }

    public void setIndexIdGreaterThanOrEqual(Long indexIdGreaterThanOrEqual){
        this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
    }

    public void setIndexIdLessThanOrEqual(Long indexIdLessThanOrEqual){
	this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
    }

    public void setIndexIds(List<Long> indexIds){
        this.indexIds = indexIds;
    }


    public void setListno(Long listno){
        this.listno = listno;
    }

    public void setListnoGreaterThanOrEqual(Long listnoGreaterThanOrEqual){
        this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
    }

    public void setListnoLessThanOrEqual(Long listnoLessThanOrEqual){
	this.listnoLessThanOrEqual = listnoLessThanOrEqual;
    }

    public void setListnos(List<Long> listnos){
        this.listnos = listnos;
    }


    public void setCreatedateGreaterThanOrEqual(Date createdateGreaterThanOrEqual){
        this.createdateGreaterThanOrEqual = createdateGreaterThanOrEqual;
    }

    public void setCreatedateLessThanOrEqual(Date createdateLessThanOrEqual){
	this.createdateLessThanOrEqual = createdateLessThanOrEqual;
    }


    public void setUpdatedateGreaterThanOrEqual(Date updatedateGreaterThanOrEqual){
        this.updatedateGreaterThanOrEqual = updatedateGreaterThanOrEqual;
    }

    public void setUpdatedateLessThanOrEqual(Date updatedateLessThanOrEqual){
	this.updatedateLessThanOrEqual = updatedateLessThanOrEqual;
    }


    public void setLessessid(String lessessid){
        this.lessessid = lessessid;
    }

    public void setLessessidLike( String lessessidLike){
	this.lessessidLike = lessessidLike;
    }

    public void setLessessids(List<String> lessessids){
        this.lessessids = lessessids;
    }


    public void setCreater(String creater){
        this.creater = creater;
    }

    public void setCreaterLike( String createrLike){
	this.createrLike = createrLike;
    }

    public void setCreaters(List<String> creaters){
        this.creaters = creaters;
    }


    public void setUpdater(String updater){
        this.updater = updater;
    }

    public void setUpdaterLike( String updaterLike){
	this.updaterLike = updaterLike;
    }

    public void setUpdaters(List<String> updaters){
        this.updaters = updaters;
    }




    public StaffInfoQuery code(String code){
	if (code == null) {
	    throw new RuntimeException("code is null");
        }         
	this.code = code;
	return this;
    }

    public StaffInfoQuery codeLike( String codeLike){
        if (codeLike == null) {
            throw new RuntimeException("code is null");
        }
        this.codeLike = codeLike;
        return this;
    }

    public StaffInfoQuery codes(List<String> codes){
        if (codes == null) {
            throw new RuntimeException("codes is empty ");
        }
        this.codes = codes;
        return this;
    }


    public StaffInfoQuery name(String name){
	if (name == null) {
	    throw new RuntimeException("name is null");
        }         
	this.name = name;
	return this;
    }

    public StaffInfoQuery nameLike( String nameLike){
        if (nameLike == null) {
            throw new RuntimeException("name is null");
        }
        this.nameLike = nameLike;
        return this;
    }

    public StaffInfoQuery names(List<String> names){
        if (names == null) {
            throw new RuntimeException("names is empty ");
        }
        this.names = names;
        return this;
    }


    public StaffInfoQuery sex(String sex){
	if (sex == null) {
	    throw new RuntimeException("sex is null");
        }         
	this.sex = sex;
	return this;
    }

    public StaffInfoQuery sexLike( String sexLike){
        if (sexLike == null) {
            throw new RuntimeException("sex is null");
        }
        this.sexLike = sexLike;
        return this;
    }

    public StaffInfoQuery sexs(List<String> sexs){
        if (sexs == null) {
            throw new RuntimeException("sexs is empty ");
        }
        this.sexs = sexs;
        return this;
    }


    public StaffInfoQuery deptId(String deptId){
	if (deptId == null) {
	    throw new RuntimeException("deptId is null");
        }         
	this.deptId = deptId;
	return this;
    }

    public StaffInfoQuery deptIdLike( String deptIdLike){
        if (deptIdLike == null) {
            throw new RuntimeException("deptId is null");
        }
        this.deptIdLike = deptIdLike;
        return this;
    }

    public StaffInfoQuery deptIds(List<String> deptIds){
        if (deptIds == null) {
            throw new RuntimeException("deptIds is empty ");
        }
        this.deptIds = deptIds;
        return this;
    }


    public StaffInfoQuery department(String department){
	if (department == null) {
	    throw new RuntimeException("department is null");
        }         
	this.department = department;
	return this;
    }

    public StaffInfoQuery departmentLike( String departmentLike){
        if (departmentLike == null) {
            throw new RuntimeException("department is null");
        }
        this.departmentLike = departmentLike;
        return this;
    }

    public StaffInfoQuery departments(List<String> departments){
        if (departments == null) {
            throw new RuntimeException("departments is empty ");
        }
        this.departments = departments;
        return this;
    }


    public StaffInfoQuery post(String post){
	if (post == null) {
	    throw new RuntimeException("post is null");
        }         
	this.post = post;
	return this;
    }

    public StaffInfoQuery postLike( String postLike){
        if (postLike == null) {
            throw new RuntimeException("post is null");
        }
        this.postLike = postLike;
        return this;
    }

    public StaffInfoQuery posts(List<String> posts){
        if (posts == null) {
            throw new RuntimeException("posts is empty ");
        }
        this.posts = posts;
        return this;
    }



    public StaffInfoQuery entryDateGreaterThanOrEqual(Date entryDateGreaterThanOrEqual){
	if (entryDateGreaterThanOrEqual == null) {
	    throw new RuntimeException("entryDate is null");
        }         
	this.entryDateGreaterThanOrEqual = entryDateGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery entryDateLessThanOrEqual(Date entryDateLessThanOrEqual){
        if (entryDateLessThanOrEqual == null) {
            throw new RuntimeException("entryDate is null");
        }
        this.entryDateLessThanOrEqual = entryDateLessThanOrEqual;
        return this;
    }



    public StaffInfoQuery userId(String userId){
	if (userId == null) {
	    throw new RuntimeException("userId is null");
        }         
	this.userId = userId;
	return this;
    }

    public StaffInfoQuery userIdLike( String userIdLike){
        if (userIdLike == null) {
            throw new RuntimeException("userId is null");
        }
        this.userIdLike = userIdLike;
        return this;
    }

    public StaffInfoQuery userIds(List<String> userIds){
        if (userIds == null) {
            throw new RuntimeException("userIds is empty ");
        }
        this.userIds = userIds;
        return this;
    }


    public StaffInfoQuery staffStatus(String staffStatus){
	if (staffStatus == null) {
	    throw new RuntimeException("staffStatus is null");
        }         
	this.staffStatus = staffStatus;
	return this;
    }

    public StaffInfoQuery staffStatusLike( String staffStatusLike){
        if (staffStatusLike == null) {
            throw new RuntimeException("staffStatus is null");
        }
        this.staffStatusLike = staffStatusLike;
        return this;
    }

    public StaffInfoQuery staffStatuss(List<String> staffStatuss){
        if (staffStatuss == null) {
            throw new RuntimeException("staffStatuss is empty ");
        }
        this.staffStatuss = staffStatuss;
        return this;
    }



    public StaffInfoQuery becomerDateGreaterThanOrEqual(Date becomerDateGreaterThanOrEqual){
	if (becomerDateGreaterThanOrEqual == null) {
	    throw new RuntimeException("becomerDate is null");
        }         
	this.becomerDateGreaterThanOrEqual = becomerDateGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery becomerDateLessThanOrEqual(Date becomerDateLessThanOrEqual){
        if (becomerDateLessThanOrEqual == null) {
            throw new RuntimeException("becomerDate is null");
        }
        this.becomerDateLessThanOrEqual = becomerDateLessThanOrEqual;
        return this;
    }



    public StaffInfoQuery professionType(String professionType){
	if (professionType == null) {
	    throw new RuntimeException("professionType is null");
        }         
	this.professionType = professionType;
	return this;
    }

    public StaffInfoQuery professionTypeLike( String professionTypeLike){
        if (professionTypeLike == null) {
            throw new RuntimeException("professionType is null");
        }
        this.professionTypeLike = professionTypeLike;
        return this;
    }

    public StaffInfoQuery professionTypes(List<String> professionTypes){
        if (professionTypes == null) {
            throw new RuntimeException("professionTypes is empty ");
        }
        this.professionTypes = professionTypes;
        return this;
    }


    public StaffInfoQuery employmentForm(String employmentForm){
	if (employmentForm == null) {
	    throw new RuntimeException("employmentForm is null");
        }         
	this.employmentForm = employmentForm;
	return this;
    }

    public StaffInfoQuery employmentFormLike( String employmentFormLike){
        if (employmentFormLike == null) {
            throw new RuntimeException("employmentForm is null");
        }
        this.employmentFormLike = employmentFormLike;
        return this;
    }

    public StaffInfoQuery employmentForms(List<String> employmentForms){
        if (employmentForms == null) {
            throw new RuntimeException("employmentForms is empty ");
        }
        this.employmentForms = employmentForms;
        return this;
    }


    public StaffInfoQuery cardNo(String cardNo){
	if (cardNo == null) {
	    throw new RuntimeException("cardNo is null");
        }         
	this.cardNo = cardNo;
	return this;
    }

    public StaffInfoQuery cardNoLike( String cardNoLike){
        if (cardNoLike == null) {
            throw new RuntimeException("cardNo is null");
        }
        this.cardNoLike = cardNoLike;
        return this;
    }

    public StaffInfoQuery cardNos(List<String> cardNos){
        if (cardNos == null) {
            throw new RuntimeException("cardNos is empty ");
        }
        this.cardNos = cardNos;
        return this;
    }



    public StaffInfoQuery birthdayGreaterThanOrEqual(Date birthdayGreaterThanOrEqual){
	if (birthdayGreaterThanOrEqual == null) {
	    throw new RuntimeException("birthday is null");
        }         
	this.birthdayGreaterThanOrEqual = birthdayGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery birthdayLessThanOrEqual(Date birthdayLessThanOrEqual){
        if (birthdayLessThanOrEqual == null) {
            throw new RuntimeException("birthday is null");
        }
        this.birthdayLessThanOrEqual = birthdayLessThanOrEqual;
        return this;
    }



    public StaffInfoQuery age(Integer age){
	if (age == null) {
            throw new RuntimeException("age is null");
        }         
	this.age = age;
	return this;
    }

    public StaffInfoQuery ageGreaterThanOrEqual(Integer ageGreaterThanOrEqual){
	if (ageGreaterThanOrEqual == null) {
	    throw new RuntimeException("age is null");
        }         
	this.ageGreaterThanOrEqual = ageGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery ageLessThanOrEqual(Integer ageLessThanOrEqual){
        if (ageLessThanOrEqual == null) {
            throw new RuntimeException("age is null");
        }
        this.ageLessThanOrEqual = ageLessThanOrEqual;
        return this;
    }

    public StaffInfoQuery ages(List<Integer> ages){
        if (ages == null) {
            throw new RuntimeException("ages is empty ");
        }
        this.ages = ages;
        return this;
    }


    public StaffInfoQuery nativePlace(String nativePlace){
	if (nativePlace == null) {
	    throw new RuntimeException("nativePlace is null");
        }         
	this.nativePlace = nativePlace;
	return this;
    }

    public StaffInfoQuery nativePlaceLike( String nativePlaceLike){
        if (nativePlaceLike == null) {
            throw new RuntimeException("nativePlace is null");
        }
        this.nativePlaceLike = nativePlaceLike;
        return this;
    }

    public StaffInfoQuery nativePlaces(List<String> nativePlaces){
        if (nativePlaces == null) {
            throw new RuntimeException("nativePlaces is empty ");
        }
        this.nativePlaces = nativePlaces;
        return this;
    }


    public StaffInfoQuery politicalStatus(String politicalStatus){
	if (politicalStatus == null) {
	    throw new RuntimeException("politicalStatus is null");
        }         
	this.politicalStatus = politicalStatus;
	return this;
    }

    public StaffInfoQuery politicalStatusLike( String politicalStatusLike){
        if (politicalStatusLike == null) {
            throw new RuntimeException("politicalStatus is null");
        }
        this.politicalStatusLike = politicalStatusLike;
        return this;
    }

    public StaffInfoQuery politicalStatuss(List<String> politicalStatuss){
        if (politicalStatuss == null) {
            throw new RuntimeException("politicalStatuss is empty ");
        }
        this.politicalStatuss = politicalStatuss;
        return this;
    }


    public StaffInfoQuery nation(String nation){
	if (nation == null) {
	    throw new RuntimeException("nation is null");
        }         
	this.nation = nation;
	return this;
    }

    public StaffInfoQuery nationLike( String nationLike){
        if (nationLike == null) {
            throw new RuntimeException("nation is null");
        }
        this.nationLike = nationLike;
        return this;
    }

    public StaffInfoQuery nations(List<String> nations){
        if (nations == null) {
            throw new RuntimeException("nations is empty ");
        }
        this.nations = nations;
        return this;
    }


    public StaffInfoQuery maritalStatus(String maritalStatus){
	if (maritalStatus == null) {
	    throw new RuntimeException("maritalStatus is null");
        }         
	this.maritalStatus = maritalStatus;
	return this;
    }

    public StaffInfoQuery maritalStatusLike( String maritalStatusLike){
        if (maritalStatusLike == null) {
            throw new RuntimeException("maritalStatus is null");
        }
        this.maritalStatusLike = maritalStatusLike;
        return this;
    }

    public StaffInfoQuery maritalStatuss(List<String> maritalStatuss){
        if (maritalStatuss == null) {
            throw new RuntimeException("maritalStatuss is empty ");
        }
        this.maritalStatuss = maritalStatuss;
        return this;
    }


    public StaffInfoQuery registeredResidence(String registeredResidence){
	if (registeredResidence == null) {
	    throw new RuntimeException("registeredResidence is null");
        }         
	this.registeredResidence = registeredResidence;
	return this;
    }

    public StaffInfoQuery registeredResidenceLike( String registeredResidenceLike){
        if (registeredResidenceLike == null) {
            throw new RuntimeException("registeredResidence is null");
        }
        this.registeredResidenceLike = registeredResidenceLike;
        return this;
    }

    public StaffInfoQuery registeredResidences(List<String> registeredResidences){
        if (registeredResidences == null) {
            throw new RuntimeException("registeredResidences is empty ");
        }
        this.registeredResidences = registeredResidences;
        return this;
    }


    public StaffInfoQuery cardNoExpire(String cardNoExpire){
	if (cardNoExpire == null) {
	    throw new RuntimeException("cardNoExpire is null");
        }         
	this.cardNoExpire = cardNoExpire;
	return this;
    }

    public StaffInfoQuery cardNoExpireLike( String cardNoExpireLike){
        if (cardNoExpireLike == null) {
            throw new RuntimeException("cardNoExpire is null");
        }
        this.cardNoExpireLike = cardNoExpireLike;
        return this;
    }

    public StaffInfoQuery cardNoExpires(List<String> cardNoExpires){
        if (cardNoExpires == null) {
            throw new RuntimeException("cardNoExpires is empty ");
        }
        this.cardNoExpires = cardNoExpires;
        return this;
    }


    public StaffInfoQuery mobileTelphone(String mobileTelphone){
	if (mobileTelphone == null) {
	    throw new RuntimeException("mobileTelphone is null");
        }         
	this.mobileTelphone = mobileTelphone;
	return this;
    }

    public StaffInfoQuery mobileTelphoneLike( String mobileTelphoneLike){
        if (mobileTelphoneLike == null) {
            throw new RuntimeException("mobileTelphone is null");
        }
        this.mobileTelphoneLike = mobileTelphoneLike;
        return this;
    }

    public StaffInfoQuery mobileTelphones(List<String> mobileTelphones){
        if (mobileTelphones == null) {
            throw new RuntimeException("mobileTelphones is empty ");
        }
        this.mobileTelphones = mobileTelphones;
        return this;
    }


    public StaffInfoQuery email(String email){
	if (email == null) {
	    throw new RuntimeException("email is null");
        }         
	this.email = email;
	return this;
    }

    public StaffInfoQuery emailLike( String emailLike){
        if (emailLike == null) {
            throw new RuntimeException("email is null");
        }
        this.emailLike = emailLike;
        return this;
    }

    public StaffInfoQuery emails(List<String> emails){
        if (emails == null) {
            throw new RuntimeException("emails is empty ");
        }
        this.emails = emails;
        return this;
    }


    public StaffInfoQuery homeAddress(String homeAddress){
	if (homeAddress == null) {
	    throw new RuntimeException("homeAddress is null");
        }         
	this.homeAddress = homeAddress;
	return this;
    }

    public StaffInfoQuery homeAddressLike( String homeAddressLike){
        if (homeAddressLike == null) {
            throw new RuntimeException("homeAddress is null");
        }
        this.homeAddressLike = homeAddressLike;
        return this;
    }

    public StaffInfoQuery homeAddresss(List<String> homeAddresss){
        if (homeAddresss == null) {
            throw new RuntimeException("homeAddresss is empty ");
        }
        this.homeAddresss = homeAddresss;
        return this;
    }


    public StaffInfoQuery educationalBackground(String educationalBackground){
	if (educationalBackground == null) {
	    throw new RuntimeException("educationalBackground is null");
        }         
	this.educationalBackground = educationalBackground;
	return this;
    }

    public StaffInfoQuery educationalBackgroundLike( String educationalBackgroundLike){
        if (educationalBackgroundLike == null) {
            throw new RuntimeException("educationalBackground is null");
        }
        this.educationalBackgroundLike = educationalBackgroundLike;
        return this;
    }

    public StaffInfoQuery educationalBackgrounds(List<String> educationalBackgrounds){
        if (educationalBackgrounds == null) {
            throw new RuntimeException("educationalBackgrounds is empty ");
        }
        this.educationalBackgrounds = educationalBackgrounds;
        return this;
    }


    public StaffInfoQuery degree(String degree){
	if (degree == null) {
	    throw new RuntimeException("degree is null");
        }         
	this.degree = degree;
	return this;
    }

    public StaffInfoQuery degreeLike( String degreeLike){
        if (degreeLike == null) {
            throw new RuntimeException("degree is null");
        }
        this.degreeLike = degreeLike;
        return this;
    }

    public StaffInfoQuery degrees(List<String> degrees){
        if (degrees == null) {
            throw new RuntimeException("degrees is empty ");
        }
        this.degrees = degrees;
        return this;
    }


    public StaffInfoQuery graduateInstitutions(String graduateInstitutions){
	if (graduateInstitutions == null) {
	    throw new RuntimeException("graduateInstitutions is null");
        }         
	this.graduateInstitutions = graduateInstitutions;
	return this;
    }

    public StaffInfoQuery graduateInstitutionsLike( String graduateInstitutionsLike){
        if (graduateInstitutionsLike == null) {
            throw new RuntimeException("graduateInstitutions is null");
        }
        this.graduateInstitutionsLike = graduateInstitutionsLike;
        return this;
    }

    public StaffInfoQuery graduateInstitutionss(List<String> graduateInstitutionss){
        if (graduateInstitutionss == null) {
            throw new RuntimeException("graduateInstitutionss is empty ");
        }
        this.graduateInstitutionss = graduateInstitutionss;
        return this;
    }


    public StaffInfoQuery profession(String profession){
	if (profession == null) {
	    throw new RuntimeException("profession is null");
        }         
	this.profession = profession;
	return this;
    }

    public StaffInfoQuery professionLike( String professionLike){
        if (professionLike == null) {
            throw new RuntimeException("profession is null");
        }
        this.professionLike = professionLike;
        return this;
    }

    public StaffInfoQuery professions(List<String> professions){
        if (professions == null) {
            throw new RuntimeException("professions is empty ");
        }
        this.professions = professions;
        return this;
    }



    public StaffInfoQuery graduationTimeGreaterThanOrEqual(Date graduationTimeGreaterThanOrEqual){
	if (graduationTimeGreaterThanOrEqual == null) {
	    throw new RuntimeException("graduationTime is null");
        }         
	this.graduationTimeGreaterThanOrEqual = graduationTimeGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery graduationTimeLessThanOrEqual(Date graduationTimeLessThanOrEqual){
        if (graduationTimeLessThanOrEqual == null) {
            throw new RuntimeException("graduationTime is null");
        }
        this.graduationTimeLessThanOrEqual = graduationTimeLessThanOrEqual;
        return this;
    }



    public StaffInfoQuery foreignLanguage(String foreignLanguage){
	if (foreignLanguage == null) {
	    throw new RuntimeException("foreignLanguage is null");
        }         
	this.foreignLanguage = foreignLanguage;
	return this;
    }

    public StaffInfoQuery foreignLanguageLike( String foreignLanguageLike){
        if (foreignLanguageLike == null) {
            throw new RuntimeException("foreignLanguage is null");
        }
        this.foreignLanguageLike = foreignLanguageLike;
        return this;
    }

    public StaffInfoQuery foreignLanguages(List<String> foreignLanguages){
        if (foreignLanguages == null) {
            throw new RuntimeException("foreignLanguages is empty ");
        }
        this.foreignLanguages = foreignLanguages;
        return this;
    }


    public StaffInfoQuery technicalTitle(String technicalTitle){
	if (technicalTitle == null) {
	    throw new RuntimeException("technicalTitle is null");
        }         
	this.technicalTitle = technicalTitle;
	return this;
    }

    public StaffInfoQuery technicalTitleLike( String technicalTitleLike){
        if (technicalTitleLike == null) {
            throw new RuntimeException("technicalTitle is null");
        }
        this.technicalTitleLike = technicalTitleLike;
        return this;
    }

    public StaffInfoQuery technicalTitles(List<String> technicalTitles){
        if (technicalTitles == null) {
            throw new RuntimeException("technicalTitles is empty ");
        }
        this.technicalTitles = technicalTitles;
        return this;
    }


    public StaffInfoQuery educationalExperience(String educationalExperience){
	if (educationalExperience == null) {
	    throw new RuntimeException("educationalExperience is null");
        }         
	this.educationalExperience = educationalExperience;
	return this;
    }

    public StaffInfoQuery educationalExperienceLike( String educationalExperienceLike){
        if (educationalExperienceLike == null) {
            throw new RuntimeException("educationalExperience is null");
        }
        this.educationalExperienceLike = educationalExperienceLike;
        return this;
    }

    public StaffInfoQuery educationalExperiences(List<String> educationalExperiences){
        if (educationalExperiences == null) {
            throw new RuntimeException("educationalExperiences is empty ");
        }
        this.educationalExperiences = educationalExperiences;
        return this;
    }


    public StaffInfoQuery workExperience(String workExperience){
	if (workExperience == null) {
	    throw new RuntimeException("workExperience is null");
        }         
	this.workExperience = workExperience;
	return this;
    }

    public StaffInfoQuery workExperienceLike( String workExperienceLike){
        if (workExperienceLike == null) {
            throw new RuntimeException("workExperience is null");
        }
        this.workExperienceLike = workExperienceLike;
        return this;
    }

    public StaffInfoQuery workExperiences(List<String> workExperiences){
        if (workExperiences == null) {
            throw new RuntimeException("workExperiences is empty ");
        }
        this.workExperiences = workExperiences;
        return this;
    }


    public StaffInfoQuery tenantId(String tenantId){
	if (tenantId == null) {
	    throw new RuntimeException("tenantId is null");
        }         
	this.tenantId = tenantId;
	return this;
    }

    public StaffInfoQuery tenantIdLike( String tenantIdLike){
        if (tenantIdLike == null) {
            throw new RuntimeException("tenantId is null");
        }
        this.tenantIdLike = tenantIdLike;
        return this;
    }

    public StaffInfoQuery tenantIds(List<String> tenantIds){
        if (tenantIds == null) {
            throw new RuntimeException("tenantIds is empty ");
        }
        this.tenantIds = tenantIds;
        return this;
    }


    public StaffInfoQuery tenantName(String tenantName){
	if (tenantName == null) {
	    throw new RuntimeException("tenantName is null");
        }         
	this.tenantName = tenantName;
	return this;
    }

    public StaffInfoQuery tenantNameLike( String tenantNameLike){
        if (tenantNameLike == null) {
            throw new RuntimeException("tenantName is null");
        }
        this.tenantNameLike = tenantNameLike;
        return this;
    }

    public StaffInfoQuery tenantNames(List<String> tenantNames){
        if (tenantNames == null) {
            throw new RuntimeException("tenantNames is empty ");
        }
        this.tenantNames = tenantNames;
        return this;
    }


    public StaffInfoQuery deleteFlag(Integer deleteFlag){
	if (deleteFlag == null) {
            throw new RuntimeException("deleteFlag is null");
        }         
	this.deleteFlag = deleteFlag;
	return this;
    }

    public StaffInfoQuery deleteFlagGreaterThanOrEqual(Integer deleteFlagGreaterThanOrEqual){
	if (deleteFlagGreaterThanOrEqual == null) {
	    throw new RuntimeException("deleteFlag is null");
        }         
	this.deleteFlagGreaterThanOrEqual = deleteFlagGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery deleteFlagLessThanOrEqual(Integer deleteFlagLessThanOrEqual){
        if (deleteFlagLessThanOrEqual == null) {
            throw new RuntimeException("deleteFlag is null");
        }
        this.deleteFlagLessThanOrEqual = deleteFlagLessThanOrEqual;
        return this;
    }

    public StaffInfoQuery deleteFlags(List<Integer> deleteFlags){
        if (deleteFlags == null) {
            throw new RuntimeException("deleteFlags is empty ");
        }
        this.deleteFlags = deleteFlags;
        return this;
    }


    public StaffInfoQuery topid(String topid){
	if (topid == null) {
	    throw new RuntimeException("topid is null");
        }         
	this.topid = topid;
	return this;
    }

    public StaffInfoQuery topidLike( String topidLike){
        if (topidLike == null) {
            throw new RuntimeException("topid is null");
        }
        this.topidLike = topidLike;
        return this;
    }

    public StaffInfoQuery topids(List<String> topids){
        if (topids == null) {
            throw new RuntimeException("topids is empty ");
        }
        this.topids = topids;
        return this;
    }


    public StaffInfoQuery parentId(Long parentId){
	if (parentId == null) {
            throw new RuntimeException("parentId is null");
        }         
	this.parentId = parentId;
	return this;
    }

    public StaffInfoQuery parentIdGreaterThanOrEqual(Long parentIdGreaterThanOrEqual){
	if (parentIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("parentId is null");
        }         
	this.parentIdGreaterThanOrEqual = parentIdGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery parentIdLessThanOrEqual(Long parentIdLessThanOrEqual){
        if (parentIdLessThanOrEqual == null) {
            throw new RuntimeException("parentId is null");
        }
        this.parentIdLessThanOrEqual = parentIdLessThanOrEqual;
        return this;
    }

    public StaffInfoQuery parentIds(List<Long> parentIds){
        if (parentIds == null) {
            throw new RuntimeException("parentIds is empty ");
        }
        this.parentIds = parentIds;
        return this;
    }


    public StaffInfoQuery treeId(String treeId){
	if (treeId == null) {
	    throw new RuntimeException("treeId is null");
        }         
	this.treeId = treeId;
	return this;
    }

    public StaffInfoQuery treeIdLike( String treeIdLike){
        if (treeIdLike == null) {
            throw new RuntimeException("treeId is null");
        }
        this.treeIdLike = treeIdLike;
        return this;
    }

    public StaffInfoQuery treeIds(List<String> treeIds){
        if (treeIds == null) {
            throw new RuntimeException("treeIds is empty ");
        }
        this.treeIds = treeIds;
        return this;
    }


    public StaffInfoQuery indexId(Long indexId){
	if (indexId == null) {
            throw new RuntimeException("indexId is null");
        }         
	this.indexId = indexId;
	return this;
    }

    public StaffInfoQuery indexIdGreaterThanOrEqual(Long indexIdGreaterThanOrEqual){
	if (indexIdGreaterThanOrEqual == null) {
	    throw new RuntimeException("indexId is null");
        }         
	this.indexIdGreaterThanOrEqual = indexIdGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery indexIdLessThanOrEqual(Long indexIdLessThanOrEqual){
        if (indexIdLessThanOrEqual == null) {
            throw new RuntimeException("indexId is null");
        }
        this.indexIdLessThanOrEqual = indexIdLessThanOrEqual;
        return this;
    }

    public StaffInfoQuery indexIds(List<Long> indexIds){
        if (indexIds == null) {
            throw new RuntimeException("indexIds is empty ");
        }
        this.indexIds = indexIds;
        return this;
    }


    public StaffInfoQuery listno(Long listno){
	if (listno == null) {
            throw new RuntimeException("listno is null");
        }         
	this.listno = listno;
	return this;
    }

    public StaffInfoQuery listnoGreaterThanOrEqual(Long listnoGreaterThanOrEqual){
	if (listnoGreaterThanOrEqual == null) {
	    throw new RuntimeException("listno is null");
        }         
	this.listnoGreaterThanOrEqual = listnoGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery listnoLessThanOrEqual(Long listnoLessThanOrEqual){
        if (listnoLessThanOrEqual == null) {
            throw new RuntimeException("listno is null");
        }
        this.listnoLessThanOrEqual = listnoLessThanOrEqual;
        return this;
    }

    public StaffInfoQuery listnos(List<Long> listnos){
        if (listnos == null) {
            throw new RuntimeException("listnos is empty ");
        }
        this.listnos = listnos;
        return this;
    }



    public StaffInfoQuery createdateGreaterThanOrEqual(Date createdateGreaterThanOrEqual){
	if (createdateGreaterThanOrEqual == null) {
	    throw new RuntimeException("createdate is null");
        }         
	this.createdateGreaterThanOrEqual = createdateGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery createdateLessThanOrEqual(Date createdateLessThanOrEqual){
        if (createdateLessThanOrEqual == null) {
            throw new RuntimeException("createdate is null");
        }
        this.createdateLessThanOrEqual = createdateLessThanOrEqual;
        return this;
    }




    public StaffInfoQuery updatedateGreaterThanOrEqual(Date updatedateGreaterThanOrEqual){
	if (updatedateGreaterThanOrEqual == null) {
	    throw new RuntimeException("updatedate is null");
        }         
	this.updatedateGreaterThanOrEqual = updatedateGreaterThanOrEqual;
        return this;
    }

    public StaffInfoQuery updatedateLessThanOrEqual(Date updatedateLessThanOrEqual){
        if (updatedateLessThanOrEqual == null) {
            throw new RuntimeException("updatedate is null");
        }
        this.updatedateLessThanOrEqual = updatedateLessThanOrEqual;
        return this;
    }



    public StaffInfoQuery lessessid(String lessessid){
	if (lessessid == null) {
	    throw new RuntimeException("lessessid is null");
        }         
	this.lessessid = lessessid;
	return this;
    }

    public StaffInfoQuery lessessidLike( String lessessidLike){
        if (lessessidLike == null) {
            throw new RuntimeException("lessessid is null");
        }
        this.lessessidLike = lessessidLike;
        return this;
    }

    public StaffInfoQuery lessessids(List<String> lessessids){
        if (lessessids == null) {
            throw new RuntimeException("lessessids is empty ");
        }
        this.lessessids = lessessids;
        return this;
    }


    public StaffInfoQuery creater(String creater){
	if (creater == null) {
	    throw new RuntimeException("creater is null");
        }         
	this.creater = creater;
	return this;
    }

    public StaffInfoQuery createrLike( String createrLike){
        if (createrLike == null) {
            throw new RuntimeException("creater is null");
        }
        this.createrLike = createrLike;
        return this;
    }

    public StaffInfoQuery creaters(List<String> creaters){
        if (creaters == null) {
            throw new RuntimeException("creaters is empty ");
        }
        this.creaters = creaters;
        return this;
    }


    public StaffInfoQuery updater(String updater){
	if (updater == null) {
	    throw new RuntimeException("updater is null");
        }         
	this.updater = updater;
	return this;
    }

    public StaffInfoQuery updaterLike( String updaterLike){
        if (updaterLike == null) {
            throw new RuntimeException("updater is null");
        }
        this.updaterLike = updaterLike;
        return this;
    }

    public StaffInfoQuery updaters(List<String> updaters){
        if (updaters == null) {
            throw new RuntimeException("updaters is empty ");
        }
        this.updaters = updaters;
        return this;
    }



    public String getOrderBy() {
        if (sortColumn != null) {
			String a_x = " asc ";
			if (sortOrder != null) {
				a_x = sortOrder;
			}

            if ("code".equals(sortColumn)) {
                orderBy = "E.CODE_" + a_x;
            } 

            if ("name".equals(sortColumn)) {
                orderBy = "E.NAME_" + a_x;
            } 

            if ("sex".equals(sortColumn)) {
                orderBy = "E.SEX_" + a_x;
            } 

            if ("deptId".equals(sortColumn)) {
                orderBy = "E.DEPT_ID_" + a_x;
            } 

            if ("department".equals(sortColumn)) {
                orderBy = "E.DEPARTMENT_" + a_x;
            } 

            if ("post".equals(sortColumn)) {
                orderBy = "E.POST_" + a_x;
            } 

            if ("entryDate".equals(sortColumn)) {
                orderBy = "E.ENTRY_DATE_" + a_x;
            } 

            if ("userId".equals(sortColumn)) {
                orderBy = "E.USER_ID_" + a_x;
            } 

            if ("staffStatus".equals(sortColumn)) {
                orderBy = "E.STAFF_STATUS_" + a_x;
            } 

            if ("becomerDate".equals(sortColumn)) {
                orderBy = "E.BECOMER_DATE_" + a_x;
            } 

            if ("professionType".equals(sortColumn)) {
                orderBy = "E.PROFESSION_TYPE_" + a_x;
            } 

            if ("employmentForm".equals(sortColumn)) {
                orderBy = "E.EMPLOYMENT_FORM_" + a_x;
            } 

            if ("cardNo".equals(sortColumn)) {
                orderBy = "E.CARD_NO_" + a_x;
            } 

            if ("birthday".equals(sortColumn)) {
                orderBy = "E.BIRTHDAY_" + a_x;
            } 

            if ("age".equals(sortColumn)) {
                orderBy = "E.AGE_" + a_x;
            } 

            if ("nativePlace".equals(sortColumn)) {
                orderBy = "E.NATIVE_PLACE_" + a_x;
            } 

            if ("politicalStatus".equals(sortColumn)) {
                orderBy = "E.POLITICAL_STATUS_" + a_x;
            } 

            if ("nation".equals(sortColumn)) {
                orderBy = "E.NATION_" + a_x;
            } 

            if ("maritalStatus".equals(sortColumn)) {
                orderBy = "E.MARITAL_STATUS_" + a_x;
            } 

            if ("registeredResidence".equals(sortColumn)) {
                orderBy = "E.REGISTERED_RESIDENCE_" + a_x;
            } 

            if ("cardNoExpire".equals(sortColumn)) {
                orderBy = "E.CARD_NO_EXPIRE_" + a_x;
            } 

            if ("mobileTelphone".equals(sortColumn)) {
                orderBy = "E.MOBILE_TELPHONE_" + a_x;
            } 

            if ("email".equals(sortColumn)) {
                orderBy = "E.EMAIL_" + a_x;
            } 

            if ("homeAddress".equals(sortColumn)) {
                orderBy = "E.HOME_ADDRESS_" + a_x;
            } 

            if ("educationalBackground".equals(sortColumn)) {
                orderBy = "E.EDUCATIONAL_BACKGROUND_" + a_x;
            } 

            if ("degree".equals(sortColumn)) {
                orderBy = "E.DEGREE_" + a_x;
            } 

            if ("graduateInstitutions".equals(sortColumn)) {
                orderBy = "E.GRADUATE_INSTITUTIONS_" + a_x;
            } 

            if ("profession".equals(sortColumn)) {
                orderBy = "E.PROFESSION_" + a_x;
            } 

            if ("graduationTime".equals(sortColumn)) {
                orderBy = "E.GRADUATION_TIME_" + a_x;
            } 

            if ("foreignLanguage".equals(sortColumn)) {
                orderBy = "E.FOREIGN_LANGUAGE_" + a_x;
            } 

            if ("technicalTitle".equals(sortColumn)) {
                orderBy = "E.TECHNICAL_TITLE_" + a_x;
            } 

            if ("educationalExperience".equals(sortColumn)) {
                orderBy = "E.EDUCATIONAL_EXPERIENCE_" + a_x;
            } 

            if ("workExperience".equals(sortColumn)) {
                orderBy = "E.WORK_EXPERIENCE_" + a_x;
            } 

            if ("tenantId".equals(sortColumn)) {
                orderBy = "E.TENANT_ID_" + a_x;
            } 

            if ("tenantName".equals(sortColumn)) {
                orderBy = "E.TENANT_NAME_" + a_x;
            } 

            if ("deleteFlag".equals(sortColumn)) {
                orderBy = "E.DELETE_FLAG_" + a_x;
            } 

            if ("topid".equals(sortColumn)) {
                orderBy = "E.TOPID" + a_x;
            } 

            if ("parentId".equals(sortColumn)) {
                orderBy = "E.PARENT_ID" + a_x;
            } 

            if ("treeId".equals(sortColumn)) {
                orderBy = "E.TREE_ID" + a_x;
            } 

            if ("indexId".equals(sortColumn)) {
                orderBy = "E.INDEX_ID" + a_x;
            } 

            if ("listno".equals(sortColumn)) {
                orderBy = "E.LISTNO" + a_x;
            } 

            if ("createdate".equals(sortColumn)) {
                orderBy = "E.CREATEDATE" + a_x;
            } 

            if ("updatedate".equals(sortColumn)) {
                orderBy = "E.UPDATEDATE" + a_x;
            } 

            if ("lessessid".equals(sortColumn)) {
                orderBy = "E.LESSESSID" + a_x;
            } 

            if ("creater".equals(sortColumn)) {
                orderBy = "E.CREATER" + a_x;
            } 

            if ("updater".equals(sortColumn)) {
                orderBy = "E.UPDATER" + a_x;
            } 

        }
        return orderBy;
    }

    @Override
    public void initQueryColumns(){
        super.initQueryColumns();
        addColumn("id", "ID_");
        addColumn("code", "CODE_");
        addColumn("name", "NAME_");
        addColumn("sex", "SEX_");
        addColumn("deptId", "DEPT_ID_");
        addColumn("department", "DEPARTMENT_");
        addColumn("post", "POST_");
        addColumn("entryDate", "ENTRY_DATE_");
        addColumn("userId", "USER_ID_");
        addColumn("staffStatus", "STAFF_STATUS_");
        addColumn("becomerDate", "BECOMER_DATE_");
        addColumn("professionType", "PROFESSION_TYPE_");
        addColumn("employmentForm", "EMPLOYMENT_FORM_");
        addColumn("cardNo", "CARD_NO_");
        addColumn("birthday", "BIRTHDAY_");
        addColumn("age", "AGE_");
        addColumn("nativePlace", "NATIVE_PLACE_");
        addColumn("politicalStatus", "POLITICAL_STATUS_");
        addColumn("nation", "NATION_");
        addColumn("maritalStatus", "MARITAL_STATUS_");
        addColumn("registeredResidence", "REGISTERED_RESIDENCE_");
        addColumn("cardNoExpire", "CARD_NO_EXPIRE_");
        addColumn("mobileTelphone", "MOBILE_TELPHONE_");
        addColumn("email", "EMAIL_");
        addColumn("homeAddress", "HOME_ADDRESS_");
        addColumn("educationalBackground", "EDUCATIONAL_BACKGROUND_");
        addColumn("degree", "DEGREE_");
        addColumn("graduateInstitutions", "GRADUATE_INSTITUTIONS_");
        addColumn("profession", "PROFESSION_");
        addColumn("graduationTime", "GRADUATION_TIME_");
        addColumn("foreignLanguage", "FOREIGN_LANGUAGE_");
        addColumn("technicalTitle", "TECHNICAL_TITLE_");
        addColumn("educationalExperience", "EDUCATIONAL_EXPERIENCE_");
        addColumn("workExperience", "WORK_EXPERIENCE_");
        addColumn("tenantId", "TENANT_ID_");
        addColumn("tenantName", "TENANT_NAME_");
        addColumn("deleteFlag", "DELETE_FLAG_");
        addColumn("topid", "TOPID");
        addColumn("parentId", "PARENT_ID");
        addColumn("treeId", "TREE_ID");
        addColumn("indexId", "INDEX_ID");
        addColumn("listno", "LISTNO");
        addColumn("createdate", "CREATEDATE");
        addColumn("updatedate", "UPDATEDATE");
        addColumn("lessessid", "LESSESSID");
        addColumn("creater", "CREATER");
        addColumn("updater", "UPDATER");
    }

}