package com.codewithsouma.graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UndirectedWeightedGraph {
    private class Node {
        private String label;
        private List<Edge> edges = new ArrayList<>();

        private Node(String label) {
            this.label = label;
        }

        public void addEdges(Node to, int weight){
            edges.add(new Edge(this, to, weight));
        }

        public List<Edge> getEdges(){
            return edges;
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
    //private HashMap<Node, List<Edge>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);

        //old implementation
        //adjacencyList.putIfAbsent(node, new ArrayList<Edge>());
    }

    public void addEdge(String from, String to, int weight) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (toNode == null || fromNode == null) throw new IllegalArgumentException();

        //old implementation
       //adjacencyList.get(fromNode).add(new Edge(fromNode, toNode, weight));
       //adjacencyList.get(toNode).add(new Edge(toNode, fromNode, weight));

        fromNode.addEdges(toNode,weight);
        toNode.addEdges(fromNode,weight);
    }

    public void print() {
       /* for (var source : adjacencyList.keySet())
            System.out.println(source + " is connected with: " + adjacencyList.get(source));*/

        for (var node: nodes.values()){
            System.out.println(node + " is connected with: "+node.getEdges());
        }

    }

}
