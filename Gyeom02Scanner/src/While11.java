
public class While11 {
	public static void main(String[] args) {
		
		for(int i=2;i<10;i++) {
			if(i%2==1)continue;
			for(int k=1;k<10;k++) {
				if(i+1==k)break;
				System.out.println(i+"*"+k+"="+(i*k));
			}
		}
	}
}
