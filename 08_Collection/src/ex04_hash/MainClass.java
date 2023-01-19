package ex04_hash;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {

		User user1 = new User("admin", "123456");
		User user2 = new User("admin", "123456");
		
		Set<User> set = new HashSet<User>();
		set.add(user1);
		set.add(user2);  //그대로 sysout(user2)하면 주소값 나온다 toString해줘야함
		
		System.out.println(set);
		
	}

}
