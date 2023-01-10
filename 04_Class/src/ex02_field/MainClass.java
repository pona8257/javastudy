package ex02_field;

public class MainClass { // 어렵다 공부 해야된다.......

	public static void main(String[] args) {

		School school = new School();
		
		school.name = "철산초";
		school.students = new Student[3];  // 학생 3명 저장 가능
		
		for(int i = 0; i < school.students.length; i++) {
			
			// Student객체 생성
			school.students[i] = new Student();
			
			school.students[i].name = "정숙";   // 학생 한명한명 지정
			school.students[i].stuNo = "10101";  
			
			// score 객체 생성
			school.students[i].score = new Score();  // Student클래스 안에 Score클래스를 지정해서 여기서 score 쓰고 싶으면 생성해줘야 한다. 
			
			school.students[i].score.eng = 100;  
			school.students[i].score.kor = 90;  
			school.students[i].score.math = 40;  
		
			System.out.println("학번 : " + school.students[i].stuNo);
			System.out.println("이름 : " + school.students[i].name);
			System.out.println("국어 점수 : " + school.students[i].score.kor);
			System.out.println("영어 점수 : " + school.students[i].score.eng);
			System.out.println("수학 점수 : " + school.students[i].score.math);
			
		}
		/*
		System.out.println("학번 : " + students[i].stuNo);
		System.out.println("이름 : " + students[i].name);
		System.out.println("국어 점수 : " + student1.score.kor);
		System.out.println("영어 점수 : " + student1.score.eng);
		System.out.println("수학 점수 : " + student1.score.math);
		*/
		
		
	}

}
