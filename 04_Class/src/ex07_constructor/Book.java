package ex07_constructor;

public class Book {

	// 필드
	String title;
	String author;
	int price;
	
	// 생성자
	Book(String bTitle){
		title = bTitle;
		author = "미상";
		price = 0;
	}
	
	Book(String bTitle, String bAuthor) {
		title = bTitle;
		author = bAuthor;
		price = 0;
	}
	
	Book(String bTitle, String bAuthor, int bPrice) {
		title = bTitle;
		author = bAuthor;
		price = bPrice;
	}
	
	//메소드
	void info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + price);
	}
	
}
