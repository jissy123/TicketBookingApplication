package com.springboot.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.ticketbooking.entity.Ticket;

import com.springboot.ticketbooking.service.TicketServiceImpl;

@RestController
@RequestMapping(value="api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketServiceImpl ticketService;	
	
	
	@PostMapping(value="create")
	public Ticket createTicket(@RequestBody Ticket ticket)
	 {
		
		return ticketService.createTicket(ticket);
	 }
	
	@GetMapping(value="/all")
	public Iterable<Ticket> getTickets()
	{
		
		return ticketService.getTickets();
		
	 }
	
	@GetMapping(value="/{ticketId}")
	public Ticket getTicket(@PathVariable("ticketId") Integer ticketId)
	{
		
		return ticketService.getTicket(ticketId);
		
	 }
	
	@DeleteMapping(value="/delete/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		
		ticketService.deleteTicket(ticketId);
	}
	
	@PutMapping(value="/{ticketId}/{newEmail}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId,@PathVariable("newEmail") String newEmail)
	{
		
	
		return ticketService.updateTicket(ticketId, newEmail);
		
	}
	
	

}
