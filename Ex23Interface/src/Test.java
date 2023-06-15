
// interface: 추상메소드만 가지는 추상클래스임
// interface == abstract class
public interface Test {
	//인터페이스는 오로지 추상메소드만 가지는 클래스입니다
	abstract void aaa(); //기능의 이름만 정함
	//인터페이스 안에서는 모든 메소드가 추상메소드이므로 자동 적용됨
	void bbb();
	// 일반 메소드는 정의불가능
	// void show(){}
}
