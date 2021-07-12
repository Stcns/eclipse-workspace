package exam;

public class Q15_1 {

	public static void main(String[] args) {

		for(int i = 1; i <= 99; i++) {
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print(i + "¹Ú¼ö Â¦");
				if (i / 10 >= 1 && i % 3 == 0) {
					System.out.print("Â¦");
				}
				System.out.println();
			}
			else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9 ) {
				System.out.print(i + "¹Ú¼ö Â¦");
				System.out.println();
			}
		}
		
	}

}
