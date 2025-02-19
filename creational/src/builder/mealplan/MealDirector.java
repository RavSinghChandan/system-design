package builder.mealplan;

public class MealDirector {

    public  void  constructMeal(MealPlanBuilder builder){
        builder.buildBreakfast();
        builder.buildLunch();
        builder.buildDinner();
        builder.buildSnack();
    }
}
