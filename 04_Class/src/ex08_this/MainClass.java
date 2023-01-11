package ex08_this;

public class MainClass {

	public static void main(String[] args) {
		// USer 객체 생성
		User user = new User("admin","123456");
		
		// user에 저장된 값은 생성된 user 객체의 참조값이다. (user밖에서 부를때)
		System.out.println(user); 
		
		// user 객체의 this값 확인   (user 내부에서 부를때)
		user.printThis();
		
		// user 객체의 필드값 확인
		user.info();
	}

}
