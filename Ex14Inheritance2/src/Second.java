
public class Second extends First {
	
	private int b;
	
	public void show() {
		//System.out.println(a); error 상속받아도 프라이빗은 못건드림 
		showFirst();
		System.out.println("b : "+b);
		System.out.println();
	}
	
	
	//생성자 메소드 : Constructor
	public Second() {
		// 자동으로 부모객체를 생성하면서 생성자메소드가 호출됨
		// 부모생성자를 호출하는 호출문이 사실 숨겨져있음.
		// 다른생성자를 부르는 this()생성자 호출문이 있듯이
		// 부모생성자를 호출하는 호출문법이 존재함
		//super(); //써도 안써도 동일하게 동작 숨겨져있었음
		System.out.println("Second객체 생성");
	}
	
	//생성자 메소드 오버로딩
	public Second(int a,int b) {
		//매개변수 값을 멤버변수에 대입
		//super.a=a; //error - 부모의 멤버가 private
		//부모객체를 생성하면서 생성자메소드 호출하며 값 전달
		super(a);		  //생성자 호출은 무조건 첫번째
		this.b=b;
		System.out.println("Second객체 생성 int,int");
	}
}
