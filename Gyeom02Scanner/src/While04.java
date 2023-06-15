import java.util.Scanner;
public class While04 {
	public static void main(String[]args) {
		int a;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 :");
		a=scan.nextInt();
		for(int i=9;i>0;i--) {
		System.out.println(a+"*"+i+"="+(a*i));
		}
		
	}

}
