import java.util.*;

//This class is to implement the depth first traversal.
class GraphDFS {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    // To create graph in the main method.
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

    // DFS code
    void DFS(int vertex) {
        visited[vertex] = true;

        // Integer to character
        String node = "";
        switch (vertex) {
            case 0: // 0=A
                node = "A";
                break;
            case 1: // 1=B
                node = "B";
                break;
            case 2: // 2=C
                node = "C";
                break;
            case 3: // 3=D
                node = "D";
                break;
            case 4: // 4=E
                node = "E";
                break;
            case 5: // 5=F
                node = "F";
                break;
            case 6: // 6=G
                node = "G";
                break;
            case 7: // 7=H
                node = "H";
                break;
            case 8: // 8=I
                node = "I";
                break;
        }

        // Printing out the characters
        System.out.print(node + " ");

        Iterator<Integer> ite = adjLists[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFS(adj);
        }
    }
}