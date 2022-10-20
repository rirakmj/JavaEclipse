package singleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println( myCompany1 == myCompany2 );
	myCompany1.address = "부산";
	myCompany1.name = "김민지";
	myCompany1.age = 35;
	System.out.println( "myCompany1 address : " + myCompany1.address );
	System.out.println( "myCompany1 name : " + myCompany1.name );
	System.out.println( "myCompany1 age : " + myCompany1.age);
	}
	
}
