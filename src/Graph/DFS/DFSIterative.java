package Graph.DFS;

import java.util.*;

public class DFSIterative {
    private static final DFSGraph graph = new DFSGraph();

    // Used to continue traverse the second and more level of the Graph
    private void startDFS(DFSNode startNode) {
        startNode.visits();
        System.out.println(startNode.name);

        Queue<DFSNode> allAdjacents = graph.adjMap.get(startNode);
        if (allAdjacents == null) return;

        for (DFSNode adjacent : allAdjacents)
            if (!adjacent.isVisited) startDFS(adjacent);

        graph.adjMap.keySet().forEach(it -> {
            if (!it.isVisited) startDFS(it);
        });
    }

    public static void main(String[] args) {
        DFSIterative operator = new DFSIterative();

        DFSNode london = new DFSNode("London");
        DFSNode salisbury = new DFSNode("Salisbury");
        DFSNode bristol = new DFSNode("Bristol");
        DFSNode birmingham = new DFSNode("Birmingham");
        DFSNode cardiff = new DFSNode("Cardiff");
        DFSNode manchester = new DFSNode("Manchester");
        DFSNode kingston = new DFSNode("Kingston");
        DFSNode liverpool = new DFSNode("Liverpool");
        DFSNode newcastle = new DFSNode("Newcastle");
        DFSNode edinburgh = new DFSNode("Edinburgh");
        DFSNode glasgow = new DFSNode("Glasgow");

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

        System.out.println("DFS Traversal : ");
        operator.startDFS(london);
    }
}

class DFSGraph {
    Map<DFSNode, LinkedList<DFSNode>> adjMap = new HashMap<>();

    private void edgeMaker(DFSNode src, DFSNode dest) {
        LinkedList<DFSNode> temp = adjMap.get(src);

        if (temp != null) temp.remove(dest);
        else temp = new LinkedList<>();

        temp.add(dest);
        adjMap.put(src, temp);
    }

    void undirectedEdge(DFSNode src, DFSNode dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);

        edgeMaker(src, dest);
        edgeMaker(dest, src);
    }
}

class DFSNode {
    String name;
    boolean isVisited;

    DFSNode(String name) {
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}