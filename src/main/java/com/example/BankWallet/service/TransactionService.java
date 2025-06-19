package com.example.BankWallet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BankWallet.dao.TransactionRepository;
import com.example.BankWallet.model.Transaction;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository repo;
	
	public List<Transaction> getAllTransaction()
	{
		return repo.findAll();
	}
	public Optional<Transaction> getById(int id)
	{
		return repo.findById(id);
	}
	public void deleteByid(int id)
	{
	    repo.deleteById(id);
	}
	public void updateTransaction(Transaction trn)
	{
		repo.save(trn);
	}
	public void addTransaction(Transaction trn)
	{
		repo.save(trn);
	}

}
