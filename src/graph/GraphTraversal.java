package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTraversal {
    private List<List<Integer>> adjList;

    public GraphTraversal(int n) {
        adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[adjList.size()];
        dfs(start, visited);
    }

    private void dfs(int u, boolean[] visited) {
        visited[u] = true;
        System.out.println(u);
        for (int v : adjList.get(u)) {
            if (!visited[v]) {
                dfs(v, visited);
            }
        }
    }

    public void bfs(int start) {
        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int u = queue.poll();
            if (!visited[u]) {
                visited[u] = true;
                System.out.println(u);
                for (int v : adjList.get(u)) {
                    queue.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("DFS:");
        graph.dfs(0);

        System.out.println("BFS:");
        graph.bfs(0);
    }
}
