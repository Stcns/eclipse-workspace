package chapter02;

public class BinaryTest3 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000001000110;	// 양수 : 70
		int num2 = 0B11111111111111111111111110111010;	// 음수 : -70
		
		// 32자리에서 맨 처음 자리는 부호bit, 0일때 양수, 1일때 음수
		// 양수를 음수로 바꿀 때 보수로 바꾼 후 1을 더해준다.
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
