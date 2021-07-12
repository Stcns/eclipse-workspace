package chapter02;

public class Q4 {

	public static void main(String[] args) {
		
		int i = 10;
		double j = 2.0;
		
		System.out.println(i + j);			// 암시적(묵시적) 형변환 int + double = double
		
		System.out.println((int)(i + j));	// 명시적 형변환	double -> int
		System.out.println((int)(i - j));
		System.out.println((int)(i * j));
		System.out.println((int)(i / j));

	}

}
