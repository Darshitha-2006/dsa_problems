package darshita.project.grokking_dsa;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode next;

    TreeNode(int value) {
        this.value = value;
        this.left = this.right = this.next = null;
    }
}

public class levelOrderSiblings {
    public static void connect(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode prev = null;

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = q.poll();

                if (prev != null) {
                    prev.next = current;
                }
                prev = current;

                if (current.left != null)
                    q.offer(current.left);
                if (current.right != null)
                    q.offer(current.right);
            }
        }
    }

    public static void printLevelOrder(TreeNode root) {
        TreeNode current = root;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        connect(root);
        printLevelOrder(root);  // Output: 12 7 1 9 2 10 5
    }
}
