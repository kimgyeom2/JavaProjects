
public class Marine implements Unit,LevelupAble {
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("걸어서 이동");
		
	}
	@Override
		public void attack() {
			// TODO Auto-generated method stub
		System.out.println("총알 발사");
			
		}
	@Override
	public void levelup() {
		// TODO Auto-generated method stub
		System.out.println("불꽃마린 변신!");
	}
}
