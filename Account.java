package com.transactions;


public class Account 
{
	   long acc_No;
	   String acc_Name;
	   String address;
	   long mob_No;
	   long aadhar_No; 
	   int age;
	   double balance;
	   
	   public Account(long acc_No, String acc_Name, String address,long mob_No,long aadhar_No, int age, double balance)
	   {
		   this.acc_No=acc_No;
		   this.acc_Name=acc_Name;
		   this.address= address;
		   this.mob_No = mob_No;
		   this.aadhar_No= aadhar_No;
		   this.age = age;
		   this.balance= balance;
	   }


	@Override
	public String toString() {
		return "Account [acc_No=" + acc_No + ", acc_Name=" + acc_Name + ", address=" + address + ", mob_No=" + mob_No
				+ ", aadhar_No=" + aadhar_No  + ", age=" + age + "]";
	} 
	   
	   
		   
	   
	

}
