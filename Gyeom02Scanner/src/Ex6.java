import java.util.Scanner;	
public class Ex6 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		a=scan.nextInt();
		System.out.print("정수 입력 : ");
		b=scan.nextInt();
		System.out.print("정수 입력 : ");
		c=scan.nextInt();
		System.out.println((a-b)*(b+c)*(c-a));
	}
}
