package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); // 정수타입 리스트 생성
		
		// 리스트에 정수 추가
		list.add(7);
		list.add(9);
		list.add(123);
		
		// get(인덱스번호)로 리턴
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
