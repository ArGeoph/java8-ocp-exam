package chapter1;

public class Enclosing {
	private static class Nested {
		private int price = 6;
	}
	
	public static void main(String[] args) {
		Nested nested = new Enclosing.Nested();
		System.out.println(nested.price);
	}
}