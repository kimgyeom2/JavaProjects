import java.util.Scanner;
public class While06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		int total=0;
		for(int i=0;i<5;i++) {
			System.out.print("정수를 입력하세요 :");
			a=scan.nextInt();
			total+=a;
			if(a<1)i--;
		}
		
		System.out.println(total);
	}

}
