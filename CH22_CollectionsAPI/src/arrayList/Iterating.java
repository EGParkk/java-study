package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(); // 정수타입 리스트 생성
		
		// 리스트에 정수 추가
		list.add(7);
		list.add(9);
		list.add(123);
		
		// for each문 : 간단하게 출력
		for(Integer n : list) {
			System.out.println(n);
		}
		
		// for문 : 인덱스 번호가 필요할때
		for(int i = 0; i < list.size(); i++) {
			Integer n = list.get(i);
			System.out.println(i + " : " + n);
		}
		
		// 람다식 컬렉션객체.forEach(각각 반복)
		list.forEach(e -> System.out.println(e));
		
		// 메소드 래퍼런스
		list.forEach(System.out::println);
	}

}
