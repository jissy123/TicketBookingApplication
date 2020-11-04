package com.springboot.ticketbooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.ticketbooking.entity.Ticket;
import com.springboot.ticketbooking.repository.TicketRepo;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired
	TicketRepo ticketRepo;

	@Override
	public Ticket createTicket(Ticket ticket) {
	
	return	ticketRepo.save(ticket);
		
		
	}

	@Override
	public Iterable<Ticket> getTickets() {
		
	  	return ticketRepo.findAll();
	}

	@Override
	public Ticket getTicket(Integer ticketId) {
		
		return ticketRepo.findById(ticketId).orElse(new Ticket());
				
		
		
	}

	@Override
	public void deleteTicket(Integer ticketId) {
		
		ticketRepo.deleteById(ticketId);
	}

	@Override
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket dbTicket =getTicket(ticketId);
		dbTicket.setEmailAddress(newEmail);
		
		return ticketRepo.save(dbTicket);
	}
	

	
}
