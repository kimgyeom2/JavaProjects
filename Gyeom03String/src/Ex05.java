import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String s1, s2, s3;
		
		while(true) {
			System.out.print("첫번째 자리 입력(3자리) : ");
			s1= scan.next();
			
			int i;
			for(i=0; i<s1.length(); i++) {
				char ch= s1.charAt(i);
				if( ch<'0' || ch>'9') break;				
			}
			
			if(i==3) break;			
			else System.out.println("[잘못 입력하셨습니다. 3자리의 숫자만 입력가능합니다.");
		}
		
		while(true) {
			System.out.print("두번째 자리 입력(3~4자리) : ");
			s2= scan.next();
			int i;
			for(i=0; i<s2.length(); i++) {
				char ch= s2.charAt(i);
				if( ch<'0' || ch>'9') break;				
			}
			
			if(i==3 || i==4) break;
			else System.out.println("[잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.");
		}
		
		while(true) {
			System.out.print("세번째 자리 입력(4자리) : ");
			s3= scan.next();
			int i;
			for(i=0; i<s3.length(); i++) {
				char ch= s3.charAt(i);
				if( ch<'0' || ch>'9') break;				
			}
			
			if(i==4) break;
			else System.out.println("[잘못 입력하셨습니다. 4자리의 숫자만 입력가능합니다.");
		}
		
		String s= s1+"-"+s2+"-"+s3;
		System.out.println("입력된 전화번호는 ["+ s + "]입니다.");

	}

}