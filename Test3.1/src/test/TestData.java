package test;

import res.Address;
import res.Student;
import res.Teacher;

public class TestData {
	public static void main(String[] args) {
		Student xiaoming = new Student();
		Teacher xiaogang = new Teacher();
		
		xiaoming.setName("С��");
		xiaoming.setSex('��');
		xiaoming.setAdr(new Address("�й�","�����","����","106"));
		xiaoming.setStNo("123");
		
		xiaogang.setName("С��");
		xiaogang.setSex('��');
		xiaogang.setAdr(new Address("�й�","�����","����","101"));
		xiaogang.setGongHao(456);
		
		xiaogang.setStudentGrade(xiaoming, 90);
		
		System.out.println(xiaoming.getName()+"�ĳɼ���"+xiaoming.getGrade());
		
		System.out.println(xiaoming.toString());
		
		
		
	}
}
