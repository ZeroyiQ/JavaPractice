package computerStudent;

public class Courses {
	private String courseName;
	private double credit = 0;
	private int courseStuNum = 0;
	private String courseStu=new String();

	public void reset() {
	}

	// �γ����ƺ�ѧ�ֵķ��������޸���
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getcredit() {
		return credit;
	}

	public void setcredit(float credit) {
		this.credit = credit;
	}

	// ѡ�������ķ�����
	public int getCourseStuNum() {
		return courseStuNum;
	}

	// ���ѡ��ѧ���ĳ�Ա����
	public void inputStu(String... studens) {
		this.courseStuNum=studens.length;
		for (int i = 0; i < studens.length; i++) {
			this.courseStu+=studens[i]+"\n";
		}
	}

	// ���������γ���Ϣ���ַ���
	public String toString() {
		String temp = new String();

		temp = "�γ̣�" + courseName + "\n" + "ѧ��:" + credit + "\n" + "����:" + courseStuNum;
		return temp;
	}

	// ѡ�ޱ��γ̵�ѧ������
	public String studentsNames() {
		System.out.println("ID ����");
		return courseStu;
	}
}
