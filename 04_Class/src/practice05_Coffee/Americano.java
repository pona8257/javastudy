package practice05_Coffee;

public class Americano {

	// 필드
		private Espresso[] cups;  // 에스프레소 여러 잔 들어갈 수 있음
		private int shotCount;    // 아메리카노에 들어간 에스프레소 개수(샷)
		private int extraWater;   // 물
		private int idx;          // cups 배열의 인덱스
		
		// 생성자
		public Americano(int shotCount, int extraWater) {
			cups = new Espresso[shotCount];
			this.shotCount = shotCount;
			this.extraWater = extraWater;
		}
		
		// 샷 추가 addEspresso 메소드
		public void addEspresso(Espresso espresso) {
			
		}
		
		// 조회 info 메소드
		public void info() {
			
		}
	
}
