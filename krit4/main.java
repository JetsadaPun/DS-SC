package krit4;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class main {
    public static void main(String[] args) {
        Dictionary<String, Integer> dictionary = new Hashtable<>();
        // Adding elements to the dictionary
        dictionary.put("A", 1);
        dictionary.put("B", 2);
        dictionary.put("C", 3);
        // Getting values from the dictionary
        int valueA = dictionary.get("A");
        System.out.println("Value of A: " + valueA);
        // Removing elements from the dictionary
        dictionary.remove("B");
        // Enumerating the elements of the dictionary
        Enumeration<String> k = dictionary.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            System.out.println("Key: " + key + ", Value: " + dictionary.get(key));
        }
    }
}
