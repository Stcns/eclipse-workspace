package array;

public class ArrayEx1_1 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int plus = 1;
		long total = 1;										// 값이 너무 커져 음수가 되므로 int대신 long 사용
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]에서부터 arr[3][4]까지 1부터 20 차례대로 할당
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = plus;
				plus++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]에서부터 arr[3][4]까지 값 출력
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
				// System.out.printf("arr[%d][%d] = %d \n", i, j, arr[i][j]);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]에서부터 arr[3][4]까지의 값 모두 곱한 total 구하기
			for(int j = 0; j < arr[i].length; j++) {
				total *= arr[i][j];
			}
		}
		
		System.out.println("arr의 값을 모두 곱한 값은 " + total + "입니다.");							// total(1~20까지의 곱) 출력
		
		System.out.println(total == (long)1*2*3*4*5*6*7*8*9*10*11*12*13*14*15*16*17*18*19*20);	// 답이 맞는지 확인
		
	}

}
