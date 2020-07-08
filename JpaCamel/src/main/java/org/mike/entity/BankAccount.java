package org.mike.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "bank_account" )
public class BankAccount  {


	@Id
   @Column(name = "id", nullable = false)
   private Integer id;

   @Column(name = "Full_Name", length = 128, nullable = false)
   private String fullName;

   @Column(name = "Balance", nullable = false)
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