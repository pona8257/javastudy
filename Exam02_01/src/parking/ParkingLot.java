package parking;

import java.util.Scanner;


public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	public ParkingLot(String name) {
		super();
		this.name = name;
		cars = new Car[10];	// 배열이 10인거 생성
		sc = new Scanner(System.in); 	// 키보드 입력받는 sc 객체생성
		
	}
	
	public void addCar() {
		
		System.out.println("현재 등록된 차량은 : " +idx + "대");
		if(cars.length == idx) {	// 만차일때						for문 안하는 이유는 여기서 10대까지 if문 해줘서
			System.out.println("더 이상 차량등록 불가");
			return;	// 메소드 종료
		}
		System.out.println("차량 번호 >>> ");
		String carNo = sc.next(); // 공백 없이 
		System.out.println("차량 모델 >>> ");
		String model = sc.next(); // 공백 없이 
		cars[idx++] = new Car(carNo, model);	// 생성자 호출  carNo,model 안같아도됨                     // Bean에 객체, 생성자 (디폴트일때 ) 나와 있다 모르면 거기가서 보기
		
		System.out.println("차량번호" + carNo + " 차량이 등록되었습니다.");
		
	}
	
	public void deleteCar() {
		System.out.println("차량번호 입력 >>>> ");
		String carNo = sc.next();
		if(idx == 0) {
			
		}
		for(int i = 0; i < cars.length; i++) {
			if(cars[i].getCarNo().equals(carNo)) {
				
			}
		}
		
		
		
	}
	
	public void printAllcars() {
		
		
		
	}
	
	public void manage() {	// 얘만 불러주면되
		
		while(true) {
			System.out.print("1.추가 2.삭제 3.전체 0.종료 >>>>");
			//int choice = sc.nextInt();	// 정수입력 받기
			String choice = sc.next();	// 문자 받기
			
			switch(choice) {
			case "1": 
				addCar();	// addCar 호출
				break;
			case "2":
				deleteCar();
				break;
			case "3":
				printAllcars();
				break;
			case "0":
				return;	// manage 메소드 종료         // break는 빠져나가도 while만 빠져나가서 안된다.
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}
	}
 
}
