package chapter04;

public class Switch_If_convert {

	public static void main(String[] args) {

		String medal = "Gold";			// switch���� if ~ else if ~ else������
		
		if (medal == "Gold" || medal == "G" || medal == "g" || medal == "Gol") {
			System.out.println("�ݸ޴� �Դϴ�.");
		}
		else if (medal == "Silver" || medal == "S" || medal == "s" || medal == "Sil") {
			System.out.println("���޴� �Դϴ�.");
		}
		else if (medal == "Bronze" || medal == "B" || medal == "b" || medal == "Bro") {
			System.out.println("���޴� �Դϴ�.");
		}
		else {
			System.out.println("�޴��� �����ϴ�.");
		}
		
	}

}
