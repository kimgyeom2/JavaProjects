
public class RunnableTest {
	public static void main(String[] args) {
		
		// Thread 능력을 가지는 2가지 방법
		// 1. Thread클래스를 상속(Extends) 클래스를 설계하여 사용하는 방법
		// 2. Runnable인터페이스 구현한(implements)클래스를 설계하여 사용하는 방법
		
		// 왜 방법이 2가지 존재할까?
		// 다중 상속의 효과를 보고싶어서
		// Person클래스의 능력을 가지면서 Thread의 능력도 있었으면 할때
		// 자바는 다중상속이 금지되어있음. 대신 인터페이스의 구현은 다중구현이 가능하기에
		// 여러능력을 동시에 가질 수 있음.
		PersonThread pt=new PersonThread("sam",23);
		
		// Thread를 실행하려면 run()을 자동실행시켜주는 .strat()메소드를 호출해야함
		// Thread는 클래스라 start기능이 있는거고 Runnable은 인터페이스라 기능이있을리가 없음
		
		// Runnable 인터페이스를 구현한 객체의 run()을 실행시켜주는 별도의 (Thread)객체가 필요함 -Thread가 생긴이유
		// Thread객체를 생성하면서 생성자메소드의 파라미터로 Runnable을 구현한 객체를 전달하면
		// Thread객체를 start할때 자동 run됨
		Thread t=new Thread(pt); //파라미터로 전달한 runnable을 실행함
		t.start();
		pt.run();
		
		// 다중상속이 아닌 그냥 스레드객체가 필요할때도 Runnable로 만들기도 함
		// Runnable r=new Runnable(); //인터페이스는 직접객체생성 불가능
		// 인터페이스는 반드시 추상메소드를 구현한 클래스를 설계한후 객체로 생성해야함
		// 실제로 코딩해보면 이 별도의 클래스 이름을 명령하는것도 스트뤠스~
		// 이름에 따라서는 이게 Thread인지 인식하기 힘든 이름으로 사용했을수도 있음
		MyThread mr=new MyThread();
		
		Runnable obj=new MyThread(); //업캐스팅
		obj=new PersonThread("",0);
		
		// Thread가 작업할 코드는 별도의 class영역에 작성되어 있어서 start할때
		// 어떤 동작을 수행할지 한눈에 보이지 않음
		// 그래서 스레드의 작업코드를 작성하는 run()메소드를 스레드객체를 생성하면서
		// 그자리에서 곧바로 작성하는 문법
		// 객체를 만들면서 객체를 설계하는 문법 : 익명 클래스
		Runnable r=new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("별도 스레드가 작업할 내용..");
			}
		};
		
		new Thread(r).start();
	
	}//Main method
	
} //Main 클래스

class MyThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Person{
	String name;
	int age;
}

//Person 클래스의 맴버를 상속받으면서 Thread의 역할도 하는 클래스를 설계
class PersonThread extends Person implements Runnable{
	public PersonThread(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//1초마다 이름과 나이를 출력하는 기능코드 작성
		for(int i=0;i<5;i++) {
			System.out.println(name + ":"+age);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}