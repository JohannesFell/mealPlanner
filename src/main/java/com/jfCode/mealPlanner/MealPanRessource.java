package com.jfCode.mealPlanner;

import com.jfCode.mealPlanner.model.MealPlan;
import com.jfCode.mealPlanner.service.MealPlanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.OutputKeys;
import java.util.List;

@RestController
@RequestMapping( "/mealPlan" )
public class MealPanRessource
{
    private  final MealPlanService mealPlanService;

    public MealPanRessource ( MealPlanService mealPlanService )
    {
        this.mealPlanService = mealPlanService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MealPlan>> getAllMealPlans ()
    {
        List<MealPlan> mealPlans = mealPlanService.findAllMealPlans();
        return new ResponseEntity<>( mealPlans, HttpStatus.OK );
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<MealPlan> getMealPlanById (@PathVariable("id") Long id)
    {
        MealPlan mealPlan = mealPlanService.findMealPlanById(id);
        return new ResponseEntity<>( mealPlan, HttpStatus.OK );
    }

    @PostMapping("/add")
    public ResponseEntity<MealPlan> addMealplan(@RequestBody MealPlan mealPlan)
    {
        MealPlan newMealPlan = mealPlanService.addMealPlan( mealPlan );//ToDO
        return new ResponseEntity<>( newMealPlan, HttpStatus.CREATED );
    }

    @PutMapping("/update")
    public ResponseEntity<MealPlan> updateMealplan(@RequestBody MealPlan mealPlan)
    {
        MealPlan updateMealplan = mealPlanService.updateMealPlan( mealPlan );
        return new ResponseEntity<>( updateMealplan, HttpStatus.OK );
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMealplan(@PathVariable("id") Long id)
    {
        mealPlanService.deleteMealPlan( id );
        return new ResponseEntity<>( HttpStatus.OK );
    }
}
