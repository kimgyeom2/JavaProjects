import java.util.Random;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		
		//랜덤한 값을 만들어내는 능력(기능)을 가진 class : Random
		Random rnd=new Random();
		//랜덤한 정수값 얻어오기
		
//		  int a = 0; for(int i=0;i<10;i++) { a=rnd.nextInt();
//		  System.out.println("a : "+a);}
		 
		
		//0~9 10개의 숫자 중에 하나가 랜덤하게 나오도록..
//		int b;
//		for(int i=0;i<10;i++) {
//		b=rnd.nextInt(10);
//		System.out.println("b : "+b);
//		}
//		
//		//5~15
//		int d=rnd.nextInt(11)+5;   //+5아하면 0~10사이가 나옴
//		
//		//-5~5
//		int e=rnd.nextInt(11)-5;
//		System.out.println("e: "+e);
		
		
		//실수형 랜덤값 얻어오기
		double f=rnd.nextDouble();
		System.out.println("f: "+f); //0.0~0.9999999999999
		
		//0.0~9.99
		double g=rnd.nextDouble()*10;
		System.out.println("g: "+g);
		
		//0.0~14.9900
		double h=rnd.nextDouble()*15;
		System.out.println("h : "+h);
		
		//논리값 랜덤
		boolean i=rnd.nextBoolean();
		System.out.println(i);
		
		if(i)System.out.println("Good");  //변수자체가 조건식의 결과값
		else System.out.println("Bad");
		
		System.out.println("----------------------------");
		System.out.println();
		
		//컴퓨터가 생성한 랜덤 숫자를 맞추는 게임
		
		//컴퓨가 생성한 랜덤숫자를 저장할 변수
		int com=rnd.nextInt(501)+500; //범위는 500~1000
		
		System.out.println("500~1000사이의 숫자를 맞춰보세요!");
		System.out.println();
		
		//키보드 입력을 편하게 받아주는객체 생성
		Scanner scan=new Scanner(System.in);
		int user; //사용자가 입력한 숫자를 저장할 변수
		while(true) {
			System.out.print("숫자 입력 : ");
			user=scan.nextInt();
		
		//정답값(com변수)와 입력된 값(user변수)를 비교
		if(user>com) {
			System.out.println(user+"보다 작습니다.");
		}else if(user<com) {
			System.out.println(user+"보다 큽니다.");
		}else {
			System.out.println("축하합니다!\n정답입니다~^^");
			break;
		}
		}
		
		
		
	}

}
