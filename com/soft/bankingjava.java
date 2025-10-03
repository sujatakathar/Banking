package com.soft;

public class bankingjava {
	public static void main(String[]args) {
		 Banking  Bank = new Banking();
		 Bank.setCustId(123456);
		 Bank.setCustName("sujata kathar");
		 Bank.setAccountNumber(123456789L);
		 Bank.setEmail("sujatakathar@123gmail.com");
		 
		 System.out.println("custmer ID:-" + Bank.getCustId());
		 System.out.println("custmer Name:-" + Bank.getCustName());
		 System.out.println("Account Number:-" + Bank.getAccountNumber());
		 System.out.println("Balance:-" + Bank.getBalance());
		 System.out.println("custmer ID:-" + Bank.getEmail());
		 System.out.println("==============================");
		 
		 Bank.displayAccountInfo();
		 
		 Bank.deposit(1500);
		 Bank.deposit(2000);
		 Bank.deposit(5000);
		 Bank.deposit(6000);//shoulld fail
		 Bank.deposit(-500);//should show error*/

	} 
	}
	


