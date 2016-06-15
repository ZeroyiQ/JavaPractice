public class Vehicle {
	private float speed = 0;

	// 重载机车类
	public void vehicle() {
	}

	// 重载机车.速度
	public void Vehiclespeed(float num) {
		this.speed = num;
	}

	// 得到速度
	public float getSpeed() {
		return speed;
	}

	// 设置速度
	public void setSpeed(float num) {
		this.speed = num;
	}

	// 速度加快
	public void speedUp(float up) {
		this.speed += up;
	}

	// 速度减慢
	public void speedDown(float down) {
		this.speed -= down;
	}

}
