package isd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graphhhh {
    private Map<Character, ArrayList<Character>> graph = new HashMap<>();

    public static void main(String[] args) {
        Graphhhh res = new Graphhhh();

        res.addNode('A', 'B');
        res.addNode('A', 'D');
        res.addNode('A', 'E');
        res.addNode('B', 'E');
        res.addNode('D', 'G');
        res.addNode('E', 'F');
        res.addNode('E', 'H');
        res.addNode('F', 'C');
        res.addNode('F', 'H');
        res.addNode('G', 'H');
        res.addNode('H', 'I');
        res.addNode('I', 'F');
        res.addNode('C', 'B');

        System.out.println("Adjacency List: " + res);
    }

    public void addNode(char start, char dest) {
        if (!graph.containsKey(start)) graph.put(start, new ArrayList<>());
        if (!graph.containsKey(dest)) graph.put(dest, new ArrayList<>());

        graph.get(start).add(dest);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Character vertexS : graph.keySet()) {
            result.append("Vertex ").append(vertexS).append(" --> ");

            for (Character vertexD : graph.get(vertexS)) {
                result.append(vertexD).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }
}
