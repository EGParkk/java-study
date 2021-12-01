package super_Constructor;

public class App {

	public static void main(String[] args) {
		// super() 생성자
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee("김펭수");
		System.out.println(e2);
	}

}
