import java.util.Scanner;
public class Operator3 {

	public static void main(String[] args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 하나 입력 :");
		a=scan.nextInt();
		if(a<1) System.out.println(-a);
		else System.out.println(a);
	}

}
