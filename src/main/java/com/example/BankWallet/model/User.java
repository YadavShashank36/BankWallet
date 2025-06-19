package com.example.BankWallet.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
  private Integer id;
  String name;
  double balance;

  @OneToMany
  List<Transaction> transactions;



public User(String name, double balance) {
	

	this.name = name;
	this.balance = balance;

	
}

public List<Transaction> getTransactions() {
	return transactions;
}

public void setTransactions(List<Transaction> transactions) {
	this.transactions = transactions;
}

public User() {
	
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", balance=" + balance + ", transactions=" + transactions + "]";
}

  
}

