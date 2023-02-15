package ex02_runnable;

// Soldier를 스레드 처리하는 이유
// new Soldier()를 이용해서 객체를 생성할 때마다 해당 객체는 독립적으로 동작한다

/*
 	Runnable 인터페이스를 상속하는 방법
	1. implements Runnable 처리한다
	2. Runnable 인터페이스의 public void run() 추상메소드를 오버라이드 한다.
	3. Runnable 객체를 만들고, Runnable 객체를 이용해서 Thread 객체를 만든다. 
	4. Thread 객체가 가진 run 메소드는 start 메소드로 호출한다.
*/
public class Soldier implements Runnable{

	private String name;
	private Gun gun;
	
	public Soldier(String name, Gun gun) {	//new Soldier("김상사", new gun(10));
		this.gun = gun;
		this.name = name;
	}
	
	public void shoot() {
		System.out.print("[" + name + "] ");	// [김상사] 빵! 9발 남았다
		gun.shoot();
	}

	@Override
	public void run() {

		// 1초에 1발씩 쏘기
		// 1초동안 일시중지 시키기 ; Thread.sleep(1000);  1000밀리초(1초) 일시중지 -> 반드시 예되처리 필요
		
		try {
			
			while(gun.getBullet() != 0) {
				shoot();
				Thread.sleep(1000);
			}
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
