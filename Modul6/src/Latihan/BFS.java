package Latihan;
import java.io.*;
import java.util.*;
public class BFS {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;
    public BFS(int v){
        node = v;
        adj = new LinkedList[node];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }
    void insert(int v, int w){
        adj[v].add(w);
    }
    void bfs(int n){
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[n] = true;
        que.add(n);
        while(que.size() != 0){
            n = que.poll();
            System.out.print(n+" ");
            for (int i = 0; i < adj[n].size(); i++) {
                a = adj[n].get(i);
                if(!nodes[a]){
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs = new BFS(6);
        bfs.insert(0, 1);
        bfs.insert(0, 3);
        bfs.insert(0, 4);
        bfs.insert(4, 5);
        bfs.insert(3, 5);
        bfs.insert(1, 2);
        bfs.insert(1, 0);
        bfs.insert(2, 1);
        bfs.insert(4, 1);
        bfs.insert(3, 1);
        bfs.insert(5, 4);
        bfs.insert(5, 3);
        System.out.println("BFS Traversal");
        bfs.bfs(0);
    }
}
