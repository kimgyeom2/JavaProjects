
public class Calculator {

	//사칙연산 기능들 : 메소드
	//더하기 기능
	int sum(int x,int y) {
		return x+y;
	}
	
	//뺄셈 기능
	int subtract(int x,int y) {
		return x-y;
	} 
	
	//곱셈 기능
	int multiply(int x,int y) {
		return x*y;	
	}
	 
	//나눗셈기능
	int divide(int x,int y) {
		return x/y;
	}
	
	// 위 4개의 기능은 모두 정수형만 처리하니
	// 실수형 사칙연산 기능이 별도로 있어야 함.
	
	//별도의 덧셈기능이라며 함수이름을 다르게하면 사용하는쪽에서 혼동스러움
	//함수의 기능을 똑같이하고 파라미터를 다르게 적용하는문법
	double sum(double x,double y) {
		return x+y;
	}
	
	double subtract(double x,double y)
	{
		return x-y;
	}
	double multiply(double x,double y)
	{
		return x*y;
	}double divide(double x,double y)
	{
		return x/y;
	}
	
	// 숫자모양의 문자열 데이터들의 산술 덧셈 결과 리턴해주는 기능메소드
	// 덧셈기능 sum 메소드의 오버로딩
	int sum(String x,String y) {
		//문자열을 정수로 변환해주는기능(메소드)이용
		int a=Integer.parseInt(x);
		int b=Integer.parseInt(y);
		return a+b;
	}
	
	
	//전달받은 값의 누적된 덧셈결과를 계산하는 기능
	//파라미터의 개수가 몇개일지 모를때 사용하는 특별한 매개변수 연산자 '...'
	//가변길이 인자
	void add(int...ns) {
		//ns는 배열객체가 됨.
		System.out.println("전달받은 데이터 개수 : "+ns.length);
		
		for(int t:ns) {
			System.out.print(t+" , ");
		}
		System.out.println();
	}
}
	
	