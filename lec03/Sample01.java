package lec03;

public class Sample01 {

	public static void main (String[] args) {
		/*
		 * //������ for (int i=2;i<=9;i++) { System.out.println(i + "��"); for(int
		 * j=1;j<=9;j++) { System.out.println(i+"x"+j+"="+i*j); } }
		 */
		/*
		 * for(int i=0;i<10;i++) { int a = (int)(Math.random()*10); System.out.println(i
		 * + ":::" + a); }
		 */
		/*
		 * int getMathRandom = (int) (Math.random()*10);
		 * System.out.println("getMathRandom :::" + getMathRandom); if(getMathRandom % 2
		 * ==0) { System.out.println("¦���Դϴ�."); if(getMathRandom % 4 ==0) {
		 * System.out.println("4�� ����Դϴ�."); }else { System.out.println("4�� ����� �ƴմϴ�.");
		 * } }else { System.out.println("Ȧ���Դϴ�."); if(getMathRandom%3==0) {
		 * System.out.println("3�� ����Դϴ�."); }else { System.out.println("3�� ����� �ƴմϴ�.");
		 * } }
		 */
		/*
		 * for (int i=0;i<10;i++) { if(i%2==0) { System.out.println(i +
		 * "���� �ݺ����� ¦���Դϴ�."); }else { System.out.println(i + "���� �ݺ����� Ȧ���Դϴ�."); } }
		 */
		/*
		 * for(int i=0;i<10;i++) { if (i % 3 ==2) { System.out.println(i +
		 * "::: �������� 2�Դϴ�."); }else if(i % 3 ==1) { System.out.println(i +
		 * "::: �������� 1�Դϴ�."); }else if(i % 3 ==0) { System.out.println(i +
		 * "::: �������� 0 �Դϴ�."); } }
		 */
		StringBuilder sbPlus = new StringBuilder("");
		String[] arrStr = new String[] {"��","��","��","��","��","��","��","��","��","��"};
		
		for (int i=0;i<10;i++) {
			int mathRandom = (int)(Math.random()*10);
			System.out.println(i + ":::" + arrStr[mathRandom]);
			sbPlus.append(arrStr[mathRandom]);//��Ʈ���� �̾���̴� �޼���
		}
		System.out.println("���ڿ� :::" + sbPlus.toString());
		
	}
}
