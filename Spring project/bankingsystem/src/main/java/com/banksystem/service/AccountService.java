package com.banksystem.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.banksystem.entity.Account;


public interface AccountService {
	public Account createAccount(Account account);
	public Account getAccountByAccountNo(String accountNo);
	public List<Account> getAllAccountDetails();
	public Account updateAccountNo(int id, String accountNo);
	public Account depositInBank(int id, float amount);
}
