package chapter3;

public class GenericsTest<T> {
	T t;
	
	public GenericsTest(T t) {
		this.t = t;
	}
	
	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		System.out.println(new GenericsTest<String>("hi").toString());
		System.out.println(new GenericsTest("hello").toString());
	}
}
