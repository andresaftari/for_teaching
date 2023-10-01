package isd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graphzzzz {
    private Map<Character, ArrayList<Character>> mapper = new HashMap<>();

    public static void main(String[] args) {
        Graphzzzz graph = new Graphzzzz();

        graph.addVertex('A', 'B');
        graph.addVertex('A', 'D');
        graph.addVertex('A', 'E');
        graph.addVertex('B', 'E');
        graph.addVertex('D', 'G');
        graph.addVertex('E', 'F');
        graph.addVertex('E', 'H');
        graph.addVertex('F', 'C');
        graph.addVertex('F', 'H');
        graph.addVertex('G', 'H');
        graph.addVertex('H', 'I');
        graph.addVertex('I', 'F');
        graph.addVertex('C', 'B');

        System.out.println(graph);
    }

    private void addVertex(char start, char dest) {
        if (!mapper.containsKey(start)) mapper.put(start, new ArrayList<>()); // bikin v
        if (!mapper.containsKey(dest)) mapper.put(dest, new ArrayList<>()); // bikin v

        mapper.get(start).add(dest);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Character vertexS : mapper.keySet()) {
            result.append("Vertex ").append(vertexS).append(" --> ");

            for (Character vertexD : mapper.get(vertexS)) {
                result.append(vertexD).append(" ");
            }
            result.append("\n");
        }

        return result.toString();
    }
}

// github.com/andresaftari/for_teaching/src/isd/
