package test;

import computerStudent.ComputerStudent;
import computerStudent.Courses;

public class Test {

	public static void main(String[] args) {
		// 声明变量
		ComputerStudent xiaoming = new ComputerStudent();
		ComputerStudent xiaohong = new ComputerStudent();
		ComputerStudent xiaogang = new ComputerStudent();
		Courses riyu = new Courses();
		Courses wangqiu = new Courses();

		// 创建三个学生的信息

		// ID 1 小明 日语
		xiaoming.setId(1);
		xiaoming.setStudentName("小明");
		xiaoming.addCourses(new String[] { "日语" });

		// ID 2 小红 网球
		xiaohong.setId(2);
		xiaohong.setStudentName("小红");
		xiaohong.addCourses("网球","日语");

		// ID 3 小刚 日语 网球
		xiaogang.setId(3);
		xiaogang.setStudentName("小刚");
		xiaogang.addCourses("网球","日语");

		// 日语 1.5分 2人
		riyu.setCourseName("日语");
		riyu.setcredit(1.5f);
		riyu.inputStu("01 小明","02 小红","03 小刚");

		// 网球 2分 2人
		wangqiu.setCourseName("网球");
		wangqiu.setcredit(2f);
		wangqiu.inputStu("02 小红","03 小刚");

		// 输出三个学生信息
		System.out.println("~~~~~~~~~~~~");
		System.out.println(xiaoming.toString());
		System.out.println("~~~~~~~~~~~~");
		System.out.println(xiaohong.toString());
		System.out.println("~~~~~~~~~~~~");
		System.out.println(xiaogang.toString());

		// 输出两门课的信息
		System.out.println("###########");
		System.out.println(riyu.toString());
		System.out.println(riyu.studentsNames());
		System.out.println("###########");
		System.out.println(wangqiu.toString());
		System.out.println(wangqiu.studentsNames());
		System.out.println("###########");
	}

}
