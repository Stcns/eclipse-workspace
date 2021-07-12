package chapter04;

public class Loop_for_Example04 {

	public static void main(String[] args) {

		int dan;
		int times;
		
		for (dan = 1; dan <= 9; dan++) {
			for (times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times);
			}
			System.out.println(); 			//서로 다른 단 사이 공백 넣기
		}
		
	}

}
