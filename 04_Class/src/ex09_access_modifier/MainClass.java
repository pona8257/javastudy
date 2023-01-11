package ex09_access_modifier;

public class MainClass {

	public static void main(String[] args) {
		//User 객체 생성하기
		User user = new User();
		
		// user 객체에 id 전달하기
		user.setId("admin");
		
		// user 객체에 id 확인하기
		System.out.println(user.getId());
		
		// user 객체에 pw 전달하기
		user.setPw("1234");
		
		// user 객체에 pw 확인하기
		System.out.println(user.getPw());

	}

}
