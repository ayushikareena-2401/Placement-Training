//DFS and BFS on Graph implementation using a 2-D Matrix.


import java.io.*;
import java.util.*;

class GraphNode {
  String name;
  int index;
  public boolean isVisited = false;
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

   public ArrayList<GraphNode> getNeighbour(GraphNode node) {
     int i=node.index;
     ArrayList<GraphNode> n = new ArrayList<>();
     for(int j=0;j<adjacencyMatrix.length;j++) {
       if(adjacencyMatrix[i][j]==1) {
          n.add(nodeList.get(j));
       }
     }
     return n;
  }
  
   public void dfsVisit(GraphNode node) {
     Stack<GraphNode> stack = new Stack<>();
     stack.push(node);
     while(!stack.isEmpty()) {
      GraphNode currentNode =stack.pop();
      currentNode.isVisited=true;
      System.out.print(currentNode.name+" ");
      ArrayList<GraphNode> neighbour = getNeighbour(currentNode);
      for(GraphNode neighbor : neighbour) {
	        if(!neighbor.isVisited) {
	          stack.push(neighbor);
	          neighbor.isVisited = true;
            }
      }
   }
 }

   public void dfs() {
    for(GraphNode node: nodeList ) {
       if(!node.isVisited) {
          dfsVisit(node);
       }
    }
   }

    public void bfsVisit(GraphNode node) {
     LinkedList<GraphNode> queue = new LinkedList<>();
     queue.add(node);
     while(!queue.isEmpty()) {
      GraphNode currentNode =queue.remove();
      currentNode.isVisited=true;
      System.out.print(currentNode.name+" ");
      ArrayList<GraphNode> neighbour = getNeighbour(currentNode);
      for (GraphNode neighbor : neighbour) {
	        if (!neighbor.isVisited)
	        {
	          queue.add(neighbor);
	          neighbor.isVisited = true;
                 }
      }
   }
  }

   public void bfs() {
    for(GraphNode node: nodeList ) {
       if(!node.isVisited) {
          bfsVisit(node);
       }
    }
   }

}
public class Graph3 {
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
		g.bfs();
  }
}