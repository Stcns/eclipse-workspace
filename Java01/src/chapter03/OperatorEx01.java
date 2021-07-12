package chapter03;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println(+num1);
		System.out.println(-num2);		// num2 변수에 -를 붙여 출력해도 num2 값 자체는 변하지 않음
		
		System.out.println(num2);		// 20
		
		num2 = -num2;					// num2 변수에 -num2를 대입하면 num2 값은 음수가 된다.
		System.out.println(num2);		// -20
		
	}
	
}
