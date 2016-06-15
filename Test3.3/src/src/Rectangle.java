package src;

public class Rectangle implements Speakable {
	private double w;
	private double h;

	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
		if (w <= 0 || h <= 0) {
			System.out.println("���γ��Ϳ�Ӧ����������");
		}
	}

	public double area() {
		return w * h;
	}

	public double perimeter() {
		return 2 * (w + h);
	}

	public String toString() {
		return "----��-��----" + "\n" + "�߶ȣ�" + this.h + "\n" + "��ȣ�" + this.w + "\n" + "�ܳ���" + this.perimeter() + "\n"
				+ "���:" + this.area();
	}

}
