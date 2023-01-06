package ex01_variable;

public class MainClass {

    //single comment - 주석(설명)
	/* 
	  multiple comment - 여러줄 주석
	 */
	
	/*
	     키워드 이름 규칙
	     1. 프로젝트 : 마음대로
	     2. 패키지 : 모두 소문자(실무에서는 회사 도매인과 앱 이름으로 작성 ex)com.samsung.galaxy )
	     3. 클래스 : 첫 글자만 대문자 나머지는 소문자. Upper camel case (HelloWord)
	     4. 메소드 : 첫 글자만 대문자로 작성 나머지는 소문자. Lower camel case (helloWorld)
         5. 변수   : 첫 글자만 대문자로 작성 나머지는 소문자. Lower camel case (helloWorld)
         6. 상수   : 모두 대문자로 작성. Snake case (HELLO_WORLD)  
	 */
	
	/*
	     main 메소드
	     1. Java가 실행될 때 main 메소드가 실행된다
	     2. 열린 main 메소드가 없으면 최근레 실행에 성공한 main 메소드를 실행한다
	 */
	
	
	
	public static void main(String[] args) {
	
		// 코드는 들여쓰기가 잘 되어 있어야 한다 (탭 키 사용)
		
		//변수 선언하기(어떤 데이터를 저장할 것인가? 어떤 이름을 사용할 것인가?)
		
		
		/*
		  ctrl + space는 기본코드 보여줌 대충치고 두개 누르면 나온다
		  ctrl + alt + 아래 방향기 = 복사하기
		  ctrl + d = 그 줄 전체 지움
		*/
		
		/*
		  타입의 구분
		  1. primitive type : 기본 타입(소문자로 되어있음), 값으 지정하는 타입
		  2. reference type : 참조 타입(첫 글자가 대문자로 되어 있음, 모든 클래스는 참조 타입), 값이 저장된 참조값을 저장하는 타입
		*/
		
		
		//논리 타입 (참과 거짓 저장)
		boolean isGood = true;
		boolean isAlive = false;
		System.out.println(isGood);
		System.out.println(isAlive);
		
		// 문자 타입(Charater) : 1 글자
		char ch1 = 'A';
		char ch2 = '한';
		char ch3 = '\n'; // 라인 피드 - 줄바꿈
		char ch4 = '\t'; // 탭
		char ch5 = '\''; // 작은 따옴표
		char ch6 = '\"'; // 큰 따옴표
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		// 정수 타입
	    int age = 25;
		long money = 10000000004L;
		System.out.println(age);
		System.out.println(money);
		
		// 정수 기준 구분의 기준
		System.out.println(Integer.MAX_VALUE); //이 값 이상이면 뒤에 L붙인다(중요 x)
		
		// 실수 타입 
		double leftEye = 0.9;
		double rightEye = 1.2;
		System.out.println(leftEye);
		System.out.println(rightEye);
		
		// 문자열 타입(여러 글자를 의미, 글자 수의 제한이 없음)
		String name = "한재형"; // Java에서 기본 타입과 같은 사용벌을 제공
		System.out.println(name);
		String country = new String("Korea"); // 대부분의 참조 타입 사용법
		System.out.println(country);
		
		// 상수 선언하기 (final 키워드가 필요)
		final double PI = 3.141592; 
		System.out.println(PI);
	}

}
