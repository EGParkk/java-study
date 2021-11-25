package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// &&, || 합쳐서 사용
		boolean isRaining = false; // 비가 오나?
		boolean mightRain = true; // 비가 올수도 있나?
		boolean haveUmberella = false; // 우산을 가지고 있나?
		
		// 1
		if((isRaining || mightRain) && haveUmberella) {
			System.out.println("우산을 쓴다!");
		}
		else {
			System.out.println("우산을 쓰지 않는다.");
		}
		
		// 2
		boolean rainCheck = isRaining || mightRain;
		
		if(rainCheck && haveUmberella) {
			System.out.println("우산을 쓴다!");
		}
		else {
			System.out.println("우산을 쓰지 않는다.");
		}
	}
	
}
