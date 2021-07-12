package chapter02;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		double dNum1 = 1.2;
		float fNum2 = 0.9F;						//float는 숫자 뒤에 F나 f를 붙임
		
												// 명시적 형변환. double과 float에서 int로 변환됨 
		int iNum3 = (int)dNum1 + (int)fNum2;	// 1.2 -> 1, 0.9 -> 0으로 소실이 발생함
		int iNum4 = (int)(dNum1 + fNum2);		// 2.1 -> 2로 마찬가지로 소실이 발생함(double -> int)
		
		System.out.println(iNum3);
		System.out.println(iNum4);

	}

}
