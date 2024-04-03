package parkingLot.strategies;

import parkingLot.models.ParkingSlot;
import parkingLot.models.VehicleType;

public class SimpleParkingSlotAllotStrategy implements ParkingPlaceAllotmentStrategy{

    // here we have only simple parking Lot suppose
    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId)
            throws ParkingLotFullException {

        // get all the floors for this parking lot which are free
        // go through the free floors and return any spot for this vehicle type.
        return null;
    }
}
