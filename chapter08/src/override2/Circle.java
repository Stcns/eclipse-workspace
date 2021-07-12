package override2;

class Shape2 {
	protected String name;
	public void paint() {
		draw();
	}
	
	public void draw() {
		System.out.println("Shape2");
	}
}

public class Circle extends Shape2 {

	/*
	@Override
	public void draw(int a) {
		System.out.println("Circle");
	}
	*/
	
	@Override						// 오버라이드 되지 않을 때(별개의 메소드로 인식될때) 오류메세지 뜨게함
	public void draw() {
		System.out.println("Circle");
	}

	
	public static void main(String[] args) {

		Shape2 b = new Circle();		// 업캐스팅
		b.paint();
		
	}


}
