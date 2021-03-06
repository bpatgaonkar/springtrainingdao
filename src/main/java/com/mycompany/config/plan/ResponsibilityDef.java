package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * ResponsibilityDef generated by hbm2java
 */
@XmlType(name="ResponsibilityDef")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponsibilityDef  implements java.io.Serializable {

	 @XmlTransient
     private BigDecimal responsibilitydefid;
	 @XmlTransient
     private long version;
	 @XmlAttribute
     private String uniquename;
	 @XmlAttribute
     private String displayname;
	 @XmlTransient
     private String renderer;
	 @XmlTransient
     private BigDecimal sessionid;
	 @XmlTransient
     private Date lstmoddttm;
     //@JsonIgnore
	 @XmlTransient
     private String permissiontypecode;
     @JsonIgnore
	 @XmlTransient
     private Set responsibilities = new HashSet(0);

    public ResponsibilityDef() {
    }

	
    public ResponsibilityDef(BigDecimal responsibilitydefid, BigDecimal sessionid, Date lstmoddttm) {
        this.responsibilitydefid = responsibilitydefid;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public ResponsibilityDef(BigDecimal responsibilitydefid, String uniquename, String displayname, String renderer, BigDecimal sessionid, Date lstmoddttm, String permissiontypecode, Set responsibilities) {
       this.responsibilitydefid = responsibilitydefid;
       this.uniquename = uniquename;
       this.displayname = displayname;
       this.renderer = renderer;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.permissiontypecode = permissiontypecode;
       this.responsibilities = responsibilities;
    }
   
    public BigDecimal getResponsibilitydefid() {
        return this.responsibilitydefid;
    }
    
    public void setResponsibilitydefid(BigDecimal responsibilitydefid) {
        this.responsibilitydefid = responsibilitydefid;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    public String getUniquename() {
        return this.uniquename;
    }
    
    public void setUniquename(String uniquename) {
        this.uniquename = uniquename;
    }
    public String getDisplayname() {
        return this.displayname;
    }
    
    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }
    public String getRenderer() {
        return this.renderer;
    }
    
    public void setRenderer(String renderer) {
        this.renderer = renderer;
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
    public String getPermissiontypecode() {
        return this.permissiontypecode;
    }
    
    public void setPermissiontypecode(String permissiontypecode) {
        this.permissiontypecode = permissiontypecode;
    }
    @JsonIgnore 
    public Set getResponsibilities() {
        return this.responsibilities;
    }
    
    public void setResponsibilities(Set responsibilities) {
        this.responsibilities = responsibilities;
    }




}


