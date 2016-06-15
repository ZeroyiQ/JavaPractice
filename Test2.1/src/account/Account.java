package account;
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	// 创建默认账户
	public void getdefaultAccount() {
		System.out.println("ID: " + id);
		System.out.println("BALANCE: " + balance);
		System.out.println("ANNUALINTERESTRATE: " + annualInterestRate);
		System.out.println("DATACREATED: " + dateCreated);
	}

	// 创建带特定id和初始余额的账户
	public void setAccout(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// 各个数据的访问器和构造方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// dataCreate的访问器
	public Date getDateCreated() {
		return dateCreated;
	}

	// 返回月利率
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = 0;
		monthlyInterestRate = balance * annualInterestRate / 12;
		return monthlyInterestRate;
	}

	// 取款
	public void withDraw(int num) {
		this.balance -= num;
	}

	// 存款
	public void deposit(int num) {
		this.balance += num;
	}
}
