package abstractex;

public abstract class Computer {		// 추상 메소드를 포함하려면 public class 역시 abstract를 가진 추상 클래스여야 함
										// 템플릿, 프레임워크 구현, 인터페이스 구현에 사용
	
	public abstract void display();		// 추상 메소드 : 선언부만 존재하고, 실행부(구현코드가 있는 {})가 없는 메소드
	abstract public void  typing();		// 추상 메소드의 abstract는 public(접근제한자)과 순서가 바뀌어도 된다.
	
//	public void add(int a, int b) {}	// 일반 메소드
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");	// 상위 클래스의 일반 메소드는 하위 클래스에 모두 적용을 위함
	}											// 추상 메소드는 하위 클래스에서 개인적인 메소드를 각자 구현하도록 함
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
