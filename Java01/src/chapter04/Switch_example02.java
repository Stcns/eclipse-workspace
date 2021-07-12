package chapter04;

public class Switch_example02 {

	public static void main(String[] args) {

		String medal = "aa";
		
		switch (medal) {
			case "Gold": case "G": case "g": case "Gol":	//한줄에 case 여러개를 설정 가능
				System.out.println("금메달 입니다.");
				break;
			case "Silver": case "S": case "s":
				System.out.println("은메달 입니다.");
				break;
			case "Bronze": case "B": case "b":
				System.out.println("동메달 입니다.");
				break;
			default:										//해당되는 case가 없으면 default 실행
				System.out.println("메달이 없습니다.");
				break;
			
		}
		
	}

}
