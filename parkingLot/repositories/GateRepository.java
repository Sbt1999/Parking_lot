package parkingLot.repositories;

import parkingLot.exceptions.GateNotFoundException;
import parkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    // creating map because we are not dealing with the database;
    Map<Long, Gate> gates = new HashMap<>();
    public Gate findGateByGateId(Long gateId) throws GateNotFoundException {
        if(gates.containsKey(gateId)){
           return gates.get(gateId);
        }
        throw new GateNotFoundException();
    }
}
