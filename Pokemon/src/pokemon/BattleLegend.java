package pokemon;

import java.util.Scanner;

public class BattleLegend extends Thread {
	private String name;
	static Fire Fire = new Fire("불", "파이어", 15, 40, 40);
	static Scanner Scan = new Scanner(System.in);
	boolean check = true;

	public BattleLegend(String name) {
		this.name = name;
	}

	public void run() {
		try {
			while (true) {
				Thread.sleep(7000);
				if (Choice.userPaili.BattleHp <= 0) {
					Choice.userPaili.BattleHp = 0;
					System.out.println("==========================================");
					System.out.println(PokemonMain.userName + "의 포켓몬이 죽었습니다.");
					System.out.println("파이어가 달아났습니다.");
					System.out.println("==========================================");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("====================================================");
					System.out.println("\r\n" + " _____  _                  _____             _ \r\n"
							+ "|_   _|| |                |  ___|           | |\r\n"
							+ "  | |  | |__    ___       | |__   _ __    __| |\r\n"
							+ "  | |  | '_ \\  / _ \\      |  __| | '_ \\  / _` |\r\n"
							+ "  | |  | | | ||  __/      | |___ | | | || (_| |\r\n"
							+ "  \\_/  |_| |_| \\___|      \\____/ |_| |_| \\__,_|\r\n"
							+ "                                               \r\n"
							+ "                                               \r\n" + "");

					System.out.println("====================================================");
					System.out.println("");
					break;
				} else if (BattleLegend.Fire.BattleHp <= 0) {
					System.out.println("");
					break;
				} else {
					if (check) {
						if (BattleLegend.Fire.BattleHp <= 30) {
							BattleLegend.Fire.fireskill();
							System.out.println("");
							check = false;
						}
					}
					System.out.println("==========================================");
					System.out.println(BattleLegend.Fire.Name + "가 공격을 하였습니다.");
					System.out.println("파이어  화염방사!!!");
					System.out.println("==========================================");
					System.out.println("");
					Choice.userPaili.BattleHp -= BattleLegend.Fire.Firelegend;
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<야생 포켓몬>-----");
					System.out.println("이름: " + BattleLegend.Fire.Name);
					System.out.println("레벨: " + BattleLegend.Fire.Level);
					System.out.println("Hp: " + BattleLegend.Fire.BattleHp + "/" + BattleLegend.Fire.Hp);
					System.out.println("-------------------");
					System.out.println("");
					System.out.println(
							"---------------------------------------------------------------------------------");
					System.out.println("");
					System.out.println("                   -----<사용자 포켓몬>-----");
					System.out.println("                                                 이름: " + Choice.userPaili.Name);
					System.out
							.println("                                                 레벨: " + Choice.userPaili.Level);
					System.out.println(
							"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
					System.out
							.println("                                                    EXP:" + Choice.userPaili.Exp);
					System.out.println(
							"--------------------------------------------------------------------------------");

				}

			}
		} catch (Exception e) {
		}
	}

}
