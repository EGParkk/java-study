package polymorphism;

public class App {

	public static void main(String[] args) {
		// 다향성 : 자식 클래스 타입을 부모 타입으로 형 변환
//		Cat cat1 = new Cat();
//		Cat cat2 = new HouseCat();
//		Cat cat3 = new RoadCat();
//		
//		Cat[] cats = {cat1, cat2, cat3};
//		
//		for (Cat c : cats) { // cats 벼열의 각각의 객체를 c에 대입하여 반복
//			c.vocal();
//			c.hunt();
//		}
		
		Cat[] cats = {new HouseCat(), new RoadCat(), new Tiger()};
		// cats[0] == new HouseCat();
		// cats[1] == new RoadCat();
		// cats[2] == new Tiger();
		
		// String[] s = {new String("문자열1"), new String("문자열2"), new String("문자열3")};
		
		// for 반복문		
		for(int i = 0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		// for ~ each 반복문
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		// 캐스팅 형변환 (기본 데이터 타입)
		int a = (int)1.2345;
		System.out.println(a);
		
		// 참조형 타입 (상속 관계일때)
		Cat cat1 = new HouseCat(); // 업캐스팅
		HouseCat cat2 = (HouseCat)cat1; // 다운캐스팅
	}

}
