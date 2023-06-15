import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		String[] sss=new String[a];
		for(int i=0;i<sss.length;i++) {
			sss[i]=scan.next();
		}
		for(String t:sss) {
			System.out.println(t);
			
		}
	}

}
