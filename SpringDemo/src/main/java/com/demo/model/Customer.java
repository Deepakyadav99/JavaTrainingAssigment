package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cust_id;
	
	String cust_city;
	
	String cust_name;

	String cust_state;
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_city() {
		return cust_city;
	}
	public void setCust_city(String cust_city) {
		this.cust_city = cust_city;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_state() {
		return cust_state;
	}
	public void setCust_state(String cust_state) {
		this.cust_state = cust_state;
	}
	@Override
	public String toString() {
		return "Customer [cust_id=" + cust_id + ", cust_city=" + cust_city + ", cust_name=" + cust_name
				+ ", cust_state=" + cust_state + "]";
	}
	
	

}
