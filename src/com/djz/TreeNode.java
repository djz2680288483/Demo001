package com.djz;

/**
 * @author djz
 * @date 2021/3/22 -16:12
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 前序遍历获取二叉树深度
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int h1 = maxDepth(root.left), h2 = maxDepth(root.right);
            return 1 + (h1 > h2 ? h1 : h2);
        }

    }
}
