import java.util.Random;
public class Ex07 {
	public static void main(String[] args) {
	int[][] arr=new int[5][5];
	Random rnd=new Random();
	int[] n=new int[25];
	for(int i=0;i<5;i++) {
		for(int k=0;k<5;k++) {
			arr[i][k]=rnd.nextInt(25)+1;				
			}
		}
	
	
	for(int i=0; i<5; i++){			
		for(int j=0; j<5; j++){				
			System.out.printf( "%4d", arr[i][j] );
		}
		System.out.println();
	}
	}

}
