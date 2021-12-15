package example;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(6);
		numbers.add(4);
		numbers.add(7);
		numbers.add(3);
		numbers.add(6);
		numbers.add(3);
		
		numbers.removeIf(App3::filter);
		numbers.replaceAll(App3::map);
		
		numbers.forEach(System.out::println);
	}
	
	private static boolean filter(int n) {
		return n < 5;
	}
	
	private static int map(int n) {
		return n * 2;
	}
}
