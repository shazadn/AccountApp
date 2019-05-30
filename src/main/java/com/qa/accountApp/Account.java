package com.qa.accountApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private int accountNum;
	
	public int getId() {
		return id;
	} 
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAccountNumber() {
		return accountNum;
	}
	
	public void setAccountNumber(int accountNum) {
		 this.accountNum = accountNum;
	}
	
}
