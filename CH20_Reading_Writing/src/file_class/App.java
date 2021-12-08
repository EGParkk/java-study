package file_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일 객체를 만들기
		File currentDirectory = new File("."); // 현재 프로젝트 폴더 안에 있는 파일로 파일 객체 생성
		
		System.out.println(currentDirectory.getAbsolutePath()); // 파일 객체의 절대경로 출력
		System.out.println(currentDirectory.getCanonicalPath()); // 파일 객체의 절대경로 출력
		
		// 폴더 내부 파일들을 출력
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
	}

}
