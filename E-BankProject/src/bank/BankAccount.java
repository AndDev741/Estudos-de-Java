package bank;

public interface BankAccount {
	public void deposit(int value);
	public void withdrawMoney(int value);
	public int getMoney();
	public String getClient();
}
