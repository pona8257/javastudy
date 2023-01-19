package ex03_throw;

import java.util.Scanner;

public class MainClass {

	public static void ex01() {
		
		try {
			Integer.parseInt("하하하");
			int a = 4 / 0;
			System.out.println(a);
			
		} catch(Exception e) {
			
			System.out.println(e.getClass().getName());	// 예외 클래스 이름 확인
			System.out.println(e.getMessage());	// 예외 메시지 확인
			
		}
		
	}
	
	public static void ex02() {
	try {
		Integer.parseInt("호호");
		
	} catch(Exception e) {
		e.printStackTrace();	// 예외를 추적하는 메소드(개발중에는 이것만 사용함) !!
	}
}

	public static void ex03() {
		
		/*
		 	throw
		 	1. 예외 객체를 생성해서 직접 던질 수 있다.
		 	2. 개발자가 직접 예를 처리할 떄 사용한다.
		 */
		
		Scanner sc = null;
		
		try{
			sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요 >>>");
			int age = sc.nextInt();
			if(age < 0 || age > 100) {
				throw new RuntimeException(age + "살은 불가능합니다.");	// catch로 간다.  RuntimeException : 실행하다가 예외발생 할때 어떻게 처리 할까
			}
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}
	

	public static void main(String[] args) {

		ex03();
		
		
	}

}
