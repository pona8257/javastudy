package ex02_random;

import java.util.UUID;

public class Ex04_UUID {

	public static void main(String[] args) {	// 중복되지 않는 랜덤값을 사용할 때 

		/*
		 	java.util.UUID
		 	1. 전역 고유 식별자(Universal Unique IDentifier)
		 	2. 32개의 16진수와 4개의 하이픈(-)로 구성된 식별자 값
		 	3.
		 */
		
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();
		
		// 하이픈(-) 모두 업애기 : 모든 하이픈을 빈문자열로 바꾸기
		System.out.println(str.replace("-",""));
		
	}

}
