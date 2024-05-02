package com.banksystem.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banksystem.entity.Account;
import com.banksystem.repos.AccountRepository;
import com.banksystem.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Account createAccount(Account account) {
		Account savedAccount = accountRepository.save(account);
		return savedAccount;
	}

	@Override
	public Account getAccountByAccountNo(String accountNo) {
		Account searchAccount = accountRepository.findByaccountno(accountNo);
		return searchAccount;
	}

	@Override
	public List<Account> getAllAccountDetails() {
		// TODO Auto-generated method stub
		List<Account>allAccount = accountRepository.findAll();
		return allAccount;
	}

	@Override
	public Account updateAccountNo(int id, String accountNo) {
		Account searchAccount = accountRepository.findById(id).orElse(null);
		if(searchAccount == null)
			return null;
		searchAccount.setAccountno(accountNo);
		 searchAccount = accountRepository.save(searchAccount);
		return searchAccount;

	}

	@Override
	public Account depositInBank(int id, float amount) {
		Account searchAccount = accountRepository.findById(id).orElse(null);
		if(searchAccount == null)
			return null;
		float existingAmount = searchAccount.getBalance();
		amount = existingAmount+amount;
		searchAccount.setBalance(amount);
		 return accountRepository.save(searchAccount);
	}
	

	
	

}
