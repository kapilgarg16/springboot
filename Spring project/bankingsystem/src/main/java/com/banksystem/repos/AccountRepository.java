package com.banksystem.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banksystem.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

	Account findByaccountno(String accountNo);

}
