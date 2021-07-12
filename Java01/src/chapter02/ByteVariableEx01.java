package chapter02;

public class ByteVariableEx01 {

	public static void main(String[] args) {
		
		byte num;
		num = -128;		//byte : 1byte (-2^7 ~ 2^7-1), (-128 ~ 127)
		
		byte num2;
		num2 = 127;
		
		short num3 = -32768;	//short : 2byte(-2^15 ~ 2^15-1)
		short num4 = 32767;		//-32768 ~ 32767
		
		int num5 = 123456789;		//int : 4byte(-2^31 ~ 2^31-1) 기본형식
		//short num6 = 123456789;
		
		long num6 = 1234567890000L;	//long : 8byte(-2^63 ~ 2^63-1), 숫자 뒤에 꼭 l 또는 L을 붙여야함
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
	}

}
