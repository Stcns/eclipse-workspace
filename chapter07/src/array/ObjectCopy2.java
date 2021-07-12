package array;

public class ObjectCopy2 {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		System.out.println("==bookArray2의 원래 값==");	// 처음에 bookArray2는 모든 인덱스에 null이 들어가있음
		for(int i = 0; i < bookArray2.length; i++) {
			System.out.println(bookArray2[i]);
		}
		
		bookArray1[0] = new Book("태백산맥", "조정래");		// bookArray1에 각 인덱스에 값 할당
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);	// bookArray1과 같은 값 bookArray2에 복사
		
		System.out.println("==bookArray2에 복사한 후 값==");
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setBookName("나목");	// bookArray1의 인덱스0의 값을 바꿈
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("=== bookArray1 ===");		// bookArray1의 인덱스0 값이 바뀜
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("=== bookArray2 ===");		// bookArray2의 인덱스0 값도 따라 바뀜
		for(int i = 0; i < bookArray2.length; i++) {	// bookArray1을 복사했기 때문에 값도 따라 바뀜 -> 얕은 복사
			bookArray2[i].showBookInfo();
		}
		
	}

}
