import java.util.*;
public class Shortest_path_Graph {
    static ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	int v;
	
	public Shortest_path_Graph(int v) {
		this.v = v;
		for(int i = 0; i<v; i++) {
			a.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int src, int dest) {
		a.get(src).add(dest);
		a.get(dest).add(src);
	}
    public static void bfs(int src, boolean vis[], int dis[]) {
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		vis[src] = true;
		dis[src] = 0;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			System.out.print(cur+" ");
			
			for(Integer neighbor: a.get(cur)) {
				if(!vis[neighbor]) {
					dis[neighbor] = dis[cur] + 1;
					q.add(neighbor);
					vis[neighbor] = true;
				}
			}
		}
	}
    public static void main(String args[]) {
		int v = 8;
		Shortest_path_Graph graph = new Shortest_path_Graph(v);
		
		graph.addEdge(0, 1);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);
		
		graph.addEdge(3, 6);
		graph.addEdge(5, 7);
		graph.addEdge(2, 7);
		
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		graph.addEdge(4, 6);

        boolean vis[] = new boolean[v];

        // shortest path in a graph
    		int dis[] = new int[v];
    		Arrays.fill(dis, Integer.MAX_VALUE);
    		
    		bfs(0, vis, dis);
    		
    		
    		System.out.println();
    		for(int i = 0; i<v; i++) {
    			System.out.println(i+" "+dis[i]);
    		}
		
		
	}
		
}
