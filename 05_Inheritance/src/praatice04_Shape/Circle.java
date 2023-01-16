package praatice04_Shape;

public class Circle implements Shape {

	// 필드
	private double radious;
	
	// 생성자
	public Circle(double radious) {
		super();
		this.radious = radious;
	}
	
	
	@Override
	public double getArea() {
		return PI * radious * radious;
	}

	


}
