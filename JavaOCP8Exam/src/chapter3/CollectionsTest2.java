package chapter3;
import java.io.IOException;
import java.util.*;

public class CollectionsTest2 {
	
	

	public static void main(String[] args) {
		Set<Number> set1 = new HashSet<>();
		
		//Add primitives, null object and Number subclasses to the collection
		set1.add(new Integer(86));
		set1.add(85);
		set1.add(null);
		set1.add(309L);
		
		Iterator set1Iterator = set1.iterator();
		while(set1Iterator.hasNext()) {
			System.out.println(set1Iterator.next());
		}
		
		TreeSet<String> treeSet = new TreeSet<>();
		Collections.addAll(treeSet, "on", "one", "One", "ONE", "123", "ose");
		
		System.out.printf("The ceiling of the treeSet is %s%n", treeSet.ceiling("On"));
		
		treeSet.forEach(System.out::println);
		
		//Hashmap test
		Map<String, Double> map = new HashMap<>();
		
		map.put("dfd", 343.0);
		
		//Question 11
		Map<Integer, Integer> getMap = new HashMap<>(10);
		
		for (int i = 1; i <= 10; i++) {
			getMap.put(i, i * i);
		}
		
		System.out.println(getMap.get(4));
		
		List<IOException> exList = new LinkedList<java.io.IOException>();
		
		
		Queue<Integer> listRemoveTest = new LinkedList<>();
		listRemoveTest.add(10);
		listRemoveTest.add(30);
		listRemoveTest.remove(1);
		System.out.println("listRemoveTest");
		listRemoveTest.forEach(s -> {
			System.out.println(s);
		});
		//ArrayDeque test
		ArrayDeque<String> greetingsDeque = new ArrayDeque<>();
		greetingsDeque.push("hello");
		greetingsDeque.push("hi");
		greetingsDeque.push("ola");
		
		System.out.println("Array deque pop deleted " + greetingsDeque.pop());
		System.out.println(greetingsDeque.peek());
		
		
		while (greetingsDeque.peek() != null) {
			System.out.println("Array deque pop deleted after peek " + greetingsDeque.pop());
		}
	}
}
