package game.objects;

public class GameObject {
	private int id; // 아이디
	private String name; // 이름
	
	protected int getId() { // 아이디 수정은 상속한 클래스에서만 사용
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override // 원래 object의 toString메소드는 주소값을 나타내는데 메소드 오버라이드
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
}
