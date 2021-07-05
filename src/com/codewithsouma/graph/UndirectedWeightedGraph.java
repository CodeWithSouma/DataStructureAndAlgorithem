package com.codewithsouma.graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UndirectedWeightedGraph {
    private class Node {
        private String label;

        private Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private class Edge {
        private Node from;
        private Node to;
        private int weight;

        private Edge(Node from, Node to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return from + "  -> " + to;
        }
    }

    private HashMap<String, Node> nodes = new HashMap<>();
    private HashMap<Node, List<Edge>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<Edge>());
    }

    public void addEdge(String from, String to, int weight) {
        var toNode = nodes.get(to);
        var fromNode = nodes.get(from);
        if (toNode == null || fromNode == null) throw new IllegalArgumentException();

       adjacencyList.get(fromNode).add(new Edge(fromNode, toNode, weight));
       adjacencyList.get(toNode).add(new Edge(toNode, fromNode, weight));
    }

    public void print() {
        for (var source : adjacencyList.keySet())
            System.out.println(source + " is connected with: " + adjacencyList.get(source));
    }

}
