import java.util.Random;
public class Ex06 {

	public static void main(String[] args) {
		int[] arr=new int[25];
		Random ran=new Random();
		for(int i=0;i<25;i++) {
			arr[i]=ran.nextInt(25)+1; //+1해야 1~25
			for(int k=0;k<i;k++) {
			if(arr[i]==arr[k]) { 
			i--;
			break;
			}
			}
		}
			for(int i=0;i<25;i++) {
			if(i%5==0)System.out.println();
			System.out.printf("%4d",arr[i]);
			}
		}

	}

