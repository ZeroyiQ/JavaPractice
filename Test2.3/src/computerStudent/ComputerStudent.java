package computerStudent;

public class ComputerStudent {
	static String schoolName = "BISTU";
	private int id;
	private String studentName = new String();
	private String courses = new String();
	private int couresNum = 0;

	// 无参的构造方法
	public void reset() {
	}

	// 初始化学生的学号、姓名、选课
	public void defaultStudentData() {
		this.setId(1);
		this.setStudentName("佚名");
		String defaultCourses =  "无";
		this.courses = defaultCourses;
	}

	// 学生学号、姓名的访问器和修改器
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

	// 学生选课数目和选课的访问器
	public String getCourses() {
		return courses;
	}

	public int getCouresNum() {
		return couresNum;
	}

	// 添加课程
	public void addCourses(String... course) {
		this.couresNum = course.length;
		for (int i = 0; i < course.length; i++) {
			this.courses += course[i]+" ";
		}

	}

	// 返回描述学生所有信息
	public String toString() {

		String result = "学校：" + schoolName + "\n" + "ID:" + id + "\n" + "姓名：" + studentName + "\n" + "课程数：" + couresNum
				+ "\n" + "课程:" + courses;
		return result;
	}

}
