package ex03_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

	/*
	 	Set
	 	1. 저장된 요소들의 인덱스가 없다. → 저장 순서가 없다.
	 	2. 중복 저장이 되지 않는다
	 */
	
	public static void ex01() {
		
		// HashSet 객체 선언 및 생성
		Set<String> set = new HashSet<String>();
		
		// 추가
		set.add("spring");
		set.add("summer");
		set.add("autumn");
		set.add("winter");
		
		// 제거
		set.remove("winter");
		
		// 확인
		System.out.println(set);
	}
	
	public static void ex02() {
		
		// HashSet 객체의 초기화 (List를 이용해서 초기화 진행)
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		
		// 인덱스가 없기 떄문에 향상 for문만 가능
		for(Integer n : set) {
			System.out.println(n);
		}
		
	}
	
	public static void ex03() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 교집합
		set1.retainAll(set2);	// set1에 교집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
		
	}
	
	public static void ex04() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 합집합
		set1.addAll(set2);	// set1에 합집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
		
	}
	
	public static void ex05() {
		
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(3, 4, 5, 6, 7));
		
		// 합집합
		set1.removeAll(set2);	// set1에 차집합 결과가 저장된다.
		
		System.out.println(set1);
		System.out.println(set2);
		
	}
	
	public static void ex06() {
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		// 1 ~ 45 사이수 6 개 중복x
		//int lottoNum = (int)(Math.random() * 45 + 1);
		while(lotto.size() < 6) {	// 로또가 6개가 될때 까지 돌아간다 (for문은 6번 돌리면 같은수가 들어가면 저장을 안해서 6개가 안채워 질 수있다.)
			lotto.add((int)(Math.random() * 45) + 1);
		}
		
		System.out.println(lotto);
	}
	
	public static void main(String[] args) {

		ex06();
		
	}

}
