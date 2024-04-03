//package parkingLot.services;
//
//import parkingLot.dtos.IssueTicketRequest;
//import parkingLot.exceptions.GateNotFoundException;
//import parkingLot.models.Gate;
//import parkingLot.models.Ticket;
//import parkingLot.models.Vehicle;
//import parkingLot.models.VehicleType;
//import parkingLot.repositories.GateRepository;
//import parkingLot.repositories.ParkingLotRepository;
//import parkingLot.repositories.VehicleRepository;
//
//import java.util.Date;
//
//public class TicketService {
//    private GateRepository gateRepository;
//    private VehicleRepository vechicleRepository;
//    private ParkingLotRepository parkingLotRepository;
//
//    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
//        this.gateRepository = gateRepository;
//        this.vehicleRepository = vehicleRepository;
//        this.parkingLotRepository = parkingLotRepository;
//        this.ticketRepository = ticketRepository;
//    }
//    public Ticket issueTicket(IssueTicketRequest ticketRequest) throws GateNotFoundException {
//
//        //1. set time
//        Ticket ticket = new Ticket();
//        ticket.setEntryTime(new Date());
//
//        //2. get gate details
//        Gate gate = gateRepository.findGateByGateId(ticketRequest.getGateId());
//        ticket.setEntryGate(gate);
//
//        Vehicle vehicle = vechicleRepository.getVehicleByNumber(ticketRequest.getVehicleNumber());
//        if(vehicle == null){
//            vehicle = new Vehicle(ticketRequest.getVehicleType(), ticketRequest.getVehicleNumber(), ticketRequest.getOwnerName());
//            // we have created but we have not saved
//            // to save we need to create save
//            vechicleRepository.save(vehicle);
//        }
//        ticket.setVehicle(vehicle);
//
//        // 3. get ParkingLot
//
//
//        return ticket;
//    }
//}
