package ex03_method;

public class CoffeMachine { // 어렵다 복습..
	
	// 필드 값
	int moneyPot;
	String[] menu = {"아메리카노", "카페라떼", "마키아또"};
	int[] prices = {900, 1500, 2000};
	
	// 메소드
	CoffeeAndChange buyCoffe(int money, int choice) {
		
		// 돈이 모자르면 그대로 다시 돌려주기
		int price = prices[choice - 1];
		
		if(money < price) {
			System.out.println("돈이 부족합니다");
			CoffeeAndChange cnc = new CoffeeAndChange();
			cnc.change = money;
			return cnc; // 끝낸다는 의미????
		}
		
		String coffee = menu[choice - 1];
		
		moneyPot += price;
		
		CoffeeAndChange cnc = new CoffeeAndChange();
		cnc.coffee = coffee;
		//커피,체인지에 커피이름에 저장
		cnc.change = money - price;
		//커피,체인지에 잔돈에 저장
		return cnc;
		
	}
	
}
