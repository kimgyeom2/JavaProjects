//이너클래스를 가진 클래스를 outer 클래스라고 부름
public class Test {
	
	int a=10;//멤버변수
	
	//멤버메소드
	void show() {
		System.out.println(a);
		//k=20; //error 이너의 멤버는 사용불가
	}//show 메소드
	
	//이너 클래스를 객체로 생성하여 리턴해주는 기능메소드
	Nice makeInnerClassObject() {
		Nice n=new Nice();
		return n;
	}
	
	//클래스안에 또 다른 클래스를 설계///////////////////
	//이너 클래스-inner class
	//이너 클래스의 특징
	//1.외부(다른클래스)에서 아우터클래스명 없이는 인식이 불가능
	//2.외부에서 아웃터클래스명을 이용하여 인식하더라도 '직접'객체 생성은 불가능
	//3.이너 클래스는 아웃터클래스 안에서만 생성이 가능한 클래스
	
	//4.이너 클래스안에서 아웃터클래스의 멤버를 내것인양 마음대로 사용이 가능함.
	//4-1.아웃터 클래스 안에서는 이너의 멤버를 마음대로 사용불가능함
	
	//이너클래스는 객체를 안전하게 만들기위해서 사용하는 기법
	//즉 외부에서 아웃터객체 없이 마음대로 생성하지 못하도록 문법적으로 막는기법
	class Nice{
		
		int k=100; //멤버변수
		//메소드
		void aaa() {
		System.out.println("Nice.."+k);
		//아웃터의 멤버변수를 내것인양 사용가능
		a=50;
		System.out.println("아웃터의 a:"+a);
		//아웃터의 멤버 메소드로 내것인양 마구 호출가능
		show();
		}
		
	}//////////////////////////////////////////
	
	
}//Test class
