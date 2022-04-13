package point;

																		//main class creation	
public class Main {

    public static void main(String[] args) {
    													
        Articulation graph = new Articulation(6);						//graph and scope initialization and specification
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(2,1);
        graph.addEdge(0,3);
        graph.addEdge(3,4);
        
        System.out.println("Articulation points for the graph: ");		//print the articulation points for the specific graph
        
        graph.findArticulationPoint();
        
        System.out.println();											
        																//end of the program


    }
}
