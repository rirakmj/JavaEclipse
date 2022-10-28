package gamelevel;

public class MainBoard {

	public static void main(String[] args) {

		// 추상 메서드 흐름 정리
		// Player는 이 클래스 안에 추상클래스 (부모클래스) PlayerLevel 를 참조형 변수 level 선언.
		// has A 관계로 사용.
		// Player 디폴트 생성자에, 기본 BeginnerLevel 인스턴스가 생성이 됨.
		// 그리고 각 자식 클래스 3개 있음. BeginnerLevel, AdvancedLevel, SuperLevel
		// 3개 클래스의 공통점 자식 클래스, 그래서 부모가 추상클래스이므로, 자식은 상속을 했기 때문에
		// 반드시 부모에서 정의한 추상 메서드를 강제로 구현함.
		// 반드시 구현하는 기능은 4가지
		// public abstract void run();
        //		public abstract void jump();
        //		public abstract void turn();
        //		public abstract void showLevelMessage();
		Player player = new Player();
		player.play(1);
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		// 템플릿 메서드는 final 표기해서 변경 못 하게 하고
		// go (템플릿 메서드) 안에 정의한 순서대로 진행함.
		// 진항할 때 호출하는 메서드는 자식 메서드 (가상 메서드).
		// 부모에도 있고, 자식에도 있고, (같은 메서드) 있다면, 자식을 선택한다.
		
		// 다형성 예제 ) .. 부모클래스형(타입) level;
		// level = new BegginerLevel(); 사용했습니다.
	}
}
