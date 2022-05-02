
import java.util.*;

class GraphDFS {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // Graph creation
    public GraphDFS(int vertices) {
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    // Add edges
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // DFS algorithm
    void DFS(int vertex) {
        visited[vertex] = true;
        String node = "";
        switch (vertex)
        {
            case 0:
                node = "A";
                break;
            case 1:
                node = "B";
                break;
            case 2:
                node = "C";
                break;
            case 3:
                node = "D";
                break;
            case 4:
                node = "E";
                break;
            case 5:
                node = "F";
                break;
            case 6:
                node = "G";
                break;
            case 7:
                node = "H";
                break;
            case 8:
                node = "I";
                break;
        }
        System.out.print(node + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }
}
