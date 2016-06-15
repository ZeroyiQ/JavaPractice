package res;

public class Student extends Person{
	private String stNo;
	private int grade;
	public Student(){
		
	}
	
	public Student(String name, char sex, Address adr,String stNo,int grade ) {
		super(name, sex, adr);
		this.stNo=stNo;
		this.grade=grade;
		
	}

	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
