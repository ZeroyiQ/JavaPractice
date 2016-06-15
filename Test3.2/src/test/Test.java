package test;
import src.*;
public class Test {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(3, 4, 5);
		Rectangle rectangle = new Rectangle(4, 5);
		Circle circle = new Circle(5);
		System.out.println(triangle.toString());
		System.out.println(rectangle.toString());
		System.out.println(circle.toString());
		
	}
}
