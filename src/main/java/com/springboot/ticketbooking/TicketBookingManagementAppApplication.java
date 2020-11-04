package com.springboot.ticketbooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;
import com.springboot.ticketbooking.entity.Ticket;
import com.springboot.ticketbooking.service.TicketServiceImpl;
@SpringBootApplication
public class TicketBookingManagementAppApplication {// implements CommandLineRunner {
	@Autowired
	private TicketServiceImpl ticketService;

	
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//	
//		
//		Ticket ticket=new Ticket();
//		ticket.setPassengerName("DUMMY");
//		ticket.setSourceStation("HYDERABAD");
//		ticket.setDestinationStation("CHENNAI");
//		ticket.setEmailAddress("dummy@gmail.com");
//		ticket.setTravelDate(new Date());
//		
//		ticketService.createTicket(ticket);
//
//	}

}
