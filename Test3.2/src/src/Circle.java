package src;

public class Circle extends Shape {
	private double r;

	public Circle(double r) {
		super();
		this.r = r;
		if (r<=0) {
			System.out.println("圆的半径为正数！");
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
		return  "----圆-形----"+"\n"+"半径："+this.r+"\n"+"周长："+this.perimeter()+"\n"+"面积:"+this.area();
	}

}
