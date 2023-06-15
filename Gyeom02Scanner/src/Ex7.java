import java.util.Scanner;
public class Ex7 {
	public static void main(String[]args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.print("마일 입력 : ");
		a=scan.nextInt();
		System.out.println(a+"마일은"+(1.609*a)+"킬로미터 입니다.");
	}

}
