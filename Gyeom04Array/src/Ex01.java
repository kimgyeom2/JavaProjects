import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		int[] aaa=new int[5];
		int max,min;
		int total=0;
		aaa[0]=scan.nextInt();
		max=aaa[0];
		min=aaa[0];
		for(int i=1;i<5;i++) {
			int num=scan.nextInt();
			aaa[i]=num;
			total+=aaa[0];
			if(aaa[i]>max) max=aaa[i];
			if(aaa[i]<min) min=aaa[i];
		}
		System.out.println("최대"+max+"최소"+min+"합"+ total);
	}

}
