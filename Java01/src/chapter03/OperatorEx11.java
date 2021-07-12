package chapter03;

public class OperatorEx11 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
																			//단락 회로 평가
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);	
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		/*앞의 항의 num1이 10 + 10 = 20으로 False가 되므로 논리곱(&&)에서 값은 무조건 False이므로 뒤의 항은 계산하지 않음
		 *따라서 뒤의 항에 i값은 4여야하지만 계산하지 않기때문에 그대로 2가 나옴
		 *앞의 항이 True라면 뒤의 항을 계산하게됨(i가 4가 됨)
		 */
		
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		/*앞의 항의 num1이 20 + 10 = 30으로 True가 되므로 논리합(||)에서 값은 무조건 True이므로 뒤의 항은 계산하지 않음
		 *따라서 뒤의 항에 i값은 4여야하지만 계산하지 않기때문에 그대로 2가 나옴
		 *앞의 항이 False라면 뒤의 항을 계산하게됨
		 */
	}
	
}
