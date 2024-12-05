package t;

import java.util.ArrayList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
 
 
    TreeNode() {
    }
 
 
    TreeNode(int val) {
        this.val = val;
    }
 
 
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public static boolean isInTree(TreeNode root, int target) {
        if (root == null) {
            return false; // if there is no more than that means that there is not this number in this tree
        }

        if (root.val == target) { // during the first run it will be the real root. but we will use recurision and the root will be whatever number we are starting on
            return true;
        }
        return isInTree(root.left, target) || isInTree(root.right, target); // sens 2 recursive functions down throuhg each side.
    }

    public static int largestValueBST(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int mx = root.val;
        TreeNode curr = root;
        while (curr != null) {
            mx = curr.val;
            curr = curr.right;
        }
        return mx;
    }

    public static int largestValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int mx = root.val;
        mx = Math.max(mx, largestValue(root.left));
        mx = Math.max(mx, largestValue(root.right));
        return mx;
    }


    public static void allvalues(TreeNode root, ArrayList<Integer> values) {
        if (root == null) {
            return;
        }
        allvalues(root.left, values);
        values.add(root.val);
        allvalues(root.right, values);
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


    public static void main(String[] args) {
        // Example BST:
        //       10
        //      /  \
        //     5    15
        //    / \     \
        //   2   7     20

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);

        ArrayList<Integer> list = new ArrayList<>();
        allvalues(root, list); // Call the method

        // Print the sorted list
        System.out.println("Values in sorted order: " + list);
    }
 }
 
