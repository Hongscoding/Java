package Ch07array;
//p211 나 혼자 코딩 하기
public class Book {
	private String bookname;
	private String author;
	
	public Book() {}
	
	public Book(String bookname, String author) {
		this.bookname = bookname;
		this.author = author;
	} //책 이름과 저자 이름을 매개변수로 받는 생성자
	
	public String getBookname() {
		return bookname;
	}
	
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookname+","+author);
	}

}
