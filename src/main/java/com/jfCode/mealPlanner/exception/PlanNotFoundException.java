package com.jfCode.mealPlanner.exception;

public class PlanNotFoundException extends RuntimeException
{
    public PlanNotFoundException(String message)
    {
        super( message );
    }
}
