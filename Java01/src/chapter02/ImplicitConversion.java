package chapter02;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);	//1byte : byte
		System.out.println(iNum);	//4byte : int
		
		int iNum2 = 20;
		float fNum = iNum2;			//묵시적 형변환. int->float로 큰 범위로 변환됨
		
		System.out.println(iNum2);	//int
		System.out.println(fNum);	//float
		
		double dNum;
		dNum = fNum + iNum;			//float(20.0) + int(10) = double(30.0)
		System.out.println(dNum);

	}

}
