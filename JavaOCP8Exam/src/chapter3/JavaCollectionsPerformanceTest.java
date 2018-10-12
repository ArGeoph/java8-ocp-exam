package chapter3;
import java.util.*;
import java.io.*;
public class JavaCollectionsPerformanceTest {

	public JavaCollectionsPerformanceTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Set<Object> hashSet = new HashSet<>();
		
		Collections.addAll(hashSet,  5, 5, 33, -13, 32432532, -35234);
		Set<Integer> treeSet = new TreeSet<>();
		System.out.println(treeSet);
	}
}
