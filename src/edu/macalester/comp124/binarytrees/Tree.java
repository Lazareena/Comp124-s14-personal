package edu.macalester.comp124.binarytrees;

/**
 * @author Shilad Sen
 */
public class Tree {
    private Node root = null;

    public Tree() {}

    public void  insert(String value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node node = root;
        while (true) {
            if (value.compareTo(node.getValue()) < 0) {
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                    break;
                }
                node = node.getLeft();
            } else if (value.compareTo(node.getValue()) > 0) {
                if (node.getRight() == null) {
                    node.setRight(newNode);
                    break;
                }
                node = node.getRight();
            } else {
                break;
            }
        }
    }

    public Node getRoot() {
        return root;
    }

    public int height(Node node) {

        if (node == null) {
            return 0;
        }
            int left = height(node.getLeft());
            int right = height(node.getRight());

        if (left >= right) {
            return left + 1;
        } else {
            return right + 1;
        }

    }
}
