//Graph using List.

//create a graph node
//create a graph class wich will take a nodelist as a input then in that class you will have two method one will be to add the edges and other will be for printing all the elements ofthe graph.

import java.io.*;
import java.util.*;
  
class GraphNode1 {
  String name;
  int index;
  ArrayList<GraphNode1> neighbours=new ArrayList<GraphNode1>();

  public GraphNode1(String name, int index) {
    this.name=name;
    this.index=index;
  }
}


class Graph1 {
  ArrayList<GraphNode1> nodeList = new ArrayList<GraphNode1>();

   public Graph1(ArrayList<GraphNode1> nodeList) {
     this.nodeList=nodeList;
  }

  public void addUnDirectedEdges(int i,int j) {
     GraphNode1 first= nodeList.get(i);
     GraphNode1 second= nodeList.get(j);
     first.neighbours.add(second);
     second.neighbours.add(first);
  }
  
  public String toString() {
    StringBuilder s = new StringBuilder();
     for(int i=0;i<nodeList.size();i++) {
       s.append(nodeList.get(i).name+": ");
       for(int j=0;j<nodeList.get(i).neighbours.size();j++) {
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
 }
 public class MainGraph {
   public static void main(String[] a) {
      ArrayList<GraphNode1> nodeList= new ArrayList<>();
      nodeList.add(new GraphNode1("A",0));
      nodeList.add(new GraphNode1("B",0));
      nodeList.add(new GraphNode1("C",0));
      nodeList.add(new GraphNode1("D",0));
      nodeList.add(new GraphNode1("E",0));
      Graph1 g= new Graph1(nodeList);
      g.addUnDirectedEdges(0,1);
      g.addUnDirectedEdges(0,2);
      g.addUnDirectedEdges(0,3);
      g.addUnDirectedEdges(1,4);
      g.addUnDirectedEdges(2,3);
      g.addUnDirectedEdges(3,4);
      System.out.print(g.toString());
    }
   }

