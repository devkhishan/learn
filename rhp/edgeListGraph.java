import java.io.*; 
import java.util.*; 
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
class edgeListGraph{
    static void printList(ArrayList<ArrayList<edge>> graph){
        for(ArrayList<edge> val : graph){
            for(edge i : val){
                System.out.print(i+" ");
            }
        }
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

        printList(graph);
    }
}