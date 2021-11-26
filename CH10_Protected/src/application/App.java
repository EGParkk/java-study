package application;

import enitites.*;

public class App {

	public static void main(String[] args) {
		// 프로텍트(protected) 접근 지정자 사용 시 다른 패키즈에서 사용할 수 없고, 상속 받은 자식클래스에서 사용가능
		Fruit f1 = new Apple();
		// f1.id = 7;
		System.out.println(f1.toString());
		
		Fruit f2 = new Banana();
		System.out.println(f2.toString());
	}

}
