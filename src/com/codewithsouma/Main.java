package com.codewithsouma;


import com.codewithsouma.graph.DirectedGraph;
import com.codewithsouma.graph.UndirectedWeightedGraph;

public class Main {

    public static void main(String[] args) {
        UndirectedWeightedGraph graph = new UndirectedWeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");


        graph.addEdge("A","B", 3);
        graph.addEdge("A","C", 2);

        graph.print();

    }
}
