
public class Faculty extends Person implements Volunteer{
	private String title;
	final public String TEACHING_ASSISTANT="����";
	final public String LECTURER="��ʦ";
	final public String ASSOCIATE_PROFESSOR="������";
	final public String PROFESSOR="��ʦ";
	public Faculty(String name, String title) {
		super(name);
		this.title = title;
	}
	@Override
	public String toString() {
		return super.toString()+"Faculty [title=" + title + "]"+"\n";
	}
	@Override
	public String volunteer(String inform) {
		// TODO Auto-generated method stub
		return inform;
	}
	
	
}
