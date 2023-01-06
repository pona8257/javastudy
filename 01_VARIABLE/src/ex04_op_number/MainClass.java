package ex04_op_number;

public class MainClass {
    
	// ex01 메소드 정의
	public static void ex01(){
		
		int a = 5;
		int b = 2;
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b; // 나머지
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
	}
	
	
	// ex02 메소드 정의
	public static void ex02() {
		int a = 5;
		int b = 2;
		 
		double div = (double)a / b;
		System.out.println(div);
	}
	
	//ex03 메소드 정의
	public static void ex03() {
		int second = 90;
		int min = second / 60 ;
		int sec = second % 60 ;
		System.out.print(min + "분");
		System.out.println(" " + sec + "초");
	}
	
	// ex04 메소드 정의
	public static void ex04() {
		// 1 씩 증가 : ++
		// 1 씩 감소 : --
		
		//전위 연산(pre operator)
		// ++a 또는 --a
		// 변수 a의 값을 1 증가or감소 시킨 뒤 사용하시오.
		
		int a = 10;
		System.out.println(++a);
		
		// 후위 연산(host operator)
		// b++ or b--
		//변수 b의 값을 사용한 뒤에 1 증가or감소 하시오
		
		int b =10;
		System.out.println(b++);
		System.out.println(b); //출력한 뒤 1더함
		
	}
	
	// ex05 메소드 정의
	public static void ex05() {
		
		// 대입 연산
		// 등호(=)의 오른쪽 값을 왼쪽으로 보내는 연산
		
		int a;
		a = 10;
		
		// 10 = a; //10은 값을 저장할 수 있는 변수가 아니기 땜
		
		
				
	}
	
	//ex06 메소드 정의
	public static void ex06() {
		int x = 10;
		int y = 20;
		int temp; 
		temp = x; //temp에 x값을 저장해두고 바꾼다
		
		// 교환
		x = y;
		y = temp;
		
		System.out.println(x); //20
		System.out.println(y); //10
	}
	
	//ex07메소드 정의
	public static void ex07() {
		
		int account = 10000;
		account += 5000;      // account =  account + 5000;
		//account ++
		System.out.println(account);
		
		account -= 50000;
		System.out.println(account);
		
	}
	
	public static void ex08() {
		
		long account = 123456;
		double result; //더블 타입으로 결과 값을 받아야 소수점 나온다
		// 5% 이자 
		result = account * 1.05;        //account + account*0.05;   
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// 메인메소드 제외 나머지 메소드는 개발자가 만들고 호출 해야함
		// 메인메소드 안에 메소드 정의 안된다 따로따로 해야함
		
		//ex01(); // ex01 메소드 호출
		ex08();
	}
	
	

}
