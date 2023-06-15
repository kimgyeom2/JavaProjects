
public class Person {

	
	private String name;
	private int age;

	//생성자메소드 왠만하면 안받는거랑 멤버변수 수만큼 받는 생성자 2개 만들것
	public Person() {
		name="no name";
		age=0;
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
}
