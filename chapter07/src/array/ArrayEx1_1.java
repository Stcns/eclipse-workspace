package array;

public class ArrayEx1_1 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		int plus = 1;
		long total = 1;										// ���� �ʹ� Ŀ�� ������ �ǹǷ� int��� long ���
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]�������� arr[3][4]���� 1���� 20 ���ʴ�� �Ҵ�
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = plus;
				plus++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]�������� arr[3][4]���� �� ���
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
				// System.out.printf("arr[%d][%d] = %d \n", i, j, arr[i][j]);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]�������� arr[3][4]������ �� ��� ���� total ���ϱ�
			for(int j = 0; j < arr[i].length; j++) {
				total *= arr[i][j];
			}
		}
		
		System.out.println("arr�� ���� ��� ���� ���� " + total + "�Դϴ�.");							// total(1~20������ ��) ���
		
		System.out.println(total == (long)1*2*3*4*5*6*7*8*9*10*11*12*13*14*15*16*17*18*19*20);	// ���� �´��� Ȯ��
		
	}

}
