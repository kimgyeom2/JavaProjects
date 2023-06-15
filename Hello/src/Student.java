
public class Student extends Person {
String major="";
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age,String major) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.major=major;
	}
	public void show() {
		super.show();
		System.out.println("major: "+major);
		
	}
}
