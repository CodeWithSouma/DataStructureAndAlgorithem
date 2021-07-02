package com.codewithsouma;


import com.codewithsouma.graph.DirectedGraph;

public class Main {

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");


        graph.addEdge("X","A");
        graph.addEdge("A","P");
        graph.addEdge("X","B");
        graph.addEdge("B","P");

        var list = graph.topologicalSort();
        System.out.println(list);

    }
}
