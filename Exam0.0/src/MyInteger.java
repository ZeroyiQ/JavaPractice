
public class MyInteger {
	private int value = 0;

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;

	}

	public boolean isEven() {
		boolean flag = false;
		if ((value % 2) == 0) {
			flag = true;
		}
		return flag;
	}

	public boolean isOdd() {
		boolean flag = false;
		if ((value % 2) != 0) {
			flag = true;
		}
		return flag;
	}
	public static void main(String[] args) {
		MyInteger n1=new MyInteger(5);
		MyInteger n2 = new MyInteger(6);
		System.out.println("n1 is even?"+n1.isEven());
		System.out.println("n1 is odd?"+n1.isOdd());
		System.out.println("n2 is even?"+n2.isEven());
		System.out.println("n2 is odd?"+n2.isOdd());
	}
}

