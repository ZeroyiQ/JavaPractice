package test;

import computerStudent.ComputerStudent;
import computerStudent.Courses;

public class Test {

	public static void main(String[] args) {
		// ��������
		ComputerStudent xiaoming = new ComputerStudent();
		ComputerStudent xiaohong = new ComputerStudent();
		ComputerStudent xiaogang = new ComputerStudent();
		Courses riyu = new Courses();
		Courses wangqiu = new Courses();

		// ��������ѧ������Ϣ

		// ID 1 С�� ����
		xiaoming.setId(1);
		xiaoming.setStudentName("С��");
		xiaoming.addCourses(new String[] { "����" });

		// ID 2 С�� ����
		xiaohong.setId(2);
		xiaohong.setStudentName("С��");
		xiaohong.addCourses("����","����");

		// ID 3 С�� ���� ����
		xiaogang.setId(3);
		xiaogang.setStudentName("С��");
		xiaogang.addCourses("����","����");

		// ���� 1.5�� 2��
		riyu.setCourseName("����");
		riyu.setcredit(1.5f);
		riyu.inputStu("01 С��","02 С��","03 С��");

		// ���� 2�� 2��
		wangqiu.setCourseName("����");
		wangqiu.setcredit(2f);
		wangqiu.inputStu("02 С��","03 С��");

		// �������ѧ����Ϣ
		System.out.println("~~~~~~~~~~~~");
		System.out.println(xiaoming.toString());
		System.out.println("~~~~~~~~~~~~");
		System.out.println(xiaohong.toString());
		System.out.println("~~~~~~~~~~~~");
		System.out.println(xiaogang.toString());

		// ������ſε���Ϣ
		System.out.println("###########");
		System.out.println(riyu.toString());
		System.out.println(riyu.studentsNames());
		System.out.println("###########");
		System.out.println(wangqiu.toString());
		System.out.println(wangqiu.studentsNames());
		System.out.println("###########");
	}

}
