package application;

import collections.Wrapper;
import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
		Wrapper<Cat> wrapper1 = new Wrapper<>();
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		Wrapper<Mammal> wrapper3 = new Wrapper<>();
		
		Cat cat = new Cat("마틸다");
		Creature cr = new Creature("크리쳐");
		Mammal mam = new Mammal("포유류");
		
		wrapper1.set(cat);
		wrapper2.set(cr);
		wrapper3.set(mam);
		
		Cat c1 = wrapper1.get();
		Creature c2 = wrapper2.get();
		Mammal m2 = wrapper3.get(); 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m2);
	}

}
