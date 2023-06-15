
public class Test {

	// 1)리턴X 파라미터(매개변수)X
	void aaa() {
		System.out.println("aaa");
	}
	// 2)리턴X 파라미터(매개변수)O
		void bbb(int n) {
			System.out.println("n :"+n);
		}
	// 3)리턴O 파라미터(매개변수)X	
		int ccc() {
			return 10;
		}
	// 4)리턴O 파라미터(매개변수)O
		int ddd(int x,int y) {
			return x+y;
		}
}
