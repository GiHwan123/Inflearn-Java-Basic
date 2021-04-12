package ver2_lec05.exception01;

public class TryCatchFinally02 {
	
	public static void main(String[] args) {
		/*
		 * try { System.out.println("try-catch-finally 구문이 실행되었습나다.");
		 * 
		 * int allSum=10/0;
		 * 
		 * } catch (Exception e) {//예외 발생 시 catch 문 실행 // TODO: handle exception
		 * System.out.println("예외가 발생했습니다."); }finally {//finally 구문은 예외가 발생했든 안했든 무조건
		 * 실행됨 System.out.println("try-catch-finally 구문이 종료되었습니다."); }
		 */
		
		try {
			System.out.println("업무 로직입니다.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외가 발생하였네요.");
		}finally {
			System.out.println("마지막 위치입니다.");
		}
		
		
	}

}
