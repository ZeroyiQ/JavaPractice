package test;

public class Point {
	private int x;
	private int y;
	
	//Point�����ֹ��췽��
	public Point(){
	}

	public Point(int _x, int _y) {
		this.setX(_x);
		this.setY(_y);
	}
	
	//���������޸���
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int _x) {
		this.x = _x;
	}

	public void setY(int _y) {
		this.y = _y;
	}
}
