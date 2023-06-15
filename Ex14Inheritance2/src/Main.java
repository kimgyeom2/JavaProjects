
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=new First();
		f.showFirst();
		System.out.println();
		
		Second s=new Second();
		// 상속받은 부모의 객체가 second객체 만들때 안에 같이 만들어져서 
		// 생성자가 2번 발동함 자식객체안에 부모객체가 만들어지지만 
		// 생성자는 부모가 먼저발동
		s.show();
		System.out.println();
		
		// 객체를 생성하면서 값을 전달해보기.. 생성자메소드에 값 전달
		Second s2=new Second(10,20);
		s2.show();
		
		Second s3=new Second(50,60);
		s3.show();
		
		//상속의 상속 [ 부모-자식-손주 ] or [ 조부모-부모-자식]
		//Second를 상속한 Third
		Third t=new Third();
		
		//상속해준 클래스를 다른 클래스가 다시 상속도 가능
		//First를 상속한 Test
		new Test();
		
		//여러클래스를 동시에 상속받는 다중상속은 자바에서는 불가능
		//Second와 Test를 다중상속하려는 Nice클래스 설계
		
		//상속은 부모클래스의 기능,변수 들을 편하게 사용할 수 있어서
		//아주 편한문법임
		//다만 상속을 받아 기능을 사용하다보면 살짝 원하는 기능과
		//다른 상황이 있을 수 있음
		//상속받은 기능(메소드)을 원하는 동작으로 수정하고 싶을때 
		//사용하는 문법 - 메소드 오버라이드라고 부름
		//다음 프로젝트로..
	}

}
