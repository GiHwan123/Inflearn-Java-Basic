package lec04;

public class ObjClass03 {

	public static void main(String[] args) {
		
		ProcureItemDocument procureItemDocument = new ProcureItemDocument();
		
		procureItemDocument.id=1;
		procureItemDocument.procureItemName="����";
		procureItemDocument.procureItemUnitName="��";
		procureItemDocument.procureItemPrice=1000;
		procureItemDocument.procureItemQty=10;
		
		int addItemQtyPrice =  procureItemDocument.addProcureItemQtyPrice();
		System.out.println("���� ::: " + addItemQtyPrice);
		String strval=procureItemDocument.concatStringValues();
		System.out.println("��Ʈ�� ::: " + strval);
		procureItemDocument.showEachVariableValue();
		
	}
}
