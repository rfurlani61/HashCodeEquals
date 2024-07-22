package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		Set<String> set1 = new TreeSet<>();
		Set<String> set2 = new LinkedHashSet<>();
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set1.add("TV");
		set1.add("Notebook");
		set1.add("Tablet");
		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");
		System.out.println(set.contains("Notebook"));
		for (String p : set) {
			System.out.println(p);
		}
		System.out.println(set1.contains("TV"));
		for (String p : set1) {
			System.out.println(p);
		}
		System.out.println(set2.contains("Tablet"));
		for (String p : set2) {
			System.out.println(p);
		}
		
		set.remove("Tablet");
		for (String p : set) {
			System.out.println(p);
		}
		set1.removeIf(x -> x.length() > 3);
		for (String p : set1) {
			System.out.println(p);
		}
		set2.removeIf(x -> x.charAt(0) == 'T');
		for (String p : set2) {
			System.out.println(p);
		}
	}

}
