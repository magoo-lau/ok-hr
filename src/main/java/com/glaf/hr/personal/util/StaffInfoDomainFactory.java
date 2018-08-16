package com.glaf.hr.personal.util;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.glaf.core.base.DataRequest;
import com.glaf.core.base.DataRequest.FilterDescriptor;
import com.glaf.core.domain.ColumnDefinition;
import com.glaf.core.domain.TableDefinition;
import com.glaf.core.util.DBUtils;



/**
 * 
 * 实体数据工厂类
 *
 */
public class StaffInfoDomainFactory {

    public static final String TABLENAME = "HR_STAFF_INFO";

    public static final ConcurrentMap<String, String> columnMap = new ConcurrentHashMap<String, String>();

    public static final ConcurrentMap<String, String> javaTypeMap = new ConcurrentHashMap<String, String>();

    static{
        columnMap.put("id", "ID_");
        columnMap.put("code", "CODE_");
        columnMap.put("name", "NAME_");
        columnMap.put("sex", "SEX_");
        columnMap.put("deptId", "DEPT_ID_");
        columnMap.put("department", "DEPARTMENT_");
        columnMap.put("post", "POST_");
        columnMap.put("entryDate", "ENTRY_DATE_");
        columnMap.put("userId", "USER_ID_");
        columnMap.put("staffStatus", "STAFF_STATUS_");
        columnMap.put("becomerDate", "BECOMER_DATE_");
        columnMap.put("professionType", "PROFESSION_TYPE_");
        columnMap.put("employmentForm", "EMPLOYMENT_FORM_");
        columnMap.put("cardNo", "CARD_NO_");
        columnMap.put("birthday", "BIRTHDAY_");
        columnMap.put("age", "AGE_");
        columnMap.put("nativePlace", "NATIVE_PLACE_");
        columnMap.put("politicalStatus", "POLITICAL_STATUS_");
        columnMap.put("nation", "NATION_");
        columnMap.put("maritalStatus", "MARITAL_STATUS_");
        columnMap.put("registeredResidence", "REGISTERED_RESIDENCE_");
        columnMap.put("cardNoExpire", "CARD_NO_EXPIRE_");
        columnMap.put("mobileTelphone", "MOBILE_TELPHONE_");
        columnMap.put("email", "EMAIL_");
        columnMap.put("homeAddress", "HOME_ADDRESS_");
        columnMap.put("educationalBackground", "EDUCATIONAL_BACKGROUND_");
        columnMap.put("degree", "DEGREE_");
        columnMap.put("graduateInstitutions", "GRADUATE_INSTITUTIONS_");
        columnMap.put("profession", "PROFESSION_");
        columnMap.put("graduationTime", "GRADUATION_TIME_");
        columnMap.put("foreignLanguage", "FOREIGN_LANGUAGE_");
        columnMap.put("technicalTitle", "TECHNICAL_TITLE_");
        columnMap.put("educationalExperience", "EDUCATIONAL_EXPERIENCE_");
        columnMap.put("workExperience", "WORK_EXPERIENCE_");
        columnMap.put("tenantId", "TENANT_ID_");
        columnMap.put("tenantName", "TENANT_NAME_");
        columnMap.put("deleteFlag", "DELETE_FLAG_");
        columnMap.put("topid", "TOPID");
        columnMap.put("parentId", "PARENT_ID");
        columnMap.put("treeId", "TREE_ID");
        columnMap.put("indexId", "INDEX_ID");
        columnMap.put("listno", "LISTNO");
        columnMap.put("createdate", "CREATEDATE");
        columnMap.put("updatedate", "UPDATEDATE");
        columnMap.put("lessessid", "LESSESSID");
        columnMap.put("creater", "CREATER");
        columnMap.put("updater", "UPDATER");

	javaTypeMap.put("id", "String");
        javaTypeMap.put("code", "String");
        javaTypeMap.put("name", "String");
        javaTypeMap.put("sex", "String");
        javaTypeMap.put("deptId", "String");
        javaTypeMap.put("department", "String");
        javaTypeMap.put("post", "String");
        javaTypeMap.put("entryDate", "Date");
        javaTypeMap.put("userId", "String");
        javaTypeMap.put("staffStatus", "String");
        javaTypeMap.put("becomerDate", "Date");
        javaTypeMap.put("professionType", "String");
        javaTypeMap.put("employmentForm", "String");
        javaTypeMap.put("cardNo", "String");
        javaTypeMap.put("birthday", "Date");
        javaTypeMap.put("age", "Integer");
        javaTypeMap.put("nativePlace", "String");
        javaTypeMap.put("politicalStatus", "String");
        javaTypeMap.put("nation", "String");
        javaTypeMap.put("maritalStatus", "String");
        javaTypeMap.put("registeredResidence", "String");
        javaTypeMap.put("cardNoExpire", "String");
        javaTypeMap.put("mobileTelphone", "String");
        javaTypeMap.put("email", "String");
        javaTypeMap.put("homeAddress", "String");
        javaTypeMap.put("educationalBackground", "String");
        javaTypeMap.put("degree", "String");
        javaTypeMap.put("graduateInstitutions", "String");
        javaTypeMap.put("profession", "String");
        javaTypeMap.put("graduationTime", "Date");
        javaTypeMap.put("foreignLanguage", "String");
        javaTypeMap.put("technicalTitle", "String");
        javaTypeMap.put("educationalExperience", "String");
        javaTypeMap.put("workExperience", "String");
        javaTypeMap.put("tenantId", "String");
        javaTypeMap.put("tenantName", "String");
        javaTypeMap.put("deleteFlag", "Integer");
        javaTypeMap.put("topid", "String");
        javaTypeMap.put("parentId", "Long");
        javaTypeMap.put("treeId", "String");
        javaTypeMap.put("indexId", "Long");
        javaTypeMap.put("listno", "Long");
        javaTypeMap.put("createdate", "Date");
        javaTypeMap.put("updatedate", "Date");
        javaTypeMap.put("lessessid", "String");
        javaTypeMap.put("creater", "String");
        javaTypeMap.put("updater", "String");
    }


