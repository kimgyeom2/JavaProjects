
public class First {

	// 객체가 생성(new)될때 딱 한번 자동으로 실행되는 아주 특별한 메소드
	// 생성자 메소드 [ Constructor ]
	// 생성자 메소드 만드는 규칙
	// 1.메소드의 이름은 클래스의 이름과 같아야만함 
	// 2.리턴타입을 명시하지 않음
	First() {
		System.out.println("First 생성자!");
	}
	
	// 생성자 오버로딩
	First(int n) {
		System.out.println("First int 생성자!! -  "+ n);
		
	}
	
}
