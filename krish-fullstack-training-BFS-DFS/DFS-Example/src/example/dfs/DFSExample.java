package example.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSExample {

    private int node;								//initializing the node variable
    private LinkedList<Integer> list[];				//adjacency list decleration
    private boolean visited[];						//queue decleration for the program

    public DFSExample(int x){

        node = x;
        list = new LinkedList[x];
        visited = new boolean[x];

        for (int i = 0; i<x; i++){
            list[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int x, int y){
        list[x].add(y);
    }

    void DFS(int vertex){

        visited[vertex] = true;               			// checking the visited nodes
        System.out.println(vertex+ " ");

        Iterator<Integer> itr = list[vertex].listIterator();
        while(itr.hasNext()){           				// checking the un-visited nodes
            int adjList = itr.next();
            
            if (!visited[adjList]){
                DFS(adjList);
            }											//end of the program	
        }
    }
}
