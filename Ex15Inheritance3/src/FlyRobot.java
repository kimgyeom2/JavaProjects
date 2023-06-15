
public class FlyRobot extends Robot {

	// 이미 HP,이동,공격 상속으로 인해 보유중
	void fly() {
		System.out.println("날아 날아");
	}
	
	// 상속받은 attack기능 메소드의 기능을 변경
	// 메소드 Override(올라탐 밑에있는게 안보이게(없어지는게아님), 덮어쓰기가 아님)
	void attack() {      
		System.out.println("미사일 발사!");
	}
}
