package src;

public class Rectangle extends Shape {
	private double w;
	private double h;

	public Rectangle(double w, double h) {
		super();
		this.w = w;
		this.h = h;
		if(w<=0 || h<=0){
			System.out.println("���γ��Ϳ�Ӧ����������");
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
		return "----��-��----"+"\n"+"�߶ȣ�"+this.h+"\n"+"��ȣ�"+this.w+"\n"+"�ܳ���"+this.perimeter()+"\n"+"���:"+this.area();
	}

}
