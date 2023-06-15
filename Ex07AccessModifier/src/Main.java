import aaa.Second;

public class Main {

	public static void main(String[] args) {
		
		
		// OOP는 객체의 멤버들을 외부에서 마음대로 사용하는 것에 대해 제한함
		// 그래서 존재하는 접근제한자 라는 문법이 존재함.
		
		// 멤버접근을 제한하는 제한자의 4가지 종류
		//1. private     본인 클래스 안에서만 접근가능
		//2. default     같은 패키지안에서는 .연산자로 멤버접근가능, 다른패키지에서는 접근불가
		//3. protected   같은 패키지안에서는 .연산자로 멤버접근가능, 다른패키지에서는 접근불가, 단 상속관계하면 접근가능함
		//4. public      어디서든 .연산자만 있으면 접근가능  
	
		//같은 패키지의 클래스 객체 생성
		First f=new First();
		//f.a=10; //error : private멤버는 사용불가
		f.b=20;
		f.c=30;
		f.d=40;
		
		f.aaa();
		
		//다른 패키지의 클래스 객체 생성
		aaa.Second s=new aaa.Second(); //or import aaa.Second;
		//s.a=10; //error
		//s.b=20; //error
		//s.c=30; //error
		s.d=40; //public만 사용가능
		
		
		//멤버함수 호출 - 함수도 멤버에대한 접근제한 영향을 받음
		//s.show(); //error
		s.output();
	
	
	}
}
