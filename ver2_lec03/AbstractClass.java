package ver2_lec03;

public abstract class AbstractClass {

	//��ü���� ����� ��õ������� �߻�Ŭ����. �������̽��� �����ϰ� �޼ҵ��(���)�鸸 �����س��� ��ü���� ����� Ŭ�������� ����
	//�߻�Ŭ������ ����ϱ� ���� ����� ���� ��쿡�� ������ ��� �޼ҵ� ���Ǹ� �������.(�������̵� ���־����)
	
	public abstract void methodFirst();
	
	public void methodSecond() {//�߻�Ŭ������ �߻�Ŭ���� ������ ���� �̷������� ���ǰ� ���������� �������̽��� �ƿ� �Ұ�����
		// �̰��� �������̽��� �߻�Ŭ������ ���� ū ������
		System.out.println("�߻�Ŭ���� �޼ҵ� ������");
		methodFirst();
	}
	
	public int methodThird() {
		return 10 + 2;
	}
}
