package chapter04;

public class Loop_while_Example {
	
	public static void main(String[] args) {
		
		int num = 1;			// num : 1���� 10���� 1�� �����ϴ� ��
		int sum = 0;			// sum : ���� ����� ���� ����
		
		while (num <= 10) {
			sum += num;			//sum = sum + num
			num++;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}
}

/* sum = 0,  num = 1	<== �ʱⰪ
 * sum = 1,  num = 2	<==loop 1
 * sum = 3,  num = 3	<==loop 2
 * sum = 6,  num = 4	<==loop 3
 * sum = 10, num = 5	<==loop 4
 * sum = 15, num = 6	<==loop 5
 * sum = 21, num = 7	<==loop 6
 * sum = 28, num = 8	<==loop 7
 * sum = 36, num = 9	<==loop 8
 * sum = 45, num = 10	<==loop 9
 * sum = 55, num = 11	<==loop 10 ��
 */
