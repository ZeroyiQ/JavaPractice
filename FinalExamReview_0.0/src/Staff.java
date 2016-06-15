
public class Staff extends Employee {
	private static final String KEJI = "�Ƽ�";
	private static final String CHUJI = "����";

	private String rank = new String();
	private boolean isRight = true;

	public Staff(String name, String addresss, String phone, String email, String office, int salary, String rank) {
		super(name, addresss, phone, email, office, salary);
		setRank(rank);
	}

	public void setRank(String rank) {
		switch (rank) {
		case KEJI:
			this.rank = rank;
			break;
		case CHUJI:
			this.rank = rank;
			break;
		default:
			isRight = false;
			break;
		}
	}
	@Override
	public String toString() {
		if (isRight) {
			return super.toString()+"\nְ��"+rank;
		}
		else {
			return "�������ְԱ"+getName()+"��ְ���������������룡";
		}
	}
}
