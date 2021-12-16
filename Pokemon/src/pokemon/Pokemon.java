package pokemon;

public class Pokemon {

	String Type; // 속성(불,물,풀,암석)
	String Name;
	int Level;
	static int Hp; // HP-체력
	static int BattleHp; // 싸울 때 줄어드는 HP
	

	public Pokemon(String Type, String Name, int Level, int Hp, int BattleHp) {
		super();
		this.Type = Type;
		this.Name = Name;
		this.Level = Level;
		this.Hp = Hp;
		this.BattleHp = BattleHp;
		
	}
}
