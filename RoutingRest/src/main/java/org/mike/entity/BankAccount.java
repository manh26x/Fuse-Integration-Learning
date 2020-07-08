package org.mike.entity;




public class BankAccount  {



   private Integer id;


   private String fullName;

   private double balance;

   
   
   public BankAccount(Integer id, String fullName, double balance) {
	super();
	this.id = id;
	this.fullName = fullName;
	this.balance = balance;
}

   
public BankAccount() {
	   super();
   }
   
   public Integer getId() {
       return id;
   }


   public void setId(Integer id) {
       this.id = id;
   }

   public String getFullName() {
       return fullName;
   }

   public void setFullName(String fullName) {
       this.fullName = fullName;
   }

   public double getBalance() {
       return balance;
   }

   public void setBalance(double balance) {
       this.balance = balance;
   }
}