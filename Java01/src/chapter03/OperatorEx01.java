package chapter03;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(+num1);
		System.out.println(-num2);		// num2 ������ -�� �ٿ� ����ص� num2 �� ��ü�� ������ ����
		
		System.out.println(num2);		// 20
		
		num2 = -num2;					// num2 ������ -num2�� �����ϸ� num2 ���� ������ �ȴ�.
		System.out.println(num2);		// -20
		
	}
	
}
