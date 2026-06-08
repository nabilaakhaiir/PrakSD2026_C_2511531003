package pekan9_2511531003;
import java.util.*;
public class GraphTraversal_2511531003 {
    private Map<String, List<String>> graph_1003 = new HashMap<>();
    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1_1003, String node2_1003) {
        graph_1003.putIfAbsent(node1_1003, new ArrayList<>());
        graph_1003.putIfAbsent(node2_1003, new ArrayList<>());
        graph_1003.get(node1_1003).add(node2_1003);
        graph_1003.get(node2_1003).add(node1_1003);
    }
    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_1003 : graph_1003.keySet()) {
            System.out.print(node_1003 + " -> ");
            List<String> neighbors_1003 = graph_1003.get(node_1003);
            System.out.println(String.join(", ", neighbors_1003));
        }
        System.out.println();
    }
    // DFS rekursif
    public void dfs(String start_1003) {
        Set<String> visited_1003 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper(start_1003, visited_1003);
        System.out.println();
    }
    private void dfsHelper(String current_1003, Set<String> visited_1003) {
        if (visited_1003.contains(current_1003))
            return;
        visited_1003.add(current_1003);
        System.out.print(current_1003 + " ");
        for (String neighbor_1003 : graph_1003.getOrDefault(current_1003, new ArrayList<>())) {
            dfsHelper(neighbor_1003, visited_1003);
        }
    }
 // BFS iteratif
    public void bfs(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);
        System.out.println("Penelusuran BFS:");
        while (!queue.isEmpty()) {
            String current = queue.poll();
            System.out.print(current + " ");
            for (String neighbor : graph_1003.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        System.out.println();
    }
    // Main
    public static void main(String[] args1003) {
        GraphTraversal_2511531003 graph1003 = new GraphTraversal_2511531003();
        graph1003.addEdge("A", "B");
        graph1003.addEdge("A", "C");
        graph1003.addEdge("B", "D");
        graph1003.addEdge("B", "E");
        System.out.println("Graf Awal adalah: ");
        graph1003.printGraph();
        graph1003.dfs("A");
        graph1003.bfs("A");
    }
}