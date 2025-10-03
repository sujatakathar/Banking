package com.soft;

public class Banking {
	private int custId;
	private String custName;
	public  long accountNumber;
	private float balance;
	private String email;
	//getter and setter methods create
	public int getCustId(){
		return custId;
	}
	public void setCustId(int custId) { //getters and setters with validation where needed
		this.custId =custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName){
		this.custName = custName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber){
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance)
	{
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void deposit(float amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("/nDeposited:-" + amount + "/n| New Balance:- " + balance);
		}
		else {
			System.out.println("/nDeposit amount must be positive.");
		}
	}
	public void withdraw(float amount) {
		if(amount > 0){
			if (amount <= balance) {
				balance -= amount;
				System.out.println("nWithdrew:-" + amount + "/n| Remainning Balance:- " + balance);
			}
		}
	}
	public void displayAccountInfo()
	{
	}		
}
	
	


