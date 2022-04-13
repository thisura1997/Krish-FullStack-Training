package example.bfs;

//main class creation

public class Main {

    public static void main(String[] args) {

        BFSExample bfs = new BFSExample(6); 			//decleration of the BFS edge points in the graph
        
        //points in the graph
        
        bfs.addEdge(0,1);
        bfs.addEdge(0,3);
        bfs.addEdge(0,4);
        bfs.addEdge(4,2);
        bfs.addEdge(4,5);
        bfs.addEdge(3,2);

        System.out.println("BFS for the graph : " );	//Print statement for the graph points
       
        bfs.BFS(0);										//assigning default value after printing
    }
}
