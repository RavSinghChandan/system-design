package builder.mealplan;

import builder.director.Director;

public class MealPlanner {
    public static void main(String[] args) {
        MealPlanBuilder builder = new VegetarianMealBuilder();
        MealDirector director = new MealDirector();

        VegetarianMealBuilder vegetarianMealBuilder = new VegetarianMealBuilder();
        director.constructMeal(vegetarianMealBuilder);
        vegetarianMealBuilder.getCompleteMealPlan();
        System.out.println("====================================================");
        NonVegetarianMealBuilder nonVegetarianMealBuilder = new NonVegetarianMealBuilder();
        director.constructMeal(nonVegetarianMealBuilder);
        nonVegetarianMealBuilder.getCompleteMealPlan();
    }
}
