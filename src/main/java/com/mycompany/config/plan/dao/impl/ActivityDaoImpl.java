/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.config.plan.dao.impl;

import com.mycompany.config.plan.Activity;
import com.mycompany.config.plan.dao.ActivityDao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author Patgaonkar
 */
public class ActivityDaoImpl implements ActivityDao {
	private SessionFactory sessionFactory;
    
    //@NamedQueries({@NamedQuery(name="",query="")})

    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public List<Activity> getActivities() {
		return this.sessionFactory.getCurrentSession().createQuery("from Activity").list();
	}

	public Activity getActivityForTypeCode(String typeCode) {
		Session session = this.sessionFactory.getCurrentSession();
		List list = session.createCriteria(Activity.class).setFetchMode("activityType", FetchMode.JOIN)
                        .add(Restrictions.eq("activityType.activitytypecode", typeCode)).list();
		if(list!=null && !list.isEmpty()){
			return (Activity)list.get(0);
		}
		return null;
	}
        public List<Activity> getActivitiesByPlanResponsibility(String planid,String respid){
            Session session = this.sessionFactory.getCurrentSession();
            Criteria c = session.createCriteria(Activity.class,"act");
            c.createAlias("act.activityGroup", "ag");
            c.createAlias("ag.responsibility", "resp");
            c.createAlias("resp.plan", "pl");
            c.add(Restrictions.eq("pl.planid", new BigDecimal(planid)));
            c.add(Restrictions.eq("resp.responsibilityid", new BigDecimal(respid)));
            c.addOrder(Order.asc("act.position"));
            c.addOrder(Order.asc("resp.position"));
            return c.list();
        }
}
