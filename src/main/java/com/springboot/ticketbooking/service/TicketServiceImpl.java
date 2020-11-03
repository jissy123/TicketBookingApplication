package com.springboot.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.ticketbooking.entity.Ticket;
import com.springboot.ticketbooking.repository.TicketRepo;

public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepo ticketRepo;

	@Override
	public Ticket createTicket(Ticket ticket) {
	
	return	ticketRepo.save(ticket);
		
		
	}
	
	
	

}