package com.lti.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {

	@Id
	private int bid;
	private String bname;
	private String btype;
	private String dur;
	private LocalTime arr_time;
	private LocalTime dep_time;
	private String src;
	private String dest;
	private double fare;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBtype() {
		return btype;
	}
	public void setBtype(String btype) {
		this.btype = btype;
	}
	public String getDur() {
		return dur;
	}
	public void setDur(String dur) {
		this.dur = dur;
	}
	public LocalTime getArr_time() {
		return arr_time;
	}
	public void setArr_time(LocalTime arr_time) {
		this.arr_time = arr_time;
	}
	public LocalTime getDep_time() {
		return dep_time;
	}
	public void setDep_time(LocalTime dep_time) {
		this.dep_time = dep_time;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	
	
	
	
	
}
