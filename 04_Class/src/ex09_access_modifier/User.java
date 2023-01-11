package ex09_access_modifier;

public class User {

	/*
	 	접근 제어 지시자(Access Modifier)
	 	1. private : 클래스 내부에서만 접근 가능      *
	 	2. default : 동일한 패키지에서만 접근 가능
	 	3. protected : 동일한 패키지 또는 상속 관계의 클래스 에서만 접근할 수 있다.
	 	4. public : 누구나 접근가능                   *
	 	1, 4번을 주로 이용
	 */
	
	/*
	 	정보 은닉(Information Hiding)
	 	1. 클래스의 내부 정보를 외부에 노출하지 않는 것을 말한다.
	 	2. 클래스의 내부 정보는 "필드"를 의미하므로  "필드"값을 외부에 공개하지 않는 것을 의미
	 	3. "필드"는 private 처리 한다.  중요!!!!!!!!!!!!
	 	4. "메소드"는 public 처리 한다. "필드"에 접근 하려면 "메소드"를 통해서 접근해야 한다.
	 */
	
	// 필드
	private String id;
	private String pw;
	
	// 메소드 (각각의 메소드가 뭘 하는지 공부 필수!!!!!!!!!!)
	public void setId(String id) {
		this.id = id; //이름이 같을 때 this. 하면 필드를 불러온다.
	}
	public String getId() {
		return id;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return pw;
	}
	
}
