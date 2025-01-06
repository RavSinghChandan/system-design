package facade.chandan;

public class AirConditioner {
    public void turnOn() {
        System.out.println("Air Conditioner is turned ON.");
    }
    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF.");
    }
    public void setTemperature(int temperature) {
        System.out.println("Air Conditioner temperature set to " + temperature + "°C.");
    }
}
