
public class Tank implements Unit,LevelupAble{
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("굴러서 이동");
		
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("포탄 발사");
	}
	
	@Override
	public void levelup() {
		// TODO Auto-generated method stub
		System.out.println("시저 모드On");
	}
}
