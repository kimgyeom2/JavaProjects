
public class SwimmingRobot extends Robot {

	//이미 HP,이동,공격 상속으로 인해 보유중
	void swimming() {
		System.out.println("어푸 어푸");
	}
	
	//상속받은 기능변경
	//오버라이드 override
	void attack() {
		System.out.println("어뢰 발사!");
	}
}
