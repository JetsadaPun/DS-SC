package krit5;

public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(70);
        tree.insert(80);
        tree.insert(30);
        tree.insert(50);
        tree.insert(5);
        tree.insert(60);
        tree.insert(40);
        tree.insert(4);
        tree.insert(90);
        tree.insert(75);

        System.out.println("\nBefore deleting");
        tree.PrintBST();

        tree.delete(70);
        tree.delete(5);

        System.out.println("\nAfter deleting");
        tree.PrintBST();
    }
}
