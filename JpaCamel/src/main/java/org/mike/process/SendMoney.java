package org.mike.process;

import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mike.exception.BankAccountException;


import org.mike.entity.BankAccount;
public class SendMoney implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		List<BankAccount> bList = (List<BankAccount>) exchange.getIn().getBody();
		double amount = Double.parseDouble(exchange.getIn().getHeader("amount").toString());
		int id = Integer.parseInt(exchange.getIn().getHeader("id").toString());
		if (bList.size() == 0) {
            throw new BankAccountException("Account not found " + id);
        }
		BankAccount account= bList.get(0);
		{
			double newBalance = account.getBalance() + amount;
	        if (newBalance < 0) {
	            throw new BankAccountException(
	                    "The money in the account '"+id+"' is not enough (" + account.getBalance() + ")");
	        }
	        account.setBalance(newBalance);
		}
		exchange.getIn().setBody(account);
	}

}
