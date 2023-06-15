
public class Main {
	public static void main(String[] args) {
		
		//지역변수에 final을 붙이면 상수화된 변수
		final int a=10;
		//a=20; error a값변경 불가능
		
		//자바의 특이한점
		final int b;   //쓰다가 만거라고 인식
		b=20;          //최초의 한번 대입가능 권장x
		//b=30;        error  
		
		//멤버변수에 final? 당연히 가능
		
		
		System.out.println(Test.COUNT);
		//Test.count=20;  //final 변수라
		
		//final을 메소드에도 적용가능-오버라이드 금지
		
		//class에도 final적용가능 - 상속불가능 클래스
	}
}
