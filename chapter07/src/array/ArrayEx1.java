package array;

public class ArrayEx1 {

	public static void main(String[] args) {

		int[][] arr = new int[4][5];
		long total = 1;										// ���� �ʹ� Ŀ�� ������ �ǹǷ� int��� long ���
		
		arr[0][0] = 1;										// arr[0][0]�������� arr[3][4]���� 1���� 20 ���ʴ�� �Ҵ�
		arr[0][1] = 2;										
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;
		arr[2][0] = 11;
		arr[2][1] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;
		arr[3][0] = 16;
		arr[3][1] = 17;
		arr[3][2] = 18;
		arr[3][3] = 19;
		arr[3][4] = 20;

		
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]�������� arr[3][4]���� �� ���
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		for(int i = 0; i < arr.length; i++) {				// arr[0][0]�������� arr[3][4]������ �� ��� ���� total ���ϱ�
			for(int j = 0; j < arr[i].length; j++) {
				total *= arr[i][j];
			}
		}
		
		System.out.println(total);							// total(1~20������ ��) ���
		
		System.out.println(total == (long)1*2*3*4*5*6*7*8*9*10*11*12*13*14*15*16*17*18*19*20);	// ���� �´��� Ȯ��
		
	}

}
