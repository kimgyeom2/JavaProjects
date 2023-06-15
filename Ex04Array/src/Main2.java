import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		//Java의 2차원 배열 - 1차원 배열의 '참조변수'를 여러개 가진 배열객체
		
		//2차원 배열객체 생성
		int[][] aaa=new int[3][]; //1차원배열 참조변수 3개짜리 배열객체
		System.out.println(aaa[0]); //참조변수의 기본값 null
		System.out.println(aaa[1]);
		System.out.println(aaa[2]);
		
		//2차원배열요소(참조)에 값(배열객체) 대입
		aaa[0]=new int[4];
		aaa[1]=new int[2];
		aaa[2]=new int[5];
		
		//1차원 배열객체들의 요소(int형 변수)에 정수값 대입
		aaa[0][0]=10;
		aaa[0][1]=20;
		aaa[0][2]=30;
		aaa[0][3]=40;
		aaa[1][0]=100;
		aaa[1][1]=200;
		aaa[2][0]=1000;
		aaa[2][1]=2000;
		aaa[2][2]=3000;
		aaa[2][3]=4000;
		aaa[2][4]=5000;
		
		//반복문을 이용하여 출력
		//그 그전에 .. 반복횟수에 사용될 배열의 길이값 확인
		System.out.println(aaa.length);
		System.out.println(aaa[0].length);
		System.out.println(aaa[1].length);
		System.out.println(aaa[2].length);
		
		System.out.println();
		//반복문을 사용해서 요소값들 출력해보기
		for(int i=0;i<aaa.length;i++) {
			for(int k=0;k<aaa[i].length;k++) {
				System.out.print(aaa[i][k]+" , ");
			}
			System.out.println();
		}
		System.out.println();
		
		//확장된 for문법 [for each문법]으로 출력해보기
		for(int[] t:aaa) {
			for(int k:t) {
				System.out.print(k+" , ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//만약 2차원 배열이 가진 참조변수들이 모두 같은 개수의 배열객체를 
		//참조한다면 쉽게2차원 배열객체를 생성가능
		int[][] bbb=new int[2][3];  //1차원 배열 객체들도 모두 만들어줌
		for(int i=0;i<bbb.length;i++) {
			for(int k=0;k<bbb[i].length;k++) {
				System.out.print(bbb[i][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//2차원 배열의 초기화
		int[][] ccc=new int[][] {
			new int [] {10,20},new int[] {10,20,30,40}
			};
		
		//초기화의 축약표현문법 허용
		int[][]ddd={
			{10,20},{10,20,30,40}
			};
		
		for(int[] t:ddd) {
			for(int n:t) {
				System.out.print(n+ " , ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//2차원배열의 길이값을 변수로 지정해보기.. 키보드로 입력받은 개수 크기로
		Scanner scan=new Scanner(System.in);
			
		System.out.print("층수 입력 : ");
		int a=scan.nextInt();
		int[][] eee=new int[a][];
		
		//입력된 층수만큼 1차원배열 참조변수들에게 객체 대입해주기
		for(int i=0;i<a;i++) {
			System.out.print("호실 수 입력 : ");
			int b=scan.nextInt();
			eee[i]=new int[b];
		}
		
		//입력된 층,호실 수 만큼 배열들이 잘 만들어졌는지 확인해보기
		for(int[] t:eee) {
			for(int k:t) {
				System.out.print(k+",");
			}
			System.out.println();
		}
		System.out.println();
		
		
		//3차원 배열도.. 2차원배열 참조변수를 여러개 가진객체
		int[][][] abc=new int[2][][]; //2차원배열 참조변수가 2개인 배열객체
		
		abc[0]=new int[3][];
		abc[1]=new int[4][];
		
		abc[0][0]=new int[5];
		abc[0][1]=new int[3];
		abc[0][2]=new int[2];
		
		abc[1][0]=new int[7];
		abc[1][1]=new int[4];
		abc[1][2]=new int[8];
		abc[1][3]=new int[2];
		
		abc[0][1][2]=10;
		
		System.out.println();
		System.out.println("========================================");
		System.out.println();
		
		
		//배열은 한번 만들어진 요소의 개수를 변경할 수 없음!!!!
		//실무환경에서는 대량의 데이터 개수가 유동적인 경우가 더 많음(Ex.게시글.상품목록 등)
		
		//그래서 등장한 유동적 배열용 class존재(Like 기차모양)
		//ArrayList 클래스
		ArrayList<String> list=new ArrayList<String>();
		
		//요소의 개수 확인하는 기능(메소드)
		System.out.println("리스트의 개수 : "+list.size());
		
		//요소 추가
		list.add(new String("aaa"));
		list.add(new String("bbb"));
		list.add(new String("ccc"));
		System.out.println("리스트의 개수 : "+list.size());
		System.out.println(list.get(0)); //aaa
		System.out.println(list.get(1)); //bbb
		System.out.println(list.get(2)); //ccc
		
		//요소 삭제
		list.remove(0); //0번요소 제거
		System.out.println("리스트의 개수 : "+list.size());
		System.out.println(list.get(0));  //bbb
	}

}
