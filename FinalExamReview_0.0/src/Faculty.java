
public class Faculty extends Employee {
	private static final String ASSISTANT = "1";
	private static final String LECTURER = "2";
	private static final String ASSOCIATE_PROF = "3";
	private static final String PROF = "4";

	private String office_hours = new String();
	private String rank = new String();
	private boolean isRight = true;

	public Faculty(String name, String addresss, String phone, String email, String office, int salary, String rank,
			String office_hours) {
		super(name, addresss, phone, email, office, salary);
		setRank(rank);
		this.office_hours = office_hours;
	}

	public void setRank(String rank) {
		switch (rank) {
		case ASSISTANT:
			this.rank = rank;
			break;
		case LECTURER:
			this.rank = rank;
			break;
		case ASSOCIATE_PROF:
			this.rank = rank;
			break;
		case PROF:
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
			return super.toString()+"\n办公时间"+office_hours+"\n职称"+rank;
		}
		else {
			return "您输入的教员"+getName()+"的级别有误，请重新输入！";
		}
	}

}
