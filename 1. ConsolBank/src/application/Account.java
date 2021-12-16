package application;
/**
 * Created by massivcode on 2017-01-15.
 */
public class Account {
	//계좌 id
    private String id;
    //계좌 비번
    private String password;
    //현재 자산
    private int money;

    public Account(String id, String password, int money) {
        this.id = id;
        this.password = password;
        this.money = money;
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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                '}';
    }
}
