import java.util.Scanner;

public class Ex2 {
	public static void main(String[]args) {
		
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		a=scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		b=scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		c=scan.nextInt();
		System.out.println(a+"*"+b+"+"+c+"="+((a*b)+c));

		
	}
}
