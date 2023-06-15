import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("문자열 입력 : ");
	String s=scan.next();
	
	for(int i=0;i<s.length();i++) {
	char c1=s.charAt(i);
	c1=(char) (c1+1);
	System.out.println(c1);
	}
	
		
}
}
