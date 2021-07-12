package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] data = new double[5];	// 배열의 방을 5개 생성	<== 선언, 생성
		// double date[] = new double[5]도 가능
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		// 값이 들어가지 않은 방에는 double형으로 선언했기 때문에 0.0이 자동 할당된다.
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
			
		int[] data2 = {1, 2, 3, 4, 5};		// 배열 선언과 동시에 값 할당<== 초기화
		
		for (int i = 0; i < data2.length; i++) {
			System.out.println(data2[i]);
				
				
		}
		
	}
	
}
