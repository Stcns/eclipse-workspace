package chapter04;

public class Q4_Explanation {

	public static void main(String[] args) {

		int lineCount = 4;			// ����� ���� ��
		int spaceCount = 3;			// ������ ó���ϴ� ���� (��ǥ ���� ������), �ʱⰪ���� 3 
		int starCount = 1;			// ��ǥ�� ó���ϴ� ���� (���� ����), �ʱⰪ���� 1
		
		for (int i = 0; i < lineCount; i++) {			// ������ ó���ϴ� for��	
			for (int j = 0; j < spaceCount; j++) {		// ��ǥ ������ ���� ó��
				System.out.print(' ');
			}
			for (int j = 0; j < starCount; j++) {		// ��ǥ�� ó��
				System.out.print('*');
			}
			for (int j = 0; j < spaceCount; j++) {		// ��ǥ �������� ���� ó��
				System.out.print(' ');
			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}
		
	}

}
