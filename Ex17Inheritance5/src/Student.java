
public class Student extends Person{
	
	private String major;
	
	public Student() {
		super();
		major="";
	}
	public Student(String name,int age,String major) {
		super(name,age);
		this.major=major;
	}
	
	//상속받은 기능show()는 name,age만 출력함
	//그래서 기능을 개선 - override
	public void show() {
		super.show();
		System.out.println("major: "+major);
	}
}
