package throwing_exception2;

public class Thermostat {
	// 예외처리 throws는 해당 예외처리를 이 메소드를 호출할때 처리하도록 함
	public void setTemperature(double temperature) throws Exception {
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}

	private void setMachineTemperature(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다."); // 새 예외를 생성
		}		
	}
}
