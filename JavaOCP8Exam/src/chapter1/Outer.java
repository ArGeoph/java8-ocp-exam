package chapter1;

public class Outer {
	private String greeting = "Hi";
	
	protected static class Inner {
			public int repeat = 3;
			public void go() {
				for (int i = 0; i < repeat; i++) {
					//System.out.println(greeting);
					System.out.println("Test");
				}
			}			
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		//Inner inner = outer.new Inner();
		//inner.go();
		//outer.callInner();
		Inner inner = new Inner();
		inner.go();
		
	}
}