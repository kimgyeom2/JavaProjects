import java.util.Scanner;
public class While09 {
	public static void main(String[] args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		a=scan.nextInt();
		System.out.print("정수 입력 : ");
		b=scan.nextInt();
		if(a<b)System.out.println(b-a);
		else System.out.println(a-b);
	}
}
