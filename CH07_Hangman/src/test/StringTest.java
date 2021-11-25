package test;

public class StringTest {
	public static void main(String[] args) {
		// 스트링빌더 테스트
		String text = "I ";
		text += "have ";
		text += "a dog";
		
		System.out.println(text);
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("I ");
		sb1.append("have ");
		sb1.append("a ");
		sb1.append("dog");
		
		System.out.println(sb1.toString());
		String animal = "cat";
		StringBuilder sb2 = new StringBuilder("I ");
		sb2.append("have ").append("a ").append(animal);
		
		System.out.println(sb2.toString());
	}
}
