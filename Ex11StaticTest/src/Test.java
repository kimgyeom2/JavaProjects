
public class Test {

	public int a;        //멤버변수 -- 객체마다 변수존재 : 인스턴스변수 라고도 부름 스테이틱변수 반대를 표현하고싶을때
	public static int b; //정적(static) 멤버변수 - Test클래스에'1개'만 존재함
	//static 변수는 모양부터 좀 다름
	//클래스에 1개라 클래스변수라고도 함
	public Test(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	//일반 메소드 - instance method
	void aaa() {
		System.out.println("일반 메소드");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
	//클래스 메소드 - class method: 객체생성과 상관없이 호출가능한 메소드
	static void bbb() {
		System.out.println("static method");
		//static메소드 안에서는 static멤버변수만 사용가능
		//System.out.println("a : "+a);//일반변수-error
		System.out.println("b : "+b);//static 변수
			
		ccc(); //다른 메소드를 호출할 수 도있음
		//ddd(); //error 다른 일반 메소드는 호출 할 수없음
		//일반 메소드나 변수는 객체가 생성되어야 생기는거기때문
	}
	
	//또 다른 static method
	static void ccc() {
		System.out.println("ccc method");
	}
	
	void ddd() {
		System.out.println("ddd method");
	}


}
