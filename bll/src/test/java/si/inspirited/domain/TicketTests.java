package si.inspirited.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class TicketTests {

    long MAX_LONG_VALUE = 9223372036854775807L;

    @Test
    public void testCreation() {

        Ticket ticket = new Ticket();
        ticket.setId(1);
        ticket.setOwner("Traveler J");
        ticket.setBus("Test Bus #AO1122AH white");
        ticket.setPlace(1);
        ticket.setStartPoint("Irshava - bus station #1");
        ticket.setStart(new Date(2018,12, 5, 23, 59, 00));
        ticket.setEndPoint("Jerushalaim");
        ticket.setArrive(new Date(2018,12, 11, 04, 14, 07));
        ticket.setPrice(1);
        ticket.setSold(new Date(2018,12, 4, 15, 01, 00));
        ticket.setActive(true);

        System.out.println(ticket);
        Assertions.assertTrue(ticket.isActive());
    }
}
