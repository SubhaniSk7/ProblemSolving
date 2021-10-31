package leetproblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q207_CourseSchedule {

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
		int[] degree = new int[numCourses];
		int p = prerequisites.length;

		for (int i = 0; i < numCourses; ++i) {
			ArrayList<Integer> e = new ArrayList<>();
			edges.add(e);
		}
		for (int i = 0; i < p; ++i) {
			edges.get(prerequisites[i][1]).add(prerequisites[i][0]);
			degree[prerequisites[i][0]]++;
		}
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < numCourses; ++i) {
			if (degree[i] == 0)
				q.offer(i);
		}
		int count = q.size();
		while (!q.isEmpty()) {
			int u = q.poll();
			for (int v : edges.get(u)) {
				degree[v]--;
				if (degree[v] == 0) {
					count++;
					q.offer(v);
				}
			}
		}
		return count == numCourses;
	}
}
