package witharrayList;

import java.util.ArrayList;		// ArrayList import, Ctri + Shift + O : 자동 import 추가

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();	// 선언
		
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");		// 업캐스팅
		Customer customerYoul = new GoldCustomer(10040, "이율곡");		// 업캐스팅
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);	// 업캐스팅
		
		customerList.add(customerLee);		//ArrayList인 customerList[0]에 객체 customerLee 저장
		customerList.add(customerShin);		//ArrayList인 customerList[1]에 객체 customerShin 저장							 
		customerList.add(customerHong);		//ArrayList인 customerList[2]에 객체 customerHong 저장
		customerList.add(customerYoul);		//ArrayList인 customerList[3]에 객체 customerYoul 저장
		customerList.add(customerKim);		//ArrayList인 customerList[4]에 객체 customerKim 저장
		
		System.out.println("====== 고객 정보 출력 ======\n");
		for(Customer customer : customerList) {					// 향상된 for문 
			System.out.println(customer.showCustomerInfo());	// customer 변수에 customerList[0]부터 [4]까지 할당 및 실행 반복
		}
		
		System.out.println("\n====== 할인율과 보너스 포인트 계산 ======\n");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);	// 객체의 클래스 타입에 따른 서로 다른 override된 calcPrice(price) 메소드 실행
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
		
	}

}
