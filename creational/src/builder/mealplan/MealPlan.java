package builder.mealplan;

public class MealPlan {

    private String breakFast;
    private String lunch;
    private String dinner;
    private String snack;

    public String getBreakFast() {
        return breakFast;
    }

    public void setBreakFast(String breakFast) {
        this.breakFast = breakFast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    @Override
    public String toString() {
        return "MealPlan{" +
                "breakFast='" + breakFast + '\'' +
                ", lunch='" + lunch + '\'' +
                ", dinner='" + dinner + '\'' +
                ", snack='" + snack + '\'' +
                '}';
    }
}
