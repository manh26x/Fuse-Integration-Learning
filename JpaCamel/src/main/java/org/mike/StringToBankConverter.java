package org.mike;

import org.apache.camel.Converter;
import org.apache.camel.TypeConverters;
import org.mike.entity.BankAccount;


public class StringToBankConverter implements TypeConverters {
	
	 @Converter
	 public static BankAccount stringToBankAccount(Integer id, String fullName, double balance) {
		 BankAccount ba = new BankAccount();
	     ba.setId(id);
	     ba.setFullName(fullName);
	     ba.setBalance(balance);
	     return ba;
	 }

}
