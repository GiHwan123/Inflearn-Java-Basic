package ver2_lec03;

public class MainMethod {

	public static void main(String[] args){
		
		System.out.println("���� �޼ҵ带 �����մϴ�.");
		
		ExtendsClass extendsClass = new ExtendsClass();
		

		extendsClass.methodSecond();
		int thirdResult = extendsClass.methodThird();
		System.out.println("�� ��° ���Դϴ�. ::: " + thirdResult);
	}
}
