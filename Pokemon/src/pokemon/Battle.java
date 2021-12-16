package pokemon;

import java.util.Scanner;

public class Battle {
	Scanner scan = new Scanner(System.in);
	Longston GraygymLongston = new Longston("암석", "롱스톤", 8, 40, 40);
	Longston WildLongston = new Longston("암석", "롱스톤", 5, 20, 20);
	Aqustar BluegymAqustar = new Aqustar("물", "아쿠스타", 8, 40, 40);
	Aqustar WildAqustar = new Aqustar("물", "아쿠스타", 5, 20, 20);
	Ketupi WildKetupi = new Ketupi("풀", "캐터피", 3, 15, 15);
	
	
	public void GrayGym() {
		while (true) {
			System.out.println("[1번] 공격한다            [2번] 상처약 사용            [3번] 도망가다 ");
			System.out.print("번호 입력 :");
			int GraybattleFunction = scan.nextInt();
			if (GraybattleFunction == 1) {
				if (GraygymLongston.BattleHp <= 0) {
					GraygymLongston.BattleHp = 0;
					System.out.println(GraygymLongston.Name + "는(은) 죽었습니다.\n");
					System.out.println("경험치가 100올랐습니다.");
					Choice.userPaili.Exp += 100;
					Choice.userPaili.Exp();
					System.out.println("체육관 관장에게 이겼습니다.");
					System.out.println("체육관 관장 웅이에게 체육관 뱃지와 2000원을 받았습니다.");
					System.out.println("");
					User.userMoney += 2000;
					User.grayBbagi += 1;
					break;
				} else {
					System.out.println("사용자가 선공을 하였습니다.");
					System.out.println("파이리 불 뿜기!!!");
					System.out.println("");
					GraygymLongston.BattleHp -= Choice.userPaili.Fireattack;
					if (GraygymLongston.BattleHp <= 0) {
						GraygymLongston.BattleHp = 0;
					}
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<웅이 포켓몬>-----");
					System.out.println("이름: " + GraygymLongston.Name);
					System.out.println("레벨: " + GraygymLongston.Level);
					System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
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
							"---------------------------------------------------------------------------------");
					if (GraygymLongston.BattleHp<=0) {
						GraygymLongston.BattleHp = 0;
						System.out.println("--------------------------------------------------");
						System.out.println(GraygymLongston.Name + "는(은) 죽었습니다.\n");
						System.out.println("경험치가 100올랐습니다.");
						Choice.userPaili.Exp += 100;
						Choice.userPaili.Exp();
						System.out.println("체육관 관장에게 이겼습니다.");
						System.out.println("체육관 관장 웅이에게 체육관 뱃지와 2000원을 받았습니다.");
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						User.userMoney += 2000;
						User.grayBbagi += 1;
						break;
					}
					System.out.println("롱스톤이 반격을 하였습니다.");
					System.out.println("롱스톤 돌던지기!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= GraygymLongston.RockAttack;
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<웅이 포켓몬>-----");
					System.out.println("이름: " + GraygymLongston.Name);
					System.out.println("레벨: " + GraygymLongston.Level);
					System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
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
					System.out.println("                                            EXP:" + Choice.userPaili.Exp);
					System.out.println(
							"--------------------------------------------------------------------------------");
				}
			}
			if (GraybattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("상처약을 사용할 수 없습니다.");
						System.out.println("소유하고 있던 상처약을 모두 사용하셨습니다");
						System.out.println("");
						continue;
					} else {
						System.out.println("상처약을 사용하셨습니다.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------전투장----------------------------------------");
						System.out.println("");
						System.out.println("-----<웅이 포켓몬>-----");
						System.out.println("이름: " + GraygymLongston.Name);
						System.out.println("레벨: " + GraygymLongston.Level);
						System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<사용자 포켓몬>-----");
						System.out.println(
								"                                                 이름: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 레벨: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
					}
				}
			} else if (GraybattleFunction == 3) {
				System.out.println("웅이 : 아쉽군....다음에 다시 도전해보도록");
				System.out.println("");
				break;
			}
		}
	}

	public void BlueGym() {
		while (true) {
			System.out.println("[1번] 공격한다            [2번] 상처약 사용            [3번] 도망가다 ");
			System.out.print("번호 입력 :");
			int BluebattleFunction = scan.nextInt();
			if (BluebattleFunction == 1) {
				if (BluegymAqustar.BattleHp <= 0) {
					BluegymAqustar.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(BluegymAqustar.Name + "는(은) 죽었습니다.\n");
					System.out.println("경험치가 100올랐습니다.");
					Choice.userPaili.Exp += 100;
					Choice.userPaili.Exp();
					System.out.println("체육관 관장에게 이겼습니다.");
					System.out.println("체육관 관장 이슬이가 체육관 뱃지와 2000원을 주었습니다.");
					User.userMoney += 2000;
					User.blueBbagi += 1;
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("");
					break;
				} else {
					System.out.println("사용자가 선공을 하였습니다.");
					System.out.println("파이리 불 뿜기!!!");
					System.out.println("");
					BluegymAqustar.BattleHp -= Choice.userPaili.Fireattack;
					if (BluegymAqustar.BattleHp <= 0) {
						BluegymAqustar.BattleHp = 0;
					}
						System.out.println(
								"------------------------------------전투장----------------------------------------");
						System.out.println("");
						System.out.println("-----<이슬 포켓몬>-----");
						System.out.println("이름: " + BluegymAqustar.Name);
						System.out.println("레벨: " + BluegymAqustar.Level);
						System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<사용자 포켓몬>-----");
						System.out.println(
								"                                                 이름: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 레벨: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println(
								"                                                    EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
						if (BluegymAqustar.BattleHp <= 0) {
							BluegymAqustar.BattleHp = 0;
							System.out.println("--------------------------------------------------");
							System.out.println(BluegymAqustar.Name + "는(은) 죽었습니다.\n");
							System.out.println("경험치가 100올랐습니다.");
							Choice.userPaili.Exp += 100;
							Choice.userPaili.Exp();
							System.out.println("체육관 관장에게 이겼습니다.");
							System.out.println("체육관 관장 이슬이가 체육관 뱃지와 2000원을 주었습니다.");
							System.out.println("--------------------------------------------------");
							User.userMoney += 2000;
							User.blueBbagi += 1;
							System.out.println("");
							System.out.println("");
							break;
						}
						System.out.println("아쿠스타가 반격을 하였습니다.");
						System.out.println("아쿠스타 물대포!!!");
						System.out.println("");
						Choice.userPaili.BattleHp -= BluegymAqustar.WaterAttack;
						System.out.println(
								"------------------------------------전투장----------------------------------------");
						System.out.println("");
						System.out.println("-----<이슬 포켓몬>-----");
						System.out.println("이름: " + BluegymAqustar.Name);
						System.out.println("레벨: " + BluegymAqustar.Level);
						System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<사용자 포켓몬>-----");
						System.out.println(
								"                                                 이름: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 레벨: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println(
								"                                                    EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"--------------------------------------------------------------------------------");
					}
				}
			
	
			if (BluebattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("상처약을 사용할 수 없습니다.");
						continue;
					} else {
						System.out.println("상처약을 사용하셨습니다.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------전투장----------------------------------------");
						System.out.println("");
						System.out.println("-----<이슬 포켓몬>-----");
						System.out.println("이름: " + BluegymAqustar.Name);
						System.out.println("레벨: " + BluegymAqustar.Level);
						System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<사용자 포켓몬>-----");
						System.out.println(
								"                                                 이름: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 레벨: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out
								.println("                                               EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
					}
				}
			} else if (BluebattleFunction == 3) {
				System.out.println("이슬 : 아쉽다....다음에 다시 도전해봐");
				System.out.println("");
				break;
			}
		}
	}

	public void WildbattleKetupi() {
		while (true) {
			System.out.println("[1번] 공격한다            [2번] 상처약 사용            [3번] 몬스터볼 사용           [4번] 도망가다 ");
			System.out.print("번호 입력 :");
			int wildketupibattlefunction = scan.nextInt();
			if (wildketupibattlefunction == 1) {
				if (WildKetupi.BattleHp <= 0) {
					WildKetupi.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(WildKetupi.Name + "는(은) 죽었습니다.\n");
					System.out.println("야생 포켓몬을 물리쳤습니다.");
					System.out.println("경험치가 20올랐습니다.");
					Choice.userPaili.Exp += 20;
					Choice.userPaili.Exp();
					System.out.println("보상금으로 300원을 주었습니다.");
					User.userMoney += 300;
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("");
					break;
				} else {
					System.out.println("사용자가 선공을 하였습니다.");
					System.out.println("파이리 불 뿜기!!!");
					WildKetupi.BattleHp -= Choice.userPaili.Fireattack;
					if (WildKetupi.BattleHp <= 0) {
						WildKetupi.BattleHp = 0;
					}
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<야생 포켓몬>-----");
					System.out.println("이름: " + WildKetupi.Name);
					System.out.println("레벨: " + WildKetupi.Level);
					System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
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
							"---------------------------------------------------------------------------------");
					if (WildKetupi.BattleHp <= 0) {
						WildKetupi.BattleHp = 0;
						System.out.println("--------------------------------------------------");
						System.out.println(WildKetupi.Name + "는(은) 죽었습니다.\n");
						System.out.println("야생 포켓몬을 물리쳤습니다.");
						System.out.println("경험치가 20올랐습니다.");
						Choice.userPaili.Exp += 20;
						Choice.userPaili.Exp();
						System.out.println("보상금으로 300원을 주었습니다.");
						User.userMoney += 300;
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						break;
					}
					System.out.println("캐터피가 반격을 하였습니다.");
					System.out.println("캐터피 나뭇잎날리기!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= WildKetupi.LeafAttack;
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<야생 포켓몬>-----");
					System.out.println("이름: " + WildKetupi.Name);
					System.out.println("레벨: " + WildKetupi.Level);
					System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
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
					System.out.println("                                               EXP:" + Choice.userPaili.Exp);
					System.out.println(
							"--------------------------------------------------------------------------------");
				}
			}
			if (wildketupibattlefunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("상처약을 사용할 수 없습니다.");
						continue;
					} else {
						System.out.println("상처약을 사용하셨습니다.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------전투장----------------------------------------");
						System.out.println("");
						System.out.println("-----<야생 포켓몬>-----");
						System.out.println("이름: " + WildKetupi.Name);
						System.out.println("레벨: " + WildKetupi.Level);
						System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<사용자 포켓몬>-----");
						System.out.println(
								"                                                 이름: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 레벨: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"---------------------------------------------------------------------------------");
					}
				}
			}
			if (wildketupibattlefunction == 3) {
				if (WildKetupi.BattleHp > 0) {
					if (User.userBall == 0) {
						System.out.println("몬스터볼을 사용하실 수 없습니다.");
						System.out.println("");
						continue;
					} else {
						if (WildKetupi.BattleHp > 8) {
							System.out.println("몬스터볼을 사용하셨습니다.");
							User.userBall--;
							System.out.println("----------------------------------------");
							System.out.println("몬스터 볼 남은 갯수 :  " + User.userBall);
							System.out.println("----------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("야생 포켓몬이 몬스터 볼에서 나왔습니다");
							System.out.println("아직 체력이 좋은거 같습니다.");
							System.out.println("");
							continue;
						} else {
							System.out.println("몬스터볼을 사용하셨습니다.");
							User.userBall--;
							System.out.println("----------------------------------------");
							System.out.println("몬스터 볼 남은 갯수 :  " + User.userBall);
							System.out.println("----------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("야생포켓몬을 잡으셨습니다! 축하드립니다.");
							System.out.println("");
							System.out.println("");
							User.pokemonlist.add(WildKetupi.Name);
							break;
						}
					}
				}
			}
			if (wildketupibattlefunction == 4) {
				System.out.println("야생포켓몬에게서 도망쳤습니다.");
				System.out.println("");
				break;
			}
		}
	}

	public void WildbattleLongston() {
		System.out.println("배틀 시작하겠습니다.");
		while (true) {
			System.out.println("[1번] 공격한다            [2번] 상처약 사용            [3번] 몬스터볼 사용           [4번] 도망가다");
			System.out.print("번호 입력 :");
			int WildlongstonBattleFunction = scan.nextInt();
			if (WildlongstonBattleFunction == 1) {
				if (WildLongston.BattleHp <= 0) {
					WildLongston.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(WildLongston.Name + "는(은) 죽었습니다.\n");
					System.out.println("야생 포켓몬을 물리쳤습니다.");
					System.out.println("경험치가 20올랐습니다.");
					Choice.userPaili.Exp += 20;
					Choice.userPaili.Exp();
					System.out.println("보상금으로 300원을 주었습니다.");
					User.userMoney += 300;
					System.out.println("--------------------------------------------------");
					System.out.println("");
					System.out.println("");
					break;
				} else {
					System.out.println("사용자가 선공을 하였습니다.");
					System.out.println("파이리 불 뿜기!!!");
					System.out.println("");
					WildLongston.BattleHp -= Choice.userPaili.Fireattack;
					if (WildLongston.BattleHp <= 0) {
						WildLongston.BattleHp = 0;
					}
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<야생 포켓몬>-----");
					System.out.println("이름: " + WildLongston.Name);
					System.out.println("레벨: " + WildLongston.Level);
					System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
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
							"---------------------------------------------------------------------------------");
					if (WildLongston.BattleHp <= 0) {
						WildLongston.BattleHp = 0;
						System.out.println("--------------------------------------------------");
						System.out.println(WildLongston.Name + "는(은) 죽었습니다.\n");
						System.out.println("야생 포켓몬을 물리쳤습니다.");
						System.out.println("경험치가 20올랐습니다.");
						Choice.userPaili.Exp += 20;
						Choice.userPaili.Exp();
						System.out.println("보상금으로 300원을 주었습니다.");
						User.userMoney += 300;
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						break;
					} 
					System.out.println(WildLongston.Name + "가 반격을 하였습니다.");
					System.out.println("롱스톤 돌 던지기!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= WildLongston.RockAttack;
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<야생 포켓몬>-----");
					System.out.println("이름: " + WildLongston.Name);
					System.out.println("레벨: " + WildLongston.Level);
					System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
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
			if (WildlongstonBattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.out.println("상처약을 사용할 수 없습니다.");
						continue;
					} else {
						System.out.println("상처약을 사용하셨습니다.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------전투장----------------------------------------");
						System.out.println("");
						System.out.println("-----<야생 포켓몬>-----");
						System.out.println("이름: " + WildLongston.Name);
						System.out.println("레벨: " + WildLongston.Level);
						System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<사용자 포켓몬>-----");
						System.out.println(
								"                                                 이름: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 레벨: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"--------------------------------------------------------------------------------");
					}
				}
			}
			if (WildlongstonBattleFunction == 3) {
				if (WildLongston.BattleHp > 0) {
					if (User.userBall == 0) {
						System.err.println("몬스터볼을 사용하실 수 없습니다.");
						System.out.println("");
						continue;
					} else {
						if (WildLongston.BattleHp > 10) {
							System.out.println("몬스터볼을 사용하셨습니다.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("몬스터 볼 남은 갯수 :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("야생 포켓몬이 몬스터 볼에서 나왔습니다");
							System.out.println("아직 체력이 좋은거 같습니다.");
							System.out.println("");
							continue;
						} else {
							System.out.println("몬스터볼을 사용하셨습니다.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("몬스터 볼 남은 갯수 :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("야생포켓몬을 잡으셨습니다! 축하드립니다.");
							System.out.println("");
							System.out.println("");
							User.pokemonlist.add(WildLongston.Name);
							break;
						}
					}
				}
			}
			if (WildlongstonBattleFunction == 4) {
				System.out.println("야생포켓몬에게서 도망쳤습니다.");
				System.out.println("");
				break;
			}
		}
	}

	public void WildbattleAqustar() {
		System.out.println("배틀 시작하겠습니다.");
		while (true) {
			System.out.println("[1번] 공격한다            [2번] 상처약 사용            [3번] 몬스터볼 사용           [4번] 도망가다 ");
			System.out.print("번호 입력 :");
			int WildaqustarBattleFunction = scan.nextInt();
			if (WildaqustarBattleFunction == 1) {
				if (WildAqustar.BattleHp <= 0) {
					WildAqustar.BattleHp = 0;
					System.out.println("--------------------------------------------------");
					System.out.println(WildAqustar.Name + "는(은) 죽었습니다.\n");
					System.out.println("야생 포켓몬을 물리쳤습니다.");
					System.out.println("경험치가 20올랐습니다.");
					Choice.userPaili.Exp += 20;
					Choice.userPaili.Exp();
					System.out.println("보상금으로 300원을 주었습니다.");
					User.userMoney += 300;
					System.out.println("--------------------------------------------------");
					break;
				} else {
					System.out.println("사용자가 선공을 하였습니다.");
					System.out.println("파이리 불 뿜기!!!");
					System.out.println("");
					WildAqustar.BattleHp -= Choice.userPaili.Fireattack;
					if (WildAqustar.BattleHp <= 0) {
						WildAqustar.BattleHp = 0;
					}
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<야생 포켓몬>-----");
					System.out.println("이름: " + WildAqustar.Name);
					System.out.println("레벨: " + WildAqustar.Level);
					System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
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
							"---------------------------------------------------------------------------------");
					if (WildAqustar.BattleHp <= 0) {
						WildAqustar.BattleHp = 0;
						System.out.println("-------------------------------------------------");
						System.out.println(WildAqustar.Name + "는(은) 죽었습니다.\n");
						System.out.println("야생 포켓몬을 물리쳤습니다.");
						System.out.println("경험치가 20올랐습니다.");
						Choice.userPaili.Exp += 20;
						Choice.userPaili.Exp();
						System.out.println("보상금으로 300원을 주었습니다.");
						User.userMoney += 300;
						System.out.println("--------------------------------------------------");
						System.out.println("");
						System.out.println("");
						break;
					}
					System.out.println(WildAqustar.Name + "가 반격을 하였습니다.");
					System.out.println("아쿠스타 물 대포!!!");
					System.out.println("");
					Choice.userPaili.BattleHp -= WildAqustar.WaterAttack;
					System.out
							.println("------------------------------------전투장----------------------------------------");
					System.out.println("");
					System.out.println("-----<야생 포켓몬>-----");
					System.out.println("이름: " + WildAqustar.Name);
					System.out.println("레벨: " + WildAqustar.Level);
					System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
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
			if (WildaqustarBattleFunction == 2) {
				if (Choice.userPaili.BattleHp > 0) {
					if (User.userMedicine == 0) {
						System.err.println("상처약을 사용할 수 없습니다.");
						continue;
					} else {
						System.out.println("상처약을 사용하셨습니다.");
						User.userMedicine--;
						Choice.userPaili.BattleHp += 10;
						if (Choice.userPaili.BattleHp > 40) {
							Choice.userPaili.BattleHp = 40;
						}
						System.out.println(
								"------------------------------------전투장----------------------------------------");
						System.out.println("");
						System.out.println("-----<야생 포켓몬>-----");
						System.out.println("이름: " + WildAqustar.Name);
						System.out.println("레벨: " + WildAqustar.Level);
						System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
						System.out.println("-------------------");
						System.out.println("");
						System.out.println(
								"---------------------------------------------------------------------------------");
						System.out.println("");
						System.out.println("                   -----<사용자 포켓몬>-----");
						System.out.println(
								"                                                 이름: " + Choice.userPaili.Name);
						System.out.println(
								"                                                 레벨: " + Choice.userPaili.Level);
						System.out.println(
								"                      Hp: " + Choice.userPaili.BattleHp + "/" + Choice.userPaili.Hp);
						System.out.println("                                              EXP:" + Choice.userPaili.Exp);
						System.out.println(
								"--------------------------------------------------------------------------------");
					}
				}
			}
			if (WildaqustarBattleFunction == 3) {
				if (WildAqustar.BattleHp > 0) {
					if (User.userBall == 0) {
						System.err.println("몬스터볼을 사용하실 수 없습니다.");
						System.out.println("");
						continue;
					} else {
						if (WildAqustar.BattleHp > 10) {
							System.out.println("몬스터볼을 사용하셨습니다.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("몬스터 볼 남은 갯수 :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("야생 포켓몬이 몬스터 볼에서 나왔습니다");
							System.out.println("아직 체력이 좋은거 같습니다.");
							System.out.println("");
							continue;
						} else {
							System.out.println("몬스터볼을 사용하셨습니다.");
							User.userBall--;
							System.out.println("--------------------------------------");
							System.out.println("몬스터 볼 남은 갯수 :  " + User.userBall);
							System.out.println("--------------------------------------");
							System.out.println("...");
							System.out.println("...");
							System.out.println("...");
							System.out.println("야생포켓몬을 잡으셨습니다! 축하드립니다.");
							System.out.println("");
							System.out.println("");
							User.pokemonlist.add(WildAqustar.Name);
							break;
						}
					}
				}
			}
			if (WildaqustarBattleFunction == 4) {
				System.out.println("야생포켓몬에게서 도망쳤습니다.");
				System.out.println("");
				break;
			}
		}
	}

}
