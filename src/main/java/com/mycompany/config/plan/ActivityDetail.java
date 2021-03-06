package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * ActivityDetail generated by hbm2java
 */
public class ActivityDetail  implements java.io.Serializable {


     private BigDecimal activitydetailid;
     private long version;
     private Responsibility responsibility;
     private ActivityContext activityContext;
     private String regionclasssys;
     private String regionpropsys;
     private String rootpathsys;
     private BigDecimal regionidsys;
     private BigDecimal sessionid;
     private Date lstmoddttm;
     private Date ad1createddate;
     private Date ad1duedate;
     private Boolean ad1current;
     private Long ad1priority;
     private String ad1title;
     private String ad1text;
     private BigDecimal ad1createdby;
     private Date ad2createddate;
     private Date ad2duedate;
     private Boolean ad2current;
     private Long ad2priority;
     private String ad2title;
     private String ad2text;
     private BigDecimal ad2createdby;
     private Long position;
     private Boolean ad1internalonly;
     private Boolean ad2internalonly;

    public ActivityDetail() {
    }

	
    public ActivityDetail(BigDecimal activitydetailid, Responsibility responsibility, ActivityContext activityContext, BigDecimal sessionid, Date lstmoddttm) {
        this.activitydetailid = activitydetailid;
        this.responsibility = responsibility;
        this.activityContext = activityContext;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public ActivityDetail(BigDecimal activitydetailid, Responsibility responsibility, ActivityContext activityContext, String regionclasssys, String regionpropsys, String rootpathsys, BigDecimal regionidsys, BigDecimal sessionid, Date lstmoddttm, Date ad1createddate, Date ad1duedate, Boolean ad1current, Long ad1priority, String ad1title, String ad1text, BigDecimal ad1createdby, Date ad2createddate, Date ad2duedate, Boolean ad2current, Long ad2priority, String ad2title, String ad2text, BigDecimal ad2createdby, Long position, Boolean ad1internalonly, Boolean ad2internalonly) {
       this.activitydetailid = activitydetailid;
       this.responsibility = responsibility;
       this.activityContext = activityContext;
       this.regionclasssys = regionclasssys;
       this.regionpropsys = regionpropsys;
       this.rootpathsys = rootpathsys;
       this.regionidsys = regionidsys;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.ad1createddate = ad1createddate;
       this.ad1duedate = ad1duedate;
       this.ad1current = ad1current;
       this.ad1priority = ad1priority;
       this.ad1title = ad1title;
       this.ad1text = ad1text;
       this.ad1createdby = ad1createdby;
       this.ad2createddate = ad2createddate;
       this.ad2duedate = ad2duedate;
       this.ad2current = ad2current;
       this.ad2priority = ad2priority;
       this.ad2title = ad2title;
       this.ad2text = ad2text;
       this.ad2createdby = ad2createdby;
       this.position = position;
       this.ad1internalonly = ad1internalonly;
       this.ad2internalonly = ad2internalonly;
    }
   
    public BigDecimal getActivitydetailid() {
        return this.activitydetailid;
    }
    
    public void setActivitydetailid(BigDecimal activitydetailid) {
        this.activitydetailid = activitydetailid;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public Responsibility getResponsibility() {
        return this.responsibility;
    }
    
    public void setResponsibility(Responsibility responsibility) {
        this.responsibility = responsibility;
    }
    
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public ActivityContext getActivityContext() {
        return this.activityContext;
    }
    
    public void setActivityContext(ActivityContext activityContext) {
        this.activityContext = activityContext;
    }
    public String getRegionclasssys() {
        return this.regionclasssys;
    }
    
    public void setRegionclasssys(String regionclasssys) {
        this.regionclasssys = regionclasssys;
    }
    public String getRegionpropsys() {
        return this.regionpropsys;
    }
    
    public void setRegionpropsys(String regionpropsys) {
        this.regionpropsys = regionpropsys;
    }
    public String getRootpathsys() {
        return this.rootpathsys;
    }
    
    public void setRootpathsys(String rootpathsys) {
        this.rootpathsys = rootpathsys;
    }
    public BigDecimal getRegionidsys() {
        return this.regionidsys;
    }
    
    public void setRegionidsys(BigDecimal regionidsys) {
        this.regionidsys = regionidsys;
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
    public Date getAd1createddate() {
        return this.ad1createddate;
    }
    
    public void setAd1createddate(Date ad1createddate) {
        this.ad1createddate = ad1createddate;
    }
    public Date getAd1duedate() {
        return this.ad1duedate;
    }
    
    public void setAd1duedate(Date ad1duedate) {
        this.ad1duedate = ad1duedate;
    }
    public Boolean getAd1current() {
        return this.ad1current;
    }
    
    public void setAd1current(Boolean ad1current) {
        this.ad1current = ad1current;
    }
    public Long getAd1priority() {
        return this.ad1priority;
    }
    
    public void setAd1priority(Long ad1priority) {
        this.ad1priority = ad1priority;
    }
    public String getAd1title() {
        return this.ad1title;
    }
    
    public void setAd1title(String ad1title) {
        this.ad1title = ad1title;
    }
    public String getAd1text() {
        return this.ad1text;
    }
    
    public void setAd1text(String ad1text) {
        this.ad1text = ad1text;
    }
    public BigDecimal getAd1createdby() {
        return this.ad1createdby;
    }
    
    public void setAd1createdby(BigDecimal ad1createdby) {
        this.ad1createdby = ad1createdby;
    }
    public Date getAd2createddate() {
        return this.ad2createddate;
    }
    
    public void setAd2createddate(Date ad2createddate) {
        this.ad2createddate = ad2createddate;
    }
    public Date getAd2duedate() {
        return this.ad2duedate;
    }
    
    public void setAd2duedate(Date ad2duedate) {
        this.ad2duedate = ad2duedate;
    }
    public Boolean getAd2current() {
        return this.ad2current;
    }
    
    public void setAd2current(Boolean ad2current) {
        this.ad2current = ad2current;
    }
    public Long getAd2priority() {
        return this.ad2priority;
    }
    
    public void setAd2priority(Long ad2priority) {
        this.ad2priority = ad2priority;
    }
    public String getAd2title() {
        return this.ad2title;
    }
    
    public void setAd2title(String ad2title) {
        this.ad2title = ad2title;
    }
    public String getAd2text() {
        return this.ad2text;
    }
    
    public void setAd2text(String ad2text) {
        this.ad2text = ad2text;
    }
    public BigDecimal getAd2createdby() {
        return this.ad2createdby;
    }
    
    public void setAd2createdby(BigDecimal ad2createdby) {
        this.ad2createdby = ad2createdby;
    }
    public Long getPosition() {
        return this.position;
    }
    
    public void setPosition(Long position) {
        this.position = position;
    }
    public Boolean getAd1internalonly() {
        return this.ad1internalonly;
    }
    
    public void setAd1internalonly(Boolean ad1internalonly) {
        this.ad1internalonly = ad1internalonly;
    }
    public Boolean getAd2internalonly() {
        return this.ad2internalonly;
    }
    
    public void setAd2internalonly(Boolean ad2internalonly) {
        this.ad2internalonly = ad2internalonly;
    }




}


