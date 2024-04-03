package parkingLot.repositories;

import parkingLot.models.Gate;
import parkingLot.models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    long previousId = 0;
    Map<String, Vehicle> vehicleMap = new HashMap<>();
    public Vehicle getVehicleByNumber(String vehicleNumber) {
        if(vehicleMap.containsKey(vehicleNumber)){
            return vehicleMap.get(vehicleNumber);
        }
        // we can also use optional (Java 8)
        return null;
    }

    public Vehicle save(Vehicle vehicle) {
        previousId++;
        vehicle.setId(previousId);
        vehicleMap.putIfAbsent(vehicle.getVehicleNumber(), vehicle);
        return vehicleMap.get(vehicle.getVehicleNumber());
    }
}
