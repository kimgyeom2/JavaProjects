
public class SynchronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 동기화 처리- Thread를 사용하는 것은 비동기 처리를 의미함. 이로 인한 문제 해결기법
		// 동기 (Synchronize) : a작업이 끝나면 b작업을 해라.
		// 비동기 (Asynchronize) : a작업할때 b작업을 동시에 하는거
		
		// 계좌 객체 생성
		Account acc=new Account();
		
		//계좌에 돈을 입금하는 작업을 수행하는 별도 Thread객체 생성
		TestThread t1=new TestThread(acc);
		TestThread t2=new TestThread(acc);
		t1.start();
		t2.start();
	}

}

// 은행계좌 클래스
class Account{
	
	int money=0;
	
	// 입금기능 만들기 - 별도의 동기화 처리를 하지 않으면 서로다른 스레드가 동시에 이 기능을 실행하여 문제가 생길 수 있음 
//	void add(int m) {
//		String name=Thread.currentThread().getName();
//		System.out.println(name+"- 입금작업을 시작합니다");
//		System.out.println(name+"- 현재 잔액 : "+money);
//		money+=m; //누적
//		
//		// 전산처리 시간을 가정하여 임의로 오래걸리는 코드 작성
//		for(long i=0;i<50000000000L;i++) {
//			new String("aaaa");
//		}
//		
//		System.out.println(name+"- 입금 후 잔액 : "+money);
//		System.out.println();
//	}
	
	
	
	// 입금기능- 동기화 처리가 된 메소드로 설계하기 - 메소드를 동기화처리
//	synchronized void add(int m) {
//		String name=Thread.currentThread().getName();
//		System.out.println(name+"- 입금작업을 시작합니다");
//		System.out.println(name+"- 현재 잔액 : "+money);
//		money+=m; //누적
//		
//		// 전산처리 시간을 가정하여 임의로 오래걸리는 코드 작성
//		for(long i=0;i<50000000000L;i++) {
//			new String("aaaa");
//		}
//		
//		System.out.println(name+"- 입금 후 잔액 : "+money);
//		System.out.println();
//	}
	
	// 입금기능- 동기화 블럭 사용해보기
	void add(int m) {
		String name=Thread.currentThread().getName();
		System.out.println(name+"- 입금작업을 시작합니다");
		
		synchronized (this) {
			System.out.println(name+"- 현재 잔액 : "+money);
			money+=m; //누적
			
			// 전산처리 시간을 가정하여 임의로 오래걸리는 코드 작성
			for(long i=0;i<50000000000L;i++) {
				new String("aaaa");
		}		
		
		}
		
		System.out.println(name+"- 입금 후 잔액 : "+money);
		System.out.println();
	}
}

class TestThread extends Thread{
	
	Account acc; //참조변수
	public TestThread(Account acc) {
		this.acc=acc;
	}
	@Override
	public void run() {
		this.acc.add(100); //100원을 입금하는 동작 수행
	}
}
