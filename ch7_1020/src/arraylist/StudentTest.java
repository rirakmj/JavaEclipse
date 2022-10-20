package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		Student studentKim2 = new Student(1003, "Kim2");
		
		studentKim2.addSubject("국어", 85);
		studentKim2.addSubject("수학", 85);
		studentKim2.addSubject("영어", 85);
		
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
		System.out.println("======================================");
		studentKim2.showStudentInfo();
	}
}
