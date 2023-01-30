package ex04_OutputStream;

import java.io.Serializable;

/*
 	ObjectOutputStream/ObjectInputStream을 통해서
 	객체 입출력을 수행하려면 '반드시' 직렬화 처리를 해야 한다.
 */
/*
 	직렬화 처리 방법
 	1. java.io.Serializable 인터페이스를 구현(implements)한다. (필수)
 	2. serialVersionUID 필드 값을 정의한다. (선택)
 */

public class Person implements Serializable{

	private static final long serialVersionUID = -5029711212556522265L;	// 선택
	private String name;
	private int age;
	private double height;
	private boolean isalive;
	
	public Person() {
		
	}

	public Person(String name, int age, double height, boolean isalive) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.isalive = isalive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isIsalive() {
		return isalive;
	}

	public void setIsalive(boolean isalive) {
		this.isalive = isalive;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", isalive=" + isalive + "]";
	}
	
	
	
}
