
public class First {
	
	//4가지 유형의 접근제한자가 적용된 멤버변수들
	private int a;
	int b; //default
	protected int c;
	public int d;
  
	//멤버함수
	void aaa() {
		//같은 클래스안에있는 멤버변수들은 접근제한자와 상관없이 그냥 사용가능
		a=10;
		b=20;
		c=30;
		d=40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
	}
}
