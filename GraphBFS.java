import java.util.*;
class GraphBFS
{
  private int V;
  private LinkedList<Integer> adjLists[];

    public GraphBFS(int v)
  {
        V = v;
        adjLists = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjLists[i] = new LinkedList<Integer>();

    }

    // Add edges to the graph
  void addEdge(int v, int w)
  {
        adjLists[v].add(w);
  }

    // BFS algorithm
  void BFS(int s)
  {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adjLists[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
  }
}
