package src;

public class Circle extends Shape {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
		if (r<=0) {
			System.out.println("Բ�İ뾶Ϊ������");
		}
	}

	@Override
	double area() {
		return r * r * Math.PI;
	}

	@Override
	double perimeter() {
		return 2 * r * Math.PI;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "----Բ-��----"+"\n"+"�뾶��"+this.r+"\n"+"�ܳ���"+this.perimeter()+"\n"+"���:"+this.area();
	}

}
