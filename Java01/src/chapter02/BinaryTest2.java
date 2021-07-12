package chapter02;

public class BinaryTest2 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000000000101;	// 양수 : 5
		int num2 = 0B11111111111111111111111111111011;	// 음수 : -5
		
		// 32자리에서 맨 처음 자리는 부호bit(MSB, Most Significant Bit)로 0일때 양수, 1일때 음수
		// 양수를 음수로 바꿀 때 1의 보수를 취한 후(0->1, 1->0) 1을 더해준다.
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
	}

}
