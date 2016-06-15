package src;

public class Circle implements Speakable {
	private double r;

	public Circle(double r) {
		this.r = r;
		if (r <= 0) {
			System.out.println("Բ�İ뾶Ϊ������");
		}
	}

	public double area() {
		return r * r * Math.PI;
	}

	public double perimeter() {
		return 2 * r * Math.PI;
	}

	public String toString() {
		return "----Բ-��----" + "\n" + "�뾶��" + this.r + "\n" + "�ܳ���" + this.perimeter() + "\n" + "���:" + this.area();
	}

}
