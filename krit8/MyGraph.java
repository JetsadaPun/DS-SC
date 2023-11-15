package krit8;

import java.util.*;

public class MyGraph {

    Hashtable<String, Node> allNode;

    public MyGraph() {
        allNode = new Hashtable<>();
    }

    public void addNode(String st) {
        if (!allNode.containsKey(st)) {
            allNode.put(st, new Node());
        }
    }

    public void addEdge(String s, String e, Integer w) {
        allNode.get(s).addAdj(e, w);
        allNode.get(e).addAdj(s, w);
    }

    public void PrintGraph() {
        for (String key : allNode.keySet()) {
            System.out.print(key + " : ");
            for (String adj : allNode.get(key).adjacent.keySet()) {
                System.out.print(adj + "=" + allNode.get(key).adjacent.get(adj) + " ");
            }
            System.out.println();
        }
    }
}

class Node {
    Hashtable<String, Integer> adjacent;

    public Node() {
        adjacent = new Hashtable<>();
    }

    public void addAdj(String e, Integer w) {
        if (!adjacent.containsKey(e)) {
            adjacent.put(e, w);
        }
    }
}