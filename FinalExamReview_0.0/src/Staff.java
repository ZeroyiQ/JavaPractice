
public class Staff extends Employee {
	private static final String KEJI = "科级";
	private static final String CHUJI = "处级";

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
			return super.toString()+"\n职务"+rank;
		}
		else {
			return "您输入的职员"+getName()+"的职务有误，请重新输入！";
		}
	}
}
