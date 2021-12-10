package javaAPI;

import java.util.ArrayList;

class Store {
	private ArrayList<Menu> list;

	public Store() {
		this.list = new ArrayList<>();
	}

	public void add(Menu menu) {
		list.add(menu);
	}

	public int totalSales() {
		int totalsale = 0;

		for (Menu m : list) {
			totalsale += m.getPrice() * m.getCount();
		}

		return totalsale;
	}
}

class Menu {
	private String name;
	private int price;
	private int count;

	public Menu(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public int getCount() {
		return count;
	}
}

public class Totalsales {

	public static void main(String[] args) {
		Menu m1 = new Menu("김밥", 2000, 57);
		Menu m2 = new Menu("돈까스", 6000, 29);
		Menu m3 = new Menu("냉면", 5000, 34);
		
		Store mys = new Store();
		mys.add(m1);
		mys.add(m2);
		mys.add(m3);
		
		System.out.printf("총 매출 : %d원", mys.totalSales());
	}

}
