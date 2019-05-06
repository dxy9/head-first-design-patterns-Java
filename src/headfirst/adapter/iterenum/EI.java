package headfirst.adapter.iterenum;

import java.util.*;

public class EI {
	public static void main (String args[]) {
		Vector<String> v = new Vector<String>(Arrays.asList("a","b","c"));
		Enumeration<String> enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
