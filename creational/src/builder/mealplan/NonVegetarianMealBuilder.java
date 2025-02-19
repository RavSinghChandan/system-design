package builder.mealplan;

public class NonVegetarianMealBuilder implements MealPlanBuilder{
    private MealPlan mealPlan = new MealPlan();

    @Override
    public void buildBreakfast() {
        mealPlan.setBreakFast("Egg white : ");
    }

    @Override
    public void buildLunch() {
        mealPlan.setLunch("Brown Rice : ");
    }

    @Override
    public void buildDinner() {
        mealPlan.setDinner("Fish : river + sea : ");
    }

    @Override
    public void buildSnack() {
        mealPlan.setSnack("Dry fruits : ");
    }

    @Override
    public MealPlan getCompleteMealPlan() {
        System.out.println(mealPlan.toString());
        return mealPlan;
    }
}
