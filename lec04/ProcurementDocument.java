package lec04;

public class ProcurementDocument {

	public int procureRequestQty;
	public int orderRequestDocumentQty;
	public int orderDocumentQty;
	public int contractDocumentQty;
	public int estimateDocumentQty;
	
	public int totalDocumentQtyDailyMake() {
		
		int totalDocument = procureRequestQty + orderRequestDocumentQty + orderDocumentQty
				+ contractDocumentQty + estimateDocumentQty;
		
		return totalDocument;
	}
	
	public int staticValueCaculateDailyDocument() {//�̷����� ������ ���� �����ڰ� ���Ƿ� ����־��ִ�
		//�ϵ��ڵ� ����� �ǹ������� ���� �������ʰ� �������� �����Ͱ��� �Ҵ��ϴ� ��ĸ��� ����
		int totalDocuCnt=0;
		
		totalDocuCnt = 10 + 5 + 1+ 3;
		
		return totalDocuCnt;
	}
}
