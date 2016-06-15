package src;

public class Rectangle extends Shape {
	private double w;
	private double h;

	public Rectangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
		if(w<=0 || h<=0){
			System.out.println("矩形长和宽应该是正数！");
		}
	}

	@Override
	double area() {
		return w * h;
	}

	@Override
	double perimeter() {
		return 2 * (w + h);
	}

	@Override
	public String toString() {
		return "----矩-形----"+"\n"+"高度："+this.h+"\n"+"宽度："+this.w+"\n"+"周长："+this.perimeter()+"\n"+"面积:"+this.area();
	}

}
