package chapter04;

public class Loop_for_Example01 {

	public static void main(String[] args) {
		
		int i;									// for ���� �ʱ�ȭ�� �ڸ��� �����Ƿ� ���� �Ѵ�.
		int sum;
		
		for (i = 0, sum = 0; i < 10; i++) {			// i�� 0�����̹Ƿ� ���ǽ��� i < 10���� �Ͽ� 10�� �ݺ�
			sum += (i + 1);						//sum = sum + (i+1)
					
		}
		System.out.println("1���� 10������ ���� " + sum  + "�Դϴ�.");
	}
}
