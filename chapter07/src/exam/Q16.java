package exam;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88,76, 62, 55};
		
		String name = "";
		int i = 0;
		
		while(true) {
			System.out.print("���� �̸��� �Է��ϼ��� >> ");
			name = sc.next();
			if(name.equals("�׸�"))
				break;
			for(i = 0; i < course.length; i++) {	// �Է��� ���� array ���� ��ġ ���� ������ for���� ������ �����ϰ�
				if(course[i].equals(name)) {		// for���� �������� i�� course.length�� 5�� �ȴ�.
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				}
			}
			if (i == course.length) {				// �� i�� 5�� �Ǿ���(course.length�� ��������)�°� ���� �����̶�� �ǹ�
				System.out.println("���� �����Դϴ�.");
				
			}
			
			
		}
		
	}

}