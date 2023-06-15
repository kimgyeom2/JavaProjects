
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추상 클래스의 문법적 특징 알아보기.
		// 추상클래스는 곧바로 객체 생성이 불가능
		// Test t=new Test; //error
		
		// 추상클래스를 사용하려면..상속한 클래스를 설계하여 객체로 생성하여 사용함
		// Test 추상클래스를 상속하는 Nice라는 클래스를 설계
		
		// 추상클래스를 상속한 클래스들은 반드시 추상메소드를 구현해야만 하기에
		// 특정 메소드를 반드시 보유하게끔 강제할 수 있다는 특징이 있음			
		Hello h=new Hello();
		h.aaa();
		
		
		//인터페이스- 일반 변수나 메소드없이 오로지 추상적인것들만 있는 클래스
		
	}

}
