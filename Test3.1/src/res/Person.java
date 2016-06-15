package res;

public class Person  {
	protected String name;
	protected char sex;
	protected Address adr;
	public Person(){
		
	}
	public Person(String name, char sex, Address adr) {
		super();
		this.name = name;
		this.sex = sex;
		this.adr = adr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}
	
	public String toString(){
		return "������"+this.name+"\n"+"�Ա�"+this.sex+"\n"+"---��-ַ---"+"\n"+this.adr.toString();
	}
}
