import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 팀장이 인터페이스를 설계하고 추상메소드의 이름을 정하면
		// 팀원들은 그 이름을 토대로 기능을 구현하여 클래스를 설계
		// 팀장 : Unit 인터페이스 설계
		// 팀원1 : Marine클래스 정의 및 Unit구현 Unit이라면 가져야할 기능 구현(메소드 이름 통일)
		// 팀원2 : Tank클래스 정의 및 Unit구현
		// 팀원3 : Race클래스 정의 및 Unit구현
		
		// Marine, Tank, Race객체는 attack(), move()기능이 있음을 확신함
		
		// 팀장은 만들어진 클래스를 이용하여 객체 생성 및 게임알고리즘 구현
		
		// 캐릭터별 참조변수를 사용할 수도 있지만 부모참조변수로 자식객체들을
		// 모두 참조할 수 있으니 차라리 유닛참조변수 타입으로 모든객체들을
		// 제어하는것이 효과적임 배열로 묶을 수 있음
		//Unit[] units=new Unit[200];
		
		// 단, 실제 게임해서는 캐릭터들이 생성과 제거가 빈번하게 일어남
		// 그러나 배열은 한번 만들면 개수를 변경할 수 없음. 요소 제거도안됨
		
		// 그래서 실제 이렇게 대량의 객체를 다룰때는 유동적 배열을 더 선호함
		// 기차처럼 객체를 끌고다니는 클래스 : ArrayList
		ArrayList<Unit> units=new ArrayList<Unit>();
		
		// 요소의 개수 확인해보기
		int num=units.size();
		System.out.println("유닛개수 : "+num);
		
		// 유닛종류 객체들 생성하여 추가해주기
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Race());
		units.add(new Tank());
		units.add(new Marine());
		System.out.println("유닛개수 : "+units.size());
		
		//유닛의 기능들을 사용해보기
//		for(int i=0;i<units.size();i++) {
//			Unit unit=units.get(i);
//			
//			unit.move();
//			unit.attack();
//		}
		System.out.println();
		
		//확장된 for문법
		for(Unit unit:units) {
			unit.move();
			unit.attack();
			
			// 레벨업이 가능한 유닛들은 레벨업하기
			// Unit참조변수가 참조하는 객체가 Marine인지 확인
//			if(unit instanceof Marine) {
//				Marine m=(Marine)unit;
//				m.levelup();
//			}else if(unit instanceof Tank) {
//				((Tank)unit).levelup();
//			}			
			
			if(unit instanceof LevelupAble) {
				((LevelupAble)unit).levelup();
			}
			System.out.println();
		}
	}

}
