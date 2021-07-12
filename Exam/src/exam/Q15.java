package exam;

public class Q15 {

	public static void main(String[] args) {

		for(int i = 1; i <= 99; i++) {
			if(i / 10 % 3 == 0 && i % 3 == 0 )
				System.out.println(i + "¹Ú¼ö Â¦Â¦");
			else if(i / 10 % 3 == 0)
				System.out.println(i + "¹Ú¼ö Â¦");
			else if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				System.out.println(i + "¹Ú¼ö Â¦");
			
		}
		
	}

}
