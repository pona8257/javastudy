package praatice04_Shape;

public class Square extends Rectangle{

	
	// 필드 필요 없다(Rectangle이 가지고 있음)
	
	// 생성자
	public Square(double width) {
		super(width, width);	// Rectangle은 높이, 너비 이니까 정사각형의 너비 하나만  
	}
	
}
