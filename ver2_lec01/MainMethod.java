package ver2_lec01;

public class MainMethod {
	
	public static void main(String[] args) {
		
		CocaCola coca = new CocaCola();//��ī�ݶ� ��ü ����
		coca.showColaName("��ī�ݶ�");
		coca.showColaProperty();
		coca.whereIsCocaCola();
		
		PepsiCola pepsi = new PepsiCola();//����ݶ� ��ü ����
		pepsi.showColaName("����ݶ�");
		pepsi.showColaProperty();
		pepsi.whereIsPepsiCola();
	}

}
