import java.util.Scanner;
public class Operator1 {
	public static void main(String[]args) {
		 int a,b;
		 Scanner scan=new Scanner(System.in);
		 System.out.print("받은 돈 : ");
		 a=scan.nextInt();
		 System.out.print("상품 가격 : ");
		 b=scan.nextInt();
		 System.out.println("부가세 :"+(int)(b*0.1));
		 System.out.println("잔돈 :"+(a-b-(int)(b*0.1)));
	}
}
