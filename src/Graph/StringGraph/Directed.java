package Graph.StringGraph;

import java.util.*;

public class Directed {
    private final static Map<String, List<String>> graphMapper = new HashMap<>();
    StringBuilder output = new StringBuilder();

    private static void addEdges(String asal, String tujuan) {
        if (!graphMapper.containsKey(asal)) graphMapper.put(asal, new LinkedList<>());
        if (!graphMapper.containsKey(tujuan)) graphMapper.put(tujuan, new LinkedList<>());

        graphMapper.get(asal).add(tujuan);
//        graphMapper.get(tujuan).add(asal);
    }

    @Override
    public String toString() {
        for (String vertex1 : graphMapper.keySet()) {
            output.append("Vertex ").append(vertex1).append(" -> ");

            for (String vertex2 : graphMapper.get(vertex1)) output.append(vertex2).append(" ");
            output.append("\n");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Directed graph = new Directed();

        addEdges("A", "B");
        addEdges("A", "D");
        addEdges("A", "E");
        addEdges("D", "G");
        addEdges("G", "H");
        addEdges("H", "I");
        addEdges("I", "F");
        addEdges("F", "C");
        addEdges("F", "H");
        addEdges("C", "B");
        addEdges("B", "E");
        addEdges("E", "H");
        addEdges("E", "F");

        System.out.println("Adjacency List : \n" + graph);
    }
}