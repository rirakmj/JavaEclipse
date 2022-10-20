package abstractex;

public class DeskTop extends Computer{
	// 추상 클래스를 부모 클래스로 상속을 받으면, 추상 클래스에서 정의된 추상 메서드를 오버라이드 안 하면 오류가 발생함.
	// 반드시 기능을 구현해야하는 부분에 대해서 강제성(의무성)을 부여.	

	@Override
	public void display() {
		System.out.println("DeskTop Display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");		
	}

}
