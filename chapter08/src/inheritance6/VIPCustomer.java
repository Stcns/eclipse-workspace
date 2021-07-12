package inheritance6;

public class VIPCustomer extends Customer {
	
	private int agentID;			// VIP ���� ���� ID
	double saleRatio;				// VIP ������
	
	public VIPCustomer() {
		//super();					// ���� Ŭ������ �����ڸ� ȣ��, super(); : ���� Ŭ������ �⺻ ������ ȣ��
		customerGrade = "VIP";		// VIP ���
		bonusRatio = 0.05;			// ���ʽ� ����Ʈ VIP ���� ���� 5%
		saleRatio = 0.1;			// ������ 10%
	}
	
	public int getAgentID() {		// VIP���Ը� �ʿ��� �޼���(VIP���� ���� ���� ID)
		return agentID;
	}
	
}