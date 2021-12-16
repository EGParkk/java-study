package pokemon;

public class Longston extends Rockpokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;


	public Longston(String type, String name, int Level, int Hp,  int BattleHp) {
		super("암석", "롱스톤", Level, Hp, BattleHp);
		this.Type = "암석";
		this.Name = "롱스톤";
		this.Level = Level;
		this.BattleHp = BattleHp;
		this.Hp = Hp;
	}
}
