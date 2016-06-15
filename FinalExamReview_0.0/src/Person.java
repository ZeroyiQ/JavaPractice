
public class Person {
	private String name = new String();
	private String addresss = new String();
	private String phone = new String();
	private String email = new String();

	public Person(String name, String addresss, String phone, String email) {
		this.name = name;
		this.addresss = addresss;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "姓名" + name + "\n地址" + addresss + "\n电话号码" + phone + "\n电子邮件" + email ;
	}

}
