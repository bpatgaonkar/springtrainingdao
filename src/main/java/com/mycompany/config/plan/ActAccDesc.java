package com.mycompany.config.plan;
// Generated Feb 7, 2016 11:27:39 AM by Hibernate Tools 3.2.2.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * ActAccDesc generated by hbm2java
 */
public class ActAccDesc  implements java.io.Serializable {


     private BigDecimal actAccDescId;
     private long version;
     private Activity activity;
     private String accessctl;
     private BigDecimal sessionid;
     private Date lstmoddttm;
     private Long accind;

    public ActAccDesc() {
    }

	
    public ActAccDesc(BigDecimal actAccDescId, String accessctl, BigDecimal sessionid, Date lstmoddttm) {
        this.actAccDescId = actAccDescId;
        this.accessctl = accessctl;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public ActAccDesc(BigDecimal actAccDescId, Activity activity, String accessctl, BigDecimal sessionid, Date lstmoddttm, Long accind) {
       this.actAccDescId = actAccDescId;
       this.activity = activity;
       this.accessctl = accessctl;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.accind = accind;
    }
   
    public BigDecimal getActAccDescId() {
        return this.actAccDescId;
    }
    
    public void setActAccDescId(BigDecimal actAccDescId) {
        this.actAccDescId = actAccDescId;
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
    public String getAccessctl() {
        return this.accessctl;
    }
    
    public void setAccessctl(String accessctl) {
        this.accessctl = accessctl;
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
    public Long getAccind() {
        return this.accind;
    }
    
    public void setAccind(Long accind) {
        this.accind = accind;
    }




}

