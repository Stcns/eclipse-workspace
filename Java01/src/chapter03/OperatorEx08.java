package chapter03;

public class OperatorEx08 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
													// &&(���� : �� ���� �ϳ��� False�� False)
		boolean flag = (num1 > 0) && (num2 > 0);	// ���� ��� True �϶� True
		System.out.println(flag);
		
		boolean flag2 = (num1 > 0) && (num2 < 0);	// ���� True ������ False �϶� False
		System.out.println(flag2);
		
		boolean flag3 = (num1 < 0) && (num2 > 0);	// ���� False ������ True �϶� False
		System.out.println(flag3);
		
		boolean flag4 = (num1 < 0) && (num2 < 0);	// ���� ��� False �϶� False
		System.out.println(flag4);
		
	}

}
