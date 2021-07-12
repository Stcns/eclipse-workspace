package inheritance;

public class Point {
	
	private int x, y;	// 좌표를 나타내는 변수
						// protected : default 접근 제한자와 동일
						//				다른 패키지의 상속된 클래스의 접근을 허용
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
}
