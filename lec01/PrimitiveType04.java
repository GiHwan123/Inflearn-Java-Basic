package lec01;

public class PrimitiveType04 {

	//�ּ��� ���� ����Ͻ� �������� ���Ƴ��⵵ ��
	public static void main(String[] args) {
		
		boolean isTrue = false;
		
		char oneChar = '��';
		char twoChar = '��';
		
		byte firstByte 		= 1;
		byte secondByte 	= 2;
		int thirdInt 		= 3;
		long fourthLong 	= 4;
		
		int frontData =2;
		int backData =3;
		int multipleData = frontData * backData;
		System.out.println("multipleData :::" + multipleData);
		
		int intA=0;
		long longB=201;
		//int intAlongB=intA + longB;//10L�� ����(int)�� 20L�� ����(long)�� �� ���Ǹ� 10L�� ����(int)�� ��°Ͱ� ���� ��ġ�̱⶧���� �����߻�
		long longBintA=intA + longB;// long�� �ڷ����� �� ũ�⶧���� �� ���� ����
		
		float floatA=10.1f;
		double doubleB=20.35678;//�Ǽ����� float���� double�� �ַ� ���̻����
		double floatAB = floatA + doubleB;
		System.out.println(doubleB);
		System.out.println(floatAB);
		
		int accountDocumentCount = 10;
		int humanResourceDocumentCount = 20;
		int procureDocumentCount = 5;
		int productionDocumentCount = 15;
		int salesDocumentCount = 25;
		
		int totalDailyDocumentCount = accountDocumentCount + humanResourceDocumentCount + 
		procureDocumentCount + productionDocumentCount + salesDocumentCount;
		
		System.out.println("���� �μ� ���� ���귮 :::" + totalDailyDocumentCount);
	}
}
