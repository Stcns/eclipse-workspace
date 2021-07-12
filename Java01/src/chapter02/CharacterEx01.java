package chapter02;

public class CharacterEx01 {

	public static void main(String[] args) {
		char ch1 = 'A';					// 문자는 ''을 씌워서 할당
		System.out.println(ch1);		// 문자 출력
		System.out.println((int)ch1);	// 문자에 해당하는 정수값(아스키 코드값) 출력

		char ch2 = 66;					// 정수 값에 해당하는
		System.out.println(ch2);		// 문자 출력
		
		int ch3 = 67;
		System.out.println(ch3);		// 정수형 선언 정수값 출력
		System.out.println((char)ch3);	// 문자형으로 변환 후 문자 출력
	}

}
