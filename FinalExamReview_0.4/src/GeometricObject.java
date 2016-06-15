
public abstract class GeometricObject {
	private String color = new String();
	private boolean filled;

	public GeometricObject() {
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "ÑÕÉ«"+color+"\nÊÇ·ñÌî³ä"+filled;
		
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
