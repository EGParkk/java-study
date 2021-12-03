package custom_exception;

import custom_exception.exceptions.TempTooHighException;
import custom_exception.exceptions.TempTooLowException;

public class Thermostat {
	// 예외처리 throws는 해당 예외처리를 이 메소드를 호출할때 처리하도록 함
	public void setTemperature(double temperature) throws TempTooLowException, TempTooHighException{
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}

	private void setMachineTemperature(double temperature) throws TempTooLowException, TempTooHighException{
		if(temperature < 0) {
			throw new TempTooLowException("온도가 너무 낮습니다."); // 새 예외를 생성
		}
		else if(temperature > 35) {
			throw new TempTooHighException("온도가 너무 높습니다."); // 새 예외를 생성
		}
	}
}
