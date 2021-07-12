package chapter03;

public class OperatorEx14 {

	public static void main(String[] args) {

		int num1 = 10;				// 2진수		 		00000000 00000000 00000000 00001010
		int num2 = 5;				// 2진수				00000000 00000000 00000000 00000101
								
									// 보수를 취하면서 부호 비트도 1이 되서 음수가 됨
		int result = ~num1;			// num1의 2진수의 보수	11111111 11111111 11111111 11110101 => -11
		int result2 = num1 & num2;	// num1과 num2의 AND	00000000 00000000 00000000 00000000 => 0
		int result3 = num1 | num2;	// num1과 num2의 OR	00000000 00000000 00000000 00001111 => 15
		int result4 = num1 ^ num2; 	// num1과 num2의 XOR 00000000 00000000 00000000 00001111 => 15
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
