import java.util.Scanner;
public class While10 {
	public static void main(String[] args) {
		int a,b;
		int c,d;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		a=scan.nextInt();
		System.out.print("정수 입력 : ");
		b=scan.nextInt();
		c=(a>b)?a:(a<b)?b:'?';
		d=(a<b)?a:(a>b)?b:'?';
		System.out.println(c-d);
		
	}
}