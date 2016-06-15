
public class Faculty extends Person implements Volunteer{
	private String title;
	final public String TEACHING_ASSISTANT="助教";
	final public String LECTURER="讲师";
	final public String ASSOCIATE_PROFESSOR="副教授";
	final public String PROFESSOR="教师";
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
