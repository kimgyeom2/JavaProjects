import java.util.Scanner;
public class While02 {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.print("정수 입력 :");
		a=scan.nextInt();
		for(int i=1;i<a+1;i++) {
			System.out.println(3*i);
		}
	}

}
