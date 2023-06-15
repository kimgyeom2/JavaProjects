
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// interface는 규격용이어서 기능구현이 되어있지 않는 설계도
		// 그렇기에 곧바로 객체생성이 불가능
		// Test t=new Test();
		
		// 인터페이스를 사용하려면 이 규격을 구현한 별도의 클래스를 설계
		// 객체로 생성하여 사용함
		// Test 인터페이스를 구현한 First클래스 객체 생성
		First f=new First();
		f.aaa();
		
		// Test인터페이스를 구현한 Second클래스 객체 생성
		// Second객체는 무조건 aaa()기능이 구현되어 있을 것을 확신함
		Second s=new Second();
		s.aaa();
		
		//인터페이스도 클래스의 일종이기에 참조변수는 만들수 있음
		Test t=null;
		t=new First();
		t.aaa();
		t.bbb();
		
		t=new Second();
		t.aaa();
		t.bbb();
		
		t=new Third();
		t.aaa();
		t.bbb();
		
	}

}
