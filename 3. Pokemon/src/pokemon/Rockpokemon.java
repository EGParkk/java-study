package pokemon;

public class Rockpokemon extends Pokemon {
	int RockAttack;

	public Rockpokemon(String type, String name, int level, int hp, int battlehp) {
		super("암석", name, level, hp, battlehp);
		this.RockAttack = 10;
	}

}
