package com.codewithsouma;


import com.codewithsouma.graph.DirectedGraph;

public class Main {

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");


        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("D","C");
        graph.addEdge("A","C");



        graph.traverseBreadthFirst("D");
    }
}
