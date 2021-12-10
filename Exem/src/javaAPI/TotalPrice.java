package javaAPI;

import java.util.ArrayList;

class Cart{
	private ArrayList<Item> list;
	
	public Cart() {
		this.list = new ArrayList<>();
	}
	
	public void add(Item item) {
		list.add(item);
	}
	
	public int totalPrice() {
		int sum = 0;
		
		for(Item l : list) {
			sum += l.getPrice();
		}
		
		return sum;
	}
}

class Item{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class TotalPrice {

	public static void main(String[] args) {
		Item i1 = new Item("스트라이프 셔츠", 49900);
		Item i2 = new Item("슬림 면바지", 58900);
		Item i3 = new Item("스니커즈", 46900);
		
		Cart c1 = new Cart();
		
		c1.add(i1);
		c1.add(i2);
		c1.add(i3);
		
		System.out.printf("총합 : %d원", c1.totalPrice());
	}

}
