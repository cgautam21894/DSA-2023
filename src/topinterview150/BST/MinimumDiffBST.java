package topinterview150.BST;

import com.sun.source.tree.*;
import java.util.*;

public class MinimumDiffBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(236);
        root.left = new TreeNode(104);
        root.right = new TreeNode(701);
        root.right.right = new TreeNode(991);
        root.left.right = new TreeNode(227);
        MinimumDiffBST obj = new MinimumDiffBST();
        System.out.println(obj.getMinimumDifference(root));
    }

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        inorder(root);
        return min;
    }

    TreeNode prev = null;
    int min = Integer.MAX_VALUE;

    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        prev = root;
        inorder(root.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
