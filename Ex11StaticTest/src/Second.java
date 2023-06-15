
public class Second {

		int a;
		static int b;
		
		//static 초기화 블럭
		static{
			System.out.println("static초기화블럭");
			//a=10; 인스턴스변수 초기화 불가능
			b=20;
		}
		//초기화 블럭 - instance 초기화블럭
		{
			System.out.println("instance 초기화블럭");
			a=10;
			//b=20; //권장하지 않음
		}
}
