package ver2_lec04;

public class AnonyClassMainMethod {

	public static void main(String[] args) {
		
		Runnable action = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable�� ���� ���Դϴ�.");
			}
		};
		
		action.run();
		
	}
}
