package lec04;
//�������� ������ ��ü���� ���� Ȱ���� Ŭ���� 1
public class ObjClass01 {

	public static void main(String[] args) {
		
		ProcureItemVO procureItemVO = new ProcureItemVO();
		
		System.out.println("�ƹ��͵� �������� ���� ��ü ::: " + procureItemVO.toString());
		
		procureItemVO.setId(1);
		procureItemVO.setName("������");
		procureItemVO.setPrice(10000);
		procureItemVO.setQuantity(2);
		
		System.out.println("������ VO :::" + procureItemVO.toString());
		
		ProcureItemVO procureItemNull = new ProcureItemVO();
		System.out.println(procureItemNull.toString());
		//NullPointerException ����ó�� try~catch ������ ó�����־����.
		// String ������ ���������̱� ������ ==�� �����ڰ� �ƴ� .equals �޼���� �����־����.
	}
}
