/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytree;

/**
 *
 * @author terer
 */
public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        root = this.insertHelper(val, root);
    }

    private Node insertHelper(int val, Node current) {
        if (current == null) {
            Node newNode = new Node(val);
            return newNode;
        } else if (val < current.getValue()) {
            current.setLeftNode(insertHelper(val, current.getLeftNode()));
        } else {
            current.setRightNode(insertHelper(val, current.getRightNode()));
        }
        return current;
    }

    public void inOrderTraversal() {
        this.inOrderHelper(root);
    }

    private void inOrderHelper(Node current) {
        if (current != null) {
            this.inOrderHelper(current.getLeftNode());
            System.out.print(current.getValue() + " ");
            this.inOrderHelper(current.getRightNode());
        }
    }

    public void preOrderTraversal() {
        this.preOrderHelper(root);
    }

    private void preOrderHelper(Node current) {
        if (current != null) {
            System.out.print(current.getValue() + " ");
            preOrderHelper(current.getLeftNode());
            preOrderHelper(current.getRightNode());
        }
    }

    public void postOrderTraversal() {
        this.postOrderHelper(root);
    }

    private void postOrderHelper(Node current) {
        if (current != null) {
            postOrderHelper(current.getLeftNode());
            postOrderHelper(current.getRightNode());
            System.out.print(current.getValue() + " ");
        }
    }

}
