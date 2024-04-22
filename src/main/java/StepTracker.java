import java.util.ArrayList;
public class StepTracker
{
  private int minSteps;
  private int days;
  private int activeDaysCount;
  private int totalSteps;
  public StepTracker(int steps){
   minSteps = steps;
   days = 0;
   activeDaysCount = 0;
   totalSteps = 0;
  }
  public double addDailySteps(int todaySteps){
   days++;
   totalSteps = totalSteps + todaySteps;
   if(todaySteps >= minSteps){
    activeDaysCount++;
   }
  }
  public int activeDays(){
   return activeDaysCount;
  }
  public int averageSteps(){
    return totalSteps/days;
  }
} 
