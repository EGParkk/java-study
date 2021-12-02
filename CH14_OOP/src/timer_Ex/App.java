package timer_Ex;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Task extends TimerTask{
	private int i = 0;
	@Override
	public void run() {
		i += 5;
		System.out.println("계란 삶는 중 " + i + "초");
	}
	
}

class Task2 implements Runnable{
	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}
	
}

public class App {

	public static void main(String[] args) {
		// 1. 5초 간격 타이머 "계란 삶는 중"
		Timer timer = new Timer();
		timer.schedule(new Task(), 5000L, 5000L);
		// 2. 30초 간격 타이머 "계란 삶기 완료"
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task2(), 30L, 30L, TimeUnit.SECONDS);
	}

}
