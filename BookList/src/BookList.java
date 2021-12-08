import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
	// 1. 맴버 변수
	Connection con;
	Statement stmt;
	ResultSet rs;
	
//	// 1. 변수
//	int bookid;
//	String bookname;
//	String publisher;
//	int price;
	
//	// 2. 배열
//	int bookidArr[];
//	String booknameArr[];
//	String publisherArr[];
//	int priceArr[];
	
//	// 3. 객체
//	Book bookObj;
	
	
	// 4. 객체 배열
	private Book bookArr[];
	
	public Book[] getBookArr() {
		return bookArr;
	}

	// 2. 생성자
	public BookList() { // 배열의 초기화는 생성자에서 한다(변수 마찬가지)
//		// 2. 배열
//		bookidArr = new int[10];
//		booknameArr = new String[10];
//		publisherArr = new String[10];
//		priceArr = new int[10];
		
		// 4. 객체 배열
		bookArr = new Book[10];
	}
	
	void getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1522:XE";
		String userid = "c##madang";
		String pwd = "c##madang";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("데이터베이스 연결 준비 ...");
			con = DriverManager.getConnection(url, userid, pwd);
			System.out.println("데이터베이스 연결 성공");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	void getBook() {
		String query = "SELECT bookid, bookname, publisher, price FROM Book";
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
			
			int i = 0;
			while (rs.next()) {
//				System.out.print("\t" + rs.getInt(1));
//				System.out.print("\t" + rs.getString(2));
//				System.out.print("\t\t" + rs.getString(3));
//				System.out.println("\t" + rs.getInt(4));
				
//				// 1. 변수
//				bookid = rs.getInt(1);
//				bookname = rs.getString(2);
//				publisher = rs.getString(3);
//				price = rs.getInt(4);
//				printBook(bookid, bookname, publisher, price);
				
//				// 2. 배열
//				bookidArr[i] = rs.getInt(1);
//				booknameArr[i] = rs.getString(2);
//				publisherArr[i] = rs.getString(3);
//				priceArr[i] = rs.getInt(4);
//				i++;
				
//				// 3. 객체
//				bookObj = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
//				printObj(bookObj);
				
				// 4. 객체 배열
				bookArr[i] = new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
				i++;
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	// 1. 변수 출력용
//	void printBook(int bookid, String bookname, String publisher, int price) {
//		System.out.println("\t" + bookid + "\t" + bookname + "\t" + publisher + "\t" + price);
//	}
	
//	// 2. 배열 출력용
//	void printBookArr() {
//		for(int i = 0; i < bookidArr.length; i++) {
//			System.out.println("\t" + bookidArr[i] + "\t" + booknameArr[i] + "\t" + publisherArr[i] + "\t" + priceArr[i]);
//		}
//	}
	
//	// 3. 객체 출력용
//	void printObj(Book book) {
//		System.out.println("\t" + book.bookid + "\t" + book.bookname + "\t" + book.publisher + "\t" + book.price);
//	}
	
//	// 4. 객체 배열 출력용 -> 임마를 Book 클래스로 독립시켜줌
//	void printObjArr() {
//		for(int i = 0; i < bookArr.length; i++) {
//			// private으로 바꾸면 이거는 안됨
////			System.out.println("\t" + bookArr[i].bookid + "\t" + bookArr[i].bookname + "\t" + bookArr[i].publisher + "\t" + bookArr[i].price);
//			System.out.println("\t" + bookArr[i].getBookid() + "\t" + bookArr[i].getBookname() + "\t" + bookArr[i].getPublisher() + "\t" + bookArr[i].getPrice());
//		}
//	}
}
