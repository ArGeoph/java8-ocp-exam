package chapter4;
import java.util.*;
import java.util.function.*;

public class ConsumerTest {

	public static void main(String[] args) {
		//Testing Consumer functional interface from java.util.function
		List<String> testList = new LinkedList<>();
		//Create consumable interface that will print any element added to the list
		Consumer<String> consumerMetRef = testList::add;
		Consumer<String> consumerLambda = (newElem) -> { 
			testList.add(newElem); 
			System.out.println(newElem + " was added to testList");
		}; 
		
		consumerMetRef.accept("New-York");
		consumerLambda.accept("Moscow");
		
		
		Map<Integer, String> testMap = new HashMap<>();
		BiConsumer<Integer, String> biConsMetRef = testMap::put;
		BiConsumer<Integer, String> biConsLambda = (key, value) -> testMap.put(key, value); //Actualy the same as the previous example, but more verbous
		
 		biConsMetRef.accept(1, "one");
 		biConsLambda.accept(2, "two");
 		
 		//Print the results
 		testMap.forEach((x, y) -> {
 			System.out.println("Key: " + x + " | Value: " + y);
 		});
	}

}
