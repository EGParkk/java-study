package application;

public class Printf {

	public static void main(String[] args) {
		// printf 출력
		int age = 25;
		String addr = "부산진구";
		double pi = 3.141592;
		
		System.out.printf("내 나이는 %d살 입니다.\n", age); //printf도 줄뛰움이 없음
		System.out.printf("내 나이는 %d살 이고, %s에 살고 있습니다.\n", age, addr);
		System.out.printf("파이의 값은 : %.2f\n", pi);
	}

}
