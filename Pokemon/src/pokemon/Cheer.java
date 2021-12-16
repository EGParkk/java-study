package pokemon;

import java.util.Scanner;

public class Cheer extends Thread {
	int i = 0;

	public void run() {
		try {
			Scanner Scan = new Scanner(System.in);
			while (true) {
				Thread.sleep(6000);
				if (BattleLegend.Fire.BattleHp <= 0) {
					BattleLegend.Fire.BattleHp = 0;
					break;
				} else if (Choice.userPaili.BattleHp <= 0) {
					Choice.userPaili.BattleHp = 0;
					break;
				} else {
					System.out.println("====================================================");
					System.out.println("전설의 포켓몬에게 이길 수 있게 응원해보세요");
					System.out.println("배틀 중에 자신의 포켓몬을 응원하고 싶을 때 숫자'1234'를 입력해주세요!!! ");
					System.out.println("공격력 증가와 Hp 전체 회복이 됩니다.");
					System.out.println("=====================================================");
					System.out.println("");
					System.out.println("");
					int cheer = Scan.nextInt();	//스트링 받고싶을 때는 nextLine
					if (cheer == 1234) { 		//스트링받고 싶을 때 .equal() 사용 
						System.err.println("==================================");
						System.err.println("공격력 +10, 전체 HP회복 하셨습니다.");
						System.err.println("==================================");
						System.err.println("");
						Choice.userPaili.Fireattack += 10;
						Choice.userPaili.BattleHp = 60;
						continue;
					} else {
						System.err.println("========================================");
						System.err.println("잘못입력하셨습니다. 응원버프를 사용하지 못하였습니다.");
						System.err.println("=========================================");
						System.err.println("");
						continue;
					}
				}
			}
		} catch (Exception e) {
		}
	}
}