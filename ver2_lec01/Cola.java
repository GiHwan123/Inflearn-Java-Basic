package ver2_lec01;

public class Cola {
	
	public String colaName = "�ݶ�";
	
	public void showColaProperty() {
		System.out.println("���� ������ ź��");
	}
	
	
	public void showColaName(String getColaName) {
		colaName = String.valueOf(getColaName);
		System.out.println("�ݶ� �̸� ::: " + colaName);
	}

	
}
