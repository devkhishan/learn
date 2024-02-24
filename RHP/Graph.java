// Kosaraju Algorithm - Strongly Connected Components - Graphs 

import java.io.*; 
import java.util.*; 

class Graph{
    private int V; 
    private LinkedList<Integer> adj[]; 

    Graph(int v){
        V = v; 
        adj = new LinkedList[v]; 
        for(int i=0;i<v;++i){
            adj[i] = new LinkedList(); 
        }
    }

    void addEdge(int u, int v){
        adj[u].add(v);
    }

    void dfs(int v,Boolean visited[]){
        visited[v] = true; 

        int n;
        Iterator<Integer> i = adj[v].iterator(); 

        while(i.hasNext()){
            n = i.next();
            if (!visited[n]) dfs(n,visited);
        }
    }

    Boolean checkVisited(Boolean[] visited){
        for(int i=0;i<V;++i) if (visited[i]==false) return false; 
        return true;
    }

    Graph getTranspose(){
        Graph tran = new Graph(V); 

        for(int i=0;i<V;i++){
            Iterator<Integer> j = adj[i].iterator(); 
            while(j.hasNext()){
                tran.adj[j.next()].add(i);
            }
        }
        return tran;
    }

    Boolean sc(){
        Boolean visited[] = new Boolean[V]; 
        for(int i=0; i<V; ++i) visited[i] = false; 

        dfs(0,visited);
        if (!checkVisited(visited)) return false; 

        Graph transpose = getTranspose(); 

        for(int i=0; i<V; ++i) visited[i] = false; 

        transpose.dfs(0,visited);  
        if (!checkVisited(visited)) return false; 

        return true; 

    }

    public static void main(String[] args){
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(2, 4);
        graph.addEdge(4, 2);

        System.out.println(graph.sc()?"YES":"NO");

        Graph graph0 = new Graph(4);
        graph0.addEdge(0, 1);
        graph0.addEdge(1, 2);
        graph0.addEdge(2, 3);

        System.out.println(graph0.sc()?"YES":"NO");

    }


}