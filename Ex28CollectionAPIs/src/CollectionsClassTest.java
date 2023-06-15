import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Collections클래스의 유용한 static 기능메소드
		// 1) Collections.sort();
		// 2) Collections.shuffle();
		
		ArrayList<String> datas=new ArrayList<>();
		
		datas.add("Nice");
		datas.add("World");
		datas.add("Android");
		datas.add("Ios");
		datas.add("hello");
		datas.add("good");
		datas.add("react");
		System.out.println(datas.toString());
		Collections.sort(datas);
		System.out.println(datas.toString());
		Collections.shuffle(datas); //할때마다 다름 앱만들때 과제예정
		System.out.println(datas.toString());// 1-50넣고 셔플하면 랜덤임
		
		ArrayList<Integer> num=new ArrayList<>(45);
		for(int i=1;i<45;i++) {
			num.add(i);
			}
		Collections.shuffle(num);
		System.out.println(num.get(0));
		System.out.println(num.get(1));
		System.out.println(num.get(2));
		System.out.println(num.get(3));
		System.out.println(num.get(4));
		System.out.println(num.get(5));
	}

}
