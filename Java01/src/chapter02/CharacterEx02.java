package chapter02;

public class CharacterEx02 {

	public static void main(String[] args) {
		
		char ch1 = '한';
		char ch2 = '\uD55C';	// 유니코드 값 (한)
		char ch3 = '\uD56B';	// (핫)
		char ch4 = '\uAC38';	// (갸)
		
		// char ch5 = -65;		// 오류발생, 음수에 해당하는 문자는 없음
				
		System.out.println(ch1);	//
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	}

}