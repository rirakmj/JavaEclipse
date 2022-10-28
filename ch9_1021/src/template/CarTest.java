package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("=== 자율주행 하는 자동차 ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== 사람이 운전하는 자동차 ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}

// 나만의 자동차 만들기 & 추가 기능 넣기 (공통 기능과 각 차량마다의 기능)
