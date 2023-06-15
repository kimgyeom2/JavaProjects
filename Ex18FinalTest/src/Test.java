
public class Test {
	
	//final int num; //멤버변수   기본값으로 초기화할꺼라고 생각안함
	final int USER_NUM=100;
	//코딩은 무조건 메소드 안에만! 
	//함수명은 동사형 변수명은 명사형   상수는 대문자!!!!!!!!!!
	public static final int COUNT=10;
	//키워드 순서기억하셈 
	
	
	void aaa() {
		//num=200;  final변수는 변경 불가능	
		bbb(10);
	}
	
	void bbb(final int n) {
		//n=20; 매개변수도 final 가능
		System.out.println(n);
	}
	
	//메소드에도 final키워드 적용?
	//이 메소드의 기능이 마지막이니 개선하지마라!!
	//override를 하지 못하게하는 메소드를 만들때
	final void show() {
		System.out.println("TEST");
	}
}
