package flyweight.com.vehicle;

public class Client {
    public static void main(String[] args) {

        Vehicle car1 = VehicleFactory.getVehicle("Sedan");
        car1.display("Red");

        Vehicle car2 = VehicleFactory.getVehicle("Sedan");
        car2.display("Blue");

        Vehicle car3 = VehicleFactory.getVehicle("SUV");
        car3.display("Black");

       // System.out.println("Total unique vehicle objects: " + VehicleFactory.ve);

    }
}
