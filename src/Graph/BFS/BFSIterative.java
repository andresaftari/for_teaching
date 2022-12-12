package Graph.BFS;

import java.util.*;

public class BFSIterative {
    private static final BFSGraph graph = new BFSGraph();

    private void beginBFS(Node startNode) {
        if (startNode == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.isVisited) continue;

            node.visits();
            System.out.println(node.name);

            Queue<Node> allAdjacent = graph.adjMap.get(node);

            if (allAdjacent == null) continue;

            for (Node adjacents : allAdjacent) {
                if (!adjacents.isVisited) queue.add(adjacents);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFSIterative operator = new BFSIterative();

        Node london = new Node("London");
        Node salisbury = new Node("Salisbury");
        Node bristol = new Node("Bristol");
        Node birmingham = new Node("Birmingham");
        Node cardiff = new Node("Cardiff");
        Node manchester = new Node("Manchester");
        Node kingston = new Node("Kingston");
        Node liverpool = new Node("Liverpool");
        Node newcastle = new Node("Newcastle");
        Node edinburgh = new Node("Edinburgh");
        Node glasgow = new Node("Glasgow");

        // edges
        graph.undirectedEdge(london, birmingham);
        graph.undirectedEdge(london, salisbury);

        graph.undirectedEdge(birmingham, manchester);
        graph.undirectedEdge(birmingham, kingston);
        graph.undirectedEdge(birmingham, cardiff);
        graph.undirectedEdge(birmingham, bristol);

        graph.undirectedEdge(salisbury, bristol);

        graph.undirectedEdge(manchester, glasgow);
        graph.undirectedEdge(manchester, liverpool);
        graph.undirectedEdge(manchester, newcastle);
        graph.undirectedEdge(manchester, kingston);

        graph.undirectedEdge(newcastle, edinburgh);
        graph.undirectedEdge(newcastle, kingston);

        graph.undirectedEdge(edinburgh, glasgow);

        System.out.println("BFS Traversal : ");
        operator.beginBFS(london);
    }
}

class BFSGraph {
    HashMap<Node, LinkedList<Node>> adjMap = new HashMap<>();

    private void edgeMaker(Node src, Node dest) {
        LinkedList<Node> temp = adjMap.get(src);

        if (temp != null) temp.remove(dest);
        else temp = new LinkedList<>();

        temp.add(dest);
        adjMap.put(src, temp);
    }

    public void undirectedEdge(Node src, Node dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);

        edgeMaker(src, dest);
        edgeMaker(dest, src);
    }
}

class Node {
    String name;
    boolean isVisited;

    Node(String name) {
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}