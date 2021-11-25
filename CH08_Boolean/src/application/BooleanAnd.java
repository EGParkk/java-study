package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// A && B => A, B 모두 참일때만 참
		boolean isRaining = true; // 비가 오나?
		boolean haveUmberella = true; // 우산을 가지고 있나?
		
		boolean takeUmberella = false; // 우산을 쓰나?
		
		// 1
		if(isRaining) {
			if(haveUmberella) {
				takeUmberella = true;
			}
		}
		System.out.println("첫번째 : " + takeUmberella);
		
		// 2
		if(isRaining && haveUmberella) {
			takeUmberella = true;
		}
		System.out.println("두번째 : " + takeUmberella);
		
		takeUmberella = isRaining && haveUmberella ? true : false;
		System.out.println("세번째 : " + takeUmberella);		
	}

}
