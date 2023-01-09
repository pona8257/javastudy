package ex02_loop;

public class Ex05_nested_loop { // 이중 구문

	public static void ex01() {
		
		for(int day = 1; day <= 5; day++) {
			for(int hour = 1; hour <=8; hour++) {
				System.out.println(day + "일차 " + hour + "교시 수업");
			}
		}
		
	}
	
	public static void ex02() {
		
		int day = 1;
		
		
		while(day <= 5) {
			
			int hour = 1;
			
			while(hour <= 8) {
				System.out.println( day + "일차 " + hour + "교시 수업");
				hour++;
			}
			day++;
		}
	}
	
	public static void ex03() { //연습
		
		//전체 구구단 출력하기
		for(int a = 2; a < 10; a++) {
			for(int b = 1; b < 10; b++) {
				System.out.println(a + "x" + b + " = " + a * b);
			}
		}
		
	}
	
	public static void ex04() { //연습
		
		// 전체 구구단 출력
		// 2x1=2 3x1=3 4x1=4 ......
		// 2x9=18 3x9=27 ....
		 
		for(int b = 1; b < 10; b++) {
			for(int a = 2; a <10 ; a++) {
				System.out.print(a + "x"+ b + "=" + b*a + " ");  // 벤다이어 그램 처럼 생각하기!!  	 // 위에 3번은  a(a단)가 b를 포함 이지만
			}                                                                                        // 이번문제는 	b가 a(a단)을 포함한다
			System.out.println("");	
		}														
	}
	
	public static void main(String[] args) {
		ex02();
	}

}
