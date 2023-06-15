
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//메소드가 왜 필요한지에 대해 알아봤으니..
		//클래스의 메소드를 정의하는 4가지의 문법적 모습 [리턴타입 OX, 파라미터 OX]
		Test t=new Test();
		t.aaa();        //1번
		
		t.bbb(50);      //2번
		
		int k=t.ccc();  //3번  함수의 리턴값은 대입 연산자로 받아야만 함.
		System.out.println("k:"+k);
		
		int sum2=t.ddd(10,20);  //4번
		System.out.println("sum: "+sum2);
		
		System.out.println();
		
		//사칙연산을 해주는 계산기 객체 생성(기능만 있는 클래스)
		Calculator cal=new Calculator();
		int a=10;
		int b=5;
		
		int sum1=cal.sum(a, b);
		System.out.println(sum1);
		int sub=cal.subtract(a, b);
		System.out.println(sub);
		int mul=cal.multiply(a, b);
		System.out.println(mul);
		int div=cal.divide(a, b);
		System.out.println(div);
		
		//실수형 숫자들의 사칙연산 의뢰
		double c=3.5;
		double d=4.6;
		
		double sum=cal.sum(c, d);
		System.out.println(sum);
		System.out.println(cal.subtract(c,d));
		System.out.println(cal.multiply(c,d));
		System.out.println(cal.divide(c,d));
		
		//이런식으로 같은 기능인데 자료형이 다를때 활용하는 문법-오버로딩
		
		//좀더 확장하면 GUI환경에서는 모든 데이터가 문자열타입
		//문자여롤 숫자데이터가 입력되어도 산술덧셈된 결과가 나오도록
		System.out.println(cal.sum("245","487"));
		
		System.out.println();
		
		// 가변인자 '...'연산자
		// 메소드를 호출할때 파라미터의 개수가 가변적으로 사용되는 경우
		cal.add();
		cal.add(5);
		cal.add(5,3);
		cal.add(5,3,6);
		cal.add(5,3,8,7);
		
		
		
	}

}
