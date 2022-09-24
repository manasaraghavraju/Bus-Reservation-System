package com.lti.entitiy;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private int tid;
	private String mail;
	private double tot_amt;
	private int passengerCount;
	private LocalDate dateOfTravel;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public double getTot_amt() {
		return tot_amt;
	}
	public void setTot_amt(double tot_amt) {
		this.tot_amt = tot_amt;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public LocalDate getDateOfTravel() {
		return dateOfTravel;
	}
	public void setDateOfTravel(LocalDate dateOfTravel) {
		this.dateOfTravel = dateOfTravel;
	}
	
	
	
}
