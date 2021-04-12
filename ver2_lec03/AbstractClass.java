package ver2_lec03;

public abstract class AbstractClass {

	//구체적인 기능이 명시되지않은 추상클래스. 인터페이스와 유사하게 메소드명(기능)들만 정의해놓고 구체적인 기능은 클래스에서 정의
	//추상클래스를 사용하기 위해 상속을 받을 경우에는 무조건 모든 메소드 정의를 해줘야함.(오버라이딩 해주어야함)
	
	public abstract void methodFirst();
	
	public void methodSecond() {//추상클래스는 추상클래스 내에서 직접 이런식으로 정의가 가능하지만 인터페이스는 아예 불가능함
		// 이것이 인터페이스와 추상클래스의 가장 큰 차이점
		System.out.println("추상클래스 메소드 세컨드");
		methodFirst();
	}
	
	public int methodThird() {
		return 10 + 2;
	}
}
