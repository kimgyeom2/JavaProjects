import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
	
	//Java언어에서 배열은 객체입니다!!
	
	//int형 3개짜리 배열 객체를 생성해보자
		int[] aaa=new int[3];   //배열의 요소들은 자동 0에해당하는 값(0,0.0,false등)으로 초기화
		
		System.out.println(aaa); //배열객체의 .toString()기능이 자동 발동함
		System.out.println(aaa[0]);
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		//System.out.println(aaa[3]); //error- 인덱스 범위를 벗어나면 에러
		
		//배열요소에 값 대입
		aaa[0]=10;
		aaa[1]=20;
		aaa[2]=30; 

		//배열객체에게 배열요소의 개수(길이)를 가진 멤버 변수가 존재함.
		int len=aaa.length;
		
		//배열 요소값을 반복문을 이용하여 출력해보기
		for(int i=0;i<len;i++) {
			System.out.println(aaa[i]);
		}
		System.out.println();
		
		//배열객체를 생성하면서 배열요소값들을 초기화해보기
		int[] bbb=new int[] {10,20,30};  //초기화 할때는 개수글 명시안함
		//배열객체 생성 및 초기화할때 축약표현문법
		int[] ccc= {100,200,300}; //자동 new int[] {}는 초기화할때만 사용하기때문
		System.out.println(ccc[0]);
		System.out.println(ccc[1]);
		System.out.println(ccc[2]);
		
		//배열생성할때 개수지정을 상수가 아닌 변수로 지정할 수 있음.
		int n=3;
		
		//배열개수 n의 값을 키보드로 입력 받을 수도 있음
		Scanner scan=new Scanner(System.in);
//		System.out.print("배열 개수 입력:");
//		n=scan.nextInt();
		
		int[] ddd;//배열을 만든게아님 참조변수를 만든거임@@@@@@@@@@@@@@@@@@@@
		int[] eee=new int[n];
		for(int i=0;i<eee.length;i++) {
			System.out.print(eee[i]+", ");
		}
		System.out.println();		
		
		//배열객체의 초기화할때도 변수로 값지정 가능
		int k=10;
		int[] fff=new int[] {k,k+1,k+2};
		for(int i=0;i<fff.length;i++) {
			System.out.print(fff[i]+",");
		}
		System.out.println();
		
		
		//배열요소의 개수가 0개인 배열객체도 존재 가능
		int[] ggg=new int[0];
		System.out.println("배열길이 : "+ggg.length);
		
		//배열 참조변수끼리의 대입
		double[] hhh=new double[] {3.14,2.48,7.23};
		double[] iii=hhh;  //객체 대입이 아니라 주소값복사 =객체는1개 리모컨2개
		//객체 공유!!!!!
		for(int i=0;i<hhh.length;i++) {
			System.out.print(iii[i]+",");
		}
		System.out.println();
		
		//공유된 객체를 참조하는 참조변수 중 하나를 이용하여 요소값 변경하면 다른 참조변수의 값도 영향을 받음
		iii[2]=5.32;
		System.out.println(hhh[2]);  //5.32
		
		//배열 객체를 copy해보기 [배열요소값들을 복사하기]
		int[] mmm=new int[] {50,60,70};
		int[] nnn=new int[mmm.length]; //mmm배열과 같은 개수의 값이 0인 배열객체 생성
		for(int i=0;i<nnn.length;i++) {
			nnn[i]=mmm[i];
			System.out.println(nnn[i]);
		}
		
		// mmm과 nnn이 참조하는 배열객체는 값만같은 서로다른 객체(값만같고 주소가다름)
		
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		
		//참조형 자료형의 배열객체 생성해보기
		String[] sss=new String[3];  //스트링 참조변수(리모컨)3개짜리 배열객체를 생성
		System.out.println(sss);  //자동 tostring실행
		System.out.println(sss[0]);  //null 참조형 변수의 기본값은 null
		System.out.println(sss[1]);  
		System.out.println(sss[2]);
		
		//배열객체의 요소(참조변수)들에 값(객체) 도입
		sss[0]=new String("sam");   // sss[0]="sam"
		sss[1]=new String("robin");
		sss[2]="hong";
		
		System.out.println(sss[0]);
		System.out.println(sss[1]);
		System.out.println(sss[2]);
		System.out.println();
		
		//각 배열요소(String참조변수)의 기능메소드 사용해보기
		System.out.println("배열의 길이 :"+sss.length);  //배열한테 명령한거임
		System.out.println(sss[0].length());  //배열 요소에게 명령
		System.out.println(sss[1].length());
		System.out.println(sss[2].length());
		System.out.println();
		
		char ch=sss[1].charAt(2); //robin의 b 얻어오기
		System.out.println(ch);
		
		char ch2=sss[2].charAt(3);
		System.out.println(ch2);
		
		//참조형 배열객체 생성하면서 배열 요소들 초기화 해보기
		int[] xxx=new int[] {};
		String[] uuu=new String[] {new String("android"),new String("ios"),new String("web")};
		uuu=new String[] {"android,ios,web"};
		String[] vvv= {"sam","robin","hong"};//배열 참조변수 초기화하면서 배열객체 초기화할때는 축약표현 가능
		
		for(int i=0;i<vvv.length;i++) {
			System.out.println(vvv[i]);
		}
		
		
		// 개발자가만든 class도 배열로 당연히 만들수있음.
		Person p=new Person();
		p.name="sam";
		p.age=20;
		p.show();
		
		Person[] people=new Person[3];
		people[0]=new Person();
		people[1]=new Person();
		people[2]=new Person();
		people[0].show();
		System.out.println();
		
		
		//배열처럼 여러개의 요소를 가진 객체의 요소제어를 위한 
		//반복문을 쉽게 사용하기 위해 등장한 새로운 for 문법
		//자바에서는 확장된 for문 다른언어에서는[ for each 문법이라함]
		int[] nums=new int[] {10,20,30};
		for(int i=0;i<nums.length;i++) {
			int t=nums[i];   //t는 임시변수
			System.out.println(t);
		}
		System.out.println();
		
		//확장된 for문법으로 배열의 요소값을 간결하게 출력 해보기
		for(int t:nums) {   //for(int t:nums) == for(int i=0;i<nums.length;i++) 	int t=nums[i]; 
			System.out.println(t);   //무조건 0번부터 끝까지실행 다르게 못바꿔
		}
		
		double[] www=new double[] {3.14,2.32,4.21};
		for(double a:www) {
			System.out.println(a);
		}
		
		String[] zzz=new String[] {new String("aaa"),"bbbb","ccccc"};
		for(String c:zzz) {
			System.out.println(c +":"+c.length());
		}
		
		
		
		//2차원 배열 - 1차원배열 참조변수를 여러개 가진 배열 객체.
		
		
		
		
	}
}



//사용자 정의 class
class Person{
	String name;
	int age;
	
	void show() {
		System.out.println(name+":"+age);
	}
	
}
