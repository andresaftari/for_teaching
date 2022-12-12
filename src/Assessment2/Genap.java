package Assessment2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Genap {
    public static void main(String[] args) {
        Genap operator = new Genap();

        Node cilacap = new Node("Cilacap");
        Node kroya = new Node("Kroya");
        Node purwokerto = new Node("Purwokerto");
        Node slawi = new Node("Slawi");
        Node brebes = new Node("Brebes");
        Node tegal = new Node("Tegal");
        Node pemalang = new Node("Pemalang");
        Node kebumen = new Node("Kebumen");
        Node banjanegara = new Node("Banjanegara");
        Node purworejo = new Node("Purworejo");
        Node purbalingga = new Node("Purbalingga");
        Node pekalongan = new Node("Pekalongan");
        Node wonosobo = new Node("Wonosobo");
        Node magelang = new Node("Magelang");
        Node boyolali = new Node("Boyolali");
        Node klaten = new Node("Klaten");
        Node salatiga = new Node("Salatiga");
        Node semarang = new Node("Semarang");
        Node kendal = new Node("Kendal");
        Node temanggung = new Node("Temanggung");
        Node demak = new Node("Demak");
        Node wonogiri = new Node("Wonogiri");
        Node kudus = new Node("Kudus");
        Node rembang = new Node("Rembang");
        Node blom = new Node("Blom");
        Node solo = new Node("Solo");
        Node sragen = new Node("Sragen");
        Node sukoharjo = new Node("Sukoharjo");
        Node purwodadi = new Node("Purwodadi");

        // Layer 1
        graph.undirectedEdge(cilacap, kroya);
        graph.undirectedEdge(cilacap, purwokerto);
        graph.undirectedEdge(purwokerto, kroya);
        graph.undirectedEdge(purwokerto, kebumen);
        graph.undirectedEdge(purwokerto, purbalingga);
        graph.undirectedEdge(purwokerto, slawi);
        graph.undirectedEdge(kroya, kebumen);
        // Layer 2
        graph.undirectedEdge(kebumen, purworejo);
        graph.undirectedEdge(purbalingga, pemalang);
        graph.undirectedEdge(purbalingga, banjanegara);
        graph.undirectedEdge(slawi, tegal);
        graph.undirectedEdge(slawi, brebes);
        graph.undirectedEdge(tegal, brebes);
        graph.undirectedEdge(tegal, pemalang);
        // Layer 3
        graph.undirectedEdge(purworejo, magelang);
        graph.undirectedEdge(banjanegara, wonosobo);
        graph.undirectedEdge(magelang, wonosobo);
        graph.undirectedEdge(pemalang, pekalongan);
        // Layer 4
        graph.undirectedEdge(pekalongan, kendal);
        graph.undirectedEdge(wonosobo, temanggung);
        graph.undirectedEdge(kendal, temanggung);
        graph.undirectedEdge(magelang, temanggung);
        graph.undirectedEdge(magelang, boyolali);
        // Layer 5
        graph.undirectedEdge(temanggung, salatiga);
        graph.undirectedEdge(boyolali, klaten);
        graph.undirectedEdge(salatiga, klaten);
        graph.undirectedEdge(kendal, semarang);
        graph.undirectedEdge(salatiga, semarang);
        // Layer 6
        graph.undirectedEdge(boyolali, solo);
        graph.undirectedEdge(semarang, demak);
        // Layer 7
        graph.undirectedEdge(demak, kudus);
        graph.undirectedEdge(demak, purwodadi);
        graph.undirectedEdge(kudus, purwodadi);
        graph.undirectedEdge(solo, purwodadi);
        graph.undirectedEdge(solo, sragen);
        graph.undirectedEdge(solo, sukoharjo);
        // Layer 8
        graph.undirectedEdge(kudus, rembang);
        graph.undirectedEdge(purwodadi, blom);
        graph.undirectedEdge(rembang, blom);
        graph.undirectedEdge(sragen, blom);
        graph.undirectedEdge(sukoharjo, wonogiri);

        operator.beginDFS(cilacap);
    }

    private static final Graph graph = new Graph();

    private void beginBFS(Node startNode) {
        if (startNode == null) return;

        LinkedList<Node> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node node = queue.removeFirst();
            if (node.isVisited) continue;

            node.visits();
            System.out.print(node.name + " ");

            LinkedList<Node> adjacent = graph.mapper.get(node);

            if (adjacent == null) continue;
            for (Node values : adjacent) if (!values.isVisited) queue.add(values);
        }
        System.out.println();
    }

    private void beginDFS(Node startNode) {
        starterDFS(startNode);

        for (Node nodes : graph.mapper.keySet()) if (!nodes.isVisited) starterDFS(nodes);
    }

    private void starterDFS(Node node) {
        node.visits();
        System.out.print(node.name + " ");

        List<Node> adjacent = graph.mapper.get(node);
        if (adjacent == null) return;

        for (Node nodes : adjacent) if (!nodes.isVisited) starterDFS(nodes);
    }
}

class Graph {
    Map<Node, LinkedList<Node>> mapper;

    Graph() {
        mapper = new HashMap<>();
    }

    private void edgeMaker(Node src, Node dest) {
        LinkedList<Node> temp = mapper.get(src);

        if (temp != null) temp.remove(dest);
        else temp = new LinkedList<>();
        temp.add(dest);
        mapper.put(src, temp);
    }

    void undirectedEdge(Node src, Node dest) {
        if (!mapper.containsKey(src)) mapper.put(src, null);
        if (!mapper.containsKey(dest)) mapper.put(dest, null);
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