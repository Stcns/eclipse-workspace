package chapter04;

public class If_example04 {

	public static void main(String[] args) {

		int age = 15;								// if또는 else if에서 조건식이 성립하면
		int charge;									// 그 후에 있는 else if나 else를 확인하지않고 빠져나옴
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다. ");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("초등 학생 입니다. ");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등 학생 입니다.");	
		}
		else {
			charge = 3000;
			System.out.println("일반인 입니다. ");
		}
		System.out.println("입장료는 " + charge + "입니다. ");
	}

}
