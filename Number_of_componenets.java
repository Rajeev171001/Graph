
import java.util.*;
public class NumberComponent {
    static ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
    int v;
    public NumberComponent(int v){
        this.v=v;
        for(int i=0;i<v;i++){
            a.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int src,int dest){
        a.get(src).add(dest);
        a.get(dest).add(src);  //for undirected graph
    }

    public static void dfs(int src, boolean vis[]){
        vis[src]=true;
        System.out.print(src+" ");

        for(Integer neighbor:a.get(src)){
            if(!vis[neighbor]){
                dfs(neighbor,vis);
            }
        }

    }
    public static void main(String[] args){
        int v=8;
        NumberComponent graph=new NumberComponent(v);

        graph.addEdge(0,1);
        graph.addEdge(2,1);
        graph.addEdge(0,3);

        graph.addEdge(4,6);
        graph.addEdge(5,4);
        graph.addEdge(5,6);

        // graph.addEdge(4,5);
        // graph.addEdge(5,6);
        // graph.addEdge(4,6);

        boolean vis[]=new boolean[v];

        //dfs for every connected component
		int count = 0;
		for(int i = 0; i<v; i++) {
			if(!vis[i]) {
				count++;
				dfs(i, vis);
			}
		}
		System.out.println();
		System.out.println(count);

    }
}
