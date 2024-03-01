import java.io.*; 
import java.util.*; 

class graphDFS{
    
    public static void dfs(ArrayList<ArrayList<edge>> graph, ArrayList<boolean> visited, int root){
        if(graph.get(root).size()==0) return; 

        for()
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); // No. of Graph Relations 
        ArrayList<ArrayList<edge>> graph = new ArrayList<>(); 

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
       
        int s,d,w;
        while(sc.hasNextInt()){
            s = sc.nextInt();
            d = sc.nextInt(); 
            w = sc.nextInt(); 
            graph.get(s).add(new edge(s,d,w));
            graph.get(d).add(new edge(d,s,w));
        }

        ArrayList<boolean> visited = new ArrayList<>(Collection.nCopies(n,false)); 
        dfs(graph,visited,0); 
    }
}

class edge{
    int source;
    int destination; 
    int weight; 

    edge(){}

    edge(int source,int destination, int weight){
        this.source = source; 
        this.destination = destination; 
        this.weight = weight; 
    }

    public String toString() { return Integer.toString(source) +" "+ Integer.toString(destination) +" "+ Integer.toString(weight); }
}
