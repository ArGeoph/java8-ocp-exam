package chapter3;
import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class MethodReferenceTest {

	public MethodReferenceTest() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a string: ");
		String tmpInput = "";
		List<String> userInput = new LinkedList<>();
		
		
		try {
			tmpInput = reader.readLine();
			while (!tmpInput.equals("q")) {
				userInput.add(tmpInput);
				tmpInput = reader.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("The program is unexpectedly terminated. Reason " + e.getMessage());
		}
		
		String searchLetters = "abc";
		Predicate<String> methodRF2 = searchLetters::startsWith;
		System.out.println(userInput.removeIf((elem) -> elem.startsWith(searchLetters)));
		userInput.forEach(System.out::println);
		
	}
}
 