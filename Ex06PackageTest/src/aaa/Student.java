package aaa;

//[이름, 나이, 주소]데이터를 저장하는 학생정보 클래스
public class Student {

	public String name;  //다른 패키지에서도 멤버를 사용하게하려면 public이여야함-나중 수업내용
	int age;
	String address;
	
	//같은 패키지의 다른 클래스는 그냥 사용가능
	Person p=new Person();
	
}
