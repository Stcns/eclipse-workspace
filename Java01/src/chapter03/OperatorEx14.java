package chapter03;

public class OperatorEx14 {

	public static void main(String[] args) {

		int num1 = 10;				// 2����		 		00000000 00000000 00000000 00001010
		int num2 = 5;				// 2����				00000000 00000000 00000000 00000101
								
									// ������ ���ϸ鼭 ��ȣ ��Ʈ�� 1�� �Ǽ� ������ ��
		int result = ~num1;			// num1�� 2������ ����	11111111 11111111 11111111 11110101 => -11
		int result2 = num1 & num2;	// num1�� num2�� AND	00000000 00000000 00000000 00000000 => 0
		int result3 = num1 | num2;	// num1�� num2�� OR	00000000 00000000 00000000 00001111 => 15
		int result4 = num1 ^ num2; 	// num1�� num2�� XOR 00000000 00000000 00000000 00001111 => 15
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
