package krit5;

public class BinaryTree {

    public TreeNode root;

    public boolean isEmpty() {
        return root == null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode node, int value) {
        if (value < node.item) {
            node.lChild = delete(node.lChild, value);
        } else if (value > node.item) {
            node.rChild = delete(node.rChild, value);
        } else {
            if (node.lChild == null) {
                return node.rChild;
            } else if (node.rChild == null) {
                return node.lChild;
            }
            node.item = minValue(node.rChild);
            node.rChild = delete(node.rChild, node.item);
        }

        return node;
    }

    private int minValue(TreeNode node) {
        int minValue = node.item;
        while (node.lChild != null) {
            minValue = node.lChild.item;
            node = node.lChild;
        }
        return minValue;
    }

    public void insert(int newItem) {
        if (isEmpty()) {
            TreeNode newNode = new TreeNode(newItem);
            root = newNode;
        } else {
            insert(root, newItem);
        }
    }

    public void insert(TreeNode bst, int newItem) {
        if (newItem < bst.item) {
            if (bst.lChild == null) {
                TreeNode newNode = new TreeNode(newItem);
                bst.lChild = newNode;
            } else
                insert(bst.lChild, newItem);

        } else if (newItem > bst.item) {
            if (bst.rChild == null) {
                TreeNode newNode = new TreeNode(newItem);
                bst.rChild = newNode;
            } else
                insert(bst.rChild, newItem);
        }
    }

    // public void postOrder(TreeNode rootNode) {
    // if (rootNode != null) {
    // postOrder(rootNode.lChild);
    // postOrder(rootNode.rChild);
    // System.out.print(rootNode.item + " ");
    // }
    // }

    // public void inOrder(TreeNode rootNode) {
    // if (rootNode != null) {
    // inOrder(rootNode.lChild);
    // System.out.print(rootNode.item + " ");
    // inOrder(rootNode.rChild);
    // }
    // }

    // public void preOrder(TreeNode rootNode) {
    // if (rootNode != null) {
    // System.out.print(rootNode.item + " ");
    // preOrder(rootNode.lChild);
    // preOrder(rootNode.rChild);
    // }
    // }

    public void PrintBST() {
        PrintSubBST(root, " ", true);
    }

    public void PrintSubBST(TreeNode parent, String indent, boolean last) {
        System.out.println(indent + "+- " + parent.item);
        indent += last ? "  " : "| ";
        if (parent.lChild != null && parent.rChild != null) {
            PrintSubBST(parent.rChild, indent, false);
            PrintSubBST(parent.lChild, indent, true);
        } else if (parent.lChild != null)
            PrintSubBST(parent.lChild, indent, true);
        else if (parent.rChild != null)
            PrintSubBST(parent.rChild, indent, true);
    }
}

class TreeNode {
    public int item;
    public TreeNode lChild;
    public TreeNode rChild;

    public TreeNode(int newItem) {
        item = newItem;
        lChild = null;
        rChild = null;
    }
}