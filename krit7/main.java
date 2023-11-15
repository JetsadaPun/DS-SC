package krit7;

public class main {
    public static void main(String[] args) {
        Trie T = new Trie();
        T.insert("jan");
        T.insert("java");
        T.insert("jump");
        T.insert("halo");
        T.insert("hi");
        T.insert("hiro");
        T.PrintTrie();
        T.PrintWord();
    }
}
