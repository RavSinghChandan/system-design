package builder.mealplan;

public interface MealPlanBuilder {

    void buildBreakfast();
    void buildLunch();
    void buildDinner();
    void buildSnack();

    MealPlan getCompleteMealPlan();
}