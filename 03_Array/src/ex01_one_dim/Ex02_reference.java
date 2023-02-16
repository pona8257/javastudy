package ex01_one_dim;

public class Ex02_reference {  // 공부 요함

	public static void ex01() {
		
		int[] arr;
		
		arr = new int[5];
		
	}
	
	public static void ex02() {
		
		int[] a = new int[5];
		int[] b;
		
		b = a; // b가 길이가 5인 배열이 되었다.
		
		for(int i = 0; i <b.length; i++) {
			System.out.println(b[0]);
		}
		
		System.out.println(b[0]);
	
		/*
        |-------|
      a | 0x123 |─────┐
        |-------|          │
        |  ...  |          │
        |-------|          │
   a[0] |   0   | 0x123    │
        |-------|          │
   a[1] |   0   |          │
        |-------|          │
   a[2] |   0   |          │ b = a;   (a와 b가 같아짐)
        |-------|          │
   a[3] |   0   |          │
        |-------|          │
   a[4] |   0   |          │
        |-------|          │
        |  ...  |          │
        |-------|          │
      b | 0x123 |◀────┘
        |-------|
	*/
		
	}
	
	public static void ex03() { // 심화
		
		// 생성된 배열의 크기를 늘이는 방법
		
		// 기존 배열
		int[] a = new int[5];
		
		// 신규 배열 
		int[] b = new int[10];
		
		// 기존 배열 요소 -> 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		// 기존 배열의 참조값을 신규 배열의 참조값으로 수정
		a = b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인 (a가 10개로 늘어남)
		for(int i = 0; i < a.length; i++) {
			System.out.println(b[i]);
		}
	}
	
	public static void main(String[] args) {
		
	//	int[] arr; // arr, arr[0], ..... 해서 변수가 5개x 6개o 생긴다
		
		//arr = new int[5];
		
	//	System.out.println(arr);  // 5개 배열 요소의 참조(주소, 번지) 값
		ex03();
		
	}

}
