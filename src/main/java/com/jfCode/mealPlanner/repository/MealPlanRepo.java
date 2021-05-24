package com.jfCode.mealPlanner.repository;

import com.jfCode.mealPlanner.model.MealPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MealPlanRepo extends JpaRepository<MealPlan, Long>
{

    void deleteMealPlanById(Long id);

    Optional<MealPlan> findMealPlanById(Long id);
}
