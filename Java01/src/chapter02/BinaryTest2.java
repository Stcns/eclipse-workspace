package chapter02;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000000000101;	// ��� : 5
		int num2 = 0B11111111111111111111111111111011;	// ���� : -5
		
		// 32�ڸ����� �� ó�� �ڸ��� ��ȣbit(MSB, Most Significant Bit)�� 0�϶� ���, 1�϶� ����
		// ����� ������ �ٲ� �� 1�� ������ ���� ��(0->1, 1->0) 1�� �����ش�.
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
	}

}
