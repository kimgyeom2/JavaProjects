import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//학생의 성적을 관리하는 프로그램
		//이름, 국어, 영어, 평균
		String name;
		int kor;
		int eng;
		double aver;
		
		name="sam";
		kor=80;
		eng=70;
		aver=(double)(kor+eng)/2;
		
		// 만약, 이런 학생이 여러명이면..
		// 위 변수 4개를 매법 만드는 작업이 매우 번거로움
		// 여러개의 데이터를 관리하는 배열을 이용
		String[] arrName=new String[10];
		int[] arrKor=new int[10];
		int[] arrEng=new int[10];
		double[] arrAver=new double[10];
		
		arrName[0]="sam";
		arrKor[0]=80;
		arrEng[0]=70;
		arrAver[0]=(double)(arrKor[0]+arrEng[0])/2;
		
		// 위처럼 자료형별로 배열객체로 묶어서 사용하는것은
		// 번거롭고 가독성도 떨어짐
		// 학생 1명의 데이터가 서로다른 배열객체에 나누어져 있기때문
		
		// 그래서 서로 연관있는 데이터(이름, 국어, 영어, 평균)끼리 묶어서
		// 관리하는 것이 더 효과적임
	
		// 연관있는 데이터끼리의 묶을을 설계하는 class 정의
		// 별도의 .java문서에 새로운 클래스를 설계 해보기
	
		// 새로 설계한 Student 클래스로 객체를 생성
		Student stu=new Student();
		stu.name="sam";
		stu.kor=80;
		stu.eng=70;
		stu.aver=(double)(stu.kor+stu.eng)/2;
		
		Student stu2=new Student();
		stu2.name="robin";
		stu2.kor=90;
		stu2.eng=95;
		stu2.aver=(double)(stu2.kor+stu2.eng)/2;
		
		//화면 출력
		System.out.println(stu); //참조변수 출력하면 자동 toString()기능 발동[클래스명@해시코드]
		System.out.println("name:"+stu.name);
		System.out.println("kor:"+stu.kor);
		System.out.println("eng:"+stu.eng);
		System.out.println("aver:"+stu.aver);
		System.out.println();
		
		System.out.println("name:"+stu2.name);
		System.out.println("kor:"+stu2.kor);
		System.out.println("eng:"+stu2.eng);
		System.out.println("aver:"+stu2.aver);
		System.out.println();
		
		// 객체 멤버값 변경
		int r=80;
		stu2.kor=r;
		System.out.println("변경된 국어 성적:"+stu2.kor);
		System.out.println();
		
		// 3번째 학생의 데이터는 키보드로 입력
		Scanner scan=new Scanner(System.in);
		Student stu3=new Student();
//		stu3.name=scan.next();
//		stu3.kor=scan.nextInt();
//		stu3.eng=scan.nextInt();
		stu3.aver=(double)(stu3.kor+stu3.eng)/2;
		
		System.out.println("name:"+stu3.name);
		System.out.println("kor:"+stu3.kor);
		// 하나하나 다 출력하는건 번거로움
		// 그래서 객체라는 녀석이 스스로 출력하는 기능이 있다면 
		// 편하게 그 기능을 사용하면 좋을듯
		// stu3.출력해(); 이런거
		
		// 객체가 기능을 가질 수 있도록 class안에 기능(함수)를 설계하고 사용하기
		// 객체의 기능을 사용하기 - 메소드를 호출!
		stu3.show();
		
		// 이런식으로 객체안에 기능을 만들면 편하게 코딩가능
		Student stu4=new Student();
		stu4.name="hong";
		stu4.kor=75;
		stu4.eng=77;
		// 평균계산하는 것도 직접 매번작성하기 귀찮
		// 평균을 계산하는 기능이 객체안에 있다면 더 간결
		stu4.calAverage();
		
		// 객체의 값 출력을 객체의 출력기능 이용
		stu4.show();
		
		// 이런식으로 특정 기능을 미리 class에 설계해놓으면
		// 코드가 훨씬 간결해짐
		
		Student stu5=new Student();
		stu5.name="kim";
		stu5.kor=80;
		stu5.eng=75;
		stu5.calAverage();
		stu5.show();
		
		// 6번째 학생데이터를 넣을때도 멤버값들을 한줄씩 넣기가 귀찮음
		// 입력기능도 클래스안에 기능을 넣어보자
		Student stu6=new Student();
		stu6.setMembers("park",50,60);
		stu6.calAverage();
		stu6.show();
		
		// 7번째 학생데이터를 기능을 이용하여 입력후 출력
		Student stu7=new Student();
		stu7.setMembers("Lee",90,75);
		stu7.calAverage();
		stu7.show();
		
		Student2 stu8=new Student2();
		stu8.input();
		stu8.show();
	
		// 결국 메소드의 존재이유는 코드를 보다 간결하게 하고
		// 객체의 멤버는 객체 스스로 제어하도록 하기 위함.
		
		//정리, 객체는 변수+메소드를 가진녀석을 지칭합니다
		
		//메소드만 있는 객체도 있을 수 있음(사실 많음)
		
	}	

}
