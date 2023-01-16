package ex06_downcasting;

public class MainClass {

	public static void ex01() {
		
		// Upcasting
		Person person = new Student();	// 자식을 부모타입에 저장
		
		// downcastng
		Student student = (Student)person;
		
		
		student.eat();
		student.sleep();
		student.study();
	}
	
	public static void ex02() {
		
		// Person
		Person person = new Person();	
		
		// 잘못된 캐스팅
		Student student = (Student)person;
		
		// 잘못된 캐스팅은 컴파일 오류로 걸러지지 않는다. 
		student.eat();
		student.sleep();
		student.study();	// 오류 발생 부분
	}

	public static void ex03() {
		
		// Person
		Person person =  new Person();	// Student() 이면 해준다
		
		// Student 객체(인스턴스, instance)가 맞다면 Student 타입으로 캐스팅하자
		if(person instanceof Student) {
			
			Student student = (Student)person;	// 1
			student.eat();
			student.sleep();
			student.study();
			
			person.eat();	            // 1                         // 위와 동일하다.
			person.sleep();		        // 2
			((Student)person).study();	// 3
			// 1,2 같은 곳   3 다른 곳 
						
		}
		
	}
	
	public static void main(String[] args) {
		ex03();
	}

}
