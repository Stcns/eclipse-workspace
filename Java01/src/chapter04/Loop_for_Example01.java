package chapter04;

public class Loop_for_Example01 {

	public static void main(String[] args) {
		
		int i;									// for 사용시 초기화식 자리가 있으므로 선언만 한다.
		int sum;
		
		for (i = 0, sum = 0; i < 10; i++) {			// i가 0부터이므로 조건식을 i < 10으로 하여 10번 반복
			sum += (i + 1);						//sum = sum + (i+1)
					
		}
		System.out.println("1부터 10까지의 합은 " + sum  + "입니다.");
	}
}
