package chapter04;

public class Q4 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		for(a = 1; a <= 4; a++) {
			for(b = a; b <= 3; b++)
				System.out.print(" ");
			for(c = 1; c<= (a*2)-1; c++)
				System.out.print("*");
			System.out.println();
		}
		
	}

}
