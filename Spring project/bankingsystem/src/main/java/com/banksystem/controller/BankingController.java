package com.banksystem.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banksystem.entity.Account;
import com.banksystem.service.AccountService;

@RestController
@RequestMapping("/bankingsystem")
public class BankingController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/create")
	public ResponseEntity<Account> addAccount(@RequestBody Account account){
		Account saveAccount = accountService.createAccount(account);
		return new ResponseEntity<>(saveAccount, HttpStatus.CREATED);
	}
	
	@GetMapping("/getbyno/{accountno}")
	public ResponseEntity<Account> getAccount(@PathVariable String accountno)
	{
		Account searchAccount = accountService.getAccountByAccountNo(accountno);
		if(searchAccount == null) {
			return ResponseEntity.notFound().build();
		}
		else {
			return new ResponseEntity<>(searchAccount, HttpStatus.FOUND);
		}
	}
	@GetMapping("/findall")
	public ResponseEntity<List<Account>> getAllAccountHolderDetails(){
		List<Account> accountList = accountService.getAllAccountDetails();
		return new ResponseEntity<>(accountList, HttpStatus.ACCEPTED); 
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Account> updateAccountNo(@PathVariable int id, @RequestBody Map<String, String>request)
	{
		String accountNo = request.get("accountno");
		Account updateAccount = accountService.updateAccountNo(id, accountNo);
		if(updateAccount == null) {
			return ResponseEntity.notFound().build();
		}
		return new ResponseEntity<>(updateAccount, HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/deposit/{id}")
	public ResponseEntity<Account> depositMoney(@PathVariable int id, @RequestBody Map<String, Float> request)
	{
		float amount = request.get("balance");
		Account updateAccount = accountService.depositInBank(id, amount);
		if(updateAccount == null) {
			return ResponseEntity.notFound().build();
		}
		return new ResponseEntity<>(updateAccount, HttpStatus.ACCEPTED);
	}
}
