package exam;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		String name;
		
		while (true) {
			System.out.print("���� �̸� >> ");
			name = scanner.next();
			if (course[0].equals(name))
				System.out.println(name + "�� ������ " + score[0]);
			else if (course[1].equals(name))
				System.out.println(name + "�� ������ " + score[1]);
			else if (course[2].equals(name))
				System.out.println(name + "�� ������ " + score[2]);
			else if (course[3].equals(name))
				System.out.println(name + "�� ������ " + score[3]);
			else if (course[4].equals(name))
				System.out.println(name + "�� ������ " + score[4]);
			else if ("�׸�".equals(name))
				break;
			else {
				System.out.println("���� �����Դϴ�.");
			}
			
		}
		
		scanner.close();
		
	}

}
