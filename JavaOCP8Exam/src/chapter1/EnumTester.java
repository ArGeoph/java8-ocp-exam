package chapter1;

public class EnumTester {

	public EnumTester() {
		
	}
	public static void main(String ... args) {
		for (ExampleFromOCPBook example: ExampleFromOCPBook.values() ) {
			System.out.println(example.ordinal() + " " + example.name() + " ");
			example.hours();
		}
		
	}

}
