package com.example.BankWallet.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Transaction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer transactionId;
	private int typ;
	private double amt;
	
	@ManyToOne
	private User user;
	

	public Transaction( int typ, double amt) {
		super();
		this.typ = typ;
		this.amt=amt;
	}
	
	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}




	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getTyp() {
		return typ;
	}

	public void setTyp(int typ) {
		this.typ = typ;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", typ=" + typ + ", amt=" + amt + ", user=" + user + "]";
	}


	

}

