package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;	//차가 들어왔을 때 저장될 자리
	private Scanner sc;  
	
	public ParkingLot(String name) {
		super();
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		
		System.out.println("현재 등록된 차량 "+ idx + "대");
		
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능 합니다.");
			return;
		}
		System.out.println("차량번호 입력 >>>> ");
		String carNo = sc.next();
		System.out.println("차량 모델명 입력 >>>");
		String model = sc.next();
		cars[idx++] = new Car(carNo, model);
		System.out.println("차량번호 " + carNo + " 차량이 등록되었습니다.");
		
	}
	
	public void deleteCar() {

		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다");
			return;
		}
		System.out.println("제거할 차량번호를 입력 하세요 >>>>");
		String carNo = sc.next();
		
		for(int i = 0; i < idx; i++) {
		if(cars[i].getCarNo().equals(carNo)) {	// Car car = cars[i]; 쓰고 cars[i].getCarNo() 대신 car을 써도된다
			// 방법 1. 삭제할 요소의 뒤에 있는 것들을 모두 한 칸씩 앞으로 옮기기
			System.arraycopy(cars, i + 1, cars, i, idx -i -1);
			cars[--idx] = null;
			System.out.println("차량번호" + carNo + "인 차량이 삭제되었습니다");
			
			/* 방법2. 마지막 차량을 옯겨오기  
			 * 마지막 차량을 옯겨오기 
			 제가할 차량의 위치 : i
			 마지막 차량의 위치 : idx - 1 
			cars[i] = cars[--idx];	 제거할 차량 위치에 마지막 차량 덮어쓴다
			cars[--idx] = null;	 마지막 차량 자리를 비워준다
			return; */
			
			
			
		   }
		// else 넣고 하면 비교할때 마다 문구가 뜨기 때문에 for문이 끝나면 같은 번호가 없다는 뜻이니까 for문 밖에 써준다 ex) 3대가 들어가면 3번 출력된다
    	}
		System.out.println("대상 차량이 존재하지 않습니다");
	}
	
	public void printAllCars() {
		
		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}else {
			for(int i =0; i < idx; i++) {	// cars[idx].length는 끝까지 해야 되서 null값이 나와 오류가 뜬다 !!!!!!쓰려면 안에  if(cars[i] != null)
				System.out.println("차량번호 : " + cars[i].getCarNo() + " 모델명 : " + cars[i].getModel());
			}
		}	
	}
	
	public void manage() {
		
		
		while(true) {
			System.out.println("1.추가 2.삭제 3.전체 0.종료 >>>>");
			String choice = sc.next();
		
		switch(choice) {
		case "1": 
			addCar();
			break;
		case "2":
			deleteCar();
			break;
		case "3":
			printAllCars();
			break;
		case "0":
			return;
		default:
			System.out.println("존재하지 않는 메뉴입니다");
		
		}
	 }
	}
	
	
}
