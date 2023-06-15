import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("패스워드를 입력하세요: ");
			String pass=scan.next();
			
			int e=0;
			int n=0;
			int t=0;
			
			for(int i=0;i<pass.length();i++) {
				char c=pass.charAt(i);
				if( c>='0' && c<='9') n++;
				else if( c>='A' && c<='Z') e++;
				else if( c>='a' && c<='z') e++;
				else t++;
				}
			
			if(e!=0 && n!=0 && t!=0 && pass.length()>7)continue;
			//영숫특 사용
			if(e!=0 && n!=0 && t==0 && pass.length()<10) {
			System.out.println("영문자, 숫자만 사용시  최소 10자리 이상이어야 함");
			continue;}
			//영숫 사용
			
			if(e!=0 && n==0 && t==0)System.out.println("단독사용불가");
			else if(e==0 && n!=0 && t==0)System.out.println("단독사용불가");
			else if(e==0 && n==0 && t!=0)System.out.println("단독사용불가");
			else break;						
			}
		System.out.println("패스워드가 올바르게 만들어 졌습니다.");	
		}
}
