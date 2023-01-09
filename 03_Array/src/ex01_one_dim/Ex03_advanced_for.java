package ex01_one_dim;

public class Ex03_advanced_for { // 향상된 for문

	public static void ex01() {   // 안보고 다시 풀어보기 
		
		int[] scores = {50, 90, 60, 100, 80};
		
		int total = 0;
		int max = 0;
		int min = 100;
		
		for(int n : scores) { // scores에 있는 값을 n에 순차적으로 넣어준다는 뜻
			total += n;
			if(max < n) {
				max = n;
			}
			if(min > n) { //?
				min = n;
			}
		}
		
		System.out.println(total);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void ex02() {
		
		String[] files = {"hello.txt", "hi.txt", "안녕.txt"};
		
		for(String file : files) {
			System.out.println(file);
		}
		
	}
	
	
	public static void main(String[] args) {
		ex02();
		
	}

}
