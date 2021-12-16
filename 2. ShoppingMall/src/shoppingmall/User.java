package shoppingmall;

public class User {
	private String id;
	private String password;
	private int customer_id; //가입한 순서대로 회원번호
	private static int count;

	public User(String id, String password) {
		this.id = id;
		this.password = password;
		count++;
		customer_id = count;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "유저 [ 회원번호= " + customer_id + " 아이디 =" + id + ", 비번=" + password + "]";
	}

	public static int getCount() {
		return count;
	}

}
