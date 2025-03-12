package flyweight.com.vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    private static final Map<String, Vehicle> vehicles = new HashMap<>();

    public static Vehicle getVehicle(String model) {
        vehicles.putIfAbsent(model, new Car(model));
        return vehicles.get(model);
    }
}
