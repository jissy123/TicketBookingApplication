package com.springboot.ticketbooking.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.ticketbooking.entity.Ticket;

public interface TicketRepo extends CrudRepository<Ticket,Integer> {
	
	

}
