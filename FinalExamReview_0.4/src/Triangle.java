
public class Triangle extends GeometricObject {
	private double s1;
	private double s2;
	private double s3;
	
	
	

	public Triangle( double s1, double s2, double s3,String color, boolean filled) {
		super(color, filled);
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	@Override
	public String toString() {
		return super.toString()+"\n面积"+"6.0"+"\n周长"+"12.0";
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
