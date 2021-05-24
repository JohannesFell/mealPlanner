import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Mealplan } from './mealPlan';
import { environment } from 'src/environments/environment';

@Injectable({providedIn: 'root'})
export class MealPlanService {
  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient){}

  public getMealPlan(): Observable<Mealplan[]> {
    return this.http.get<Mealplan[]>(`${this.apiServerUrl}/mealPlan/all`);
  }

  public addMealPlan(mealPlan: Mealplan): Observable<Mealplan> {
    return this.http.post<Mealplan>(`${this.apiServerUrl}/mealPlan/add`, mealPlan);
  }

  public updateMealPlan(mealPlan: Mealplan): Observable<Mealplan> {
    return this.http.put<Mealplan>(`${this.apiServerUrl}/mealPlan/update`, mealPlan);
  }

  public deleteMealPlan(mealPlanId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiServerUrl}/mealPlan/delete/${mealPlanId}`);
  }
}
