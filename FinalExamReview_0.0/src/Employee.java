
public  class Employee extends Person {
	private String office = new String();
	private int salary;

	public Employee(String name, String addresss, String phone, String email, String office, int salary) {
		super(name, addresss, phone, email);
		this.office = office;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + "\n办公室" + office + "\n工资" + salary;
	}

}
