package lec02;

public class CaseLogic02 {

	public static void main(String[] args) {
		
		/*
		 * int paramA= 1; switch(paramA) { case 0: System.out.println("0�Դϴ�."); break;
		 * case 1: System.out.println("1�Դϴ�."); break; case 2:
		 * System.out.println("2�Դϴ�."); break; case 3: System.out.println("3�Դϴ�.");
		 * break; case 4: System.out.println("4�Դϴ�."); break; }
		 */
		/*
		 * int paramA=1; switch(paramA) { case 0: case 1:
		 * System.out.println("0�� 1 �Դϴ�."); break; case 2: case 3:
		 * System.out.println("2�� 3 �Դϴ�."); break; default:
		 * System.out.println("default �Դϴ�."); break; }
		 */
		
		/*
		 * int cnt=2; if(cnt%2==0) { if(cnt==2) { System.out.println("int�� 2 �Դϴ�."); }
		 * else { System.out.println("int �� 2�� �ƴմϴ�."); } }
		 */
		int paramA=9;
		switch(paramA) {
		case 0:
			System.out.println("0�Դϴ�.");
			break;
		case 1:
			System.out.println("1�Դϴ�.");
			break;
		case 2:
			System.out.println("2�Դϴ�.");
			break;
		case 3:
			System.out.println("3�Դϴ�.");
			break;
		case 4:
			System.out.println("4�Դϴ�.");
			break;
		case 5:
			System.out.println("5�Դϴ�.");
			break;
			default:
				System.out.println("paramA�� default �Դϴ�.");
				break;
		}
	}
}
