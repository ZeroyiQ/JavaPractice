package src;

public class Rectangle implements Speakable {
	private double w;
	private double h;

	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
		if (w <= 0 || h <= 0) {
			System.out.println("矩形长和宽应该是正数！");
		}
	}

	public double area() {
		return w * h;
	}

	public double perimeter() {
		return 2 * (w + h);
	}

	public String toString() {
		return "----矩-形----" + "\n" + "高度：" + this.h + "\n" + "宽度：" + this.w + "\n" + "周长：" + this.perimeter() + "\n"
				+ "面积:" + this.area();
	}

}
