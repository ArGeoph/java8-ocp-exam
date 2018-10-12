package chapter3;
import java.util.*;
import java.io.*;

public class CollectionsTest {

	public CollectionsTest() {
		
	}
	
	public static void main(String[] args) {
		List<String> stringLinkedList = new LinkedList<>();
		Collections.addAll(stringLinkedList, "item1", "item2", "item3", "item4");
		printList(stringLinkedList);
		
		List<Number> numberArrayList = new ArrayList<>();
		Collections.addAll(numberArrayList, 1, 5, 1432532, -33.22d, -611.1343f);
		printList(numberArrayList);
		
		List <? extends Serializable> list2 = new ArrayList<Integer>();
		
		
	}
	
	public static void printList(List<? extends Serializable> list) {
		System.out.println("List with hashcode " + list.hashCode() + " will be printed out: ");
		for (Object item : list) {
			System.out.println(item.toString());
		}
	}
}


class testLinkedList implements Testable {
	
}