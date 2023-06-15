
public class Professor extends Person {
String object="";
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(String name, int age,String object) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.object=object;
	}
	public void show() {
		super.show();
		System.out.println("object: "+ object);
	}

}
