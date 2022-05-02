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

            String node = "";
            switch (s)
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
