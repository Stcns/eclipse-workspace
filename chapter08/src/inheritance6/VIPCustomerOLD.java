package inheritance6;

public class VIPCustomerOLD {

	private int customerID;			// �� ���̵�
	private String customerName;	// �� �̸�
	private String customerGrade;	// �� ���
	int bonusPoint;					// ���ʽ� ����Ʈ
	double bonusRatio;				// ���� ����
	
	private int agentID;			// VIP �� ���� ID
	double saleRatio;				// VIP ������
	
	public VIPCustomerOLD() {
		customerGrade = "VIP";		// VIP ���
		bonusRatio = 0.05;			// ���ʽ� ����Ʈ VIP ���� ���� 5%
		saleRatio = 0.1;			// ������ 10%
	}
	
	public int calcPrice(int price) {	
		bonusPoint += price * bonusRatio;	// ���ʽ� ����Ʈ ���
		return price - (int)(price * saleRatio);	// 10% ������ ����
	}
	
	public int getAgentID() {		// VIP���Ը� �ʿ��� �޼���(VIP�� ���� ���� ID)
		return agentID;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
	
}
