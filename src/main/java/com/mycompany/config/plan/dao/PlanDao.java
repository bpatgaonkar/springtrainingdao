package com.mycompany.config.plan.dao;

import com.mycompany.config.plan.Plan;
import com.mycompany.config.plan.Responsibility;
import java.util.List;

public interface PlanDao {
	public Plan getPlanById(String planId);
	public Plan getPlanByName(String planName);
	public List<Plan> getAllPlans();
	public Long addPlan(Plan plan);
	public void saveOrUpdatePlan(Plan plan);
        public List<Responsibility> getResponsiblityById(String responsiblityId);
}
