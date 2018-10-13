package chapter4;
import java.util.function.*;
import java.util.*;

public class PredicatesTest {

	public static void main(String[] args) {
		String testString = "test";
		Predicate<String> checkIfStartWith = testString::startsWith;
		System.out.println(checkIfStartWith.test("x"));
		
		//Test bipredicate 
		BiPredicate<String, String> checkIfStartsWithTwoParam = String::startsWith;
		
		System.out.println(checkIfStartsWithTwoParam.test("Treeset", "Tree"));
		
		
	}

}
