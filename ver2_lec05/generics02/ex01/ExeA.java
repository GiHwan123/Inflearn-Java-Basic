package ver2_lec05.generics02.ex01;

public class ExeA<T> {//T는 임의의타입을 지정해주는 제네릭. 어떤타입도 지정이 가능함.
	
	private T t;
	
	public ExeA(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
