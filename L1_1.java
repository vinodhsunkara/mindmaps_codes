/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        if(leftCount+1 == k) {
            return root.val;
        } else if(k <= leftCount) {
            return kthSmallest(root.left, k);
        } else {
            return kthSmallest(root.right, k- leftCount -1 );
        }
    }
    public int count(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int nodeCount = 1;
        if(root.left!=null) {
            nodeCount = nodeCount + count(root.left);
        }
        if(root.right!=null) {
            nodeCount = nodeCount + count(root.right);
        }
        return nodeCount;
    }
}