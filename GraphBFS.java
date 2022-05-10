import java.util.*;

//This class is to implement the breadth first traversal.
class GraphBFS
{
    private int V;
    private LinkedList<Integer> adjLists[]; //adjacency list

    //To create a graph in the main method.
    public GraphBFS(int v)
    {
        V = v;
        adjLists = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjLists[i] = new LinkedList<Integer>();

    }

    //Add edges to the graph
    void addEdge(int v, int w)
    {
        adjLists[v].add(w);
    }

    //BFS code
    void BFS(int s)
    {

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0)
        {
            s = queue.poll();

            //Integer to character
            String node = "";
            switch (s)
            {
                case 0: //0=A
                    node = "A";
                    break;
                case 1: //1=B
                    node = "B";
                    break;
                case 2: //2=C
                    node = "C";
                    break;
                case 3: //3=D
                    node = "D";
                    break;
                case 4: //4=E
                    node = "E";
                    break;
                case 5: //5=F
                    node = "F";
                    break;
                case 6: //6=G
                    node = "G";
                    break;
                case 7: //7=H
                    node = "H";
                    break;
                case 8: //8=I
                    node = "I";
                    break;
            }

            //Printing out the characters
            System.out.print(node + " ");

            Iterator<Integer> i = adjLists[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
