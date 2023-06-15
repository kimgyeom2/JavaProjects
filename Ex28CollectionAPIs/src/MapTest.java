import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map : 키-밸류 쌍으로 데이터를 저장하는 방식
		
		// Map도 인터페이스여서 바로 객체생성은 불가능함
		// Map의 계열의 특징을 가진 인터페이스를 구현한 하위클래스들을 사용함
		// HashMap, TreeMap,LinkedHashMap,HashTable[HashMap과 동일-동기화처리 되어있음]
		
		// <ket자료형,value자료형>
		HashMap<String,String> map=new HashMap<String,String>(); //가장 성능좋음
		//TreeMap<String,String> map=new TreeMap<String,String>(); //키값을 오름차운으로 저장[성능중간]
		//LinkedHashMap<String, String> map=new LinkedHashMap<>(); //저장된순서대로[성능 최하위]
		// 요소 추가
		map.put("name","sam");  //(식별자,값)
		map.put("id","abcd");	//(key,value)
		map.put("pass","qwer");
		map.put("kkk","sam");	//데이터는 중복되지만 키값이 다르기에 저장가능		
		map.put("kkk","hong");  //키값이 중복되면 개수는 새로 추가되지않고 밀어냄
		
		// 요소 개수
		System.out.println("요소 개수: "+map.size());
		
		// 요소 얻어오기
		System.out.println(map.get("name"));  //키값으로 값얻기
		System.out.println(map.get("id"));
		System.out.println(map.get("pass"));
		System.out.println(map.get("kkk"));
		System.out.println();
		
		// 순서대로 요소값 얻어오기
		// 방법1 for문 불가능- index가 없음
		// 방법2 확장for문 불가능
		
		// 방법3 우선 key값들만 Set객체로 우선 얻어와서 반복문으로 처리
		Set<String> keys=map.keySet(); //keySet이 Set객체생성
		
		// 3.1 key들을 가진 Set 컬랙션 객체를 반복문으로 접근
		for(String key: keys) {
			System.out.println(map.get(key));
		}
		System.out.println(); 
		
		// 3.2 key들을 가진 Set 컬랙션 객체의 반복자 iterator이용
		Iterator<String> datas=keys.iterator();
		while(datas.hasNext()) {
			String k=datas.next();
			System.out.println(map.get(k));
		}
		System.out.println();
		
		// 방법4 map객체를 Set객체로 변환하여 접근
		// Map의 요소객체(키-벨류)인 Entry들을 가진 Set으로 변환
		Set<Entry<String, String>> entries=map.entrySet();
		for(Entry<String,String> t : entries) {
			System.out.println(t.getKey()+":"+t.getValue());
		}
		   
		//요소 삭제  
		map.remove("kkk");
		System.out.println(map.toString());
		
		
		// 키값을 그냥 정수 숫자로 할 수도 있음
		HashMap<Integer, String>map2=new HashMap<>();
		map2.put(1, "aaa");
		map2.put(2, "bbb");
		map2.put(3, "ccc");
		
		// 사용자정의 클래스를 value로 사용가능
		HashMap<String, Person>map3=new HashMap<>();
		map3.put("첫번째", new Person("sam",20));
		map3.put("두번째", new Person("robin",20));
		map3.put("세번째", new Person("hong",20));
	}

}
