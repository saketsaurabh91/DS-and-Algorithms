package ds.entities.binary.tree;

public class Solution {

  public static void main(String[] args) {


  }

  public static boolean isSymmetric(TreeNode root) {

    return checkSymmetry(root.left, root.right);
  }

  private static boolean checkSymmetry(TreeNode left, TreeNode right) {

    if (left == null && right == null) {
      return true;
    }

    if (left == null && right != null || left != null && right == null) {
      return false;
    }

    if (left.val != right.val) {
      return false;
    }

    return  checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
  }
}
