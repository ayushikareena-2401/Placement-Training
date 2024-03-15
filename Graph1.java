//BFS and DFS implementation on Graph made by list.


import java.io.*;
import java.util.*;

class GraphNode {
  String name;
  int index;
  boolean isVisited=false;
  ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
  public GraphNode(String name, int index) {
     this.name=name;
     this.index=index;
  }
}

class Graph {
  ArrayList<GraphNode> nodeList = new ArrayList<>();

  Graph(ArrayList<GraphNode> nodeList){ 
      this.nodeList=nodeList;
  }

  public void addUndirectedEdge(int i,int j) {
      GraphNode first= nodeList.get(i); 
      GraphNode second= nodeList.get(j);
      first.neighbours.add(second);
      second.neighbours.add(first);
  }

  public String toString(){
    StringBuilder s = new StringBuilder();
    for(int i=0;i<nodeList.size();i++) {
       s.append(nodeList.get(i).name+": ");
       for(int j=0;j<nodeList.get(i).neighbours.size();j++){
         if(j==nodeList.get(i).neighbours.size()-1) {
            s.append(nodeList.get(i).neighbours.get(j).name);
         } else {
            s.append(nodeList.get(i).neighbours.get(j).name+"-->");
         }
      }
       s.append("\n");
    }
     return s.toString();
  }

  void dfs(){
   for(GraphNode node: nodeList) {
     if(!node.isVisited) {
        dfsVisit(node);
     }
   }
  }

   void dfsVisit(GraphNode node) {
     Stack<GraphNode> stack = new Stack<>();
     stack.push(node);
     while(!stack.isEmpty()) {
       GraphNode currentNode = stack.pop();
       currentNode.isVisited=true;
       System.out.print(currentNode.name+" ");
       for(GraphNode nbr :currentNode.neighbours) {
          if(!nbr.isVisited) {
             stack.push(nbr);
             nbr.isVisited=true;
          }
       }
     }
   }

   
void bfs(){
   for(GraphNode node: nodeList) {
     if(!node.isVisited) {
        bfsVisit(node);
     }
   }
  }

   void bfsVisit(GraphNode node) {
     LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
     queue.add(node);
     while(!queue.isEmpty()) {
       GraphNode currentNode = queue.remove();
       currentNode.isVisited=true;
       System.out.print(currentNode.name+" ");
       for(GraphNode nbr :currentNode.neighbours) {
          if(!nbr.isVisited) {
             queue.add(nbr);
             nbr.isVisited=true;
          }
       }
     }
   }


}

public class Main{
   public static void main(String[] a) {
     ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
     nodeList.add(new GraphNode("A",0));
     nodeList.add(new GraphNode("B",0));
     nodeList.add(new GraphNode("C",0));
     nodeList.add(new GraphNode("D",0));
     nodeList.add(new GraphNode("E",0));
     Graph g= new Graph(nodeList);
     g.addUndirectedEdge(0,1);
     g.addUndirectedEdge(0,2);
     g.addUndirectedEdge(0,3);
     g.addUndirectedEdge(1,4);
     g.addUndirectedEdge(2,3);
     g.addUndirectedEdge(3,4);
     System.out.print(g.toString());
    //  System.out.println("BFS");
    //  g.bfs();
     System.out.println("DFS");
     g.dfs();
    }
}