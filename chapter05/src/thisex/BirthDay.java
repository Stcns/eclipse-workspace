package thisex;


public class BirthDay {

	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);	//this�� ����Ű�� ��ü�� �� �޸� �ּ�
	}


	
	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);	//bDay ��ü�� RAM�� ���ּ�(JVM) ���
		bDay.printThis();	//bDay�� ����Ű�� ���޸� �ּ�
		
		System.out.println(bDay.year);
	}

}