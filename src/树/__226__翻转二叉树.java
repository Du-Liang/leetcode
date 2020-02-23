package 树;

import java.util.LinkedList;
import java.util.Queue;

//https://leetcode-cn.com/problems/invert-binary-tree/
public class __226__翻转二叉树 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root==null)return null;
//           层序遍历
            Queue queue=new LinkedList<TreeNode>();
            queue.offer(root);
            TreeNode node,tem;
            while (!queue.isEmpty()){
                node=(TreeNode) queue.poll();
                tem=node.left;node.left=node.right;node.right=tem;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }

            return root;
        }
        public TreeNode invertTree2(TreeNode root) {
            if(root==null)return null;
//           中序遍历
            invertTree(root.left);
            TreeNode tem=root.left;
            root.left=root.right;
            root.right=tem;
            invertTree(root.left);

            return root;
        }
    }
}
