package com.springboot.ticketbooking.service;

import com.springboot.ticketbooking.entity.Ticket;

public interface TicketService {

public Ticket createTicket(Ticket ticket);

public Iterable<Ticket> getTickets();

Ticket getTicket(Integer ticketId);

public void deleteTicket(Integer ticketId);

public Ticket updateTicket(Integer ticketId,String newEmail);




}
