package ver2_lec05.generics02.ex01;

public class ExeA<T> {//T�� ������Ÿ���� �������ִ� ���׸�. �Ÿ�Ե� ������ ������.
	
	private T t;
	
	public ExeA(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
