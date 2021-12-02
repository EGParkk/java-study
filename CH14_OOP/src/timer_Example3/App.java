package timer_Example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task extends TimerTask{
	@Override
	public void run() {
		System.out.println("타이머1 헬로우");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() { // Runnable의 추상 메소드 run()를 구현(완성)한다.
		System.out.println("타이머2 헬로우~");
	}
	
}

public class App {

	public static void main(String[] args) {
		// 타이머1
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);
		// 타이머2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 0, 1, TimeUnit.SECONDS); // 1초에 한번씩 반복
	}

}