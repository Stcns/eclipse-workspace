package exam;

public class Q14 {

	public static void main(String[] args) {

		int intArray[] = new int[10];
		int sum = 0;
	
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (int)(Math.random()* 10 + 1);
			System.out.print(intArray[i] + " ");
			sum += intArray[i];
		}
	
		System.out.println();
		System.out.println("Æò±ÕÀº " + (double)sum / intArray.length);
	
	}

}
