package lec04;

public class ObjClass02 {

	public static void main(String[] args) {
		//static 변수는 할당되는 메모리가 다르기때문에 함부로 남발하면 안됨.
		
		ProcurementDocument procurementDocument = new ProcurementDocument();
		ProcurementDocument procurementDocument2 = new ProcurementDocument();
		
		procurementDocument.procureRequestDocumentQty = 10;
		procurementDocument.orderRequestDocumentQty = 5;
		procurementDocument.orderDocumentQty = 3;
		procurementDocument.contractDocumentQty = 20;
		procurementDocument.estimateDocumentQty = 25;
		
		System.out.println(procurementDocument.procureRequestDocumentQty);
		System.out.println(procurementDocument.orderRequestDocumentQty);
		System.out.println(procurementDocument.orderDocumentQty);
		System.out.println(procurementDocument.contractDocumentQty);
		System.out.println(procurementDocument.estimateDocumentQty);
		
		int totalDocumentQty = procurementDocument.totalDocumentQtyDailyMake();
		System.out.println("totalQty ::: " + totalDocumentQty);
		
		int staticTotalDocu = procurementDocument.staticValueCaculateDailyDocument();
		System.out.println("staticTotal ::: " + staticTotalDocu);
		
	}
	
}
