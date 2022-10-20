package array;

// 다른 클래스를 이용하기 위해서 import를 사용하고,
// 자동 임포트 단축키는 ctrl + shift + o를 사용한다.
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<Book>();
		ArrayList<Object> library2 = new ArrayList<Object>();
		// Object 클래스는 최고 상위 클래스. 여기 위는 없음.
		// 클래스 검색의 끝은 Object.
		// Object 클래스에 없으면 없는 것임.

		
		library.add( new Book("태백산맥", "조정래") );
		library.add( new Book("데미안", "헤르만 헤세") );
		library.add( new Book("어떻게 살 것인가", "유시민") );
		library.add( new Book("토지", "박경리") );
		library.add( new Book("어린왕자", "생텍쥐페리") );
		library.add( new Book("김민지책", "김민지"));
		
		for(int i=0; i<library.size(); i++){
	
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library){
			book.showBookInfo();
		}
	}
}
