package practice02_soldier;
                        
public class Soldier { // 앞에 서는 상속을 받아 없어도 상관없지만
					  // 여기서는 상속을 못받아 메소드 지정 해줘야 한다.				
	// 필드
	private Gun gun;  // 초기값은 null
	
	// 메소드
	public void reload(int bullet) {
		gun.reload(bullet);
	}
	
	// 생성자
	public Soldier() {
		gun = new Gun();
	}
	
	public void shoot() {
		gun.shoot();
	}
	
}
