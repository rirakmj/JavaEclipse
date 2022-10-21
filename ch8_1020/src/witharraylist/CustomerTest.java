package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		GoldCustomer kmj = new GoldCustomer(10060, "김민지");
		VVIPCustomer PSY = new VVIPCustomer(10070, "박수영", 12346, 7799);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
	    customerList.add(kmj);
	    customerList.add(PSY);
	    
		System.out.println("====== 고객 정보 출력 =======");
		
		for( Customer customer : customerList){
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 =======");
		
		int price = 10000;
		for( Customer customer : customerList){
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() +" 님이 " +  + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() +" 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}
}

// 연습해보기
// VVIP라는 클래스 설계해보기: 보너스 적립율 15%, 할인율 20%, 전문 상담원, 발렛파킹제공
// 왜 발렛파킹 안 나오지..
