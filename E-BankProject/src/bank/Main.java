package bank;

public class Main {
	public static void main(String[] args) {
		Account account = new Account("John May");
		account.deposit(-1400);
		System.out.println(account.getMoney());
		account.withdrawMoney(1300);
		System.out.println(account.getMoney());
	}
}
