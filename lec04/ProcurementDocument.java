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
	
	public int staticValueCaculateDailyDocument() {//이런식의 고정된 값을 개발자가 임의로 집어넣어주는
		//하드코딩 방식은 실무에서는 전혀 사용되지않고 동적으로 데이터값을 할당하는 방식만이 사용됨
		int totalDocuCnt=0;
		
		totalDocuCnt = 10 + 5 + 1+ 3;
		
		return totalDocuCnt;
	}
}
