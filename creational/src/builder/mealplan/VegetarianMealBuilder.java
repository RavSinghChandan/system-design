package builder.mealplan;

public class VegetarianMealBuilder implements MealPlanBuilder{
    private MealPlan mealPlan = new MealPlan();

    @Override
    public void buildBreakfast() {
        mealPlan.setBreakFast("Fruits only : ");
    }

    @Override
    public void buildLunch() {
        mealPlan.setLunch("Salad with white Rice : ");
    }

    @Override
    public void buildDinner() {
        mealPlan.setDinner("Brow rice and soup : ");
    }

    @Override
    public void buildSnack() {
        mealPlan.setSnack( "Dry fruits : ");
    }

    @Override
    public MealPlan getCompleteMealPlan() {
        System.out.println(mealPlan.toString());
        return mealPlan;
    }
}
