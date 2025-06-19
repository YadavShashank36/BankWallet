package com.example.BankWallet.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.BankWallet.dao.UserRepository;
import com.example.BankWallet.model.Transaction;
import com.example.BankWallet.model.User;

public class UserService {
@Autowired
UserRepository repo;

public List<User> getAllUser()
{
	return repo.findAll();
}
public User getUserById(int id)
{
	Optional<User> user= repo.findById(id);
	if(user.isEmpty()) {System.out.println("No User found");return null;}
	return user.get();
}
public List<Transaction> getAllTransaction(int id)
{
	Optional<User> user= repo.findById(id);
	if(user.isEmpty()) {System.out.println("No User found");return Arrays.asList();}
	List<Transaction> transactions= user.get().getTransactions();
	return transactions;	
}
public void addUser(User user)
{
	repo.save(user);
}
public void depositAmount(Transaction transaction,int id)
{
	Optional<User> user= repo.findById(id);
	if(user.isEmpty()) {System.out.println("No User found");}
	user.get().getTransactions().add(transaction);
}
public void withDrawAmount(Transaction transaction, int id)
{
	Optional<User> user= repo.findById(id);
	if(user.isEmpty()) {System.out.println("No User found");}
	
}



}
