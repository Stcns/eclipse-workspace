package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump�� �� ������.");
	}

	@Override
	public void turn() {
		System.out.println("Turn�� �� ������.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �ʺ��� �����Դϴ�. *****");
	}

	/*
	@Override
	public void gotest() {		// �������̵� �Ұ� : final (���� Ŭ����)
		
	}
	
	public void gotest2() {
		
	}
	*/
}