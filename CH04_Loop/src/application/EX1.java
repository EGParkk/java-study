package application;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int meun = 0;
		
		while(!(meun==3)) {
			System.out.print("옵션을 선택 > ");
			meun = scanner.nextInt();
			
			if(meun == 1) {
				System.out.println("'헬로우'");
			}
			else if(meun == 2) {
				System.out.println("'안녕 ?'");
			}
			else if(meun == 3) {
				System.out.println("프로그램 종료");
			}
			else if(meun == 10000) {
				System.out.println("이스터에그 발견!");
			}
			else {
				System.out.println("잘못된 옵션입니다.");
			}
		}
		scanner.close();
	}

}
