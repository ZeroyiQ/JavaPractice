package src;

public class Triangle extends Shape {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		if (a <= 0 || b <= 0 || c <= 0 || a+b<=c || Math.abs(a-b)>=c) {
			System.out.println("三角形输入的三条边长不能小于等于零！");
		}
	}

	@Override
	double area() {
		double s = 0.5 * (a + b + c);
		return Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
	}

	@Override
	double perimeter() {
		return a + b + c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "----三角形----"+"\n"+"边长："+this.a+" "+this.b+" "+this.c+"\n"+"周长："+this.perimeter()+"\n"+"面积:"+this.area();
	}

}
