package chapter03;

public class OperatorEx13 {

	public static void main(String[] args) {
		int fatherAge = 45;
		int motherAge = 47;
		
		
		char ch;									// 문자형.문자 하나
		ch = (fatherAge > motherAge) ? 'T' : 'F';	// ch에 조건식이 True면 'T', False면 'F' 대입
													// 조건식이 True이므로 ch에 'T' 대입
		System.out.println(ch);
	}
	
}
