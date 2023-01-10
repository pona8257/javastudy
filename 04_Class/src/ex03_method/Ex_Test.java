package ex03_method;

public class Ex_Test {

	public static void t1() { 
		
		int serial = 5;
		
		if(serial % 2 == 0) {
			System.out.println("여자입니다");
		}
		else {
			System.out.println("남자입니다.");
		}
		
	}
	
	public static void t2() {
		
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.print(" " + i + "x" + j + " = " + i * j);
			}
			System.out.println();
		}
		
	}

	public static void t3() {
		
		int eventotal = 0;
		int oddtotal = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 ==0) {
				eventotal += i;
			}
			
			if(i % 2 == 1) {
				oddtotal += i;
			}
		}
		System.out.println("짝수의 합은 : " + eventotal);
		System.out.println("홀수의 합은 ; " + oddtotal);
		
		
	}
	
	public static void main(String[] args) {
		t3();
	}

}
