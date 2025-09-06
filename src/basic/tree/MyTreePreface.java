package basic.tree;

import java.util.List;

/**
 * @author zhulx
 **/
public class MyTreePreface {
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
  }

    public void preorderTraversal(TreeNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        preorderTraversal(head.left);
        preorderTraversal(head.right);
    }

}
