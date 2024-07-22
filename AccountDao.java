package com.transactions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class AccountDao 
{
  List <Account> accList = new ArrayList<Account>();
  Scanner scanner = new Scanner(System.in); 
  
  
  
  public void createAccount()
  {
	  System.out.println("Please Enter Account Details: ");
	  
	  System.out.println("Enter Account Name:");
	  String acc_Name = scanner.next()  ;
	  System.out.println("Enter Address:");
	  String address = scanner.next()  ; 
	  System.out.println("Enter Mobile Number:");
	  long mob_No = scanner.nextLong()  ;
	  System.out.println("Enter Aadhar Number:");
	  long aadhar_No = scanner.nextLong()  ; 
	  System.out.println("Enter age:");
	  int age = scanner.nextInt();
	  Random r= new Random(); 
	  long acc_No =r.nextLong(10000000000000l);  
	  
	  Account objAccount = new Account(acc_No, acc_Name, address, mob_No, aadhar_No,age,0);
	  
	  if(age > 18)
	  {
	  accList.add(objAccount);
	  
	  System.out.println("Account is created successfully with Account Number : " + acc_No );
	  }
	  
	  else 
	  {
		  System.out.println(" Your not prmitted to create an account for the age < 18 "  ); 
	  }
	  
	  
  }
  
  public void searchAccount() 
  
  {   
	  System.out.println("Enter your Account No : ");
	  long account_No=scanner.nextLong();
	  
	  for(int i=0;i<accList.size();i++) 
	   {
		 Account a1=(Account)accList.get(i);
		 
		 if(a1.acc_No==account_No)
				 {
			       System.out.println(a1.toString());
			     } 
		 else 
		 {
			 System.out.println("Please create your Account!");
			 createAccount();
		 }
		
	   }  
  }

  public void editAccount()
  {
	  System.out.println("Enter your Account No : ");
	  long account_No=scanner.nextLong();
	  
	  for(int i=0;i<accList.size();i++) 
	   {
		 Account a1=(Account)accList.get(i);
		 
		 if(a1.acc_No==account_No)
				 { 
			      System.out.println("Enter new Address : ");
			      a1.address=scanner.next();
			      
			      System.out.println(a1.toString());
			     } 
		 else 
		 {
			 System.out.println("Please create your Account!");
			 createAccount();
		 }
		
	   }  
  }   
  
  public void addAmount()
  {
	  
	      System.out.println("Enter Amount : ");
	      double amount=scanner.nextDouble();
	      
	     
	      System.out.println("Enter your Account No : ");
		  long account_No=scanner.nextLong(); 
		  
		  if(amount>0) 
	      {
		  for(int i=0;i<accList.size();i++) 
		   {
			 Account a1=(Account)accList.get(i);
			 
			 if(a1.acc_No==account_No)
					 { 
				        
				        a1.balance=a1.balance+amount;
				        System.out.println("Amount Rs"+ amount +"addedd successfully into the account :"+ account_No);
				     } 
			 else 
			 {
				 System.out.println("Account Not Found!");
				 
			 }
			
		   }  
	      }
	      else 
	      { 
				 System.out.println("You cannot add Rs 0 into the account  :" + account_No);

	      }
		  
	  
  }  
  
  public void withdrawAmount()
  {
	  { 
	      System.out.println("Enter Amount : ");
	      double amount=scanner.nextDouble();
	      
	      System.out.println("Enter your Account No : ");
		  long account_No=scanner.nextLong(); 
		  
		  if(amount==0)
		  {
			  System.out.println(" You cannot withdraw Rs 0 from the account  : "+ account_No);
		  }
		  for(int i=0;i<accList.size();i++) 
		   {
			 Account a1=(Account)accList.get(i);
			 
			 if(a1.acc_No==account_No )
					 {  
				        if(a1.balance!=0)
				        {
				        a1.balance=a1.balance-amount;
				        System.out.println("Amount Rs"+ amount +"debited from the account :"+ account_No);
				        } 
				        else {
				        	 System.out.println("Insufficeient balance in the account : " + account_No);	
						}
				     } 
			 else 
			 {
				 System.out.println("Account Not Found!");
				 
			 }
			
		   } 
		  
	  } 
  }
  
  public void balanceEnquiry()
  {
	  System.out.println("Enter your Account No : ");
	  long account_No=scanner.nextLong(); 
	  for(int i=0;i<accList.size();i++) 
	   {
		 Account a1=(Account)accList.get(i);
		 
		 if(a1.acc_No==account_No)
				 {
			      System.out.println("Your balance is " + a1.balance);
				 } 
		 else 
		 {
			 System.out.println("Account Not Found!");
			 
		 }
		
	   }  
   }
}
