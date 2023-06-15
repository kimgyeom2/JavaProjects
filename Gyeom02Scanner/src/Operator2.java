import java.util.Scanner;
public class Operator2 {
	public static void main(String[]args) {
		int a,b,c,d;
		Scanner scan=new Scanner(System.in);
		System.out.print("좌 상단의 x좌표 : ");
		a=scan.nextInt();
		System.out.print("좌 상단의 y좌표 : ");
		b=scan.nextInt();
		System.out.print("우 하단의 x좌표 : ");
		c=scan.nextInt();
		System.out.print("우 하단의 y좌표 : ");
		d=scan.nextInt();
		System.out.println("두 점이 이루는 직사각형의 넓이는"+((c-a)*(d-b))+"입니다");
	}
}
