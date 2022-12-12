package Graph.AdjacencyList;

import java.util.LinkedList;

public class Graph {
    int vertex;
    LinkedList<Integer>[] adjacencyList;

    Graph(int total) {
        this.vertex = total;
        adjacencyList = new LinkedList[total];

        for (int i = 0; i < total; i++) adjacencyList[i] = new LinkedList<>();
    }

    public void addEdge(Graph graph, int source, int destination) {
        graph.adjacencyList[source].add(destination);
        graph.adjacencyList[destination].add(source);
    }

    public void printGraph(Graph graph) {
        for (int vertex = 0; vertex < graph.vertex; vertex++) {
            System.out.println("Adjacency list of vertex : " + vertex);
            System.out.print("Head");

            for (Integer marks : graph.adjacencyList[vertex]) {
                System.out.print(" -> " + marks);
            }
            System.out.println("\n");
        }
    }
}

class Main {
    public static void main(String[] args) {
        int total = 8;
        Graph graph = new Graph(total);

        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 0, 3);
        graph.addEdge(graph, 1, 5);
        graph.addEdge(graph, 2, 6);
        graph.addEdge(graph, 3, 5);
        graph.addEdge(graph, 4, 6);
        graph.addEdge(graph, 5, 6);
        graph.addEdge(graph, 6, 7);
        graph.addEdge(graph, 4, 7);

        graph.printGraph(graph);
    }
}