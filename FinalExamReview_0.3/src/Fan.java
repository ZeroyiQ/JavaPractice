
public class Fan {
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;

	private int speed = SLOW;
	private boolean ON = false;
	private double radius = 5;
	private String color = "blue";

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isON() {
		return ON;
	}

	public void setON(boolean oN) {
		ON = oN;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fan() {
	}

	public Fan(int speed, boolean oN, double radius, String color) {
		this.speed = speed;
		ON = oN;
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public String toString() {
		if (ON) {
			return "�÷��ȵ��ٶ�Ϊ"+speed+"\n��ɫ��"+color+"\n�뾶��"+String.format("%.1f",radius);
		}
		else {
			return "fan is off\n�÷��ȵ���ɫ��"+color+"\n�뾶��"+String.format("%.1f",radius);
		}
	}
}
