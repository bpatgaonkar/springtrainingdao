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

/**
 * ActivityDefinition generated by hbm2java
 */
@XmlType(name="ActivityDefinition")
@XmlAccessorType(XmlAccessType.FIELD)

public class ActivityDefinition  implements java.io.Serializable {

	 @XmlTransient
     private BigDecimal activitydefinitionid;
	 @XmlTransient
     private long version;
	 @XmlTransient
     private ActivityType ActivityType;
     @XmlAttribute
     private String uniquename;
     @XmlTransient
     private Boolean actcxtdel;
     @XmlTransient
     private String activitysp;
     @XmlAttribute
     private String closedrenderer;
     @XmlAttribute
     private String openrenderer;
     @XmlAttribute
     private String interface_;
     @XmlAttribute
     private String navinterface;
     @XmlTransient
     private String dashboardview;
     @XmlTransient
     private String consumerview;
     @XmlTransient
     private String consumernavview;
     @XmlAttribute
     private String description;
     @XmlAttribute
     private String supportedkey1;
     @XmlAttribute
     private String supportedkey2;
     @XmlAttribute
     private String supportedkey3;
     @XmlAttribute
     private String supportedkey4;
     @XmlAttribute
     private String supportedkey5;
     @XmlAttribute
     private String supportedkey6;
     @XmlAttribute
     private String supportedkey7;
     @XmlAttribute
     private String supportedkey8;
     @XmlAttribute
     private String supportedkey9;
     @XmlAttribute
     private String supportedkey10;
     @XmlTransient
     private BigDecimal sessionid;
     @XmlTransient
     private Date lstmoddttm;
     @XmlTransient
     private Set activityContexts = new HashSet(0);

    public ActivityDefinition() {
    }

	
    public ActivityDefinition(BigDecimal activitydefinitionid, ActivityType ActivityType, BigDecimal sessionid, Date lstmoddttm) {
        this.activitydefinitionid = activitydefinitionid;
        this.ActivityType = ActivityType;
        this.sessionid = sessionid;
        this.lstmoddttm = lstmoddttm;
    }
    public ActivityDefinition(BigDecimal activitydefinitionid, ActivityType ActivityType, String uniquename, Boolean actcxtdel, String activitysp, String closedrenderer, String openrenderer, String interface_, String navinterface, String dashboardview, String consumerview, String consumernavview, String description, String supportedkey1, String supportedkey2, String supportedkey3, String supportedkey4, String supportedkey5, String supportedkey6, String supportedkey7, String supportedkey8, String supportedkey9, String supportedkey10, BigDecimal sessionid, Date lstmoddttm, Set activityContexts) {
       this.activitydefinitionid = activitydefinitionid;
       this.ActivityType = ActivityType;
       this.uniquename = uniquename;
       this.actcxtdel = actcxtdel;
       this.activitysp = activitysp;
       this.closedrenderer = closedrenderer;
       this.openrenderer = openrenderer;
       this.interface_ = interface_;
       this.navinterface = navinterface;
       this.dashboardview = dashboardview;
       this.consumerview = consumerview;
       this.consumernavview = consumernavview;
       this.description = description;
       this.supportedkey1 = supportedkey1;
       this.supportedkey2 = supportedkey2;
       this.supportedkey3 = supportedkey3;
       this.supportedkey4 = supportedkey4;
       this.supportedkey5 = supportedkey5;
       this.supportedkey6 = supportedkey6;
       this.supportedkey7 = supportedkey7;
       this.supportedkey8 = supportedkey8;
       this.supportedkey9 = supportedkey9;
       this.supportedkey10 = supportedkey10;
       this.sessionid = sessionid;
       this.lstmoddttm = lstmoddttm;
       this.activityContexts = activityContexts;
    }
   
    public BigDecimal getActivitydefinitionid() {
        return this.activitydefinitionid;
    }
    
    public void setActivitydefinitionid(BigDecimal activitydefinitionid) {
        this.activitydefinitionid = activitydefinitionid;
    }
    public long getVersion() {
        return this.version;
    }
    
