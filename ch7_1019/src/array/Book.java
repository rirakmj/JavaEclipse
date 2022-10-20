package array;

public class Book {
	
	// 인스턴스 변수, 참조형 변수
	private String bookName;
	private String author;
	
	// 디폴트 생성자
	public Book(){}
	
	// 매개변수가 두 개인 생성자, 생성자는 인스턴스 변수를 초기화
	// 초기화: 처음으로 값을 할당하는 것
	// 생성자의 기능에서 추가로 다른 기능을 넣을 수 있다
	public Book(String bookName, String author){
		this.bookName = bookName;
		this.author = author;
	}
	
	// 인스턴스 멤버 변수의 접근 지정자
	// private 외부에서 안 보임 (데이터 은닉)
	// 해당 값에 접근하거나 사용하기 위해서 get, set 메소드를 사용한다.
	// 자주 이용하기 때문에 마우스 우클릭 -> 소스에서 자동 생성 가능.
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
	public void showBookInfo(){
		System.out.println(bookName + "," + author);
	}
}
