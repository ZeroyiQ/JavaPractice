package res;

public class Address {
	private String state;
	private String street;
	private String city;
	private String no;
	public Address(){
		
	}
	public Address(String state, String street, String city, String no) {
		super();
		this.state = state;
		this.street = street;
		this.city = city;
		this.no = no;
	}
	public String toString(){
		return "���ң�"+state+"\n"+"���У�"+city+"\n"+"�ֵ���"+street+"\n"+"���ƣ�"+no;
	}
}
