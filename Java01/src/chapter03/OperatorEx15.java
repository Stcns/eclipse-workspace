package chapter03;

public class OperatorEx15 {

	public static void main(String[] args) {

		int num = 0B00000101;			// 0B00000101 -> 5
		
		System.out.println(num << 2);	// 0B00010100 -> 20(왼쪽으로 2비트 이동한 값) 5 * 2^2 = 20
		System.out.println(num << 3);	// 0B00101000 -> 40(왼쪽으로 3비트 이동한 값) 5 * 2^3 = 40
		System.out.println(num << 4);	// 0B01010000 -> 80(왼쪽으로 4비트 이동한 값) 5 * 2^4 = 80
		System.out.println(num >> 1); 	// 0B00000010 -> 2(오른쪽으로 1비트 이동한 값) 5 / 2^1 = 2
		System.out.println(num >> 2);	// 0B00000001 -> 1(오른쪽으로 2비트 이동한 값) 5 / 2^2 = 1
		System.out.println(num >>> 2);	// 0B00000101 -> 1(오른쪽으로 2비트 이동한 값) 5 / 2^2 = 1
		
		
		System.out.println(num);		// 0B00000101 -> 5, num에 값을 대입하지 않았으므로 기존 값 그대로 출력
		
		num = num << 2;					// 0B00010100 -> 20(왼쪽으로 2비트 이동한 값)을 num에 대입
		System.out.println(num);		// 20 출력
		
	}

}
