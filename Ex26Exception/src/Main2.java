import java.net.MalformedURLException;
import java.net.URL;


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// throws : 예외를 떠넘기는 문법
		try {
		int num=divide(10,0);
		System.out.println("num: "+num);
		}catch(ArithmeticException e) {
			System.out.println("divide 메소드의 throws된 예외를 대신처리");
		}
		
		System.out.println();
		
		//강제로 예외처리를 해야만 하는 checked Exception을 던지는 메소드
		try {
			ccc();
		}catch(MalformedURLException e) {
			
		}		
	}
	static void ccc() throws MalformedURLException {
		bbb();
	}
	//throws는 폭탄떠넘기듯 예외를 마구 떠넘길수 있음
	static void bbb()throws MalformedURLException {
		aaa();
	}
	
	static void aaa() throws MalformedURLException{
		URL url=new URL("http://www.google.com");
	}

	//두 수를 나눗셈연산하여 결과를 리턴해주는 기능메소드
	// 경우에 따라서는 예외가 발생하는 코드에서 직접 처리가 애매할 수 있음
	// 이럴때 이곳에서 예외를 처리하지 않고 이 메소드를 호출하는 쪽으로 
	// 예외를 던져버리는 문법 : throws (폭탄돌리기)
	static int divide(int x,int y) throws ArithmeticException {
		return x/y;
//		try{
//		return x/y;
//		}catch(ArithmeticException e) {
//			return ?? 	
//		}
	}
	
}
