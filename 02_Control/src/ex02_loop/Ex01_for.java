package ex02_loop;

public class Ex01_for {

	/*
	      for문 
	      1. 연속된 숫자를 생성하는 반복문(배열에서 주로 사용)
	      2. 형식
	           for(초기문; 조건문; 증감문) {
	             실행문
	             }
	 */
	
	
	public static void ex01() {
		
		// 1 ~ 10 출력
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);   // 실행순서는 1.초기문 -> 2.조건문 -> 3.실행문 -> 4.증감문 -> 2 -> 3 -> 4 .... 2,3,4 순서로 루프 반복
		}
		
	}
	
	public static void ex02() {
		
		// 횟수 (5번)
		int count = 5;
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
		
	}
	
	public static void ex03() { // 연습
		
		// 10 ~ 1
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
	}
	
	public static void ex04() { // 연습
		// 구구단 n단
		
		int dan = 9; // 원하는 n단을 넣으면 된다.
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "x"+ i + "=" + i * dan);
		}
				
	}
	
	public static void main(String[] args) {

		ex04();
		
	}

}
