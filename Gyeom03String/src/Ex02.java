import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		for(int i=0;i<s1.length();i++) {
			char a=s1.charAt(s1.length()-1-i);
			System.out.print(a);
		}

	}

}
