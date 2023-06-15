
public class Second extends First{
	// 이미 First의 a변수를 보유한 상태
	private int b;
	
	// 멤버값을 출력하는 기능메소드 [ 상속받은 a변수도 출력할 의무있음 ]
	// 상속받은 출력기능 show는 a변수만 출력하니 이를 개선
	// Override
	public void show() {
		//System.out.println(a);  //부모의 private멤버는 사용불가
		//First에게 출력 요청.
		//show();//부모의 show()메소드 호출이 아니라 재귀호출이됨
		super.show();
		System.out.println("b : "+b);
		System.out.println();
		
	}
	
}
