package ex03_constructor;

public class Alba extends Student{ //school과 company를 출력해야 되기때문에 둘다 가지고 있는 Stu 

	public Alba() {
		super();
	}
	
	// 필드
	private String company;
	
	// 생성자
	public Alba(String name, String school, String company) {
		super(name, school);
		this.company = company;
	}
	
	// 메소드
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}


	
}
