package pokemon;

public class Paili extends Firepokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;
	int Exp;

	public Paili(String Type, String Name, int Level, int Hp, int BattleHp, int Exp) {
		super(Type, Name, Level, Hp, BattleHp);
		this.Type = "불";
		this.Name = "파이리";
		this.Level = 5;
		this.BattleHp = 40;
		this.Hp = 40;
		this.Exp = 0;
	}

	// 유저 포켓몬 파이리 경험치
	public void Exp() {
		if (Exp >= 100) {
			System.out.println("=========================================");
			System.out.println("포켓몬이 레벨 업 했습니다!!! ");
			System.out.println("포켓몬이 체력이 +10 증가했습니다!!! ");
			System.out.println("포켓몬의 공격력이 +3 증가했습니다!!! ");
			System.out.println("=========================================");
			Level++; // Exp 100이상일 때 레벨 1증가
			Exp = 0; // Exp 0으로 초기화
			Hp += 10; // Hp +10증가
			Firepokemon.Fireattack += 3; // 공격력 +3증가
			if (Level == 6) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("---------------------------------");
				System.out.println("포켓몬이 진화합니다.");
				System.out.println("파이리가 리자드로 진화하였습니다!");
				System.out.println("---------------------------------");
				User.pokemonlist.remove(Choice.userPaili.Name);
				Choice.userPaili.Name = "리자드";
				User.pokemonlist.add(Choice.userPaili.Name);
			}
			if (Level == 7) {
				System.out.println("");
				System.out.println("");
				System.out.println("");
				System.out.println("---------------------------------");
				System.out.println("포켓몬이 진화합니다.");
				System.out.println("리자드가 리자몽으로 진화하였습니다!");
				System.out.println("---------------------------------");
				User.pokemonlist.remove(Choice.userPaili.Name);
				Choice.userPaili.Name = "리자몽";
				User.pokemonlist.add(Choice.userPaili.Name);
			}

		}
	}
}
