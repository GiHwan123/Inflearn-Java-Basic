package lec02;
import java.util.*;

public class ForLoop03 {

	public static void main(String[] args) {
		
		/*
		 * for(int i=0;i<5;i++) { System.out.println("i��" + i + "�Դϴ�."); }
		 */
		
		/*
		 * int whileCnt=0; while(whileCnt<5) { System.out.println("�ݺ���++" + whileCnt++ +
		 * "�Դϴ�."); } whileCnt=0; while(whileCnt<5) { System.out.println("++�ݺ���" +
		 * ++whileCnt + "�Դϴ�."); }
		 */
		/*
		 * for(int i=1;i<=5;i++) { System.out.println("1����.." + i + "�Դϴ�."); }
		 */
		/*
		 * ArrayList<String> strList= new ArrayList<>(); strList.add("�ѹ���");
		 * strList.add("ȸ���"); strList.add("�繫��"); strList.add("��ȹ��");
		 * strList.add("�λ��"); for (String dep : strList) { System.out.println("�μ� : " +
		 * dep); }
		 */
		/*
		 * for(int i=10;i>0;i--) { System.out.println("i��" + i + "�Դϴ�."); }
		 */
		/*
		 * for (int i=10;i>0;i-=2) { System.out.println("i-=2��" + i + "�Դϴ�."); }
		 */
		for(int x=2;x<=9;x++) {
			for (int y=1;y<=9;y++) {
				System.out.println(x + "*" + y + "=" + x*y);
			}
		}
	}
}
