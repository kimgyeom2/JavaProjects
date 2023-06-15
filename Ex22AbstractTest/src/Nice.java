
// 상속받은 추상클래스안에 이름뿐인 추상메소드가 있다면 반드시 오버라이드 해서
// 구연해야하는 의무가 생김
public class Nice extends Test{
	@Override
	void aaa() {
		// TODO Auto-generated method stub
		// 상속받은 클래스의 추상메소드를 반드시 구현할 수 밖에 없게됨
		System.out.println("nice클래스에서 구현한 aaa기능");
		Nice nice=new Nice();
		nice.aaa();
		
		// Test 클래스를 상속하는 또 다른 클래스를 설계
	}
}
