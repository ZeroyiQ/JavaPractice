package src;

public class Circle implements Speakable {
	private double r;

	public Circle(double r) {
		this.r = r;
		if (r <= 0) {
			System.out.println("圆的半径为正数！");
		}
	}

	public double area() {
		return r * r * Math.PI;
	}

	public double perimeter() {
		return 2 * r * Math.PI;
	}

	public String toString() {
		return "----圆-形----" + "\n" + "半径：" + this.r + "\n" + "周长：" + this.perimeter() + "\n" + "面积:" + this.area();
	}

}
