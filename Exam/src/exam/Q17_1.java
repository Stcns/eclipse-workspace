package exam;

import java.util.Scanner;

public class Q17_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"����", "����", "��"};
		int n = (int)(Math.random()*3);
		String input;
		
		while (true) {
			System.out.print("���� ���� ��! >> ");
			input = scanner.next();
			
			if("�׸�".equals(input)) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			else if(str[n].equals(input)) {
				System.out.println("����� = " + input + " , ��ǻ�� = " + str[n] + " �����ϴ�.");
			}
			else if(str[n].equals("����")) {
				if(input.equals("����"))
					System.out.println("����� = " + input + " , ��ǻ�� = " + str[n] + " ����ڰ� �̰���ϴ�.");
				if(input.equals("��"))
					System.out.println("����� = " + input + " , ��ǻ�� = " + str[n] + " ����ڰ� �����ϴ�.");
			}
			else if(str[n].equals("����")) {
				if(input.equals("����"))
					System.out.println("����� = " + input + " , ��ǻ�� = " + str[n] + " ����ڰ� �����ϴ�.");
				if(input.equals("��"))
					System.out.println("����� = " + input + " , ��ǻ�� = " + str[n] + " ����ڰ� �̰���ϴ�.");
			}
			else if(str[n].equals("��")) {
				if(input.equals("����"))
					System.out.println("����� = " + input + " , ��ǻ�� = " + str[n] + " ����ڰ� �̰���ϴ�.");
				if(input.equals("����"))
					System.out.println("����� = " + input + " , ��ǻ�� = " + str[n] + " ����ڰ� �����ϴ�.");
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		
		}
		scanner.close();
	}

}
