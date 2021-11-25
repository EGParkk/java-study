package application;

public class BooleanOr {

	public static void main(String[] args) {
		// A || B => 둘중에 하나라도 참이면 참
		boolean isRaining = false; // 비가 오나?
		boolean mightRain = true; // 비가 올수도 있나?
		boolean takeUmberella = false; // 우산을 가져가나?
		
		takeUmberella = isRaining || mightRain;
		
		System.out.println(takeUmberella);
	}

}
