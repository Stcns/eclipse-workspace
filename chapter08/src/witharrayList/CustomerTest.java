package witharrayList;

import java.util.ArrayList;		// ArrayList import, Ctri + Shift + O : �ڵ� import �߰�

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();	// ����
		
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");		// ��ĳ����
		Customer customerYoul = new GoldCustomer(10040, "������");		// ��ĳ����
		Customer customerKim = new VIPCustomer(10050, "������", 12345);	// ��ĳ����
		
		customerList.add(customerLee);		//ArrayList�� customerList[0]�� ��ü customerLee ����
		customerList.add(customerShin);		//ArrayList�� customerList[1]�� ��ü customerShin ����							 
		customerList.add(customerHong);		//ArrayList�� customerList[2]�� ��ü customerHong ����
		customerList.add(customerYoul);		//ArrayList�� customerList[3]�� ��ü customerYoul ����
		customerList.add(customerKim);		//ArrayList�� customerList[4]�� ��ü customerKim ����
		
		System.out.println("====== ���� ���� ��� ======\n");
		for(Customer customer : customerList) {					// ���� for�� 
			System.out.println(customer.showCustomerInfo());	// customer ������ customerList[0]���� [4]���� �Ҵ� �� ���� �ݺ�
		}
		
		System.out.println("\n====== �������� ���ʽ� ����Ʈ ��� ======\n");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);	// ��ü�� Ŭ���� Ÿ�Կ� ���� ���� �ٸ� override�� calcPrice(price) �޼ҵ� ����
			System.out.println(customer.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
		}
		
	}

}