package flyweight.com.vehicle;

public class Car implements Vehicle{
    private String model; // Intrinsic data

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void display(String color) {
        System.out.println("The model is "+model +" The color is "+color);
    }
}
