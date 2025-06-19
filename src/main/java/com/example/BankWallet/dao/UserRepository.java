package com.example.BankWallet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankWallet.model.User;



public interface UserRepository extends JpaRepository<User, Integer> {

}
