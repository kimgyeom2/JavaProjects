import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char max=s.charAt(0);
		for(int i=1;i<s.length();i++) {
			char a=s.charAt(i);
			if(a>max)max=a;
		}
		System.out.println(max);
	}

}
