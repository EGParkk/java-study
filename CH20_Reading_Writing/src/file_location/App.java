package file_location;

import java.io.File;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileFocation = "C:\\java502\\EonGyu\\JAVA\\java-study\\CH20_Reading_Writing\\test.txt";
		// 위 파일 주소로 파일객체 생성, 메소드 exists는 파일이 있으면 true, 없으면 false 리턴
		System.out.println(new File(fileFocation).exists());
	}

}
