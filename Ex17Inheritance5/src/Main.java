
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 어떤 대학교의 정보제공 앱 제작- 회원가입 기능
		// 회원종류: 일반, 학생, 교슈, 근로학생
		
		// 1. 일반: 이름, 나이
		// 2. 학생: 이름, 나이, 전공
		// 3. 교수: 이름, 나이, 연구과제
		// 4. 근로학생: 이름, 나이, 전공, 업무
		
		//일반회원
		Person p=new Person("sam",20);
		p.show();
		System.out.println();
		
		//학생회원
		Student stu=new Student("robin",23,"android");
		stu.show();
		System.out.println();
		
		//교수회원
		Professor pr=new Professor("Park",42,"mobile optimization");
		pr.show();
		System.out.println();
		
		//근로학생
		AlbaStudent al=new AlbaStudent("hong",27,"ios","pc management");
		al.show();
		System.out.println();
	}

}
