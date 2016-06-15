package test;

import res.Address;
import res.Student;
import res.Teacher;

public class TestData {
	public static void main(String[] args) {
		Student xiaoming = new Student();
		Teacher xiaogang = new Teacher();
		
		xiaoming.setName("小明");
		xiaoming.setSex('男');
		xiaoming.setAdr(new Address("中国","五道口","北京","106"));
		xiaoming.setStNo("123");
		
		xiaogang.setName("小刚");
		xiaogang.setSex('男');
		xiaogang.setAdr(new Address("中国","五道口","北京","101"));
		xiaogang.setGongHao(456);
		
		xiaogang.setStudentGrade(xiaoming, 90);
		
		System.out.println(xiaoming.getName()+"的成绩："+xiaoming.getGrade());
		
		System.out.println(xiaoming.toString());
		
		
		
	}
}
