
public class Test {

	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		car.setSpeed(10);
		float speed0 = car.getSpeed();
		System.out.println("�趨���ٶ�V0=" + speed0);
		car.speedUp(20);
		float speed2 = car.getSpeed();
		System.out.println("����20��V2=" + speed2);
		car.speedDown(5);
		float speed3 = car.getSpeed();
		System.out.println("����5��V3=" + speed3);
		
	}

}
