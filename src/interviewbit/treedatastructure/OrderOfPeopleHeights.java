package interviewbit.treedatastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class OrderOfPeopleHeights {
	public static void main(String[] subhani) {

	}

	public ArrayList<Integer> order(ArrayList<Integer> A, ArrayList<Integer> B) {
		Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());

		for (int i = 0; i < A.size(); ++i)
			map.put(A.get(i), B.get(i));

		ArrayList<Integer> result = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet())
			result.add(entry.getValue(), entry.getKey());
		return result;
	}
}
