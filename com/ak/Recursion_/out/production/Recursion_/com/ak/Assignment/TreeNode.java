package com.ak.Assignment;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    class Solution {
        int pathLength = 0;

        private void dfs(TreeNode root, int left, int right) {
            if (root == null) {
                return;
            }

            pathLength = Math.max(pathLength, Math.max(left, right));

            if (root.left != null) {
                dfs(root.left, right + 1, 0);
            }

            if (root.right != null) {
                dfs(root.right, 0, left + 1);
            }
        }

        public int longestZigZag(TreeNode root) {
            dfs(root, 0, 0);
            return pathLength;
        }
    };
  }
