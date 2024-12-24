package graphtraversal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int vertices = 6;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Adding edges to the graph (example)
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(1).add(4);
        adjList.get(2).add(5);

        GraphTraversal gt = new GraphTraversal();

        // Perform BFS starting from node 0
        System.out.print("BFS: ");
        gt.bfs(0, vertices, adjList);
        System.out.println();

        // Perform DFS starting from node 0
        System.out.print("DFS: ");
        gt.dfs(0, vertices, adjList);
    }
}
