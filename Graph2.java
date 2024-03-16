//Graph implementation using a 2-D Matrix.


import java.io.*;
import java.util.*;

class GraphNode {
  String name;
  int index;
  GraphNode(String name, int index) {  
    this.name=name;
    this.index=index;
  }
}

class Graph {
  ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
  int[][] adjacencyMatrix;
  
  Graph(ArrayList<GraphNode> nodeList) {
    this.nodeList=nodeList;
    adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
  }

  public void addUndirectedEdge(int i,int j) {
     adjacencyMatrix[i][j]=1;
     adjacencyMatrix[j][i]=1;
  }
  public String toString() {
    StringBuilder s = new StringBuilder();
     s.append(" ");
    for(int i=0;i<nodeList.size();i++) {
       s.append(nodeList.get(i).name+" ");
    }
    s.append("\n");
    for(int i=0;i<nodeList.size();i++) {
        s.append(nodeList.get(i).name+" ");
       for(int j=0;j<adjacencyMatrix.length;j++){ 
         s.append(adjacencyMatrix[i][j]+" ");
       }
       s.append("\n");
    }
     return s.toString();
   }
 }


public class Graph2 {
  public static void main(String[] a) {
   ArrayList<GraphNode> nodeList = new ArrayList<>();
                nodeList.add(new GraphNode("A",0));
		nodeList.add(new GraphNode("B",1));
		nodeList.add(new GraphNode("C",2));
		nodeList.add(new GraphNode("D",3));
		nodeList.add(new GraphNode("E",4));
		Graph g=new Graph(nodeList); 	
		g.addUndirectedEdge(0, 1);
		g.addUndirectedEdge(0, 2);
		g.addUndirectedEdge(0, 3);
		g.addUndirectedEdge(1, 4);
		g.addUndirectedEdge(2, 3);
		g.addUndirectedEdge(3, 4);
		System.out.print(g.toString()); 
  }
}