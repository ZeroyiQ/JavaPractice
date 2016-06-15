import java.util.Date;

import account.Account;

public class Test {

	public static void main(String[] args) {
		Account Account = new Account();
		Account.setAccout(1122, 20000);
		Account.setAnnualInterestRate(0.045);
		Account.withDraw(2500);
		Account.deposit(3000);
		int id = Account.getId();
		double MonthlyInterestRate = Account.getMonthlyInterestRate();
		Date dateCreated = Account.getDateCreated();
		System.out.println("-----------------------------------");
		System.out.println(id);
		System.out.println(MonthlyInterestRate);
		System.out.println(dateCreated);
		System.out.println("-----------------------------------");

	}

}
