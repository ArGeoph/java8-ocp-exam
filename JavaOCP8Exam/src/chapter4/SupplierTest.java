package chapter4;
import java.util.function.*;
import java.time.*;
import java.util.*;

public class SupplierTest {
	public static void main(String ... args) {
		Supplier<LocalDate> supplier1 = LocalDate::now; 
		Supplier<LocalDate> supplier2 = () -> LocalDate.now();
		Supplier<String> supplier3 = String::new;
		Supplier<List<String>> supplier4 = ArrayList<String>::new;
		
		System.out.println(supplier1.get());
		System.out.println(supplier2.get());
		System.out.println(supplier1);
		System.out.println(supplier4.get().hashCode());
	}
}
