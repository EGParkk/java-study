package application;

import collections.pair;
import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App2 {

	public static void main(String[] args) {
		pair<Integer, Cat> pair = new pair<>(1, new Cat("마틸다"));
		
		System.out.println(pair);
		
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());
		
		pair<Creature, Mammal> pair2 = new pair<>(new Creature("생물"), new Mammal("포유류"));
		
		System.out.println(pair2);
	}

}
