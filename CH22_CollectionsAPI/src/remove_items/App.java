package remove_items;

import java.util.ArrayList;
import java.util.List;

class Cat {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}

public class App {

	public static void main(String[] args) {
		Cat c1 = new Cat("마틸다");
		
		List<Cat> cats = new ArrayList<>();
		cats.add(c1);
		cats.add(new Cat("라이언"));
		cats.add(new Cat("마이클"));
		cats.add(new Cat("제니"));
		
		cats.remove(1); // 인덱스 번호
		cats.remove(c1); // 객체 주소
		
		cats.forEach(System.out::println);
	}

}
