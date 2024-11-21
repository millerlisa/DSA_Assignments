package AssignmentEight;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }
    // Level order traversal
    public void levelOrder(BinaryNode root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root); // start from root node

        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.poll(); // remove the node from the front of the queue
            System.out.print(currentNode.value + " "); // print the node

            if (currentNode.left != null) {
                queue.add(currentNode.left); // add left child to the queue
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right); // add right child to the queue
            }
        }
    }

    // Example BinaryNode class
    static class BinaryNode {
        int value;
        BinaryNode left;
        BinaryNode right;    
        
        public BinaryNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // Example use
        BinaryTreeLL tree = new BinaryTreeLL();
        tree.root = new BinaryNode(1);
        tree.root.left = new BinaryNode(2);
        tree.root.right = new BinaryNode(3);
        tree.root.left.left = new BinaryNode(4);
        tree.root.left.right = new BinaryNode(5);
        tree.root.right.left = new BinaryNode(6);
        tree.root.right.right = new BinaryNode(7);
        System.out.println();
        System.out.println("Level order traversal of binary tree:  ");
        tree.levelOrder(tree.root);
    }

    // Example tree:
    //         1
    //        / \
    //      2     3
    //     / \   / \
    //    4   5 6   7

    // Explanation:
    // Queue Initialization:
        // A Queue is used to hold the nodes to be processed.
        // We use LinkedList for the queue implementation.
    // Processing Nodes:
        // Start with the root node by adding it to the queue.
        // While the queue is not empty, remove the front node, process it, and enqueue its children (if any).
    // Example:
        // The main method shows how to build a simple binary tree and call the levelOrder method.


    // Class Notes - Monday, 18 November + Tuesday, 19 November
    // //preOrder traversal
    // public void preOrder(BinaryNode node){
    //     if (node == null) {
    //         return;
    //     }
    //     System.out.print(node.value + " "); //root
    //     preOrder(node.left);
    //     preOrder(node.right);
    // }

    // //inOrder traversal
    // public void inOrder(BinaryNode node){
    //     if (node == null) {
    //         return;
    //     }
    //     inOrder(node.left);
    //     System.out.print(node.value + " "); //root
    //     inOrder(node.right);
    // }

    // //postOrder traversal
    // public void postOrder(BinaryNode node){
    //     if (node == null) {
    //         return;
    //     }
    //     postOrder(node.left);
    //     postOrder(node.right);
    //     System.out.print(node.value + " "); //root

    // }

    //First Assignment
    //Implement  Level order traversal
    //HINT = You will need a queue to implement this.

    
}
