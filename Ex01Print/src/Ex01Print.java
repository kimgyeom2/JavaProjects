
public class Ex01Print {

	
	public static void main(String[] args) {
		
		//출력기능(함수->Method)을 가진 객체에게 출력을 요청
		System.out.print("Hello\n");
		System.out.print("Nice\n");
		
		System.out.println(10);
		System.out.print("\n");
		
		System.out.print("3.14");
		System.out.print("\n");
		
		System.out.print('G');
		System.out.print("\n");
		
		System.out.print(true);
		System.out.print("\n");
		
		System.out.println(10+3);
		System.out.println("10+3");
		
		//c언어처럼 서식문자를 이용하여 출력모양을 만들수 있음
		System.out.printf("%2d+%2d=%2d\n",5,10,10+5);
		
		System.out.println(5+3);  //+산술연산자
		System.out.println(10+3.14);//int+double[작은것->큰것으로 자동형변환]
		System.out.println('G'+1); //한문자+1
		
		//문자열 데이터의 덧셈 연산  [문자열 붙이기]
		System.out.println("aaa"+"bbb"); //  +:결합 연산자
		System.out.println("Hello"+"World");
		//문자열 + 다른자료형 [문자열 결합됨]
		System.out.println("aaa"+10); //"aaa"+"10"
		System.out.println("bbb"+3.14);
		System.out.println("aaa"+10+"bbb"+3.14);
		
		//자바는 출력형식을 만들때 printf보다는 문자열의 +결합으로 처리하는 경우가 많음
		System.out.println(5+"+"+3+"+"+ 5+3);  // 문자열+(5+3)이라 8이아닌 53이나옴
		System.out.println(5+"+"+3+"+"+ (5+3));
		
		
		System.out.println();
		System.out.println();   //printfln을쓰면 안써도됨
		
		//자료형(Data type)과 변수(Variable)
		//자료형의 2가지 종류
		//1)primitive(원시) 자료형 - boolean-byte-char-short-int-long-float-double
		//2)reference(참조) 자료형 - String,Scanner,Random...등 [class로 만든 자료형]
		
		//변수를 만드는 문법 => 자료형 변수명;
		int a=10;
		//출력기능을 가진 객체에게 출력을 요청
		System.out.println(a);
		
		//c언어와 다르게 값을 대입할 때 주의점.
		int b;
		/* b=3.14; */ //error = 자료형이 '큰' 변수를 '작은' 변수에 대입 불가능~!
		
		//자료형별로 담을 수 있는 값의 크기가 제한됨
		byte c=127;  //-128~127     128넣으면 error
		System.out.println(c);
		
		short d=32767;  //양수/음수 : 각 32768개씩 가능
		System.out.println(d);
		
		int e=2100000000; //양수/음수 : 각 21억까지 가능
		System.out.println(e);

		long f; //양수/음수 각900경
		 f=2500000000L;     //정수형 상수는 4바이트로 하기로약속 4바이트는25억을 담을수가없음
		 					//정수형 상수를 Long으로 만드는 L(대문자-헷갈릴까봐)키워드가 접미어로 있어야함!
		System.out.println(f);
		
		float g;
		//g=3.14;  //error - 실수형 상수는 기본으로 double형 
		g=3.14f;   //실수형 상수를 float으로 만드는 f 키워드가 접미어로 있어야 함.
		System.out.println(g);
		
		double h=3.14;
		System.out.println(h);  //소숫점 더 보고싶으면 printf써야함
		
		char i='g';
		System.out.println(i);
		i=65;       //한문자는 유니코드 숫자로 바뀜
		System.out.println(i);
		
		boolean j=5<3;
		System.out.println(j);
		
		
		//작은 값은 큰변수에 대입이 가능함. [자동 형변환]
		double k=10;  //int를 double에 넣으면 자동으로 바뀜
		System.out.println(k);
		
		/* long m=3.14f; */  //error 롱8 플롯4지만 무조건 실수가 정수보다 큰값 
		
		//long+float 연산하면 long을 float으로 변환하여 연산함
		System.out.println(100L+3.14f);
		
		//byte, short는 별도의 접미어 없이도 int형 상수값을 대입가능함
		byte n=10;        //byte short의 최대값을 넘으면 안됨 127,32768
		short r=100;       
		
		//byte나 short 변수끼리의 연산은 자동int로 변환되어 계산됨
		short x=10;
		short y=50;
		int t;            // 램->cpu로 올때 2바이트로 오는걸 안좋아함
		//t=x+y; //error
		t=(short)(x+y);
		System.out.println(t);
		
		System.out.println();
		System.out.println();
		
		//자바의 상수 - 2가지 종류
		//1) literal 상수 - 값 자체 의미 [10(4),3.14(8),'G'(2),"aaa"(?),true(1)]
		//2) final 상수 - 상수화된 변수
		
		final int z=10; //final 상수 [상수의 이름은 대문자로만.. 스네이크 표기법 권장]
		/* z= 20; */  //error - final상수 값은 바꿀 수 없음
		
		final int USER_MAX=3;
		
		
		// 참조형에 대한 학습 맛보기   첫글자 대문자!!!!!!
		String s;  //포인터
		s= new String("Hello");    //person
		
		System.out.println(s.toString()); // String안에있는 toString 기능 소환
		
		s=new String("Nice");
		System.out.println(s);  //자동 .tostring() 해줌
		
		s="android"; //자동 new string("android")   String만 가능
		System.out.println(s);
		
		char u='한';
		System.out.println(u);
	}
}
