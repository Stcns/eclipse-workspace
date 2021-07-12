package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point();		// Point 클래스의 객체 생성
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();	// ColorPoint 객체
		cp.set(3, 4);			// set 메소드는 ColorPoint 클래스에 있는 것이 아닌
		cp.setColor("red");		// 상위 클래스 Point 클래스에게 상속받은 메소드
		cp.showColorPoint();
		
	}

}
