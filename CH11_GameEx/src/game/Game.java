package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissors;

public class Game {
	// 사용할 가위, 바위, 보 객체를 배열로 생성
	GameObject[] objects = {new Scissors(), new Rock(), new Paper()};
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);
	
	public void run() {
		System.out.println("2판3선 게임 시작 ...");
		int wins = 0;
		for(int i = 1; i <= 3; i++) {
			// 유저의 선택
			System.out.print("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");
			GameObject ob1 = objects[scanner.nextInt()];
			GameObject ob2 = objects[random.nextInt(objects.length)];
			System.out.println("당신의 선택은 : " + ob1.getName());
			System.out.println("컴퓨터 선택은 : " + ob2.getName());
			
			int result = ob1.compareTo(ob2);
			wins += result;
			if (result > 0) {
				System.out.println("당신의 승리!🚀");
			} else if (result < 0) {
				System.out.println("당신의 패배!🎌");
			} else {
				System.out.println("비겼습니다! Draw! 🚩");
			}
			if(wins >= 2) {
				break;
			} else if(wins <= -2) {
				break;
			}
		}
		// 3번 가위바위보 끝난 후 총점 wins로 결과를 출력한다.
		System.out.println();
		System.out.print("2판3선 결과는 : ");
		if (wins > 0) {
			System.out.println("당신의 승리!🚀");
		} else if (wins < 0) {
			System.out.println("당신의 패배!🎌");
		} else {
			System.out.println("비겼습니다! Draw! 🚩");
		}
	}
}
