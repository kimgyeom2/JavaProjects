public class Second {

	//멤버변수(field)
	private int a;
	private int b;
	
	//멤버변수를 초기화하는 생성자메소드
	public Second(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("int, int");
	}
	
	//생성자 오버로딩
	public Second() {
		// 생성자의 존재이유는 멤버변수의 초기화를 목적
		// 값전달이 없을때 default 값을 대입하는 코드를 작성함
		// this.a=0;
		// this.b=0;
		// 이런 멤버변수가 엄청 많을때는 일일이 값을 대입하는것이 번거로움
		// 가만보니 이미 파라미터 2개를 주면 각각멤버변수에 넣어주는
		// 다른 생성자메소드(기능)가 있음 그러니 굳이 여러줄작성 안하고
		// 그 생성자 메소드에 여러값을 전달하면 한줄로 코딩이 가능
		// 이때 사용하는 다른 생성자의 호출문:this()
		this(0,0);
		System.out.println("Second 생성자호출!");
	}
	
	public Second(int a) {
		//System.out.println("Second 생성자!! int");
		//this() 생성자 호출문은 반드시 첫번째 문장으로 있어야 함.
		this(a,0);
		System.out.println("Second 생성자!! int");
	}
}
