import java.util.Scanner;
public class Ex5 {
	public static void main(String[]args) {
		int a,b;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		a=scan.nextInt();
		System.out.print("정수 입력 : ");
		b=scan.nextInt();
		
		System.out.println("몫은 :"+(a/b)+", 나머지는 : "+(a%b));
	}

}
