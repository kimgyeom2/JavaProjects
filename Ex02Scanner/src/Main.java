import java.io.IOException;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
	
		//키보드 입력받기
		
//		int a;
//		
//		//키보드로부터 입력된 값을 받아서 '리턴'해주는 기능을 가진 객체[System.in]를 이용
//		try {
//			a=System.in.read();                //read=%c
//			System.out.println(a);
//			
//			//입력받은 숫자에 50을 더해서 출력해보기   '0'=48!
//			a=a-48; //숫자모양의 문자를 숫자로 변환
//			System.out.println("덧셈결과 : "+(a+50));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//3자리 숫자 입력받아보기
//		int num=0;
//		
//		try {
//			int n;
//			n=System.in.read();
//			num=num+(n-48)*100;
//			n=System.in.read();
//			num=num+(n-48)*10;
//			n=System.in.read();
//			num=num+(n-48)*1;
//			System.out.println("num: "+num);
//		
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//위 처럼 입력받아서 자료형으로 변하는 코드를 직접 작성하는 것은 매우 번거로움.
		//이 작업을 편히 하기위해 만들어진 class가 Scanner 클래스임.
		//이 Scanner클래스를 사용하려면 객체로 생성하여 사용해야함.  자료형 변수 = 클래스 객체
		//Java는 모든객체를 반드시 'Heap'메모리영역에 만들어야만 함.
		//Heap메모리에 객체를 생성하는 키워드를 사용 : new
		Scanner scan=new Scanner(System.in);  //이름이 없음
//		
//		//정수형 숫자 입력
//		int a;
//		System.out.print("정수입력 : ");
//		a=scan.nextInt();
//		System.out.println("a:  "+a);
//		
//		//실수형 숫자 입력
//		double b;
//		System.out.print("실수입력 : ");
//		b=scan.nextDouble();
//		System.out.println("b : "+b);
//		
//		//논리값 입력
//		System.out.print("논리값 입력 : ");
//		boolean c=scan.nextBoolean();
//		System.out.println("c: "+c);
//		
//		//문자열 입력
//		System.out.print("문자열 입력 : ");
//		String s=scan.next();  //띄어쓰기 없는 문자열 입력
//		System.out.println("s : "+s);  
		
		//띄어쓰기 포함 문자열 입력
		System.out.print("문자열 입력 : ");
		String s2=scan.nextLine();   //띄어쓰기 포함 문자열(문장 입력가능) -이전 입력에 의한 Enter키를 입력으로 받음
		s2=scan.nextLine();  //해결- 한번더 받으면됨
		System.out.print("s2: "+s2);  
		
		
	}
}
