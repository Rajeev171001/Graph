//Using adjacency Matrix

package Graph;
public class Graph1 {
    int a[][];
    int v;
    
    public Graph1(int v){
        this.v=v;
        a=new int[v][v];
    }
    public void addEdge(int src,int dest){
        a[src][dest]=1;
        a[dest][src]=1;
    }
    public static void main(String[] args) {
        int v=4;
        Graph1 graph=new Graph1(v);

        graph.addEdge(0, 1);
        graph.addEdge(2, 3);
        graph.addEdge(0, 3);
        graph.addEdge(2, 1);
    }
}

//For printing use traversals
