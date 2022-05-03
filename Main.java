import java.util.*;

class Main
{
    public static void main(String args[])
    {
        //Creating a new graph with 9 vertex.
        GraphDFS newGraph = new GraphDFS(9);

        //Adding the edges and listing which nodes connect.
        newGraph.addEdge(0, 1); // A->B
        newGraph.addEdge(0, 3); // A->D
        newGraph.addEdge(0, 4); // A->E
        newGraph.addEdge(1, 4); // B->E
        newGraph.addEdge(2, 1); // C->B
        newGraph.addEdge(3, 6); // D->G
        newGraph.addEdge(4, 5); // E->F
        newGraph.addEdge(4, 7); // E->H
        newGraph.addEdge(5, 2); // F->C
        newGraph.addEdge(5, 7); // F->H
        newGraph.addEdge(6, 7); // G->H
        newGraph.addEdge(7, 8); // H->I
        newGraph.addEdge(8, 5); // I->F

        System.out.println("Depth First Traversal: ");
        //Printing out the graph starting from 0(A)
        newGraph.DFS(0);
        System.out.println();

        //Creating a second graph with 9 vertex.
        GraphBFS newGraph1 = new GraphBFS(9);

        //Adding edges and listing which nodes connect.
        newGraph1.addEdge(0, 1); // A->B
        newGraph1.addEdge(0, 3); // A->D
        newGraph1.addEdge(0, 4); // A->E
        newGraph1.addEdge(1, 4); // B->E
        newGraph1.addEdge(2, 1); // C->B
        newGraph1.addEdge(3, 6); // D->G
        newGraph1.addEdge(4, 5); // E->F
        newGraph1.addEdge(4, 7); // E->H
        newGraph1.addEdge(5, 2); // F->C
        newGraph1.addEdge(5, 7); // F->H
        newGraph1.addEdge(6, 7); // G->H
        newGraph1.addEdge(7, 8); // H->I
        newGraph1.addEdge(8, 5); // I->F

        System.out.println("Breadth First Traversal: ");
        //Printing out the graph starting from 0(A)
        newGraph1.BFS(0);
        System.out.println();
    }
}