    public static Map<String, String> getColumnMap() {
	return columnMap;
    }

    public static Map<String, String> getJavaTypeMap() {
	return javaTypeMap;
    }

    public static TableDefinition getTableDefinition(){
        return getTableDefinition(TABLENAME);
    }

    public static TableDefinition getTableDefinition(String tableName) {
        tableName = tableName.toUpperCase();
        TableDefinition tableDefinition = new TableDefinition();
        tableDefinition.setTableName(tableName);
        tableDefinition.setName("StaffInfo");

        ColumnDefinition idColumn = new ColumnDefinition();
        idColumn.setName("id");
        idColumn.setColumnName("ID_");
        idColumn.setJavaType("String");
        idColumn.setLength(64);
        tableDefinition.setIdColumn(idColumn);


        ColumnDefinition code = new ColumnDefinition();
        code.setName("code");
        code.setColumnName("CODE_");
        code.setJavaType("String");
        code.setLength(100);
        tableDefinition.addColumn(code);

        ColumnDefinition name = new ColumnDefinition();
        name.setName("name");
        name.setColumnName("NAME_");
        name.setJavaType("String");
        name.setLength(100);
        tableDefinition.addColumn(name);

        ColumnDefinition sex = new ColumnDefinition();
        sex.setName("sex");
        sex.setColumnName("SEX_");
        sex.setJavaType("String");
        sex.setLength(100);
        tableDefinition.addColumn(sex);

        ColumnDefinition deptId = new ColumnDefinition();
        deptId.setName("deptId");
        deptId.setColumnName("DEPT_ID_");
        deptId.setJavaType("String");
        deptId.setLength(100);
        tableDefinition.addColumn(deptId);

        ColumnDefinition department = new ColumnDefinition();
        department.setName("department");
        department.setColumnName("DEPARTMENT_");
        department.setJavaType("String");
        department.setLength(100);
        tableDefinition.addColumn(department);

        ColumnDefinition post = new ColumnDefinition();
        post.setName("post");
        post.setColumnName("POST_");
        post.setJavaType("String");
        post.setLength(100);
        tableDefinition.addColumn(post);

        ColumnDefinition entryDate = new ColumnDefinition();
        entryDate.setName("entryDate");
        entryDate.setColumnName("ENTRY_DATE_");
        entryDate.setJavaType("Date");
        tableDefinition.addColumn(entryDate);

        ColumnDefinition userId = new ColumnDefinition();
        userId.setName("userId");
        userId.setColumnName("USER_ID_");
        userId.setJavaType("String");
        userId.setLength(100);
        tableDefinition.addColumn(userId);

        ColumnDefinition staffStatus = new ColumnDefinition();
        staffStatus.setName("staffStatus");
        staffStatus.setColumnName("STAFF_STATUS_");
        staffStatus.setJavaType("String");
        staffStatus.setLength(100);
        tableDefinition.addColumn(staffStatus);

        ColumnDefinition becomerDate = new ColumnDefinition();
        becomerDate.setName("becomerDate");
        becomerDate.setColumnName("BECOMER_DATE_");
        becomerDate.setJavaType("Date");
        tableDefinition.addColumn(becomerDate);

        ColumnDefinition professionType = new ColumnDefinition();
        professionType.setName("professionType");
        professionType.setColumnName("PROFESSION_TYPE_");
        professionType.setJavaType("String");
        professionType.setLength(100);
        tableDefinition.addColumn(professionType);

        ColumnDefinition employmentForm = new ColumnDefinition();
        employmentForm.setName("employmentForm");
        employmentForm.setColumnName("EMPLOYMENT_FORM_");
        employmentForm.setJavaType("String");
        employmentForm.setLength(100);
        tableDefinition.addColumn(employmentForm);

        ColumnDefinition cardNo = new ColumnDefinition();
        cardNo.setName("cardNo");
        cardNo.setColumnName("CARD_NO_");
        cardNo.setJavaType("String");
        cardNo.setLength(100);
        tableDefinition.addColumn(cardNo);

        ColumnDefinition birthday = new ColumnDefinition();
        birthday.setName("birthday");
        birthday.setColumnName("BIRTHDAY_");
        birthday.setJavaType("Date");
        tableDefinition.addColumn(birthday);

        ColumnDefinition age = new ColumnDefinition();
        age.setName("age");
        age.setColumnName("AGE_");
        age.setJavaType("Integer");
        tableDefinition.addColumn(age);

        ColumnDefinition nativePlace = new ColumnDefinition();
        nativePlace.setName("nativePlace");
        nativePlace.setColumnName("NATIVE_PLACE_");
        nativePlace.setJavaType("String");
        nativePlace.setLength(100);
        tableDefinition.addColumn(nativePlace);

        ColumnDefinition politicalStatus = new ColumnDefinition();
        politicalStatus.setName("politicalStatus");
        politicalStatus.setColumnName("POLITICAL_STATUS_");
        politicalStatus.setJavaType("String");
        politicalStatus.setLength(100);
        tableDefinition.addColumn(politicalStatus);

        ColumnDefinition nation = new ColumnDefinition();
        nation.setName("nation");
        nation.setColumnName("NATION_");
        nation.setJavaType("String");
        nation.setLength(100);
        tableDefinition.addColumn(nation);

        ColumnDefinition maritalStatus = new ColumnDefinition();
        maritalStatus.setName("maritalStatus");
        maritalStatus.setColumnName("MARITAL_STATUS_");
        maritalStatus.setJavaType("String");
        maritalStatus.setLength(10);
        tableDefinition.addColumn(maritalStatus);

        ColumnDefinition registeredResidence = new ColumnDefinition();
        registeredResidence.setName("registeredResidence");
        registeredResidence.setColumnName("REGISTERED_RESIDENCE_");
        registeredResidence.setJavaType("String");
        registeredResidence.setLength(100);
        tableDefinition.addColumn(registeredResidence);

        ColumnDefinition cardNoExpire = new ColumnDefinition();
        cardNoExpire.setName("cardNoExpire");
        cardNoExpire.setColumnName("CARD_NO_EXPIRE_");
        cardNoExpire.setJavaType("String");
        cardNoExpire.setLength(100);
        tableDefinition.addColumn(cardNoExpire);

        ColumnDefinition mobileTelphone = new ColumnDefinition();
        mobileTelphone.setName("mobileTelphone");
        mobileTelphone.setColumnName("MOBILE_TELPHONE_");
        mobileTelphone.setJavaType("String");
        mobileTelphone.setLength(100);
        tableDefinition.addColumn(mobileTelphone);

        ColumnDefinition email = new ColumnDefinition();
        email.setName("email");
        email.setColumnName("EMAIL_");
        email.setJavaType("String");
        email.setLength(100);
        tableDefinition.addColumn(email);

        ColumnDefinition homeAddress = new ColumnDefinition();
        homeAddress.setName("homeAddress");
        homeAddress.setColumnName("HOME_ADDRESS_");
        homeAddress.setJavaType("String");
        homeAddress.setLength(100);
        tableDefinition.addColumn(homeAddress);

        ColumnDefinition educationalBackground = new ColumnDefinition();
        educationalBackground.setName("educationalBackground");
        educationalBackground.setColumnName("EDUCATIONAL_BACKGROUND_");
        educationalBackground.setJavaType("String");
        educationalBackground.setLength(100);
        tableDefinition.addColumn(educationalBackground);

        ColumnDefinition degree = new ColumnDefinition();
        degree.setName("degree");
        degree.setColumnName("DEGREE_");
        degree.setJavaType("String");
        degree.setLength(100);
        tableDefinition.addColumn(degree);

        ColumnDefinition graduateInstitutions = new ColumnDefinition();
        graduateInstitutions.setName("graduateInstitutions");
        graduateInstitutions.setColumnName("GRADUATE_INSTITUTIONS_");
        graduateInstitutions.setJavaType("String");
        graduateInstitutions.setLength(100);
        tableDefinition.addColumn(graduateInstitutions);

        ColumnDefinition profession = new ColumnDefinition();
        profession.setName("profession");
        profession.setColumnName("PROFESSION_");
        profession.setJavaType("String");
        profession.setLength(100);
        tableDefinition.addColumn(profession);

        ColumnDefinition graduationTime = new ColumnDefinition();
        graduationTime.setName("graduationTime");
        graduationTime.setColumnName("GRADUATION_TIME_");
        graduationTime.setJavaType("Date");
        tableDefinition.addColumn(graduationTime);

        ColumnDefinition foreignLanguage = new ColumnDefinition();
        foreignLanguage.setName("foreignLanguage");
        foreignLanguage.setColumnName("FOREIGN_LANGUAGE_");
        foreignLanguage.setJavaType("String");
        foreignLanguage.setLength(100);
        tableDefinition.addColumn(foreignLanguage);

        ColumnDefinition technicalTitle = new ColumnDefinition();
        technicalTitle.setName("technicalTitle");
        technicalTitle.setColumnName("TECHNICAL_TITLE_");
        technicalTitle.setJavaType("String");
        technicalTitle.setLength(100);
        tableDefinition.addColumn(technicalTitle);

        ColumnDefinition educationalExperience = new ColumnDefinition();
        educationalExperience.setName("educationalExperience");
        educationalExperience.setColumnName("EDUCATIONAL_EXPERIENCE_");
        educationalExperience.setJavaType("String");
        educationalExperience.setLength(100);
        tableDefinition.addColumn(educationalExperience);

        ColumnDefinition workExperience = new ColumnDefinition();
        workExperience.setName("workExperience");
        workExperience.setColumnName("WORK_EXPERIENCE_");
        workExperience.setJavaType("String");
        workExperience.setLength(100);
        tableDefinition.addColumn(workExperience);

        ColumnDefinition tenantId = new ColumnDefinition();
        tenantId.setName("tenantId");
        tenantId.setColumnName("TENANT_ID_");
        tenantId.setJavaType("String");
        tenantId.setLength(64);
        tableDefinition.addColumn(tenantId);

        ColumnDefinition tenantName = new ColumnDefinition();
        tenantName.setName("tenantName");
        tenantName.setColumnName("TENANT_NAME_");
        tenantName.setJavaType("String");
        tenantName.setLength(64);
        tableDefinition.addColumn(tenantName);

        ColumnDefinition deleteFlag = new ColumnDefinition();
        deleteFlag.setName("deleteFlag");
        deleteFlag.setColumnName("DELETE_FLAG_");
        deleteFlag.setJavaType("Integer");
        tableDefinition.addColumn(deleteFlag);

        ColumnDefinition topid = new ColumnDefinition();
        topid.setName("topid");
        topid.setColumnName("TOPID");
        topid.setJavaType("String");
        topid.setLength(50);
        tableDefinition.addColumn(topid);

        ColumnDefinition parentId = new ColumnDefinition();
        parentId.setName("parentId");
        parentId.setColumnName("PARENT_ID");
        parentId.setJavaType("Long");
        tableDefinition.addColumn(parentId);

        ColumnDefinition treeId = new ColumnDefinition();
        treeId.setName("treeId");
        treeId.setColumnName("TREE_ID");
        treeId.setJavaType("String");
        treeId.setLength(200);
        tableDefinition.addColumn(treeId);

        ColumnDefinition indexId = new ColumnDefinition();
        indexId.setName("indexId");
        indexId.setColumnName("INDEX_ID");
        indexId.setJavaType("Long");
        tableDefinition.addColumn(indexId);

        ColumnDefinition listno = new ColumnDefinition();
        listno.setName("listno");
        listno.setColumnName("LISTNO");
        listno.setJavaType("Long");
        tableDefinition.addColumn(listno);

        ColumnDefinition createdate = new ColumnDefinition();
        createdate.setName("createdate");
        createdate.setColumnName("CREATEDATE");
        createdate.setJavaType("Date");
        tableDefinition.addColumn(createdate);

        ColumnDefinition updatedate = new ColumnDefinition();
        updatedate.setName("updatedate");
        updatedate.setColumnName("UPDATEDATE");
        updatedate.setJavaType("Date");
        tableDefinition.addColumn(updatedate);

        ColumnDefinition lessessid = new ColumnDefinition();
        lessessid.setName("lessessid");
        lessessid.setColumnName("LESSESSID");
        lessessid.setJavaType("String");
        lessessid.setLength(50);
        tableDefinition.addColumn(lessessid);

        ColumnDefinition creater = new ColumnDefinition();
        creater.setName("creater");
        creater.setColumnName("CREATER");
        creater.setJavaType("String");
        creater.setLength(50);
        tableDefinition.addColumn(creater);

        ColumnDefinition updater = new ColumnDefinition();
        updater.setName("updater");
        updater.setColumnName("UPDATER");
        updater.setJavaType("String");
        updater.setLength(50);
        tableDefinition.addColumn(updater);

       return tableDefinition;
     }

	 
    public static TableDefinition createTable() {
        TableDefinition tableDefinition = getTableDefinition(TABLENAME);
        if (!DBUtils.tableExists(TABLENAME)) {
            DBUtils.createTable(tableDefinition);
        } else {
            DBUtils.alterTable(tableDefinition);
        }
        return tableDefinition;
    }


