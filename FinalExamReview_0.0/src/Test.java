
public class Test {

	public static void main(String[] args) {
		Person zhangsan = new Person("����", "����", "111", "ab@126.com");
		Student lisi = new Student("����", "����", "222", "cd@126.com", "1");
		Employee wangwu = new Employee("����","�Ϻ�","333","ef@126.com","����",6000) ;
		Faculty zhaoliu = new Faculty("����", "�Ϻ�", "444", "hi@126.com", "����", 5000, "3", "9��");
		Staff sunqi = new Staff("����", "�Ϻ�", "555", "jk@126.com", "����", 5000, "����");
		
		System.out.println(zhangsan.toString()+"\n\n"+lisi.toString()+"\n\n"+wangwu.toString()+"\n\n"+zhaoliu.toString()+"\n\n"+sunqi.toString());
	}
	
	
}
