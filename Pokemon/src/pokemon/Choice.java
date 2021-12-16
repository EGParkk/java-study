package pokemon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Choice {

	Scanner scan = new Scanner(System.in);
	static User user = new User();
	int ballPrice = 200;
	int medicinePrice = 300;
	static Paili userPaili = new Paili("불", "파이리", 5, 40, 40, 10);
	static Longston GraygymLongston = new Longston("암석", "롱스톤", 8, 40, 40);
	static Longston WildLongston = new Longston("암석", "롱스톤", 5, 20, 20);
	static Aqustar BluegymAqustar = new Aqustar("물", "아쿠스타", 8, 40, 40);
	static Aqustar WildAqustar = new Aqustar("물", "아쿠스타", 5, 20, 20);
	static Ketupi WildKetupi = new Ketupi("풀", "캐터피", 3, 15, 15);
	int Bbagi = User.grayBbagi + User.blueBbagi;

	// 오박사한테 가서 포켓몬 선택하기
	public void Obaksapokemonchoice() {
		while (true) {
			System.out.println(
					"------------------------------------------초보자용 포켓몬------------------------------------- ");
			System.out.println("[1번]이름: 파이리/레벨: 5/ 속성: 불, [2번]이름: 꼬부기 /레벨: 5/ 속성: 물, [3번]이름: 이상해씨 /레벨: 5/ 속성: 풀 ");
			System.out.println(
					"----------------------------------------------------------------------------------------- ");
			System.out.println("");
			System.out.println("몇 번 포켓몬을 가지겠습니까?");
			System.out.print("번호 입력 :");
			int PokemonChoice = scan.nextInt();
			if (PokemonChoice == 1) {
				//해당 포켓몬 이미지 출력
				/*
				 * Runnable PailiImage = new Image("PailiImage.png"); Thread PailiChoice = new
				 * Thread(PailiImage) { public void run() { try { Thread.sleep(2000);
				 * }catch(Exception e) { e.printStackTrace(); } } }; PailiChoice.start();
				 */
				System.out.println("파이리를 선택하셨습니다.");
				System.out.println("");
				System.out.println("정말로 결정하시겠습니까?");
				System.out.println("1.예    2.아니오");
				System.out.print("번호 입력 :");
				int TruepailiChoice = scan.nextInt();
				if (TruepailiChoice == 1) {
					System.out.println("오박사님에게로부터 파이리를 받았습니다");
					User.pokemonlist.add(userPaili.Name); // 포켓몬 리스트에 객체 추가
					break;
				} else {
					System.out.println("다시 결정해주세요");
					System.out.println("");
				}

			}
			//꼬부기 선택
			if (PokemonChoice == 2) {
				//꼬부기 이미지 출력 
				/*
				 * Runnable KkoubugiImage = new Image("KkoubugiImage.png"); Thread
				 * KkoubugiChoice = new Thread(KkoubugiImage); KkoubugiChoice.start();
				 */
				System.out.println("꼬부기를 선택하셨습니다.");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				System.out.println("죄송합니다...이미 다른 분이 가져가셨습니다...");
				System.out.println("다시 결정해주세요");
				System.out.println("");
				continue;
			}
			//이상해씨 선택 
			if (PokemonChoice == 3) {
				//이상해씨 이미지 출력 
				/*
				 * Runnable EsanghaessiImage = new Image("EsanghaessiImage.png"); Thread
				 * EsanghaessiChoice = new Thread(EsanghaessiImage); EsanghaessiChoice.start();
				 */
				System.out.println("이상해씨를 선택하셨습니다.");
				System.out.println("...");
				System.out.println("...");
				System.out.println("...");
				System.out.println("죄송합니다...이미 다른 분이 가져가셨습니다...");
				System.out.println("다시 결정해주세요");
				System.out.println("");
				continue;
			}
		}
	}

	// 오박사의 선물
	public void Obaksagift() {
		System.out.println("");
		System.out.println("오박사 : 이건 여행갈 때 쓰거라 ");
		System.out.println("몬스터볼x3개, 상처약 x3개 , 소지금 2,000원을 받았습니다.");
		System.out.println("");
		System.out.println("");
		User.userBall += 3;
		User.userMoney += 2000;
		User.userMedicine += 3;
	}

	// 간호순 포켓몬 치료
	public void Nursepokemoncure() {
		System.out.println("현재 Hp:" + userPaili.BattleHp);
		System.out.println("포켓몬을 치료하겠습니다.");
		System.out.print("치료완료된 Hp: ");
		System.out.println(userPaili.BattleHp = userPaili.Hp);
		System.out.println("치료 완료하였습니다. 안녕히 가세요.");
		System.out.println("");
	}

	// 간호순한테 가서 아이템 사기
	public void Nurseitemsell() {
		System.out.println("무슨 아이템이 필요하세요?");
		while (true) {
			System.out.println(" ");
			System.out.println("-----------------------간호순 아이템 메뉴 ------------------------");
			System.out.println("  [1번] 상처약/가격: 300원       [2번] 몬스터 볼/가격: 200원          [3번] 나가기  	 ");
			System.out.println("------------------------------------------------------------");
			System.out.println("                                     (현재 소지금: " + User.userMoney + ")");
			System.out.println("몇 번을 선택하시겠습니까?");
			System.out.print("번호 입력 :");
			int ItemChoice = scan.nextInt();
			if (ItemChoice == 1) {
				System.out.println("상처약을 사기로 결정하셨습니다.");
				System.out.println("몇 개 사실 건가요?-------------------(현재 소지금:" + User.userMoney + "원)");
				System.out.print("상처약 갯 수 입력(1개 이상 입력해주세요) : ");
				int MedicineCount = scan.nextInt();
				if (medicinePrice * MedicineCount <= User.userMoney) {
					for (int i = 1; i < MedicineCount; i++) {
						User.userMedicine++;
					}
					System.out.println("구매 완료하였습니다.");
					System.out.println("");
					User.userMoney -= medicinePrice * MedicineCount;
				//구매비가 소지금보다 높을 경우 구매할 수 없음
				} else if (medicinePrice * MedicineCount > User.userMoney) {
					System.out.println("구매 할 수 없습니다.");
					System.out.println("");
				}

			}
			if (ItemChoice == 2) {
				System.out.println("몬스터 볼을 사기로 결정하셨습니다.");
				System.out.println("몇 개 사실 건가요?-------------------(현재 소지금:" + User.userMoney + "원)");
				System.out.print("몬스터 볼 갯 수 입력(1개 이상 입력해주세요) : ");
				int BallCount = scan.nextInt();
				if (ballPrice * BallCount <= User.userMoney) {
					for (int i = 1; i < BallCount; i++) {
						User.userBall++;
					}
					System.out.println("구매 완료하였습니다.");
					System.out.println("");
					User.userMoney -= ballPrice * BallCount;
					//구매비가 소지금보다 높을 경우 구매할 수 없음 
				} else if (medicinePrice * BallCount > User.userMoney) {
					System.out.println("구매 할 수 없습니다.");
					System.out.println("");
				}

			} else if (ItemChoice == 3) {
				System.out.println("다음에 다시 올께요.");
				System.out.println("");
				break;
			}
		}
	}

	public void TaechovillageChoice() {
		System.out.println("--------------태초마을 메뉴 --------------");
		System.out.println("   [1번]상태를 보다         [2번]오박사님께 가기         [3번]맵 이동 ");
		System.out.println("-------------------------------------");
	}

	public void Graycitychoice() {
		System.out.println("--------------회색시티 메뉴 --------------");
		System.out.println("   [1번]체육관 가기         [2번]포켓몬센터 가기         [3번]상태를 보다 \n   [4번]야생포켓몬 사냥   [5번]맵 이동");
		System.out.println("-------------------------------------");

	}

	public void Bluecitychoice() {
		System.out.println("---------------블루시티 메뉴 ---------------");
		System.out.println("   [1번]체육관 가기         [2번]포켓몬센터 가기         [3번]상태를 보다 \n   [4번]야생포켓몬 사냥  [5번]엔딩보기 ");
		System.out.println("---------------------------------------");
	}
	//그레이시티 관장 웅이 메뉴 
	public void Woongchoice() {
		System.out.println("관장 웅이 : 나와 대결해볼텐가? ");
		System.out.println("");
		System.out.println("------------웅이 메뉴 -------------");
		System.out.println("   1.포켓몬 배틀을 한다   2.도망간다    ");
		System.out.println("--------------------------------");
		System.out.print("번호 입력 :");
		int WoongChoice = scan.nextInt();
		if (WoongChoice == 1) {

			System.out.println("실력 한 번 볼까?");
			System.out.println("관장 웅이가 포켓몬을 꺼냈습니다");
			System.out.println("사용자님이 포켓몬을 꺼냈습니다");
			System.out.println("------------------------------------전투장----------------------------------------");
			System.out.println("");
			System.out.println("-----<웅이 포켓몬>-----");
			System.out.println("이름: " + GraygymLongston.Name);
			System.out.println("레벨: " + GraygymLongston.Level);
			System.out.println("Hp: " + GraygymLongston.BattleHp + "/" + GraygymLongston.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<사용자 포켓몬>-----");
			System.out.println("                                                 이름: " + userPaili.Name);
			System.out.println("                                                 레벨: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("배틀 시작하겠습니다.");
			Battle GrayBattle = new Battle();
			GrayBattle.GrayGym();
		} else if (WoongChoice == 2) {
			System.out.println("배틀에서 도망갔습니다.");
			System.out.println("");
		}

	}
	//블루시티 관장 이슬 메뉴 
	public void EsuelChoice() {
		System.out.println("관장 이슬 : 나와 대결해볼래? ");
		System.out.println("");
		System.out.println("------------이슬 메뉴 -------------");
		System.out.println("   1.포켓몬 배틀을 한다   2.도망간다    ");
		System.out.println("--------------------------------");
		System.out.print("번호 입력 :");
		int EsuelChoice = scan.nextInt();
		if (EsuelChoice == 1) {
			System.out.println("실력 한 번 볼까?");
			System.out.println("관장 이슬이 포켓몬을 꺼냈습니다");
			System.out.println("사용자님이 포켓몬을 꺼냈습니다");
			System.out.println("------------------------------------전투장----------------------------------------");
			System.out.println("");
			System.out.println("-----<이슬 포켓몬>-----");
			System.out.println("이름: " + BluegymAqustar.Name);
			System.out.println("레벨: " + BluegymAqustar.Level);
			System.out.println("Hp: " + BluegymAqustar.BattleHp + "/" + BluegymAqustar.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<사용자 포켓몬>-----");
			System.out.println("                                                 이름: " + userPaili.Name);
			System.out.println("                                                 레벨: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("배틀 시작하겠습니다.");
			Battle BlueBattle = new Battle();
			BlueBattle.BlueGym();
		} else if (EsuelChoice == 2) {
			System.out.println("배틀에서 도망갔습니다.");
		}
	}

	public void WildchoiceKetupi() {
		System.out.println("");
		System.out.println("------------야생포켓몬 배틀 -------------");
		System.out.println("   1.포켓몬 배틀을 한다   2.도망간다    ");
		System.out.println("--------------------------------");
		System.out.print("번호 입력 :");
		int WildChoice = scan.nextInt();
		if (WildChoice == 1) {
			System.out.println("------------------------------------전투장----------------------------------------");
			System.out.println("");
			System.out.println("-----<야생 포켓몬>-----");
			System.out.println("이름: " + WildKetupi.Name);
			System.out.println("레벨: " + WildKetupi.Level);
			System.out.println("Hp: " + WildKetupi.BattleHp + "/" + WildKetupi.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<사용자 포켓몬>-----");
			System.out.println("                                                 이름: " + userPaili.Name);
			System.out.println("                                                 레벨: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("배틀 시작하겠습니다.");
			Battle WildbattleKetupi = new Battle();
			WildbattleKetupi.WildbattleKetupi();
		} else if (WildChoice == 2) {
			System.out.println("배틀에서 도망갔습니다.");
		}
	}

	public void WildchoiceLongston() {
		System.out.println("");
		System.out.println("------------야생포켓몬 배틀 -------------");
		System.out.println("   1.포켓몬 배틀을 한다   2.도망간다    ");
		System.out.println("--------------------------------");
		System.out.print("번호 입력 :");
		int WildChoice = scan.nextInt();
		if (WildChoice == 1) {
			System.out.println("------------------------------------전투장----------------------------------------");
			System.out.println("");
			System.out.println("-----<야생 포켓몬>-----");
			System.out.println("이름: " + WildLongston.Name);
			System.out.println("레벨: " + WildLongston.Level);
			System.out.println("Hp: " + WildLongston.BattleHp + "/" + WildLongston.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<사용자 포켓몬>-----");
			System.out.println("                                                 이름: " + userPaili.Name);
			System.out.println("                                                 레벨: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("배틀 시작하겠습니다.");
			Battle WildbattleLongston = new Battle();
			WildbattleLongston.WildbattleLongston();
		} else if (WildChoice == 2) {
			System.out.println("배틀에서 도망갔습니다.");
		}
	}

	public void WildchoiceAqustar() {
		System.out.println("");
		System.out.println("------------야생포켓몬 배틀 -------------");
		System.out.println("   1.포켓몬 배틀을 한다   2.도망간다    ");
		System.out.println("--------------------------------");
		System.out.print("번호 입력 :");
		int WildChoice = scan.nextInt();
		if (WildChoice == 1) {
			System.out.println("------------------------------------전투장----------------------------------------");
			System.out.println("");
			System.out.println("-----<야생 포켓몬>-----");
			System.out.println("이름: " + WildAqustar.Name);
			System.out.println("레벨: " + WildAqustar.Level);
			System.out.println("Hp: " + WildAqustar.BattleHp + "/" + WildAqustar.Hp);
			System.out.println("-------------------");
			System.out.println("");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("                   -----<사용자 포켓몬>-----");
			System.out.println("                                                 이름: " + userPaili.Name);
			System.out.println("                                                 레벨: " + userPaili.Level);
			System.out.println("                      Hp: " + userPaili.BattleHp + "/" + userPaili.Hp);
			System.out.println("                                                    EXP:" + userPaili.Exp);
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("배틀 시작하겠습니다.");
			Battle WildbattleAqustar = new Battle();
			WildbattleAqustar.WildbattleAqustar();
		} else if (WildChoice == 2) {
			System.out.println("배틀에서 도망갔습니다.");
		}
	}
	//유저 상태창 보기 
	public void UserChoice() {
		while (true) {
			System.out.println("-------------------사용 메뉴 ---------------------");
			System.out.println(" [1번]보유물품   [2번]포켓몬들   [3번]아이템 가방   [4번]뒤로가기   ");
			System.out.println("-----------------------------------------------");
			System.out.print("번호 입력:");
			int UserMenu = scan.nextInt();
			switch (UserMenu) {
			case 1:
				System.out.println("-------------------보유물품 ---------------------");
				System.out.println(" 소지금 : " + User.userMoney + "           보유 뱃지갯수: " + Bbagi);
				System.out.println("-----------------------------------------------");
				System.out.println("			(0번: 뒤로가기)");
				System.out.print("번호 입력:");

				// 뒤로가기
				int BackUser = scan.nextInt();
				if (BackUser == 0) {
					continue;
				}

			case 2:
				System.out.println("-------------포켓몬들 --------------");
				System.out.println(User.pokemonlist);
				System.out.println("------------------------------------");
				System.out.println("			(0번: 뒤로가기)");
				System.out.print("번호 입력:");
				int BackPokemon = scan.nextInt();
				if (BackPokemon == 0) {
					continue;
				}

			case 3:
				System.out.println("-------------------------아이템 가방 ----------------------------");
				System.out.println("[1]상처약 :" + User.userMedicine + "개   [2]몬스터볼 :" + User.userBall + "개");
				System.out.println("-------------------------------------------------------------");
				System.out.println("			(0번: 뒤로가기)");
				System.out.print("번호 입력:");
				int BackItem = scan.nextInt();
				if (BackItem == 0) {
					continue;
				}
			case 4:
				break;
			}
			break;
		}
	}

}
