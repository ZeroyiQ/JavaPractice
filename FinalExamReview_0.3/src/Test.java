
public class Test {
	public static void main(String[] args) {
		Fan fan1=new Fan(3, true, 10.0, "yellow");
		Fan fan2 = new Fan(2, false, 5.0, "blue");
		System.out.println(fan1.toString()+"\n\n"+fan2.toString());
	}
}
