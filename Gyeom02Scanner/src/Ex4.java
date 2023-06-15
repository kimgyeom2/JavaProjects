import java.util.Scanner;
public class Ex4 {
	public static void main(String[]args) {
		double a,b;
		Scanner scan=new Scanner(System.in);
		System.out.print("실수 입력 : ");
		a=scan.nextDouble();
		System.out.print("실수 입력 : ");
		b=scan.nextDouble();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		
	}
}
