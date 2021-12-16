package pokemon;

public class Fire extends Firepokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;


	public Fire(String Type, String Name, int Level, int Hp, int Battlehp) {
		super(Type, Name, Level, Hp, Battlehp);
		// TODO Auto-generated constructor stub
		this.Type = "불";
		this.Name = "파이어";
		this.Level = 30;
		this.BattleHp = 150;
		this.Hp = 150;
	}
     
	

	public void fireskill() {
		if( this.BattleHp <= 30) {
			System.out.println("파이어의 특수능력이 발동되었습니다.");
			System.out.println("공격력과 Hp가 올라갑니다");
			Firepokemon.Firelegend+=5;		//불포켓몬 파이어 기술 위력 +5
			this.BattleHp +=10;				//파이어 HP +10
		}
		
	}

	
}
