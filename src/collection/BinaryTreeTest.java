package collection;

import java.util.PriorityQueue;

/**
 * Created by SATYENDRA_GUPTA on 26-07-2017.
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);

        TreeNode leftChild1 = new TreeNode(10);
        TreeNode rightChild1 = new TreeNode(50);

        leftChild1.setLeft(new TreeNode(3));
        leftChild1.setRight(new TreeNode(7));

        rightChild1.setLeft(new TreeNode(40));
        rightChild1.setRight(new TreeNode(70));

        root.setLeft(leftChild1);
        root.setRight(rightChild1);

        System.out.print("PreOrder Traversal : ");
        preOrder(root);
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        postOrder(root);
        System.out.println();
        System.out.print("InOrder Traversal : ");
        inOrder(root);

    }

    private static void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    private static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    private static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

