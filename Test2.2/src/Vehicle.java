public class Vehicle {
	private float speed = 0;

	// ���ػ�����
	public void vehicle() {
	}

	// ���ػ���.�ٶ�
	public void Vehiclespeed(float num) {
		this.speed = num;
	}

	// �õ��ٶ�
	public float getSpeed() {
		return speed;
	}

	// �����ٶ�
	public void setSpeed(float num) {
		this.speed = num;
	}

	// �ٶȼӿ�
	public void speedUp(float up) {
		this.speed += up;
	}

	// �ٶȼ���
	public void speedDown(float down) {
		this.speed -= down;
	}

}
