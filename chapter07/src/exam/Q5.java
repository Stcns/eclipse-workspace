package exam;

public class Q5 {

	public static void main(String[] args) {

		int sum = 0;
		int[] scores = {1,2,3,4,5,6,7,8,9,10};
		
		//int scores[] = {1,2,3,4,5,6,7,8,9,10};				// 대괄호는 자료형이나 변수 뒤에 아무데나 있어도 가능
		//int scores[] = new int[] {1,2,3,4,5,6,7,8,9,10};		// 다른 array 생성 방법
		//int scores[] = new int[10]							// 인덱스만 10개 만듦. 값은 기본값(정수는 0, 실수는 0.0, 문자열은 null, 논리형은 false 등)
		//scores[0] = 1; 같은 식으로 값을 인덱스에 넣어줄 수 있다.
		
		//int scores[] =  new int[10] {1,2,3,4,5,6,7,8,9,10}; // 오류 발생
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("1부터 10까지의 합은 : " + sum);
		System.out.println(scores.length);
		
	}

}
