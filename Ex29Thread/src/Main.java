
public class Main {

	public static void main(String[] args) {
		
		
		// Thread(스레드) : 작성된 코드를 실행하는 객체 - 동시에 여러작업을 처리하는 기법
		// 용어소개
		// 1) Process: 실행중인 하나의 자바 프로그램 -- 프로세스간에는 자원공유 불가능
		// 2) Thread: 하나의 프로세스 안에서 동작하는 직원같은개념 --스레드간에는 자원공유 가능
	
	
		// 하나의 프로세스에는 적어도 하나의 스레드가 기본적으로 존재하며 그 스레드를 Main Thread라고 부름
		// Thread혼자 오래걸리는 작업(코드)을 수행하면 다른 작업들이 대기상태로 
		// 오랫동안 실행되지 못할 수 있기에 동시에 여러작업을 하려면..
		// 별도의 스레드객체를 생성하여 요청해야함
	
		// 동시에 했으면 하는 작업 2개 구현
	
//		// 작업1. 20개의 파일을 다운로드하는 작업 - 실제 작업은 불가하니 느낌만
//		for(int i=0;i<20;i++) {
//			System.out.println(i+"번째 파일 다운로드중..");
//			
//			//강제로 잠시 시간벌기
//			for(long k=0;k<8000000000L;k++) {
//				new String("aaa");
//				//...
//			}
//		}
//	
//		// 작업2. 20개의 음악을 재생하는 작업
//		for(int i=0;i<20;i++) {
//			System.out.println(i+"번째 음악 재생 중..");
//			
//			//강제로 잠시 시간벌기
//			for(long k=0;k<8000000000L;k++) {
//				new String("aaa");
//				//...
//			}
//		}
		
		// 별도의 직원(Thread)객체를 생성하여 각각의 코드(작업)을 실행하도록 요청
		// Thread객체를 그냥 new만들어 쓰는 것이 아니라
		// Thread가 해야할 작업을 별도로 설계하여 작성해 놓아야 함
		// 즉, 별도의 class를 설계하여 그 class가 Thread의 능력을 가지도록 하여
		// 해야할 작업들을 작성해놓아야함
		
		
		ThreadA a=new ThreadA();
		//스레드가 해야할 작업을 작성 해놓은 run()메소드는 절대로 직접 호출하면 안됨
		//a.run(); error는 아니나 절대금지X!!!!!! run을하면 메인에서 직원의 작업지시서를가지고 '메인'이 실행하는 꼴
		a.start(); // 자동 run메소드 발동 - 이거는 Thread가 하는거
		ThreadB b=new ThreadB();
		b.start();
		
		// main Thread도 별도의 추가 작업 가능
		for(int i=0;i<20;i++) {
			// 현재 이 코드를 읽고있는 Thread가 누군지 알려주는 기능
			String s=Thread.currentThread().getName(); //Thread-0
			System.out.println(s+":"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
		
	}//main method..
	
}//main class..

// 파일 다운로드 작업을 수행하는 직원 클래스(Thread를 상속하는)
class ThreadA extends Thread{
	// 모든 Thread는 이 메소드 안에 작성한 것만 스스로 실행함.
	// Thread클래스 안에 있는 run()메소드를 오버라이드 해서 사용해야만 함
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			String s=Thread.currentThread().getName(); //Thread-1
			System.out.println(s+":"+i+"번째 파일 다운로드 중..");
			
			// 잠시 대기.. 500ms-0.5초
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}

}


// 음악 재생 작업을 수행하는 직원클래스 설계
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			String s=Thread.currentThread().getName();
			System.out.println(s+":"+i+"번째 음악을 재생 중..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	
}