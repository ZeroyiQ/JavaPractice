package res;

public class Teacher extends Person {
	private int gongHao;

	public Teacher() {

	}

	public int getGongHao() {
		return gongHao;
	}

	public void setGongHao(int gongHao) {
		this.gongHao = gongHao;
	}

	public Teacher(String name, char sex, Address adr,int gongHao) {
		super(name, sex, adr);
		this.gongHao=gongHao;
	}
	public void setStudentGrade(Student s,int grade){
			s.setGrade(grade);
	}
}
