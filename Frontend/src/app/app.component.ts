import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Mealplan } from './mealPlan';
import { MealPlanService } from './mealplan.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public mealPlans: Mealplan[] = [];


  constructor(private mealPlanService: MealPlanService){}

  ngOnInit() {
    this.getMealPlan();
  }

  public getMealPlan(): void{
    this.mealPlanService.getMealPlan().subscribe(
      (response: Mealplan[]) => {
        this.mealPlans = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
