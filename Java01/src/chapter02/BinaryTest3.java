package chapter02;

public class BinaryTest3 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000001000110;	// ��� : 70
		int num2 = 0B11111111111111111111111110111010;	// ���� : -70
		
		// 32�ڸ����� �� ó�� �ڸ��� ��ȣbit, 0�϶� ���, 1�϶� ����
		// ����� ������ �ٲ� �� ������ �ٲ� �� 1�� �����ش�.
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
