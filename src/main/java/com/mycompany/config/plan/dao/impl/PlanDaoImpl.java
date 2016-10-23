package com.mycompany.config.plan.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.mycompany.config.plan.Plan;
import com.mycompany.config.plan.Responsibility;
import com.mycompany.config.plan.dao.PlanDao;
import org.hibernate.FetchMode;


public class PlanDaoImpl implements PlanDao {
	private SessionFactory sessionFactory;

	
	private static final Logger log = Logger.getLogger(PlanDaoImpl.class);
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Plan getPlanByName(String planName) {
		Session session = this.sessionFactory.getCurrentSession();
		List list = session.createCriteria(Plan.class)
				.add(Restrictions.like("name", planName)).list();
		if(list!=null && !list.isEmpty()){
                    Plan plan = (Plan)list.get(0);
                    return plan;
		}
		return null;
	}

	public List<Plan> getAllPlans() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Plan> list = session.createCriteria(Plan.class)
				.list();
		log.debug("no of plans "+list.size());
		return list;
	}

	public Long addPlan(Plan plan) {
		Session session = this.sessionFactory.getCurrentSession();
		BigDecimal id = (BigDecimal)session.save(plan);
		return new Long(id.longValue());
		
	}

	public void saveOrUpdatePlan(Plan plan) {
		Session session = this.sessionFactory.getCurrentSession();
		session.saveOrUpdate(plan);
	}

	public Plan getPlanById(String planId) {
		Session session = this.sessionFactory.getCurrentSession();
		List list = session.createCriteria(Plan.class)
                                .setFetchMode("responsibilities", FetchMode.JOIN)
				.add(Restrictions.eq("planid", new BigDecimal(planId))).list();
		if(list!=null && !list.isEmpty()){
                    Plan plan = (Plan)list.get(0);
                    return plan;
		}
		return null;
	}
        public List<Responsibility> getResponsiblityById(String responsiblityId){
            Session session = this.sessionFactory.getCurrentSession();
            List list = session.createCriteria(Responsibility.class)
            				 .setFetchMode("responsibilityDef", FetchMode.JOIN)
                                         .setFetchMode("activityGroups", FetchMode.JOIN)
				         .add(Restrictions.eq("responsibilityid", new BigDecimal(responsiblityId))).list();
            return list;
        }
}
