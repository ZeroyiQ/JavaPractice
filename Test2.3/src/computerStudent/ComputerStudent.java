package computerStudent;

public class ComputerStudent {
	static String schoolName = "BISTU";
	private int id;
	private String studentName = new String();
	private String courses = new String();
	private int couresNum = 0;

	// �޲εĹ��췽��
	public void reset() {
	}

	// ��ʼ��ѧ����ѧ�š�������ѡ��
	public void defaultStudentData() {
		this.setId(1);
		this.setStudentName("����");
		String defaultCourses =  "��";
		this.courses = defaultCourses;
	}

	// ѧ��ѧ�š������ķ��������޸���
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;

	}

	// ѧ��ѡ����Ŀ��ѡ�εķ�����
	public String getCourses() {
		return courses;
	}

	public int getCouresNum() {
		return couresNum;
	}

	// ��ӿγ�
	public void addCourses(String... course) {
		this.couresNum = course.length;
		for (int i = 0; i < course.length; i++) {
			this.courses += course[i]+" ";
		}

	}

	// ��������ѧ��������Ϣ
	public String toString() {

		String result = "ѧУ��" + schoolName + "\n" + "ID:" + id + "\n" + "������" + studentName + "\n" + "�γ�����" + couresNum
				+ "\n" + "�γ�:" + courses;
		return result;
	}

}
