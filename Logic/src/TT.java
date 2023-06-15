import java.util.Scanner;

public class TT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String num=scan.nextLine();
		int k=2;
		int sum=0;
		for(int i=0;i<num.length()-1;i++) {
			char ch=num.charAt(i);
			if(ch>='0' && ch<='9')	
				sum+=((ch-48)*k);
				k++;
				if(k>9) k=2;
			}
		System.out.println(sum);
	}

}
