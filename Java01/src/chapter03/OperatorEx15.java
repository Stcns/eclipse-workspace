package chapter03;

public class OperatorEx15 {

	public static void main(String[] args) {

		int num = 0B00000101;			// 0B00000101 -> 5
		
		System.out.println(num << 2);	// 0B00010100 -> 20(�������� 2��Ʈ �̵��� ��) 5 * 2^2 = 20
		System.out.println(num << 3);	// 0B00101000 -> 40(�������� 3��Ʈ �̵��� ��) 5 * 2^3 = 40
		System.out.println(num << 4);	// 0B01010000 -> 80(�������� 4��Ʈ �̵��� ��) 5 * 2^4 = 80
		System.out.println(num >> 1); 	// 0B00000010 -> 2(���������� 1��Ʈ �̵��� ��) 5 / 2^1 = 2
		System.out.println(num >> 2);	// 0B00000001 -> 1(���������� 2��Ʈ �̵��� ��) 5 / 2^2 = 1
		System.out.println(num >>> 2);	// 0B00000101 -> 1(���������� 2��Ʈ �̵��� ��) 5 / 2^2 = 1
		
		
		System.out.println(num);		// 0B00000101 -> 5, num�� ���� �������� �ʾ����Ƿ� ���� �� �״�� ���
		
		num = num << 2;					// 0B00010100 -> 20(�������� 2��Ʈ �̵��� ��)�� num�� ����
		System.out.println(num);		// 20 ���
		
	}

}
