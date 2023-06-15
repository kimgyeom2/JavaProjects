import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int[] aaa=new int[10];
	for(int i=0;i<10;i++) {
		aaa[i]=scan.nextInt();
		}
	for(int k=0;k<10;k++) {
		System.out.print((1+10*k)+"-"+(10+10*k)+":");
		for(int j=0;j<10;j++) {
		if(aaa[j]>=1+10*k && aaa[j]<=10+10*k) System.out.print("*");
		}
		System.out.println();
	}
			
	}

}

