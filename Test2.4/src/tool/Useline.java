package tool;

import test.*;

public class Useline {

	public static void main(String[] args) {
		Point point1 = new Point(2, 5);
		Point point2 = new Point(4, 6);
		
		//��һ�ֹ��췽��
		Line line1 = new Line(point1,point2);
		
		//�ڶ�վ���췽��
		Line line2 = new Line(2, 5, 4, 6);
		
		line1.distance();
		line2.distance();
		
		System.out.println("��1�ĳ��ȣ�"+line1.getLength());
		System.out.println("��2�ĳ��ȣ�"+line2.getLength());
		
	}

}
