package parkingLot.controllers;

import parkingLot.dtos.IssueTicketRequest;
import parkingLot.dtos.IssueTicketResponse;
import parkingLot.dtos.ResponseStatus;
import parkingLot.exceptions.GateNotFoundException;
import parkingLot.models.Ticket;
import parkingLot.services.TicketService;

public class TicketController {
    // Ideally we should read this from configuration file
    public static  String  TICKET_ISSUED_MESSAGE = "Ticket issued";
    public static  String  INVALID_GATE = "Gate is not valid";
    private TicketService ticketService;

    public IssueTicketResponse issueTicket(IssueTicketRequest ticketRequest){

        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(ticketRequest);
        } catch (GateNotFoundException e) {
            return new IssueTicketResponse(null, ResponseStatus.FAILURE, INVALID_GATE);
        }
        IssueTicketResponse issueTicketResponse = new IssueTicketResponse(ticket, ResponseStatus.SUCCESS, TICKET_ISSUED_MESSAGE);

        return issueTicketResponse;
    }
}
