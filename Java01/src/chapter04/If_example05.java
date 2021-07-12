package chapter04;

public class If_example05 {

	public static void main(String[] args) {

		//if ~else if ~ 구문에서 else를 빼 if가 되는 경우 결과
		
		int age = 7;						//age가 7일때 else if 가 아닌 if를 사용하였기때문에
		int charge;							//각각의 if에서 모두 비교하므로 조건식이 성립하는 if가 여럿이 되어
											//값이 하나가 아닌 여러개가 나옴
		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다. ");
		}
		if (age < 14) {
			charge = 2000;
			System.out.println("초등 학생 입니다. ");
		}
		if (age < 20) {
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
