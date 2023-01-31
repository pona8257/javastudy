package ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class MainClass {

	public static void ex01() {
		
		List<String> list1 = new ArrayList<>();		// <> 안에 리스트안에 저장하고 싶은인수 (1.7이후로 생성자는 탕비 명시를 생략할 수 있다
		List<Integer> list2 = new ArrayList<>();	// int 는 안되고 Integer로 해야함
		List<Car> list3 = new ArrayList<>(); 
		
		
		list3.add(new Car("벤츠", 100));
		list3.add(new Car("BMW", 200));
		
		// add 메소드는 마지막 요소로 추가한다(순서대로 들어간다)
		list1.add("봄") ; 	// 한번에 하나씩 add 
		list1.add("여름");	
		list1.add("가을");	

		list2.add(10);
		list2.add(20);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
	}

	public static void ex02() {
		
		List<String> list1 = Arrays.asList("봄", "여름", "가을", "겨울"); 	// 초기화 사용
		List<Integer> list2 = Arrays.asList(10, 20, 30, 40);
		List<Car> list3 = Arrays.asList(new Car("벤츠", 100), new Car("BMW", 200));
		
		//list1.add("초가을"); 초기화는 데이터 추가 ,수정 ,삭제 불가
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}
	
	public static void ex03() {
		
		List<String> list = Arrays.asList("봄", "여름", "가을", "겨울");
		
		System.out.println(list.get(0));	
		System.out.println(list.size());	// 크기
		
		
		for(int i = 0, length = list.size(); i < length; i++){	// 코드 효율 높히기
			System.out.println(list.get(i));
		}
		
		for(String str : list) {
			System.out.println(str);
		}
		
		
		
		List<Car> list3 = Arrays.asList(new Car("벤츠", 100), new Car("BMW", 200));
		
		for(int i = 0, length = list3.size(); i < length; i++) {
			System.out.println(list3.get(i));
		}
		
		for(Car car : list3) {
			System.out.println(car);
		}
	}
	
	public static void ex04() {	// map은 객체로 가능
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		
		// 추가 
		map.put(1, new Car("벤츠", 100));
		map.put(2, new Car("BMW", 200));
		
		// Value 확인
		System.out.println(map.get(1));	// key가 1인 value값
		System.out.println(map.get(2));
		
	}
	
	public static void ex05() {
		
		Map<Integer, Car> map = new HashMap<Integer, Car>();
		
		map.put(1, new Car("벤츠", 100));	// 엔트리가 등록(키 : 1 , 벨류 : new Car("벤츠", 100))   !!!! 엔트리 = key + value
		map.put(2, new Car("BMW", 200));
		
		for(Entry<Integer, Car> entry : map.entrySet()) {	// .entrySet = 엔트리 단위로 (앞에 엔트리는 저장된 데이터의 타입)
			System.out.println("Key는" + entry.getKey() + "이고 Value는 " + entry.getValue());	// Car에 model, price를 geter seter했으면 entry.getmodel() / entry.getprice()
		}                                                                                       //   가격과 모델 출력 가능
		
		for(Integer key : map.keySet()) { // 키가 Integer타입 이니까 앞에 Integer
			System.out.println("Key는" + key + "이고 Value는 " + map.get(key));
		}
		
	}
	
	public static void ex06() {
		
		// map 생성, 추가
		Map<Integer, Car> home1 = new HashMap<Integer, Car>();
		home1.put(1,new Car("벤츠", 100));
		home1.put(2,new Car("BMW", 200));
		
		Map<Integer, Car> home2 = new HashMap<Integer, Car>();
		home2.put(1,new Car("아반떼", 300));
		home2.put(2,new Car("소나타", 400));
		
		// 리스트 생성, 추가
		List<Map<Integer, Car>> list = new ArrayList<>();
		list.add(home1);
		list.add(home2);
		
		Map<Integer, Car> map1 = list.get(0);
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		Map<Integer, Car> map2 = list.get(1);
		System.out.println(map2.get(1));
		System.out.println(map2.get(2));
		
		System.out.println(map1);
		System.out.println(map2);
		
		for(Map<Integer, Car> map : list) {	// 뒤에있는걸 앞에다 넣어준다
			for(Integer key : map.keySet()) {
				System.out.println(map.get(key));
			}
		}
		
		
	}
	
	public static void ex07() {
		
		Map<String, Object> product1 = new HashMap<String, Object>();
		product1.put("model", "세탁기");
		product1.put("maker", "삼성");
		product1.put("price", 100);
		
		Map<String, Object> product2 = new HashMap<String, Object>();
		product2.put("model", "냉장고");
		product2.put("maker", "LG");
		product2.put("price", 200);

		Map<String, Object> product3 = new HashMap<String, Object>();
		product3.put("model", "TV");
		product3.put("maker", "삼성");
		product3.put("price", 300);
		
		List<Map<String, Object>> products = Arrays.asList(product1, product2, product3);
		
		for(Map<String, Object> product : products) {
			System.out.println("모델 : " + product.get("model"));
			System.out.println("제조사 : " + product.get("maker"));
			System.out.println("가격 : " + product.get("price"));
		}
		
	}
	
	public static void ex08() {
		
		FileWriter fw = null;
		FileReader fr = null;
		
		try {
			
			fw = new FileWriter("sample.txt");
			fr = new FileReader("sample.txt");
			fw.close();
			fr.close();
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void ex09() throws FileNotFoundException, IOException{	// throws 하면 호출 하는 곳에서 try-catch 해야한다
		
		FileWriter fw = new FileWriter("sample.txt");
		FileReader fr = new FileReader("sample.txt");
		
		BufferedReader br = null;
		if(br == null) {
			throw new RuntimeException();
		}
		
		fw.close();
		fr.close();
		
	}
	
	public static void ex10() {		// try - catch는 오류 나면 잡아야 되서 있어야 한다
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample.txt");
			fw.write(1);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {	// 언제나 무조건 실행 한다.
			try {
				fw.close();	// close는 예외든 아니든 실행 해야 되기때문에  finally에 넣었지만 IOException이 필요해 한번더 아래에 넣어준다
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		ex10();
		/*
		try {
			ex09();
		}catch(FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			System.out.println("파일을 생성할 수 없음");
		} catch (RuntimeException e) {
			System.out.println("런타임 익셉션 발생");
		}*/
	}

}
