package ex09_access_modifier;

public class User {

	/*
	 	Getter와 Setter
	 	1. Getter
	 		1) 필드값을 외부로 반출하는 메소드
	 		2) get + 필드 이름을 가지는게 이를 수정하면 안 된다.
	 		
	 	2. Setter
	 		1) 외부로부터 필드값을 받아오는 메소드
	 		2) set + 필드 이름을 가지는데 이를 수정하면 안 된다.
	 */
	
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
	private boolean isvip;
	
	// 메소드 (각각의 메소드가 뭘 하는지 공부 필수!!!!!!!!!!)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public boolean isIsvip() {
		return isvip;
	}
	public void setIsvip(boolean isvip) {
		this.isvip = isvip;
	}
	
	
}
