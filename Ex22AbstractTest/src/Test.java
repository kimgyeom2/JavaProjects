
// 추상클래스 : 곧바로 객체생성을 할 수 없는 클래스 - 즉, 상속용으로만 존재하는 클래스
public abstract class Test {

	int a; 	// 인스턴스 변수
	static int b; // 클래스 변수
	
	// 생성자 메소드도 존재할 수 있음 - 객체를 생성할때 자동 발동하는 특별한 메소드
	public Test() {
		System.out.println("테스트 생성자");
	}
	
	// 일반메소드
	public void show() {
		System.out.println("Test show");
	}
	
	// 추상메소드 - 이름만있고 기능은 없는 메소드
	// 추상메소드를 보유한 클래스는 '반드시'추상클래스로 선언되어야함
	// 추상메소드가 없어도되지만 있으면 추상클래스여야함
	abstract void aaa(); 
}
