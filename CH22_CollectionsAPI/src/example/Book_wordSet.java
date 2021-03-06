package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {

	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 리스트에 넣기
		// 이때 리스트는 단어가 중복 되지 않고 알파벳 순으로 저장된다. => TreeSet
		File theGreatGatsby = new File("TheGreatGatsby.txt"); // C:\java502\EonGyu\JAVA\java-study\CH22_CollectionsAPI.TheGreatGatsby.txt
		File huckleberry = new File("Huckleberry.txt");

		// 파일이 있는지 확인
		System.out.println(theGreatGatsby.exists()); 
		System.out.println(huckleberry.exists());

		TreeSet<String> gatList = loadWords(theGreatGatsby);
		TreeSet<String> huckList = loadWords(huckleberry);

		System.out.println(gatList.size());
		System.out.println(huckList.size());

		displayWords(gatList);
	}

	/**
	 * list를 입력받아 그 안에 단어들을 출력한다.
	 * 
	 * @param list
	 */
	private static void displayWords(TreeSet<String> list) {
		int count = 0;
		for (String w : list) {
			System.out.printf("%-10s \t", w);
			count++;
			if (count == 6) {
				System.out.println();
				count = 0;
			}
		}
	}

	/**
	 * 입력된 파일을 읽어 단어를 저장해서 마지막에 트리셋 리스트로 리턴
	 * 
	 * @param file
	 * @return wordSet
	 */
	private static TreeSet<String> loadWords(File file) {
		TreeSet<String> wordSet = new TreeSet<>();

		// 파일 읽기
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = null;
			// 한줄 읽기
			while ((line = reader.readLine()) != null) {
				// 트리셋에 단어를 분리해서 입력한다. (자동 정렬 및 중복 제거)
				String[] words = line.split("[^a-zA-Z]+");
				for (String w : words) {
					if (w.length() < 6) {
						continue;
					}
					wordSet.add(w.toLowerCase());
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했음 : " + file);
		} catch (IOException e) {
			System.out.println("파일을 읽지 못했음 : " + file);
		}
		return wordSet;
	}

}
