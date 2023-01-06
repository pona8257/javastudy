package ex05_op_condition;

public class MainClass {

	public static void ex01() {
		
		int a = 3;
		int b = 4;
		
		boolean result1 = a > b;
		boolean result2 = a >= b;
		boolean result3 = a < b;
		boolean result4 = a <= b;
		boolean result5 = a == b;
		boolean result6 = a != b; // 같지 않다
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}
	
	public static void ex02() {
	
		// 논리 연산 
		// 1. 논리 AND : &&, 모든 조건이 true이면 true, 아니면 false
		// 2. 논리 OR  : ||, 하나의 조건이라도 true면 true, 아니면 false
		// 3. 논리 NOT : ! , 조건이 true이면 false, 조건이 false이면 true
		
		int a = 10;
		int b = 10;
		
		boolean result1 = (a == 10) && (b == 10);
		boolean result2 = (a == 10) && (b == 20);
		System.out.println(result1);
		System.out.println(result2);
		
		boolean result3 = (a == 10) || (b == 10);
		boolean result4 = (a == 10) || (b == 20);
		boolean result5 = (a == 30) || (b == 20);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		boolean result6 = !(a == 10);
		boolean result7 = !(a == 20);
		System.out.println(result6);
		System.out.println(result7);
	}
	
	public static void ex03() {
		
		// Short Circuit Evaluation
		// 1. 논리 AND의 경우 조건의 결과가  false인 경우가 발생하면 더 이상 동작하지 않는다. 최종결과가 false로 정해졌기 때문이다
		// 2. 논리 OR의 경우 조건의 결과가 true인 경우 더 이상 동작하지 않는다. 최종결과가 false로 정해졌기 때문이다
		
		int a = 10;
		int b = 10;
		
		boolean result1 = (a == 20) && (++b == 11);
		System.out.println(b); // 앞에서 false발생해서 뒤에 b가 늘어나지 않는다
		System.out.println(result1);
		
		boolean result2 = (a == 10) || (++b == 11);
		System.out.println(b); // 앞에서 true발생해서 뒤에 b가 늘어나지 않는다
		System.out.println(result2);
	}

	public static void ex04( ) { //연습

		
		int score = 85;
		
		boolean result1 = (score / 10 == 7); //70점대면 true 아니면 false 만들기
		boolean result2 = (score >= 70) && (score < 80); // 다른 방법
		System.out.println(result1);
		System.out.println(result2);
		
		
	}
	
	public static void ex05() {
	
		// 조건 연산
		// (조건식) ? true일 때 처리 : false일 때 처리
		
		int score = 50;  // 60점 이상일 때 합격 나머지 불합격
		
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(result);
	}

	public static void ex06() { //연습
		
		int n = 8;
		
		String result = (n % 2 == 1) ? "홀수" : "짝수"; 
		System.out.println(result);
	}
	
	public static void ex07() { //연습
		
		int n = 0;  //홀수or짝수or3의 배수 나타내기
		
		String result = (n != 0 && n % 3 == 0) ? "3의 배수" : (n % 2 == 0) ? "짝수" : "홀수"; // 나타낼것이 여러개 일 때 (0은 나누면 0이 나와서 0은 제외 했을 때) 
		System.out.println(result);
	}
	
	public static void ex08() {
		
		
		// String 에서 ==, != 사용x    
	}
	
	public static void main(String[] args) {
		
		ex07();

	}

}
