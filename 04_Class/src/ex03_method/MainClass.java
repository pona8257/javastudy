package ex03_method;

public class MainClass {
	
	public static void ex01() {
		
		// Caculator 객체 선언 + 생성
				Calculator calc = new Calculator();
				
				double add = calc.addtion(1.5, 2.5);  // addition 메소드 호출
				System.out.println(add);
				
				double sub = calc.subtraction(2.5, 1.3);  // subtraction 메소드 호출
				System.out.println(sub);
		
	}
	
	public static void ex02() {
		
		CoffeMachine coffeMachine = new CoffeMachine();
		
		CoffeeAndChange coffeeAndChange = coffeMachine.buyCoffe(1200, 2);
		System.out.println(coffeeAndChange.coffee);
		System.out.println("잔돈 : " + coffeeAndChange.change);
		
		System.out.println("돈통 : " + coffeMachine.moneyPot);
		
	}

	public static void ex03() { //자동차 시뮬
		
		Car car = new Car();
		
		car.addOil(100);
		
		for (int n = 0; n < 51; n++) {
			car.pushAccel();
		}
		
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
		for(int n = 0; n < 11; n++) {
			car.pushBreak();
		}
		
		System.out.println(car.oilPot);
		System.out.println(car.carSpeed);
		
	}
	
	public static void main(String[] args) {
		ex03();
		
	}

}
