package lec04;

public class ProcureItemDocument {

	public int id;
	public String procureItemName;
	public String procureItemUnitName;
	public int procureItemQty;
	public int procureItemPrice;
	
	public int addProcureItemQtyPrice() {
		int result=0;
		result =procureItemQty * procureItemPrice;
		return result;
	}
	
	public void showEachVariableValue() {//void는 아무런 리턴값도 남기지 않는 메서드.
		System.out.println("id ::: " + id);
		System.out.println("procureItemName :::" + procureItemName);
		System.out.println("procureItemUnitName :::" + procureItemUnitName);
		System.out.println("procureItemQty :::" + procureItemQty);
		System.out.println("procureItemPrice :::" + procureItemPrice);
	}
	
	public String concatStringValues() {
		String returnValue = "";
		returnValue="안녕하세요." + "구매문서품목 클래스입니다.";
		return returnValue;
	}
	//하드코딩(변수를 고정값으로 저장해놓는것)은 전혀 진행하지않고 데이터베이스의 값을 특정변수에 저장하며 유기적으로 프로그램을 작성함
	
}
