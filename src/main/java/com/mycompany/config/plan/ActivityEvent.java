package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * ActivityEvent generated by hbm2java
 */
public class ActivityEvent  implements java.io.Serializable {


     private BigDecimal activityeventid;
     private long version;
     private Activity activity;
     private ActStDesc ActStDesc;
     private String eventtype;
     private String planname;
     private Boolean iscreate;
     private BigDecimal sessionid;
     private Date lstmoddttm;
     private BigDecimal permissiondescriptor;

    public ActivityEvent() {
    }

	
    public ActivityEvent(BigDecimal activityeventid, String eventtype, BigDecimal sessionid, Date lstmoddttm) {
        this.activityeventid = activityeventid;
        this.eventtype = eventtype;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public ActivityEvent(BigDecimal activityeventid, Activity activity, ActStDesc ActStDesc, String eventtype, String planname, Boolean iscreate, BigDecimal sessionid, Date lstmoddttm, BigDecimal permissiondescriptor) {
       this.activityeventid = activityeventid;
       this.activity = activity;
       this.ActStDesc = ActStDesc;
       this.eventtype = eventtype;
       this.planname = planname;
       this.iscreate = iscreate;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.permissiondescriptor = permissiondescriptor;
    }
   
    public BigDecimal getActivityeventid() {
        return this.activityeventid;
    }
    
    public void setActivityeventid(BigDecimal activityeventid) {
        this.activityeventid = activityeventid;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    public Activity getActivity() {
        return this.activity;
    }
    
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public ActStDesc getActStDesc() {
        return this.ActStDesc;
    }
    
    public void setActStDesc(ActStDesc ActStDesc) {
        this.ActStDesc = ActStDesc;
    }
    public String getEventtype() {
        return this.eventtype;
    }
    
    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }
    public String getPlanname() {
        return this.planname;
    }
    
    public void setPlanname(String planname) {
        this.planname = planname;
    }
    public Boolean getIscreate() {
        return this.iscreate;
    }
    
    public void setIscreate(Boolean iscreate) {
        this.iscreate = iscreate;
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
    public BigDecimal getPermissiondescriptor() {
        return this.permissiondescriptor;
    }
    
    public void setPermissiondescriptor(BigDecimal permissiondescriptor) {
        this.permissiondescriptor = permissiondescriptor;
    }




}


