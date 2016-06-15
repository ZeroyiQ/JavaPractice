
public class Test {

	public static void main(String[] args) {
		Person zhangsan = new Person("张三", "北京", "111", "ab@126.com");
		Student lisi = new Student("李四", "北京", "222", "cd@126.com", "1");
		Employee wangwu = new Employee("王五","上海","333","ef@126.com","二教",6000) ;
		Faculty zhaoliu = new Faculty("赵六", "上海", "444", "hi@126.com", "二教", 5000, "3", "9点");
		Staff sunqi = new Staff("孙七", "上海", "555", "jk@126.com", "三教", 5000, "处级");
		
		System.out.println(zhangsan.toString()+"\n\n"+lisi.toString()+"\n\n"+wangwu.toString()+"\n\n"+zhaoliu.toString()+"\n\n"+sunqi.toString());
	}
	
	
}
