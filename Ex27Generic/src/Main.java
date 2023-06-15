import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generic [제네릭 - 아직 명칭이 정해지지 않은 상품(제네릭 상품)]
		// class를 설계할때 멤버의 자료형을 정하지 않고
		// 객체를 생성할때 결정하도록하는 문법
		
		// 데이터를 하나 저장할 수 있는 클래스 설계 [자료형을 미리 정하지않고]
		// 객체를 생성할때 <>제네릭 문법으로 자료형을 지정해주는 기법
		Box<String> box=new Box<String>();
		box.a="Hello";
		System.out.println(box.a);
		
		Box<Random> box2=new Box<Random>();
		box2.a=new Random();
		int k=box2.a.nextInt(5);
		System.out.println(k);
		System.out.println(box2.a.nextBoolean());
		
		// 제네릭의 문법적 제약사항 - 참조형 자료형만 <>안에 사용가능
		// Box<int> box3;//error 기본형자료형 int는 <>안에 사용불가능
		// 그럼에도 int형 같은 기본형을 사용하고 싶다면 Wrapper class를 대체사용
		// Wrapper class : Boolean,Byte,character.Short,Integer,Long,Float,Double
		// Wrapper class는 기본형을 객체형으로 감싸기위해 존재함
		int a=10; //기본형
		Integer b=new Integer(10);
		Integer c=30;  //자동 new Integer(30) -> 오토박싱
		System.out.println(c);
		
		int d=c; //자동 Integer --> int로 변환하여 대입해줌: auto unboxing이라 부름
		
		// 결국 wrapper 클래스의 참조변수를 마치 기본형변수 자료형처럼 사용해도 알아서 변환해줌
		
		// 기본형 자료형을 제네릭에 사용하려면 Wrapper클래스를 지정해주면 됨
		Box<Integer> box3=new Box<Integer>();
		box3.a=10;
		box3.setA(100);
		System.out.println(box3.a);
		
		Box<Double> box4=new Box<Double>(); //참조변수<>안에 자료형명시하면 객체생성할때 <>안의 자료형 생략가능
		box4.a=3.14;
		box4.setA(8.46);
		System.out.println(box4.a);
		
		// 만약 Box를 생성하면서 <>을 명시하지 않으면?
		Box box5=new Box();
		// box5.a="Hi"; 자료형이 지정되지 않으면 기본 Object자료형으로 만들어짐
		
		//2개 이상의 제네릭타입을 가진 클래스 객체로 생성
		Box2<String, Integer>obj=new Box2<String,Integer>();
		obj.a="aaa"; // T-->String
		obj.b=100;   // K-->Integer
	}

}
