package chapter04;

public class Switch_If_convert {

	public static void main(String[] args) {

		String medal = "Gold";			// switch문을 if ~ else if ~ else문으로
		
		if (medal == "Gold" || medal == "G" || medal == "g" || medal == "Gol") {
			System.out.println("금메달 입니다.");
		}
		else if (medal == "Silver" || medal == "S" || medal == "s" || medal == "Sil") {
			System.out.println("은메달 입니다.");
		}
		else if (medal == "Bronze" || medal == "B" || medal == "b" || medal == "Bro") {
			System.out.println("동메달 입니다.");
		}
		else {
			System.out.println("메달이 없습니다.");
		}
		
	}

}
