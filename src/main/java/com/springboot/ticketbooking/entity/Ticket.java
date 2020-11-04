package com.springboot.ticketbooking.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity 
public class Ticket {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer ticketId;

private String passengerName;	
private String sourceStation;
private String destinationStation;	
private Date travelDate;
private String emailAddress;

public Integer getTicketId() {
	return ticketId;
}
public void setTicketId(Integer ticketId) {
	this.ticketId = ticketId;
}
public String getPassengerName() {
	return passengerName;
}
public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}
public String getSourceStation() {
	return sourceStation;
}
public void setSourceStation(String sourceStation) {
	this.sourceStation = sourceStation;
}
public String getDestinationStation() {
	return destinationStation;
}
public void setDestinationStation(String destinationStation) {
	this.destinationStation = destinationStation;
}
public Date getTravelDate() {
	return travelDate;
}
public void setTravelDate(Date travelDate) {
	this.travelDate = travelDate;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}


public Ticket(Integer ticketId, String passengerName, String sourceStation, String destinationStation, Date travelDate,
		String emailAddress) {
	super();
	this.ticketId = ticketId;
	this.passengerName = passengerName;
	this.sourceStation = sourceStation;
	this.destinationStation = destinationStation;
	this.travelDate = travelDate;
	this.emailAddress = emailAddress;
}



	
}