    public static TableDefinition createTable(String tableName) {
        TableDefinition tableDefinition = getTableDefinition(tableName);
        if (!DBUtils.tableExists(tableName)) {
            DBUtils.createTable(tableDefinition);
        } else {
            DBUtils.alterTable(tableDefinition);
        }
        return tableDefinition;
    }


    public static void processDataRequest(DataRequest dataRequest) {
	    if (dataRequest != null) {
		if (dataRequest.getFilter() != null) {
			if (dataRequest.getFilter().getField() != null) {
				dataRequest.getFilter().setColumn(
						columnMap.get(dataRequest.getFilter().getField()));
				dataRequest.getFilter().setJavaType(
						javaTypeMap.get(dataRequest.getFilter().getField()));
			}

			List<FilterDescriptor> filters = dataRequest.getFilter()
					.getFilters();
			for (FilterDescriptor filter : filters) {
				filter.setParent(dataRequest.getFilter());
				if (filter.getField() != null) {
					filter.setColumn(columnMap.get(filter.getField()));
					filter.setJavaType(javaTypeMap.get(filter.getField()));
				}

				List<FilterDescriptor> subFilters = filter.getFilters();
				for (FilterDescriptor f : subFilters) {
					f.setColumn(columnMap.get(f.getField()));
					f.setJavaType(javaTypeMap.get(f.getField()));
					f.setParent(filter);
				}
			}
		}
	    }
    }

    private StaffInfoDomainFactory() {

    }

}
