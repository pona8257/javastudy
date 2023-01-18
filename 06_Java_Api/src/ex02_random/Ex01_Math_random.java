package ex02_random;

public class Ex01_Math_random {

	public static void ex01() {
		
		// java.lang.math 클래스
		
		double randNumber = Math.random();	// 0.0 <= 난수 <= 1.0

		if(randNumber < 0.1) {	// 10% 확률
			System.out.println("대박");
		}else {
			System.out.println("꽝");
		}
	}
	
	public static void ex02() {
		
		/*	중요 외움!!!!!!!!!!!!!!!!!!!!!!!!!!
		 
		 	난수 생성하기
		 	Math.random()                 0.0 <= n < 1.0
		 	Math.random() * 3             0.0 <= n < 3.0
		 	(int)(Math.rendom() * 3)      0   <= n < 3
		 	(int)(Math.rendom() * 3) + 1  1   <= n < 4 
		 	--------------------------------------------
		 	(int)(Math.rendom() * 개수) + 시작값 
		 	
 		 */
		
		StringBuilder sb = new StringBuilder();
		for(int count = 0; count < 5; count++) {
			sb.append((int)(Math.random() * 10));
			
		}
		
		String code = sb.toString();
		System.out.println(code);
		
		//System.out.println((int)(Math.random() * 5) + 1);
	}
	
	public static void main(String[] args) {
		ex02();
		
	}
	
}
