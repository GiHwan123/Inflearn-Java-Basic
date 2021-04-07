package lec03;

public class Sample01 {

	public static void main (String[] args) {
		/*
		 * //구구단 for (int i=2;i<=9;i++) { System.out.println(i + "단"); for(int
		 * j=1;j<=9;j++) { System.out.println(i+"x"+j+"="+i*j); } }
		 */
		/*
		 * for(int i=0;i<10;i++) { int a = (int)(Math.random()*10); System.out.println(i
		 * + ":::" + a); }
		 */
		/*
		 * int getMathRandom = (int) (Math.random()*10);
		 * System.out.println("getMathRandom :::" + getMathRandom); if(getMathRandom % 2
		 * ==0) { System.out.println("짝수입니다."); if(getMathRandom % 4 ==0) {
		 * System.out.println("4의 배수입니다."); }else { System.out.println("4의 배수가 아닙니다.");
		 * } }else { System.out.println("홀수입니다."); if(getMathRandom%3==0) {
		 * System.out.println("3의 배수입니다."); }else { System.out.println("3의 배수가 아닙니다.");
		 * } }
		 */
		/*
		 * for (int i=0;i<10;i++) { if(i%2==0) { System.out.println(i +
		 * "현재 반복문은 짝수입니다."); }else { System.out.println(i + "현재 반복문은 홀수입니다."); } }
		 */
		/*
		 * for(int i=0;i<10;i++) { if (i % 3 ==2) { System.out.println(i +
		 * "::: 나머지는 2입니다."); }else if(i % 3 ==1) { System.out.println(i +
		 * "::: 나머지는 1입니다."); }else if(i % 3 ==0) { System.out.println(i +
		 * "::: 나머지는 0 입니다."); } }
		 */
		StringBuilder sbPlus = new StringBuilder("");
		String[] arrStr = new String[] {"가","나","다","라","마","바","사","아","자","차"};
		
		for (int i=0;i<10;i++) {
			int mathRandom = (int)(Math.random()*10);
			System.out.println(i + ":::" + arrStr[mathRandom]);
			sbPlus.append(arrStr[mathRandom]);//스트링을 이어붙이는 메서드
		}
		System.out.println("문자열 :::" + sbPlus.toString());
		
	}
}
