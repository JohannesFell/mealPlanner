package com.jfCode.mealPlanner.service;

import com.jfCode.mealPlanner.exception.PlanNotFoundException;
import com.jfCode.mealPlanner.model.MealPlan;
import com.jfCode.mealPlanner.repository.MealPlanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MealPlanService
{
    private final MealPlanRepo mealPlanRepo;

    @Autowired
    public MealPlanService(MealPlanRepo mealPlanRepo)
    {
        this.mealPlanRepo = mealPlanRepo;
    }

    public MealPlan addMealPlan(MealPlan mealPlan)
    {
        mealPlan.setMealPlanCode(UUID.randomUUID().toString() );
        return mealPlanRepo.save(mealPlan);
    }

    public List<MealPlan> findAllMealPlans()
    {
        return  mealPlanRepo.findAll();
    }

    public MealPlan updateMealPlan( MealPlan mealPlan )
    {
        return mealPlanRepo.save(mealPlan);
    }

    public MealPlan findMealPlanById( Long id )
    {
        return mealPlanRepo.findMealPlanById( id ).orElseThrow( ()-> new PlanNotFoundException("Plan by id " + id + " was not found.") );
    }

    public void deleteMealPlan( Long id )
    {
        mealPlanRepo.deleteMealPlanById( id );
    }
}
