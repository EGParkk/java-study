package pokemon;

public class Waterpokemon extends Pokemon {
	int WaterAttack;

	public Waterpokemon(String type, String name, int level, int hp, int battlehp) {
		super("물", name, level, hp, battlehp);
		this.WaterAttack = 10;
	}

}
