package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PermissionType generated by hbm2java
 */
public class PermissionType  implements java.io.Serializable {


     private String permissionTypeCode;
     private long version;
     private PermissionGroupType PermissionGroupType;
     private PermissionCatType PermissionCatType;
     private String name;
     private String description;
     private BigDecimal sessionid;
     private Date lstmoddttm;
     private Set activityTypesForPermissionTypeCode = new HashSet(0);
     private Set activiTytypesForRdnlyPermissionTypeCode = new HashSet(0);

    public PermissionType() {
    }

	
    public PermissionType(String permissionTypeCode, BigDecimal sessionid, Date lstmoddttm) {
        this.permissionTypeCode = permissionTypeCode;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public PermissionType(String permissionTypeCode, PermissionGroupType PermissionGroupType, PermissionCatType PermissionCatType, String name, String description, BigDecimal sessionid, Date lstmoddttm, Set activityTypesForPermissionTypeCode, Set activiTytypesForRdnlyPermissionTypeCode) {
       this.permissionTypeCode = permissionTypeCode;
       this.PermissionGroupType = PermissionGroupType;
       this.PermissionCatType = PermissionCatType;
       this.name = name;
       this.description = description;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.activityTypesForPermissionTypeCode = activityTypesForPermissionTypeCode;
       this.activiTytypesForRdnlyPermissionTypeCode = activiTytypesForRdnlyPermissionTypeCode;
    }
   
    public String getPermissionTypeCode() {
        return this.permissionTypeCode;
    }
    
    public void setPermissionTypeCode(String permissionTypeCode) {
        this.permissionTypeCode = permissionTypeCode;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    public PermissionGroupType getPermissionGroupType() {
        return this.PermissionGroupType;
    }
    
    public void setPermissionGroupType(PermissionGroupType PermissionGroupType) {
        this.PermissionGroupType = PermissionGroupType;
    }
    public PermissionCatType getPermissionCatType() {
        return this.PermissionCatType;
    }
    
    public void setPermissionCatType(PermissionCatType PermissionCatType) {
        this.PermissionCatType = PermissionCatType;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getSessionid() {
        return this.sessionid;
    }
    
    public void setSessionid(BigDecimal sessionid) {
        this.sessionid = sessionid;
    }
    public Date getLstmoddttm() {
        return this.lstmoddttm;
    }
    
    public void setLstmoddttm(Date lstmoddttm) {
        this.lstmoddttm = lstmoddttm;
    }
    public Set getActivityTypesForPermissionTypeCode() {
        return this.activityTypesForPermissionTypeCode;
    }
    
    public void setActivityTypesForPermissionTypeCode(Set activityTypesForPermissionTypeCode) {
        this.activityTypesForPermissionTypeCode = activityTypesForPermissionTypeCode;
    }
    public Set getActiviTytypesForRdnlyPermissionTypeCode() {
        return this.activiTytypesForRdnlyPermissionTypeCode;
    }
    
    public void setActiviTytypesForRdnlyPermissionTypeCode(Set activiTytypesForRdnlyPermissionTypeCode) {
        this.activiTytypesForRdnlyPermissionTypeCode = activiTytypesForRdnlyPermissionTypeCode;
    }




}


