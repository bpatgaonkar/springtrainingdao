package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Responsibility generated by hbm2java
 */

@XmlType(name="Responsbility")
@XmlAccessorType(XmlAccessType.FIELD)
public class Responsibility  implements java.io.Serializable {

     @XmlAttribute
     private BigDecimal responsibilityid;
     @XmlTransient
     private long version;
     //@JsonIgnore
     @XmlElement
     private ResponsibilityDef responsibilityDef;
     @XmlTransient
     @JsonIgnore
     private Plan plan;
     @XmlTransient
     private BigDecimal sessionid;
     @XmlTransient
     private Date lstmoddttm;
     @XmlTransient
     private Long position;
     @JsonIgnore
     @XmlTransient
     private Set<ActivityDetail> activityDetails = new HashSet(0);
     //@JsonIgnore
     @XmlTransient
     //@XmlElement
     //@XmlElementWrapper
     private Set<ActivityGroup> activityGroups = new HashSet(0);

    public Responsibility() {
    }

	
    public Responsibility(BigDecimal responsibilityid, ResponsibilityDef responsibilityDef, BigDecimal sessionid, Date lstmoddttm) {
        this.responsibilityid = responsibilityid;
        this.responsibilityDef = responsibilityDef;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public Responsibility(BigDecimal responsibilityid, ResponsibilityDef responsibilityDef, Plan plan, BigDecimal sessionid, Date lstmoddttm, Long position, Set activityDetails, Set activityGroups) {
       this.responsibilityid = responsibilityid;
       this.responsibilityDef = responsibilityDef;
       this.plan = plan;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.position = position;
       this.activityDetails = activityDetails;
       this.activityGroups = activityGroups;
    }
   
    public BigDecimal getResponsibilityid() {
        return this.responsibilityid;
    }
    
    public void setResponsibilityid(BigDecimal responsibilityid) {
        this.responsibilityid = responsibilityid;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public ResponsibilityDef getResponsibilityDef() {
        return this.responsibilityDef;
    }
    
    public void setResponsibilityDef(ResponsibilityDef responsibilityDef) {
        this.responsibilityDef = responsibilityDef;
    }
    public Plan getPlan() {
        return this.plan;
    }
    
    public void setPlan(Plan plan) {
        this.plan = plan;
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
    public Long getPosition() {
        return this.position;
    }
    
    public void setPosition(Long position) {
        this.position = position;
    }
    
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Set<ActivityDetail> getActivityDetails() {
        return this.activityDetails;
    }
    
    public void setActivityDetails(Set activityDetails) {
        this.activityDetails = activityDetails;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Set<ActivityGroup> getActivityGroups() {
        return this.activityGroups;
    }
    
    public void setActivityGroups(Set activityGroups) {
        this.activityGroups = activityGroups;
    }




}


