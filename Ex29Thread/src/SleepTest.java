
public class SleepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SThread t=new SThread();
		t.start();
		
		//5초후에 깨우기
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
			
		//sleep으로 자고 있는 스레드를 강제로 깨우기위해 예외를 발생시키는 문법
		t.interrupt();
	}

}

class SThread extends Thread{
	@Override
	public void run() {
		//10초 대기 후 "Hello"글씨 출력
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("자는데 왜 깨워;");
		}
		System.out.println("Hello");
	}
}