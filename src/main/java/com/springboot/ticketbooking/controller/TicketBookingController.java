package com.springboot.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ticketbooking.entity.Ticket;
import com.springboot.ticketbooking.repository.TicketRepo;
import com.springboot.ticketbooking.service.TicketServiceImpl;

@RestController
@RequestMapping(value="api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketServiceImpl ticketService;	
	
	public Ticket createTicket(@RequestBody Ticket ticket)
	{
		
		return ticketService.createTicket(ticket);
	}
	
	
	

}
