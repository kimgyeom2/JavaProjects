import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		
//		//Java에서는 문자열(String)을 객체로 관리함.
//		//즉, Java에서 문자열은 객체입니다
//		//Java의 String객체는 글씨 변경이 불가능함.[immutable 성질]
//		
//		String str=new String("Hello");
//		//단, String은 워낙 많이 사용되기에 축약표현 문법을 제공함
//		//str="Hello";  //자동 new String()이 됨
//		
//		//객체는 기능(함수->method)들을 보유하고 있음.
//		//String class의 유용한 메소드들
//		
//		//1.문자열 데이터의 길이(글자수)를 리턴해주는 기능
//		int len=str.length();
//		System.out.println("글자수 : "+len);
//		
//		//2.문자열값의 비교 기능
//		System.out.println(str=="Hello"); //false:주소비교   str의주소와 "Hello"주소는 다름
//		System.out.println(str.equals(new String("Hello"))); //str의 값이 "Hello"냐 true
//		System.out.println(str.equals("Hello"));
//		String s1="Hello";
//		System.out.println(str.equals(s1));
//		System.out.println("Hello".equals(s1));
//		
//		//2-1. 대소문자 비교
//		System.out.println(str.equals("hello")); //false 대소문자 구별됨
//		System.out.println(str.equalsIgnoreCase("hello")); //대소문자 구분x
//		
//		//3. 문자열에서 특정 char 얻어오기
//		char ch=str.charAt(0);
//		System.out.println(ch);
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
//		//System.out.println(str.charAt(5)); //error 
//		
//		for(int i=0;i<str.length();i++) {       
//			System.out.println(str.charAt(i));
//		}
//		
		//Scanner객체를 이용하여 char 한문자 입력받아보기
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s2=scan.next();
		char c=s2.charAt(0);
		System.out.println("c : "+c);
