import java.util.Scanner;
/////////미완성
public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int[] aaa=new int[3];
		
		System.out.print("1반 학생수 :");
		int a=scan.nextInt();
		System.out.print("2반 학생수 :");
		int b=scan.nextInt();
		System.out.print("3반 학생수 :");
		int c=scan.nextInt();
		
	int[][] arr=new int[3][];
	arr[0]=new int[a];
	arr[1]=new int[b];
	arr[2]=new int[c];
	
		for(int i=0;i<a;i++) {
			System.out.print("1반"+(i+1)+"번 :");
			arr[0][i]=scan.nextInt();
		}
		for(int i=0;i<b;i++) {
			System.out.print("2반"+(i+1)+"번 :");
			arr[0][i]=scan.nextInt();
		}
		for(int i=0;i<c;i++) {
			System.out.print("3반"+(i+1)+"번 :");
			arr[0][i]=scan.nextInt();
		}
	
		
}
}
