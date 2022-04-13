package example.dfs;

public class Main {

    public static void main(String[] args) {
    	
	    DFSExample dfs = new DFSExample(6);				//decleration of the DFS edge points in the graph
	    
        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(1,3);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);
        dfs.addEdge(3,5);

        System.out.println("DFS for the graph: ");		//Print statement for the graph points
        
        dfs.DFS(0);										//assigning default value after printing
    }
}
