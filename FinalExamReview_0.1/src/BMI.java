
public class BMI {
	private String name = new String();
	private int age;
	private double weight;
	private double height;

	public BMI() {
	}

	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBMI() {
		return weight / Math.pow(height, 2);
		

	}

	public String getStatus() {
		if (getBMI() < 18.5) {
			return "过轻";
		} else if (getBMI() >= 18.5 && getBMI() <= 24) {
			return "正常";
		} else if (getBMI() >= 24) {
			return "超重";
		} else {
			return "BMI有误，请确认输入的身高和体重是否正确";
		}
	}

}
