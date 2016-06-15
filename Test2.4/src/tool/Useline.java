package tool;

import test.*;

public class Useline {

	public static void main(String[] args) {
		Point point1 = new Point(2, 5);
		Point point2 = new Point(4, 6);
		
		//第一种构造方法
		Line line1 = new Line(point1,point2);
		
		//第二站构造方法
		Line line2 = new Line(2, 5, 4, 6);
		
		line1.distance();
		line2.distance();
		
		System.out.println("线1的长度："+line1.getLength());
		System.out.println("线2的长度："+line2.getLength());
		
	}

}
