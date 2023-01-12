package practice02_soldier;

/*
 	has a 관계
 	1. 상속 관계로 만들 수 있는 관계이다.
 	2. Soldier has a Gun
 	3. 자식 has a 부모
 */

public class Gun {

	// 필드
	private String model;
	private int bullet;
	private final int MAX_BULLET = 20;
	
	
	// 메소드
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getBullet() {
		return bullet;
	}
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	// 총알 넣기
	public void reload(int bullet) {
		if(this.bullet > MAX_BULLET) { // 그냥 bullet쓰면 넣는 총알이기 떄문에 this사용 해야함
			return;
		}
		this.bullet += bullet;
		this.bullet = (this.bullet > MAX_BULLET) ? MAX_BULLET : this.bullet; // 20발 넘으면 20발로 하고 아니면 넣는다
	}
	
	// 총 쏘기
	public void shoot() { // 여기에서는 매개변수가 없어서 this. 안붙혀도 구분이 가능
		if(bullet == 0) {
			System.out.println("헛빵");
			return;
		}
		bullet--;
		System.out.println("빵");
	}
	
}
