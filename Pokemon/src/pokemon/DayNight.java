package pokemon;

public class DayNight extends Thread{
	private boolean isLoop;
	//밤 낮 주기 1분 60000초 마다 밤낮이 바뀐다 
	//밤 낮마다 각각 포켓몬에게 주는 버프가 다르다. 
  
	public DayNight (boolean isLoop) {
			try {
				this.isLoop = isLoop;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		//쓰레드 중지 
		public void close() {
			isLoop = false;
			
			this.interrupt(); // 해당 쓰레드를 중지상태로 만든다.
		}
		
		@Override
		public void run() {
			try {
				do {
					System.err.println("");
					System.err.println("지금은 '낮'입니다");
					System.err.println("파이리/롱스톤 이(가) 버프효과(공격력 증가)를 받습니다");
					System.out.println("");
					System.out.println("");
					Choice.WildKetupi.LeafAttack -=3;
					Choice.WildAqustar.WaterAttack -=5;
					Choice.userPaili.Fireattack+=5;
					Choice.WildLongston.RockAttack+=5;
					Thread.sleep(20000);	//20초
					System.err.println("");
					System.err.println("지금은 '밤'입니다");
					System.err.println("아쿠스타/캐터피가  버프효과(공격력 증가)를 받습니다");
					System.out.println("");
					System.out.println("");
					Choice.WildKetupi.LeafAttack +=3;
					Choice.WildAqustar.WaterAttack +=5;
					Choice.userPaili.Fireattack-=5;
					Choice.WildLongston.RockAttack-=5;
					Thread.sleep(20000);	//20초
				}while(isLoop); //isLoop가 true값이면 무한 반복 
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

