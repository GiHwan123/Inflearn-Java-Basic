package lec02;

public class CaseLogic02 {

	public static void main(String[] args) {
		
		/*
		 * int paramA= 1; switch(paramA) { case 0: System.out.println("0입니다."); break;
		 * case 1: System.out.println("1입니다."); break; case 2:
		 * System.out.println("2입니다."); break; case 3: System.out.println("3입니다.");
		 * break; case 4: System.out.println("4입니다."); break; }
		 */
		/*
		 * int paramA=1; switch(paramA) { case 0: case 1:
		 * System.out.println("0과 1 입니다."); break; case 2: case 3:
		 * System.out.println("2과 3 입니다."); break; default:
		 * System.out.println("default 입니다."); break; }
		 */
		
		/*
		 * int cnt=2; if(cnt%2==0) { if(cnt==2) { System.out.println("int는 2 입니다."); }
		 * else { System.out.println("int 는 2가 아닙니다."); } }
		 */
		int paramA=9;
		switch(paramA) {
		case 0:
			System.out.println("0입니다.");
			break;
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
			default:
				System.out.println("paramA는 default 입니다.");
				break;
		}
	}
}
