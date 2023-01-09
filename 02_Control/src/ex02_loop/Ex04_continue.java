package ex02_loop;

public class Ex04_continue {

	/*
	    continue문 (그리 중요x)
	    1. 반복문의 실행 시작 지점부터 다시 실행
	    2. 어떤 코드를 "제외"하고 반복문을 실행하고 싶을 때 사용
	 */
	
	
	public static void main(String[] args) {
		
		// 1 ~ 50 사이에서 4의 배수 제외하고 출려하기
		
		for(int a = 1; a >=50; a++) {

			if(a % 4 == 0) {
				continue;  // continue만나면 위에 for문으로 돌아가라는 뜻 
			}
			


		}

	}

}
