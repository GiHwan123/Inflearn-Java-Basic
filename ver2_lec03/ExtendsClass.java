package ver2_lec03;

public class ExtendsClass extends AbstractClass{

	@Override
	public void methodFirst() {
		// TODO Auto-generated method stub
		System.out.println("상속받은 클래스의 오버라이드된 methodFirst.");
	}

	@Override
	public void methodSecond() {
		// TODO Auto-generated method stub
		System.out.println("상속받은 클래스에서 약간의 로직이 더 들어갑니다.");
		super.methodSecond();
	}

	@Override
	public int methodThird() {
		// TODO Auto-generated method stub
		int getData = super.methodThird();
		int addMoreValue = 12;
		return getData + addMoreValue;
	}

	
	
}
