package com.codewithsouma.graph;

import java.util.*;

public class DirectedGraph {
    private class Node {
        String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<Node>());
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        if (fromNode == null)
            throw new IllegalArgumentException();
        var toNode = nodes.get(to);
        if (toNode == null)
            throw new IllegalArgumentException();

        adjacencyList.get(fromNode).add(toNode);
    }

    public void removeNode(String label) {
        var node = nodes.get(label);
        if (node == null) return;

        for (var adjacencyList : adjacencyList.values())
            adjacencyList.remove(node);

        nodes.remove(label);
        adjacencyList.remove(node);
    }

    public void removeEdges(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        if (fromNode == null || toNode == null) return;

        adjacencyList.get(fromNode).remove(toNode);
    }

    public void traverseDepthFirst(String label) {
        var node = nodes.get(label);
        if (node == null) return;
        Set<Node> setOfVisitedNodes = new HashSet<>();
        //dfs(node, setOfVisitedNodes);
        iterativeDFS(label);
    }

    private void iterativeDFS(String label){
        var node = nodes.get(label);
        if (node == null) return;

        Stack<Node> stackOfNodes = new Stack<>();
        stackOfNodes.push(node);
        Set<Node> setOfVisitedNodes = new HashSet<>();

        while (!stackOfNodes.isEmpty()){
            var currentNode = stackOfNodes.pop();

            if (setOfVisitedNodes.contains(currentNode)) continue;

            System.out.print(currentNode.label+"\t");
            setOfVisitedNodes.add(currentNode);

            var listOfAdjacentNodes = adjacencyList.get(currentNode);
            for (var adjacentNode: listOfAdjacentNodes)
                if (!setOfVisitedNodes.contains(adjacentNode))
                    stackOfNodes.push(adjacentNode);
        }
    }

    private void dfs(Node node, Set<Node> setOfVisitedNodes) {
        System.out.print(node.label + "\t");
        setOfVisitedNodes.add(node);

        var listOfAdjacentNodes = adjacencyList.get(node);
        for (var adjacentNode : listOfAdjacentNodes)
            if (!setOfVisitedNodes.contains(adjacentNode))
                dfs(adjacentNode, setOfVisitedNodes);
    }

    public void traverseBreadthFirst(String label) {
        var node = nodes.get(label);
        if (node == null) return;
        Set<Node> setOfVisitedNodes = new HashSet<>();
        var queue = new ArrayDeque<Node>();
        queue.add(node);
        //bfs(setOfVisitedNodes, queue);
        iterativeBFS(label);
    }

    private void iterativeBFS(String label){
        var node  = nodes.get(label);
        if (node == null) return;

        Queue<Node> queueOfNode = new ArrayDeque<>();
        Set<Node> setVisitedNodes = new HashSet<>();
        queueOfNode.add(node);

        while (!queueOfNode.isEmpty()){
            var currentNode = queueOfNode.remove();

            if (setVisitedNodes.contains(currentNode)) continue;

            System.out.print(currentNode.label + "\t");
            setVisitedNodes.add(currentNode);

            var listOfAdjacentNodes = adjacencyList.get(currentNode);
            for (var adjacentNode : listOfAdjacentNodes)
                if (!setVisitedNodes.contains(adjacentNode))
                    queueOfNode.add(adjacentNode);
        }

    }

    private void bfs(Set<Node> setOfVisitedNodes, ArrayDeque<Node> queue) {
        if (queue.isEmpty()) return;
        var currentNode = queue.remove();
        if (!setOfVisitedNodes.contains(currentNode)) {
            System.out.print(currentNode.label + "\t");
            setOfVisitedNodes.add(currentNode);
        }
        var listOfAllAdjacentNode = adjacencyList.get(currentNode);
        for (var adjacentNode : listOfAllAdjacentNode)
            queue.push(adjacentNode);
        bfs(setOfVisitedNodes, queue);
    }

    public void print() {
        for (var source : adjacencyList.keySet())
            System.out.println(source + " is connected with: " + adjacencyList.get(source));
    }

}
