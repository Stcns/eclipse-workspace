package chapter5.test;

import chapter5.test.Order;

public class Order_test {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderId = 20180312001L;
		order.customerId = "abc123";
		order.orderDate = "2018�� 3�� 12��";
		order.customerName = "ȫ���";
		order.productId = "PD0345-12";
		order.shippingAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ���ȣ : " + order.orderId);
		System.out.println("�ֹ��� ���̵� : " + order.customerId);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.productId);
		System.out.println("��� �ּ� : " + order.shippingAddress);
			
				
		
	}

}