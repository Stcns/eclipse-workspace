package chapter02;

public class Q4 {

	public static void main(String[] args) {
		
		int i = 10;
		double j = 2.0;
		
		System.out.println(i + j);			// �Ͻ���(������) ����ȯ int + double = double
		
		System.out.println((int)(i + j));	// ����� ����ȯ	double -> int
		System.out.println((int)(i - j));
		System.out.println((int)(i * j));
		System.out.println((int)(i / j));

	}

}
