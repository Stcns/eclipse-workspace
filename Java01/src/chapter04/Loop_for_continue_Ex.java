package chapter04;

public class Loop_for_continue_Ex {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		//for (int total = 0, int num = 1 ; num <= 100 ; num++)
		for(num = 1; num <= 100; num++) {
			
			if(num % 2 == 0) 
				continue;					// num이 짝수일때, 이후 수행을 생략하고 num++를 수행하게됨
			
			total += num;					// 홀수일때만 total = total + num을 수행하게됨
		}
		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");
	}

}
