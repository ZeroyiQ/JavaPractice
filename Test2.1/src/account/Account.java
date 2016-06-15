package account;
import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	// ����Ĭ���˻�
	public void getdefaultAccount() {
		System.out.println("ID: " + id);
		System.out.println("BALANCE: " + balance);
		System.out.println("ANNUALINTERESTRATE: " + annualInterestRate);
		System.out.println("DATACREATED: " + dateCreated);
	}

	// �������ض�id�ͳ�ʼ�����˻�
	public void setAccout(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	// �������ݵķ������͹��췽��
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

	// dataCreate�ķ�����
	public Date getDateCreated() {
		return dateCreated;
	}

	// ����������
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = 0;
		monthlyInterestRate = balance * annualInterestRate / 12;
		return monthlyInterestRate;
	}

	// ȡ��
	public void withDraw(int num) {
		this.balance -= num;
	}

	// ���
	public void deposit(int num) {
		this.balance += num;
	}
}
