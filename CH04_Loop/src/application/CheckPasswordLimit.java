package application;

import java.util.Scanner;

public class CheckPasswordLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 "접속 승인" 출ㄺ하고 반복문을 빠져나옴
		// 패스워드가 3회 틀릴 시 "접속 거부"

		final String USER_PASSWORD = "hello";
		boolean accessOK = false; // 플래그(flag) : 불린변수로 상태에 따라 처리 흐름 제어
		String password = null;

		Scanner scanner = new Scanner(System.in);

//		do {
//			System.out.print("Enter password > ");
//			password = scanner.nextLine();
//
//			if (password.equals(USER_PASSWORD)) {
//				accessOK = true;
//				break;
//			} else {
//				System.out.printf("비번을 %d번틀렸습니다. \n", count+1);
//			}
//
//			count++;
//		} while (count != 3);
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter password > ");
			password = scanner.nextLine();

			if (password.equals(USER_PASSWORD)) {
				accessOK = true;
				break;
			} else {
				System.out.printf("비번을 %d번틀렸습니다. \n", i+1);
			}
		}

		scanner.close();

		if (!accessOK) {
			System.out.println("접속 거부");
		} else {
			System.out.println("접속 승인");
		}
	}

}
