package abstractex;

public abstract class Computer {		// �߻� �޼ҵ带 �����Ϸ��� public class ���� abstract�� ���� �߻� Ŭ�������� ��
										// ���ø�, �����ӿ�ũ ����, �������̽� ������ ���
	
	public abstract void display();		// �߻� �޼ҵ� : ����θ� �����ϰ�, �����(�����ڵ尡 �ִ� {})�� ���� �޼ҵ�
	abstract public void  typing();		// �߻� �޼ҵ��� abstract�� public(����������)�� ������ �ٲ� �ȴ�.
	
//	public void add(int a, int b) {}	// �Ϲ� �޼ҵ�
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");	// ���� Ŭ������ �Ϲ� �޼ҵ�� ���� Ŭ������ ��� ������ ����
	}											// �߻� �޼ҵ�� ���� Ŭ�������� �������� �޼ҵ带 ���� �����ϵ��� ��
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}