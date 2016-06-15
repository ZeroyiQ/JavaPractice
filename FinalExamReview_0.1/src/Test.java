
public class Test {
	public static void main(String[] args) {
		BMI bmi = new BMI("уехЩ", 18, 60, 1.7);
		System.out.println(bmi.getBMI());
		System.out.println(bmi.getStatus());
	}
}
