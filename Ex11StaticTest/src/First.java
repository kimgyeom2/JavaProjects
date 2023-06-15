
public class First {

	static int count=0;  //'First클래스'에 1개 존재하는 변수

	public First() {
		count++;
		System.out.println("First 객체생성 : "+count);
	}
}
