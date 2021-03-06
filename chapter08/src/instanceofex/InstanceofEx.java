package instanceofex;

class Person{}
class Student extends Person{}				// Person <- Student
class Researcher extends Person{}			// Person <- Researcher
class Professor extends Researcher{}		// Person <- Researcher <- Professor


public class InstanceofEx {

	static void print(Person p) {				// 업캐스팅, Person p = new Student() 식으로 메소드 내에서 업캐스팅됨
		if (p instanceof Person) {				// Person p = new Researcher(), Person p = new Professor() ..
			System.out.print("Person ");
		}
		if (p instanceof Student) {
			System.out.print("Student ");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() -> \t"); print(new Student());			// 객체 생성 후 print(Person p) 메소드 호출
		System.out.print("new Researcher() -> \t"); print(new Researcher());
		System.out.print("new Professor() -> \t"); print(new Professor());
		
		
		
	}

}
