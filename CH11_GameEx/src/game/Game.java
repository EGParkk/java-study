package game;

import java.util.Random;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = {new Scissors(), new Rock(), new Paper()};
	Random random = new Random();
	
	public void run() {
		System.out.println("게임 시작 ...");
		
		int num = random.nextInt(objects.length);
		GameObject ob = objects[num];
		System.out.println(ob);
	}
}
