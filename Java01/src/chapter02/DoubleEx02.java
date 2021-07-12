package chapter02;

public class DoubleEx02 {

	public static void main(String[] args) {
		
		double dnum = 1;
		
		for(int i =0; i <10000; i ++ ) {
			dnum = dnum + 0.1;
			}
		System.out.println(dnum);				// 결과 값은 1001.000000000159로 오차가 발생한다.

	}

}
