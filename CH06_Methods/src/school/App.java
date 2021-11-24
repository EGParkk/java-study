package school;

public class App {

	public static void main(String[] args) {
		// 학생 객체를 만들기
		Student s1 = new Student("펭수", 7);
		Student s2 = new Student("길동", 37);
		Student s3 = new Student("라이언", 17);
		Student s4 = new Student("오리온", 27);
		
		s1.setVisible(false); // 펭수는 원격, 온도측정 안함
		s2.setTemperature(35.5); // 길동은 집체, 온도 35.5
		s3.setTemperature(36.5); // 라이언은 집체 온도 36.5
		s4.setVisible(false); // 오리온은 원격
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
	}

}
