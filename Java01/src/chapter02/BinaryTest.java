package chapter02;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;		// 기본적으로 10진법으로 값을 할당
		int bNum = 0B1010;	//0B : 2진법으로 값을 할당(0b도 가능)
		int oNum = 012;		//0	 : 8진법으로 값을 할당
		int hNum = 0XA;		//0X : 16진법으로 값을 할당(0x도 가능)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
	}
	
}
