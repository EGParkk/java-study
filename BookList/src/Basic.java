
public class Basic {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		bookList.getConnection();
		bookList.getBook();
		// b1.printBookArr(); // 2. 배열 출력
		// b.printObjArr(); // 4. 객체 배열 출력 - 이 메소드가 BookList안에 있을 경우!
		
//		for(int i = 0; i < b.bookArr.length; i++) { // private로 하면 이거 동작 안됨!
//			b.bookArr[i].printBook();
//		}
		
		for(int i = 0; i < bookList.getBookArr().length; i++) {
			bookList.getBookArr()[i].printBook();
		}
	}

}
