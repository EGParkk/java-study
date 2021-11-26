package casting;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1 = new HouseCat(); // 객체는 하우스캣
		cat1.vocal();
		cat1.hunt();
		// cat1.call(); cat1은 Cat 타입이기 때문에 Cat 클래스에 없는 메소드 사용불가, 오버라이딩은 됨
		
		// 다운 캐스팅
		HouseCat cat2 = (HouseCat)cat1;
		cat2.call();
	}

}
