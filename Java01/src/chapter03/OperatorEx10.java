package chapter03;

public class OperatorEx10 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean flag;
										// !(not) True �϶� False, !(not) False �϶� True
		flag = !(num1 > 0);				// ! (True) => False
		System.out.println(flag);
		
		flag = !(num2 < 0);				// ! (False) => True
		System.out.println(flag);
		
		flag = !(num1 > num2);			// ! (False) => True
		System.out.println(flag);
		
		flag = !(num1 < num2);			// ! (True) => False
		System.out.println(flag);
		
	}
	
}
