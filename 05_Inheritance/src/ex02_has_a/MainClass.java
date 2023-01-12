package ex02_has_a;

public class MainClass {

	public static void main(String[] args) {
		Soldier soldier = new Soldier();	// soldier는 비었지만 gun을 상속을 받아서 재장전, 슛 가능 
		soldier.reload(00);
		soldier.shoot();
		
		
	}

}
