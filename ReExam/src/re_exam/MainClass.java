package re_exam;

import java.util.Arrays;

public class MainClass {

	public static void ex01() {	// 절대값 구하기
		
		int number = -6;
		
		int absNumber = (number >= 0) ? number : -number;
		
		/*
		int absNumber;
		
		if(number >= 0) {
			absNumber = number;
		} else {
			absNumber = number * -1;
			//absNumber = -number; 둘다 됨
		}*/
		System.out.println(absNumber);
	}
	
	public static void ex02() {
		
		String strAge = "12";
		int age = Integer.parseInt(strAge);	// int로 변환
		
		if(age < 0 || age >100) {
			System.out.println("잘못된 나이");
		} else if(age <= 7) {
			System.out.println("미취학 입니다");
		} else if(age <= 13) {
			System.out.println("초등학생 입니다");
		}else if(age <= 16) {
			System.out.println("중학생 입니다");
		}else if(age <= 19) {
			System.out.println("고등학생 입니다");
		}else {
			System.out.println("성인 입니다");
		}
	}
	
	public static void ex03() {	// 삼각형 넓이 (소수점 나오게)
		
		int width = 3;
		int height = 3;
		double area = (double)width * height / 2;
		
		System.out.println(area);
	}
	
	public static void ex04() {	// 월을 보고 계절, 마지막 일 출력하기
		
		/* month % 12 / 3  인덱스로 쓰자
			겨울 : 0
			봄   : 1
			여름 : 2
			가을 : 3
		*/
		int month = 1;
		String[] season = {"겨울", "봄", "여름", "가을"};
		int[] lastDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(month < 0 || month > 12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(month + "월은 " + season[month % 12 / 3] + "이다" );
		System.out.println(month + "월은 " + lastDay[month] + "일까지 있습니다.");
	}
	
	public static void ex05() {	// 10과 가까운수
		
		int a = 8;
		int b = 11;
		int diff1 = (a > 10) ? a - 10 :10 - a;
		int diff2 = (b > 10) ? b - 10 :10 - b;
		System.out.println("10과 가까운 수는 :" +(diff1 < diff2 ? a : b) + "입니다.");
		
	}
	
	public static void ex06() {
		
		int money = 87654;
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1}; 
		int[] count = new int[unit.length];
		
		
		for(int i = 0; i < unit.length; i++) {
			count[i] = money / unit[i];	//지패 갯수
			money = money % unit[i];
			System.out.println(unit[i] + "원권 : " + count[i] + "개");
		}
		
		System.out.println(Arrays.toString(count));	// 배열 값 출력 해주는거
	}
	
	public static void ex07() {	// 2차원 배열에 구구단결과 넣기
		
		int[][] arr = new int[8][9];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0;  j < arr[i].length; j++) {
				arr[i][j] = (i + 2) * (j + 1);
				System.out.print(String.format("%3d", arr[i][j]));
			}
			System.out.println();
		}
		
		
		// 다른 방법
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		// 향상 for문
		for(int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
	}
	
	public static void main(String[] args) {
		ex07();
	}
	
}
