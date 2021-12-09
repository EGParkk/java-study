package custom_hashset;

import java.util.HashSet;
import java.util.Objects;

class Creature{
	private int id;
	private String name;
	
	public Creature(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}
}

public class App {

	public static void main(String[] args) {
		HashSet<Creature> creatures = new HashSet<>();
		
		creatures.add(new Creature(0, "고양이"));
		creatures.add(new Creature(1, "개"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(2, "돼지"));
		creatures.add(new Creature(3, "소"));
		creatures.add(new Creature(4, "말"));
		creatures.add(new Creature(4, "비둘기"));
		
		System.out.println(creatures.contains(new Creature(0, "고양이")));
		
		creatures.forEach(System.out::println);
	}

}
