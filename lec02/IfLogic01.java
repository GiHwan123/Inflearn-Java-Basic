package lec02;

public class IfLogic01 {

	public static void main(String[] args) {
		
		/*
		 * if(true) { System.out.println("true 입니다."); }
		 * 
		 * if(false) { System.out.println("false 입니다."); }
		 */
		
		/*
		 * if(true) { System.out.println("ifelse true 입니다."); }else if (false) {
		 * System.out.println("ifelse false 입니다."); }
		 */
		/*
		 * int paramA=1; if (paramA==2) { System.out.println("2입니다."); }else if(paramA
		 * ==1 ) { System.out.println("1입니다."); }
		 */
/*		int paramA=1;
		if (paramA==1) {
			System.out.println("첫번째 참입니다.");
		}else if(paramA==1) {
			System.out.println("두번째 참입니다.");
		}*/
		/*
		 * int paramA=1; if (paramA==2) { System.out.println("paramA는2"); }else
		 * if(paramA==3) { System.out.println("paramA는3"); }else {
		 * System.out.println("paramA는1"); }
		 */
		int paramA=1;
		if (paramA==2) {
			System.out.println("paramA는 2입니다.");
		}else {
			System.out.println("paramA는 else문 입니다.");
		}
	}
}
