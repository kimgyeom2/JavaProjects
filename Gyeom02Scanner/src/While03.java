import java.util.Scanner;
public class While03 {
		public static void main(String[]args) {
			Scanner scan=new Scanner(System.in);
			int a;
			int total=0;
			while(true) {
				a=scan.nextInt();
				total+=a;
				if(a==0)break;
			}
			System.out.println(total);
		}

}
