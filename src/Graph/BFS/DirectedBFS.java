package Graph.BFS;

import java.util.*;

public class DirectedBFS {
    public final BFS graph = new BFS();

    public void beginBFS(Nodes startNodes) {
        if (startNodes == null) return;

        Queue<Nodes> queue = new LinkedList<>();
        queue.add(startNodes);

        while (!queue.isEmpty()) {
            Nodes nodes = queue.poll();
            if (nodes.isVisited) continue;

            Queue<Nodes> allAdjacent = graph.adjMap.get(nodes);

            nodes.visits();

            if (allAdjacent == null) {
                System.out.print(nodes.name);
                continue;
            } else {
                System.out.print(nodes.name + " -> ");
            }

            for (Nodes adjacents : allAdjacent) {
                if (!adjacents.isVisited) queue.add(adjacents);
            }
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        DirectedBFS bfs = new DirectedBFS();

        Nodes a = new Nodes("A");
        Nodes b = new Nodes("B");
        Nodes c = new Nodes("C");
        Nodes d = new Nodes("D");
        Nodes e = new Nodes("E");
        Nodes f = new Nodes("F");
        Nodes g = new Nodes("G");
        Nodes h = new Nodes("H");
        Nodes i = new Nodes("I");

        bfs.graph.addEdge(a, b);
        bfs.graph.addEdge(a, d);
        bfs.graph.addEdge(a, e);
        bfs.graph.addEdge(b, e);
        bfs.graph.addEdge(c, b);
        bfs.graph.addEdge(d, g);
        bfs.graph.addEdge(e, f);
        bfs.graph.addEdge(e, h);
        bfs.graph.addEdge(f, c);
        bfs.graph.addEdge(f, h);
        bfs.graph.addEdge(g, h);
        bfs.graph.addEdge(h, i);

        System.out.println("BFS Traversal : ");
        bfs.beginBFS(a);
    }
}

class BFS {
    HashMap<Nodes, LinkedList<Nodes>> adjMap = new HashMap<>();

    private void edgeMaker(Nodes src, Nodes dest) {
        LinkedList<Nodes> temp = adjMap.get(src);

        if (temp != null) temp.remove(dest);
        else temp = new LinkedList<>();

        temp.add(dest);
        adjMap.put(src, temp);
    }

    public void addEdge(Nodes src, Nodes dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);

        edgeMaker(src, dest);
    }
}

class Nodes {
    String name;
    boolean isVisited;

    Nodes(String name) {
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}