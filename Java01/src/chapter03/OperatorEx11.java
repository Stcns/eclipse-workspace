package chapter03;

public class OperatorEx11 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
																			//�ܶ� ȸ�� ��
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);	
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		/*���� ���� num1�� 10 + 10 = 20���� False�� �ǹǷ� ����(&&)���� ���� ������ False�̹Ƿ� ���� ���� ������� ����
		 *���� ���� �׿� i���� 4���������� ������� �ʱ⶧���� �״�� 2�� ����
		 *���� ���� True��� ���� ���� ����ϰԵ�(i�� 4�� ��)
		 */
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		/*���� ���� num1�� 20 + 10 = 30���� True�� �ǹǷ� ����(||)���� ���� ������ True�̹Ƿ� ���� ���� ������� ����
		 *���� ���� �׿� i���� 4���������� ������� �ʱ⶧���� �״�� 2�� ����
		 *���� ���� False��� ���� ���� ����ϰԵ�
		 */
	}
	
}
