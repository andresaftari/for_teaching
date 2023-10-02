package Graph.DFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class DirectedDFS {
    public final DFS graph = new DFS();

    // Used to continue traverse the second and more level of the Graph
    public void startDFS(Node2 startNode) {
        startNode.visits();
        System.out.print(startNode.name + " ");

        Queue<Node2> allAdjacents = graph.adjMap.get(startNode);
        if (allAdjacents == null) return;

        for (Node2 adjacent : allAdjacents) {
            if (!adjacent.isVisited) startDFS(adjacent);
        }

        graph.adjMap.keySet().forEach(it -> {
            if (!it.isVisited) startDFS(it);
        });
    }
}

class Main {
    public static void main(String[] args) {
        DirectedDFS dfs = new DirectedDFS();
        
        Node2 a = new Node2("A");
        Node2 b = new Node2("B");
        Node2 c = new Node2("C");
        Node2 d = new Node2("D");
        Node2 e = new Node2("E");
        Node2 f = new Node2("F");
        Node2 g = new Node2("G");
        Node2 h = new Node2("H");
        Node2 i = new Node2("I");

        dfs.graph.addEdge(a, b);
        dfs.graph.addEdge(a, d);
        dfs.graph.addEdge(a, e);
        dfs.graph.addEdge(b, e);
        dfs.graph.addEdge(c, b);
        dfs.graph.addEdge(d, g);
        dfs.graph.addEdge(e, f);
        dfs.graph.addEdge(e, h);
        dfs.graph.addEdge(f, c);
        dfs.graph.addEdge(f, h);
        dfs.graph.addEdge(g, h);
        dfs.graph.addEdge(h, i);

        System.out.println("DFS Traversal : ");
        dfs.startDFS(a);
    }
}

class DFS {
    Map<Node2, LinkedList<Node2>> adjMap = new HashMap<>();

    private void edgeMaker(Node2 src, Node2 dest) {
        LinkedList<Node2> temp = adjMap.get(src);

        if (temp != null) temp.remove(dest);
        else temp = new LinkedList<>();

        temp.add(dest);
        adjMap.put(src, temp);
    }

    void addEdge(Node2 src, Node2 dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);

        edgeMaker(src, dest);
    }
}

class Node2 {
    String name;
    boolean isVisited;

    Node2(String name) {
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}