package basics.graphs;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class GraphUtils {
	public void printGraph(ArrayList<Set<Integer>> vertices, PrintStream out) {
		Iterator<Set<Integer>> graph = vertices.iterator();
		while (graph.hasNext())
			out.print(graph.next().toString() + "\n");
	}
}
