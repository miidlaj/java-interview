package graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RiverGraph {

    public static List<Integer> checkRiverSize(int [][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        List<Integer> sizes = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (visited[i][j]) {
                    continue;
                } else {
                    traverseThroughRiver(i, j, matrix, visited, sizes);
                }
            }
        }
        return sizes;
    }

    public static void traverseThroughRiver(int i, int j, int[][]matrix, boolean[][] visited, List<Integer> sizes) {
        int currentRiverSize = 0;
        Stack<Integer[]> nodeToExplore = new Stack<>();
        nodeToExplore.add(new Integer[]{i, j});
        while (!nodeToExplore.empty()) {
            Integer[] currentNode = nodeToExplore.pop();
            i = currentNode[0];
            j = currentNode[1];
            if (visited[i][j]) {
                continue;
            }
            visited[i][j] = true;
            if (matrix[i][j] == 0) {
                continue;
            }
            currentRiverSize++;
            List<Integer[]> nearest = getNearestNodes(i, j, matrix, visited);
            nodeToExplore.addAll(nearest);
        }
        if (currentRiverSize > 0) sizes.add(currentRiverSize);
    }

    private static List<Integer[]> getNearestNodes(int i, int j, int[][] matrix, boolean[][] visited) {
        List<Integer[]> nearest = new ArrayList<>();
        if (i > 0 && !visited[i - 1][j]) {
            nearest.add(new Integer[]{i - 1, j});
        }
        if (i < (matrix.length - 1) && !visited[i + 1][j]) {
            nearest.add(new Integer[]{i + 1, j});
        }
        if (j > 0 && !visited[i][j - 1]) {
            nearest.add(new Integer[]{i, j - 1});
        }
        if (j < (matrix[0].length - 1) && !visited[i][j + 1]) {
            nearest.add(new Integer[]{i, j + 1});
        }
        return nearest;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,0,0,1,1},
                {0,1,1,1,0},
                {0,0,0,0,1},
                {1,0,0,0,1}
        };
        List<Integer> result = checkRiverSize(matrix);

        result.forEach(System.out::println);
    }
}
