package timer_Example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{
	@Override
	public void run() {
		System.out.println("헬로우");
	}
}

public class App {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0L, 1000L);
	}

}
