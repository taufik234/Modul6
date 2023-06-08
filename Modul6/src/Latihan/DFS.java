package Latihan;
import java.util.*;
public class DFS {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    public DFS(int v){
        adj = new LinkedList[v];
        visited = new boolean[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    void insertEdge(int src, int dest){
        adj[src].add(dest);
    }

    void dfs(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");
        Iterator<Integer> it = adj[vertex].listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n]){
                dfs(n);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(8);
        dfs.insertEdge(0, 1);
        dfs.insertEdge(0, 2);
        dfs.insertEdge(0, 3);
        dfs.insertEdge(1, 3);
        dfs.insertEdge(2, 4);
        dfs.insertEdge(3, 5);
        dfs.insertEdge(3, 6);
        dfs.insertEdge(4, 7);
        dfs.insertEdge(4, 5);
        dfs.insertEdge(5, 2);
        System.out.println("DFS Traversal");
        dfs.dfs(0);
    }
}
