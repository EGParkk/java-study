package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	
	public static void greet() { // 스태틱 메소드는 객체 생성 없이 사용 가능
		System.out.println("헬로우!");
	}

	public static void main(String[] args) {
		// 메소드 레퍼런스(스태틱 메소드를 만들어 사용)
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		
		// 클래스명::메소드명
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
	}

}
