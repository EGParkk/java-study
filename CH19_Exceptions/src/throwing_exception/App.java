package throwing_exception;

public class App {
	public static void main(String[] args) throws Exception {
		Thermostat stat = new Thermostat();
		
		stat.setTemperature(36);
	}
}
