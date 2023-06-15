import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		
	
	//Set 인터페이스 : 순서X, index X, 중복데이터 X
	
	//Set<String> set=new Set();  //error 인터페이스는 객체 생성 불가
	
	//Set인터페이스를 구현한 하위클래스들 : HashSet, TreeSet, LinkedHashSet

	
	HashSet<String> set =new HashSet<String>(); //성능이 가장 우수
	//TreeSet<String> set=new TreeSet<String>(); // 값이 오름차순으로 정리됨[성능 중간]
	//LinkedHashSet<String> set=new LinkedHashSet<>(); //값을 저장한 순서대로 저장
	//요소 추가
	set.add(null);
	set.add("ccc");
	set.add("aaa");
	set.add("kkk");
	set.add("ddd");
	set.add("ccc");  //중복데이터를 추가해보기 -무시됨
	

	//요소개수 출력 및 요소값 확인
	System.out.println(set.size()+":"+set.toString());
	
	//요소값을 얻어오는 기능 .get()이 없음
	//set.get() error 인덱스번호가 없음
	
	//일반적으로는 set의 요소 하나를 얻어오기보다는
	//모든 요소들을 순차적으로 얻어오는 경우가 많음
	
	//순차적으로 요소값을 얻어오기
	//방법1 for 이용불가-인덱스 번호 없어서
	//방법2 확장for문
	for(String t:set) {
		System.out.println(t);
	}
	System.out.println();
	
	//방법3. iterater(반복자)를 이용
	Iterator<String> datas=set.iterator();
	while(datas.hasNext()) {
		String s=datas.next();
		System.out.println(s);
	}
	System.out.println();
	
	//방법4. set을 배열로 변환하여 접근
	String[] aaa=new String[set.size()];
	set.toArray(aaa);
	for(String t:aaa) {
		System.out.println(t);
	}
	
	//사용자 정의클래스를 Set의 요소로 사용해보기
	//중복체크가 될까
	HashSet<Person> people=new HashSet<>();
	people.add(new Person("sam",20));
	people.add(new Person("sam",20));
	System.out.println(people.size());
	//Set이 객체가 중복되었다고 판단하는 기준은
	// 그 객체의 기능메소드 중 .hashCode()와 .equals()결과가 같을때
	
	}
}


class Person{
	String name;
	int age;
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	
	}
}