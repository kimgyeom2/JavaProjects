import java.util.Scanner;
public class Ex02 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.print("학생수 입력:");
		int a=scan.nextInt();
		int[] aaa=new int[a];
		double total=0;
		for(int t=0;t<aaa.length;t++) {
			System.out.print("학생"+(t+1)+"의 성적을 입력하세요:");
			aaa[t]=scan.nextInt();
			if(aaa[t]>100 || aaa[t]<0) {
				System.out.println("다시입력");
				t--;
				continue;}
			total+=aaa[t];
		}
		System.out.println("성적 평균은"+(total/a)+"입니다");
}
}
