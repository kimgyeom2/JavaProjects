import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("입력값 : ");
			String num=scan.nextLine();
		int sum=0;
		int k=2;
		 
		if(num.length()<16 ) {
			
			for(int i=0;i<num.length()-1;i++) {
			char ch=num.charAt(i);
			if(ch>='0' && ch<='9') {	
				sum+=((ch-48)*k);
				k++;
				if(k>9) k=2;}
			}
			if((11-(sum%11))%10==(num.charAt(num.length()-1)-48)) {
				System.out.println("주민번호가 맞습니다");
				System.out.println();
			}else {
				System.out.println("개인정보가 아닙니다");
				System.out.println();
			}
		}else {
			
		int count=0;
		for(int i=0;i<num.length();i++) {
			char ch=num.charAt(i);
			if(ch>='0' && ch<='9') count++;
		}
		if(count==16) {
			System.out.println("카드번호가 맞습니다");
			System.out.println();
		}else {
			System.out.println("개인정보가 아닙니다");
			System.out.println();
		}
		}
	}
							
	}

}
