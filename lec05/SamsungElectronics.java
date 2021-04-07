package lec05;

public class SamsungElectronics extends Electronics{

	int productsCount = 20;
	
	public void showCount() {
		System.out.println("show value ::: " + productsCount);
		System.out.println("super. show value ::: " + super.productsCount);
		//super는 부모클래스의 값을 끌어다 쓰는 메서드
	}
}
