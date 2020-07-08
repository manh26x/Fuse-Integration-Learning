package org.mike.service;

import org.mike.dao.BankAccountDAO;
import org.mike.entity.BankAccount;

public class BankService {
	private BankAccountDAO repository;
	
	public Iterable<BankAccount> findAll(){
        return repository.findAll();
    }

}
