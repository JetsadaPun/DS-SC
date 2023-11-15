package krit8;

public class Main {
    public static void main(String[] args) {
        MyGraph g = new MyGraph();
        g.addNode("A");
        g.addNode("B");
        g.addNode("C");
        g.addNode("D");

        g.addEdge("A", "C", 10);
        g.addEdge("A", "D", 20);
        g.addEdge("C", "D", 1);
        g.addEdge("B", "C", 100);

        g.PrintGraph();
    }
}