    public void setVersion(long version) {
        this.version = version;
    }
    public ActivityType getActivityType() {
        return this.ActivityType;
    }
    
    public void setActivityType(ActivityType ActivityType) {
        this.ActivityType = ActivityType;
    }
    public String getUniquename() {
        return this.uniquename;
    }
    
    public void setUniquename(String uniquename) {
        this.uniquename = uniquename;
    }
    public Boolean getActcxtdel() {
        return this.actcxtdel;
    }
    
    public void setActcxtdel(Boolean actcxtdel) {
        this.actcxtdel = actcxtdel;
    }
    public String getActivitysp() {
        return this.activitysp;
    }
    
    public void setActivitysp(String activitysp) {
        this.activitysp = activitysp;
    }
    public String getClosedrenderer() {
        return this.closedrenderer;
    }
    
    public void setClosedrenderer(String closedrenderer) {
        this.closedrenderer = closedrenderer;
    }
    public String getOpenrenderer() {
        return this.openrenderer;
    }
    
    public void setOpenrenderer(String openrenderer) {
        this.openrenderer = openrenderer;
    }
    public String getInterface_() {
        return this.interface_;
    }
    
    public void setInterface_(String interface_) {
        this.interface_ = interface_;
    }
    public String getNavinterface() {
        return this.navinterface;
    }
    
    public void setNavinterface(String navinterface) {
        this.navinterface = navinterface;
    }
    public String getDashboardview() {
        return this.dashboardview;
    }
    
    public void setDashboardview(String dashboardview) {
        this.dashboardview = dashboardview;
    }
    public String getConsumerview() {
        return this.consumerview;
    }
    
    public void setConsumerview(String consumerview) {
        this.consumerview = consumerview;
    }
    public String getConsumernavview() {
        return this.consumernavview;
    }
    
    public void setConsumernavview(String consumernavview) {
        this.consumernavview = consumernavview;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSupportedkey1() {
        return this.supportedkey1;
    }
    
    public void setSupportedkey1(String supportedkey1) {
        this.supportedkey1 = supportedkey1;
    }
    public String getSupportedkey2() {
        return this.supportedkey2;
    }
    
    public void setSupportedkey2(String supportedkey2) {
        this.supportedkey2 = supportedkey2;
    }
    public String getSupportedkey3() {
        return this.supportedkey3;
    }
    
    public void setSupportedkey3(String supportedkey3) {
        this.supportedkey3 = supportedkey3;
    }
    public String getSupportedkey4() {
        return this.supportedkey4;
    }
    
    public void setSupportedkey4(String supportedkey4) {
        this.supportedkey4 = supportedkey4;
    }
    public String getSupportedkey5() {
        return this.supportedkey5;
    }
    
    public void setSupportedkey5(String supportedkey5) {
        this.supportedkey5 = supportedkey5;
    }
    public String getSupportedkey6() {
        return this.supportedkey6;
    }
    
    public void setSupportedkey6(String supportedkey6) {
        this.supportedkey6 = supportedkey6;
    }
    public String getSupportedkey7() {
        return this.supportedkey7;
    }
    
    public void setSupportedkey7(String supportedkey7) {
        this.supportedkey7 = supportedkey7;
    }
    public String getSupportedkey8() {
        return this.supportedkey8;
    }
    
    public void setSupportedkey8(String supportedkey8) {
        this.supportedkey8 = supportedkey8;
    }
    public String getSupportedkey9() {
        return this.supportedkey9;
    }
    
    public void setSupportedkey9(String supportedkey9) {
        this.supportedkey9 = supportedkey9;
    }
    public String getSupportedkey10() {
        return this.supportedkey10;
    }
    
    public void setSupportedkey10(String supportedkey10) {
        this.supportedkey10 = supportedkey10;
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
    public Set getActivityContexts() {
        return this.activityContexts;
    }
    
    public void setActivityContexts(Set activityContexts) {
        this.activityContexts = activityContexts;
    }




}

