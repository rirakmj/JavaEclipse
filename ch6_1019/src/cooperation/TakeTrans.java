package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 두 명의 학생을 생성
		  Student studentJames = new Student("James", 5000);   
		  Student studentTomas = new Student("Tomas", 10000);
		  Student studentMinji = new Student("Minji", 15000);
		  Bus bus40 = new Bus(40);
		  studentMinji.takeBus(bus40);     // james가 100번 버스를 탐
		  studentMinji.showInfo();           // james 정보 출력
		  bus40.showInfo();                // 버스 정보 출력
		  
		  Subway subwayGreen = new Subway("2호선");  
		  studentMinji.takeSubway(subwayGreen);  // Tomas가 2호선을 탐
		  studentMinji.showInfo();                 // Tomas 정보 출력
		  subwayGreen.showInfo();   
	}
}
