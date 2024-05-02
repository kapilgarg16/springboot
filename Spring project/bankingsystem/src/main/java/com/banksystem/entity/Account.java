package com.banksystem.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Entitiy is a object
@Entity
//@Table(name = "account_sys")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	private int id;
	private String accoutholdername;
	private float balance;
	private String accountno;
	
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String accoutholdername, float balance, String accountno) {
		super();
		this.id = id;
		this.accoutholdername = accoutholdername;
		this.balance = balance;
		this.accountno = accountno;
	}
	
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccoutholdername() {
		return accoutholdername;
	}
	public void setAccoutholdername(String accoutholdername) {
		this.accoutholdername = accoutholdername;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	
}
