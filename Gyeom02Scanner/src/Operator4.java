import java.util.Scanner;
public class Operator4 {

	public static void main(String[] args) {
		int a,b,c;
		double aver;
		int max,min;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 :");
		a=scan.nextInt();
		System.out.print("정수 입력 :");
		b=scan.nextInt();
		System.out.print("정수 입력 :");
		c=scan.nextInt();
		
		max=a;
		min=a;
		
		if(b>max) max=b;
		if(c>max) max=c;
		
		if(b<min) min=b;
		if(c<min) min=c;
		
		aver=(double)(a+b+c)/3;
		
		System.out.println("합은"+(a+b+c)+"이고 평균은"+aver+"이고 최댓값은"+max+"이고 최솟값은"+min+"이다.");
		
	}

}
