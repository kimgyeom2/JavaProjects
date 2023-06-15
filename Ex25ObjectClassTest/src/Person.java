
public class Person {

	private String name;
	private int age;
	private String address;
	
	// 멤버변수 하나하나의 값을 별도로 설정하는 기능메소드들이 필요
	// setter method 가급적 만들어 놓을것을 권장(거의 반드시)
	// 마우스 오른쪽- source- generate getter and setter누르면 한번에 다 만들어줌
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	// 멤버변수 값 각각을 리턴해주는 기능메소드들
	// getter메소드 라고 부름
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	// 객체가 생성(new)될때 자동으로 발동하는 아주 특별한 메소드
	public Person() {
		System.out.println("Person객체 생성");
	}
	
	public Person(String name,int age,String address) {
		this.name=name;
		this.age=age;
		this.address=address;
		System.out.println("Person객체 생성자2");
	}
}
