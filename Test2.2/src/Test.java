
public class Test {

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.setSpeed(10);
		float speed0 = car.getSpeed();
		System.out.println("设定初速度V0=" + speed0);
		car.speedUp(20);
		float speed2 = car.getSpeed();
		System.out.println("加速20后V2=" + speed2);
		car.speedDown(5);
		float speed3 = car.getSpeed();
		System.out.println("减速5后V3=" + speed3);
		
	}

}
