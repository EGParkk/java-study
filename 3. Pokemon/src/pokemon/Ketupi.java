package pokemon;

public class Ketupi extends Grasspokemon {
	String Type;
	String Name;
	int Level;
	int BattleHp;
	int Hp;
	
	public Ketupi(String Type, String Name, int Level, int Hp, int BattleHp) {
		super(Type, Name, Level, Hp, BattleHp);
		this.Type = Type;
		this.Name = Name;
		this.Level = Level;
		this.BattleHp = BattleHp;
		this.Hp = Hp;
	}
}
