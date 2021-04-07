package lec04;
//이전까지 생성한 객체들을 직접 활용할 클래스 1
public class ObjClass01 {

	public static void main(String[] args) {
		
		ProcureItemVO procureItemVO = new ProcureItemVO();
		
		System.out.println("아무것도 셋팅하지 않은 객체 ::: " + procureItemVO.toString());
		
		procureItemVO.setId(1);
		procureItemVO.setName("옥수수");
		procureItemVO.setPrice(10000);
		procureItemVO.setQuantity(2);
		
		System.out.println("옥수수 VO :::" + procureItemVO.toString());
		
		ProcureItemVO procureItemNull = new ProcureItemVO();
		System.out.println(procureItemNull.toString());
		//NullPointerException 예외처리 try~catch 문으로 처리해주어야함.
		// String 변수는 참조변수이기 때문에 ==비교 연산자가 아닌 .equals 메서드로 비교해주어야함.
	}
}
