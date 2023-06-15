import java.util.Scanner;
public class While05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b;
		double total=0;
		System.out.print("몇개의 수를 입력하시겠습니까? :");
		a=scan.nextInt();
		for(int i=0;i<a;i++) {
			b=scan.nextInt();
			total+=b;
		}
		System.out.println("평균은 :"+(total/a));
	}

}
