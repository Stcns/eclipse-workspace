package inheritance4;

class A {
	public A() {
		System.out.println("생성자 A");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("생성자 B");
	}
}

class C extends B {
	public C() {
		super();						// super : 슈퍼클래스(부모클래스), 부모클래스의 생성자 호출, 기본적으로 생략되어 있는 상태
		System.out.println("생성자 C");	// super();는 반드시 첫번째 라인에 와야함
	}
}

public class ConstructorEx02 {

	public static void main(String[] args) {
		
		C c;
		c = new C();
		
	}
	
}
