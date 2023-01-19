package ex04_throws;

public class MainClass {

	public static void main(String[] args) {

		Gun gun = new Gun();
		
		try {
			gun.reload(10);	// reload메소드 호출
			for(int n = 0; n < 11; n++) {	// 11번 쏨
				gun.shoot();
			}
		} catch(Exception e) {	//  throws runtimeexceptuon 쓰면 
			System.out.println(e.getMessage());
		}
		
		/*
		   원래는 메소드 하나하나에 try - catch를 달아야 하는데
		   
		   throws runtimeExceptuon 쓰면 하나의 catch에 여러 메소드의 
		   예외를 처리할 수 있다  
		   
		 */
		
		
		
		
	}

}
