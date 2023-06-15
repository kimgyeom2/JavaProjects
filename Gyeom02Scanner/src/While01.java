import java.util.Scanner;
public class While01 {
	public static void main(String[]args) {
		int a;
		int i=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 :");
		a=scan.nextInt();
		
		while(i<a)
		{
			System.out.println("Hello world");
			i++;
		}
	}
}
