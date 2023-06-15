import java.util.Scanner;

public class Ex1 {
	public static void main(String[]args){
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		a=scan.nextInt();
		System.out.print("정수를 입력하세요 : ");
		b=scan.nextInt();
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
	}
}
