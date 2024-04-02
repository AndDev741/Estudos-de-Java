package bank;

public class Account implements BankAccount {
	private int money;
	private String client;
	
	public Account(String client) {
		money = 0;
		this.client = client;
	}
	
	//Getters
	public int getMoney(){
		return money;
	}
	
	public String getClient() {
		return client;
	}
	
	//Setters
	
	public void deposit(int value) {
		if(value > 0) {
			this.money = value;
		}
	}
	
	public void withdrawMoney(int value) {
		if(money >= 0 && value <= this.money) {
			this.money = this.money - value;
		}
	}
	
	
	
}
