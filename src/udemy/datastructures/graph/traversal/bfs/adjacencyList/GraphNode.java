package udemy.datastructures.graph.traversal.bfs.adjacencyList;

import java.util.ArrayList;

public class GraphNode {

    public String name;
    public int index;
    public boolean isVisited = false;

    public ArrayList<GraphNode> neighbors = new ArrayList<>();

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
    }
}
