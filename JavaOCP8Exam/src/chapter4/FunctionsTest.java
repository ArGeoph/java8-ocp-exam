package chapter4;
import java.util.function.*;

public class FunctionsTest {

	public static void main(String[] args) {
		//Test of Java functional interface Function and BiFunction that transform one value type to another type by returning it from method apply
		String testString = "test";
		Function<String, Integer> funct1 = String::length; 
		
		System.out.println(funct1.apply(testString));

		//Test biFunction 
		BiFunction<String, String, String> funct2 = String::concat;
		BiFunction<String, String, String> funct3 = (str1, str2) -> {
			return str1.concat(str2 + " Test");
		};
		
		System.out.println(funct3.apply("One", "Two"));
	}

}
