

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반 클래스들은 간단하게 객체로 만들어짐
		Test t=new Test();
		t.show();
		
		//클래스안에 클래스를 설계하는 inner class
		
		//이너클래스는 아우터명 없이는 인식불가능
		//Nice nice;;//error
		
		//이너클래스는 아웃터클래스명으로 인식가능하더라도 객체생성이 불가능
		//Test.Nice nice=new Test.Nice(); //error
		
		//그럼에도 이너클래스를 객체로 만들어 사용하고 싶다면
		//아웃터 객체에게 이너클래스객체를 만들어서 리턴해달라고 요청-메소드 호출
		Test.Nice nice=t.makeInnerClassObject();
		nice.aaa();
		
		//결국, 아웃터객체를 생성하지 않는다면 이너클래스를 객체로
		//생성할 수 없도로 함으로써 잘못된 객체사용을 막기위함
		
		//이너클래스에는 static 키워드가 적용 가능함
		//아웃터객체없이 생성가능한 이너클래스를 만들때 사용함.
		First.Hello h=new First.Hello();
		h.show();
	}

}
