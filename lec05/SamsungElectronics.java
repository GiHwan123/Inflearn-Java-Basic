package lec05;

public class SamsungElectronics extends Electronics{

	int productsCount = 20;
	
	public void showCount() {
		System.out.println("show value ::: " + productsCount);
		System.out.println("super. show value ::: " + super.productsCount);
	}
}