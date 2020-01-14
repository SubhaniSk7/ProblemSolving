package basics.javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {

	public static void main(String subhani[]) {

		HashSet<String> set = new HashSet();

		set.add("subhani");
		set.add("subhani");

		for (String st : set) {
			System.out.println(st);
		}

		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		String[] str = set.toArray(new String[set.size()]);

		System.out.println("---");
		for (int i = 0; i < str.length; i++)
			System.out.println(str[i]);
	}
}
