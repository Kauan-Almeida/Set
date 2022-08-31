package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set1 = new LinkedHashSet<>(); //mantem a ordem que os elementos então
		Set<String> set2 = new HashSet<>(); //não mantem a ordem da lista
		Set<String> set3 = new TreeSet<>(); //ordena em ordem 
		
		set1.add("TV");
		set1.add("Tablet");
		set1.add("Notebook");
		set1.add("Cell");
		
		set2.add("Control");
		set2.add("VideoGame");
		set2.add("Phone");
		set2.add("Watch");
		
		set3.add("Mouse");
		set3.add("Keyboard");
		set3.add("Computer");
		set3.add("Monitor");
			
		set1.removeIf(x -> x.charAt(0) == 'T');
		set2.removeIf(x -> x.length() < 5);
		set3.remove("Monitor");
		
		System.out.println(set1.contains("Notebook"));
		System.out.println();
		
		
		for (String p : set1) {
			System.out.println(p);
		}
		System.out.println();
		
		for (String p : set2) {
			System.out.println(p);
		}
		System.out.println();
		
		for (String p : set3) {
			System.out.println(p);
		}
	}
}
