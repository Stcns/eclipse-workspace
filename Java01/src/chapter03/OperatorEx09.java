package chapter03;

public class OperatorEx09 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
													// ||(논리합 : 두 항중 하나만 True면 True)
		boolean flag = (num1 > 0) || (num2 > 0);	// 두항 모두 True 일때 True
		System.out.println(flag);
		
		boolean flag2 = (num1 > 0) || (num2 < 0);	// 왼쪽 True 오른쪽 False 일때 True
		System.out.println(flag2);
		
		boolean flag3 = (num1 < 0) || (num2 > 0);	// 왼쪽 False 오른쪽 True 일때 True
		System.out.println(flag3);
		
		boolean flag4 = (num1 < 0) || (num2 < 0);	// 두항 모두 False 일때 False
		System.out.println(flag4);
		
	}
	
}
