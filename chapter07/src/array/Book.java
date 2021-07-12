package array;

public class Book {

	private String bookName;
	private String author;
	
	public Book() {}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;	// this.를 붙여 지역 변수 bookName이 아닌 인스턴스 변수 bookName으로 값이 할당되게끔 한다
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}
	
	
}
