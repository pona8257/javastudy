package praatice04_Shape;

public class MainClass {

	public static void main(String[] args) {

		Shape circle = new Circle(1.5);	// 업 캐스팅 (자식을 부모에 저장)
		
		System.out.println("원의 면적 :" + circle.getArea());
		
		Shape rectangle = new Rectangle(1.5, 2.5); // 너비 1.5/ 높이 2.5인 사각형
		System.out.println("직사각형의 면적 : " + rectangle.getArea());
		
		Shape square = new Square(1.5); // 너비, 좊이가 1.5인 사각형
		System.out.println("정사각형의 면적 : " + square.getArea());
	}

}
