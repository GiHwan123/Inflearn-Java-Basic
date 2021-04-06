package lec02;

public class WhileLoop04 {

	public static void main (String[] args) {
		/*
		 * int WhileCnt=0; while (WhileCnt<10) { WhileCnt++;
		 * System.out.println("WhileCnt:::" + WhileCnt); }
		 */
		/*
		 * int whilecnt=0; boolean isTrue= true;
		 * 
		 * while(isTrue) { whilecnt++; System.out.println("if whileCnt´Â" + whilecnt);
		 * if(whilecnt==10) { break; } }
		 */
		for (int i=0;i<10;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}
	}
}
