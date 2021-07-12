package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}	
}

public class AnimalTest1 {
	
	public static void main(String[] args) {

		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}

	public void moveAnimal(Animal animal) {		// Animal animal = new Human();, = new Tiger();, = new Eagle();
		animal.move();							// 원래는 Animal 클래스의 move()를 호출해야하지만 재정의(override)되어서
	}											// 생성된 객체에 맞는 클래스의 move() 메소드를 호출한다.(업캐스팅)
}							// 상위 클래스를 자료형으로 레퍼런스 변수를 선언하고 하위 클래스의 객체를 생성 및 할당하여 활용
