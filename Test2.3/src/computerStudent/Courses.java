package computerStudent;

public class Courses {
	private String courseName;
	private double credit = 0;
	private int courseStuNum = 0;
	private String courseStu=new String();

	public void reset() {
	}

	// 课程名称和学分的访问器和修改器
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

	// 选课人数的访问器
	public int getCourseStuNum() {
		return courseStuNum;
	}

	// 添加选课学生的成员方法
	public void inputStu(String... studens) {
		this.courseStuNum=studens.length;
		for (int i = 0; i < studens.length; i++) {
			this.courseStu+=studens[i]+"\n";
		}
	}

	// 返回描述课程信息的字符串
	public String toString() {
		String temp = new String();

		temp = "课程：" + courseName + "\n" + "学分:" + credit + "\n" + "人数:" + courseStuNum;
		return temp;
	}

	// 选修本课程的学生名单
	public String studentsNames() {
		System.out.println("ID 姓名");
		return courseStu;
	}
}
