package lec02;

public class IfLogic01 {

	public static void main(String[] args) {
		
		/*
		 * if(true) { System.out.println("true �Դϴ�."); }
		 * 
		 * if(false) { System.out.println("false �Դϴ�."); }
		 */
		
		/*
		 * if(true) { System.out.println("ifelse true �Դϴ�."); }else if (false) {
		 * System.out.println("ifelse false �Դϴ�."); }
		 */
		/*
		 * int paramA=1; if (paramA==2) { System.out.println("2�Դϴ�."); }else if(paramA
		 * ==1 ) { System.out.println("1�Դϴ�."); }
		 */
/*		int paramA=1;
		if (paramA==1) {
			System.out.println("ù��° ���Դϴ�.");
		}else if(paramA==1) {
			System.out.println("�ι�° ���Դϴ�.");
		}*/
		/*
		 * int paramA=1; if (paramA==2) { System.out.println("paramA��2"); }else
		 * if(paramA==3) { System.out.println("paramA��3"); }else {
		 * System.out.println("paramA��1"); }
		 */
		int paramA=1;
		if (paramA==2) {
			System.out.println("paramA�� 2�Դϴ�.");
		}else {
			System.out.println("paramA�� else�� �Դϴ�.");
		}
	}
}
