package ex01_branch;

public class Ex01_if {

	public static void ex01() {
		
		// if 문 
		int score = 59;
		
		if(score >= 60) 
			System.out.println("합격");
		
		if(score < 60)
			System.out.println("불합격");
		
	}
	
	public static void ex02() {
		
		// if 문의 중괄호
		// 실행문이 1개의 경우 생략할 수 있다.
		// 실행문이 2개 이상인 경우 반드시 필요하다.
		
		int score = 70;
		
		if(score >= 60) {
			System.out.println("합격"); // 이 구문만 조건에 의해 출력 하고 
			System.out.println("축하합니다"); // 이 구문은 항상 출력인데 두 구문을 묶어서 하고 싶으면 중괄호 사용
		}
		
		if(score < 60) {
			System.out.println("불합격");
			System.out.println("보충수업입니다"); // 중괄호 사용 안해서 출력됨
		}
	}
	
	
	public static void main(String[] args) {
	
		ex02();

	}

}
