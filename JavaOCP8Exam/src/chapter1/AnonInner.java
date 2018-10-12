package chapter1;

public class AnonInner {
	abstract class SaleTodayOnly {
		abstract int dollarsOff();
	}
	interface TestInterface {
		public int printTest();
	}
	
	public int admission(int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly() {
			int dollarsOff() { 
				return 3; 
			}
		};
		return basePrice - sale.dollarsOff();
	} 

	
	public static void main(String... args) {
		//Anonymous class implementing interface TestInterface
		TestInterface anonInterface = new TestInterface() {
			public int printTest() {
				System.out.println("anonInterface is created!!!");
				return 3;
			}
		};
		anonInterface.printTest();
	}

}