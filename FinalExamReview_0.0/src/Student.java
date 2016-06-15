
public class Student extends Person {
	private static final String DAYI = "1";
	private static final String DAER = "2";
	private static final String DASAN = "3";
	private static final String DASI = "5";
	private String grade = new String();
	private boolean isRight = true;

	public Student(String name, String addresss, String phone, String email, String grade) {
		super(name, addresss, phone, email);
		this.setGrade(grade);

	}

	public void setGrade(String input) {
		switch (input) {
		case DAYI:
			this.grade = DAYI;
			break;
		case DAER:
			this.grade = DAER;
			break;
		case DASAN:
			this.grade = DASAN;
			break;
		case DASI:
			this.grade = DASI;
			break;
		default:
			isRight = false;
			break;
		}
	}

	@Override
	public String toString() {
		if(isRight){
			return super.toString()+"\n年级"+grade;
		}
		else {
			return "您输入的学生" + this.getName() + "的年级有误，请重新输入！";
		}
	}
}
