package reading_lineByline;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		// 파일의 위치
		String fileLocation = "C:\\java502\\EonGyu\\JAVA\\java-study\\CH20_Reading_Writing\\test.txt";
		System.out.println(new File(fileLocation).exists());
		System.out.println();
		
		// 파일을 읽기 위한 객체 생성
		try (BufferedReader reader = new BufferedReader(new FileReader(fileLocation))){
			// 파일 읽기
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line); // 더 이상 읽을 줄이 없을때까지 읽어서 한줄씩 출력한다.
			}
		} catch (FileNotFoundException e) {
			// 실제 파일을 못 찾았을 경우
			// e.printStackTrace(); 빨간색 예외처리
			System.out.println("파일을 찾지 못했음 : " + fileLocation);
		} catch (IOException e) {
			// 파일을 읽지 못할 경우
			// e.printStackTrace();
			System.out.println("파일을 읽지 못했음 : " + fileLocation);
		}
		
	}

}