//		
//		
//		//4. 문자열안에 특정 문자열이 포함되어 있는지 여부 true or false
//		String s=new String("Hello world! Hello android! nice world!");
//		boolean b=s.contains("nice");
//		System.out.println(b);
//		System.out.println(s.contains("nice"));
//		
//		//5. 문자열 안에 특정 문자가 몇번째에 위치해 있는지 알려주는 기능
//		int index=s.indexOf('e');
//		System.out.println(index);     //제일 앞에있는 e의 index번호 
//		System.out.println(s.lastIndexOf('e'));  //제일 뒤에있는 e의 index번호 
//		
//		//5-1. 특정 문자열의 시작위치도 검색가능
//		index=s.indexOf("android");
//		System.out.println(index);
//		
//		//5-2. 특정 위치부터 검색 요청도 가능함
//		index=s.indexOf("Hello",5);   //5번 인덱스 위치부터 검색 시작
//		System.out.println(index);
//		
//		//6. 문자열 결합 기능
//		s.concat(" nice android");
//		System.out.println("원본 s: "+s);
//		String s3=s.concat(" nice android!");
//		System.out.println("s3: "+s3);
//		
//		// .concat()은 잘 사용안함. why? 문자열결합 해주는 +(결합연산자) 가 훨씬 편함~
//		// + 이 친구가 대신 concat()을 내부적으로 해주는거임
//		String s4= s3+"nice ios!";
//		System.out.println(s4);
//		
//		//7. 문자열이 특정한 문자열로 시작되는지 여부 true or false
//		System.out.println(s.startsWith("Hello"));
//		System.out.println(s.startsWith("H"));
//		
//		//7-1 특정 문자열로 종료 되는가?
//		System.out.println(s.endsWith("world!"));   
//		System.out.println(s.endsWith("world"));    //! 안붙여서 false
//		
//		//8. 대소문자 변환
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s);  //원본은 변경이 안됨!
//		
//		s=s.toUpperCase();  //원본을 변경하고 싶다면 원본참조변수에 새로운 문자열 객체를 대입
//		System.out.println(s);
//		
//		//9. 문자열의 '앞뒤' 공백을 제거
//		s="    Hello   ";
//		System.out.println("["+s+"]");
//		s=s.trim();
//		System.out.println("["+s+"]");
//		
//		//10. 특정문자 바꿔치기
//		s="Hello world! Hello android! Nice world!";
//		System.out.println(s.replace('H','k'));
//		
//		//10-1 특정문자열 바꿔치기
//		System.out.println(s.replace("android", "ios"));
//		//중간 공백문자도 없앨수 있음
//		System.out.println(s.replace(" ",""));
//		System.out.println(10+"");   //10을 문자열로 바꾸기
//		
//		//11. 문자열 잘라내기
//		String s5=s.substring(6); //6번 index 뒤로 있는 문자열을 잘라내서 새로운 문자열로 리턴해줌
//		System.out.println(s5);
//		String s6=s.substring(6,12);  //6~11번까지 반복문처럼 생각 world!
//		System.out.println(s6);
//		
//		//12. 문자열값의 대소비교 [문자열 정렬할때 사용]
//		int x=10;
//		int y=15;
//		System.out.println(x>y);
//		
//		char ch1='a';
//		char ch2='b';
//		System.out.println(ch1<ch2);  //문자 대소비교 됨
//		
//		String s7="aaa";
//		String s8="bbb";
//		//System.out.println(s7<s8);  error//주소 대소비교한거 숫자긴하지만 안됨
//		System.out.println(s7.compareTo(s8));   //아스키값 차이를 보여줌 양수면 참 음수면 거짓
//		
//		
//		//13.문자열을 특정문자를 기준으로 분리해서 여러개의 문자열 배열로 리턴해줌.
//		s="android,ios,web,";
//		String[] arr=s.split(",");  //구분 문자 1개아니여도됨
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr.length);  //원래 마지막 ,뒤 ""빈공간까지 4였는데 이제 3나옴
//		
//		System.out.println();
//		
//		// String class의 static method 들..
//		// static 메소드: 객체 생성없이 바로 사용할 수 있느 기능 [ 클래스명.메소드이름() ]
//		
//		//1).format()특정 포멧(모양/형식)의 문자열을 생성하고 싶을때 사용하는 기능메소드
//		int hour=13; //시
//		int min=15; //분
//		int sec=34; //초
//		System.out.println(hour+":"+min+":"+sec);
//		min=3;
//		System.out.println(hour+":"+min+":"+sec);
//		System.out.printf("%02d:%02d:%02d\n",hour,min,sec); //출력형태를 무조건 CLI환경의 console에만 출력함.
//				
//		//실무환경에서는 GUI환경으로 데이터를 표시하며 이 표시는 반드시 문자열 데이터만 출력 가능
//		String ss=String.format("%02d:%02d:%02d",hour,min,sec);
//		System.out.println("현재시간 : "+ss);
//		
//		//2) .valueof() 기본형 자료형(primitive)을 String 객체로 변환하는 기능메소드
//		int num=100;
//		String s10=String.valueOf(num);  //100-->"100"
//		System.out.println(s10.length());
//		
//		String s11=String.valueOf(3.14);
//		System.out.println(s11.length());
//		
//		String s12=String.valueOf(true);
//		System.out.println(s12.length());
//		
//		//GUI환경에서 기본형을 문자열로 변환하는 코드는 아주 빈번함.
//		//하지만 자주사용되지는 않는 메소드 why + 결합연산자를 이용하면 더쉽기때문
//		String s13=1000+""; //빈문자열 덧셈  1000->"1000"
//		String s14=5.24+"";
//		String s15=false+"";
//		
//		//---------------------------------오늘 범위x-----------------------------------
//		//문자열을 기본형으로 변환 하고 싶을때
//		//이 기능은 String 클래스에 없음.
//		//이 기능을 가진 클래스들(8개-기본형8개) 있음. 이 클래스들의 static 메소드를 사용
//		//이런 클래스들을 wrapper 클래스라고 부름:  Boolean,Byte,Character,Short,Integer,Long,Float,Double
//		int a=10;
//		Integer aa=new Integer(10);//참조형
//		
//		int n=Integer.parseInt("100");  //String->int
//		System.out.println(n+3);
//		
//		double n2=Double.parseDouble("3.14"); //String->double
//		System.out.println(n2);
	}
}