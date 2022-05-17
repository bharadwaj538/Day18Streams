package ai.jobiak.streams;

import java.util.*; 
import java.util.function.Consumer;
import java.util.function.Function;
public class TestStreams {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		list.add("Hello");
		list.add("Hola");
		list.add("Bonjure");
		list.add("Bonues");
		list.add("count");
		
		/*
		 * Iterator<String>iter=list.iterator(); while(iter.hasNext()) { String
		 * element=iter.next(); System.out.println(element); }
		 */
		//list.stream().forEach(System.out::println);
		Consumer<String>consumer=(String str)->{System.out.println(str);};
		list.stream().forEach(consumer);
		
		long count=list.stream().count();
		System.out.println(count);
		
		list.stream().map(e->e.toUpperCase()).forEach(consumer);
		Function<String,String>upperCaseFunction=(e)->{return e.toUpperCase();};
		list.stream().map(upperCaseFunction).forEach(consumer);
	}

}
