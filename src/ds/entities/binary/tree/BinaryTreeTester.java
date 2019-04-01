package ds.entities.binary.tree;

public class BinaryTreeTester {
  public static void main(String[] args) {
    BinaryTree<Integer> tree = new BinaryTree<>();
    tree.add(4);
    tree.add(2);
    tree.add(5);
    tree.add(1);
    tree.add(3);
    tree.add(6);
    tree.add(8);

    tree.displayFormattedTree();
    // System.out.println(tree.findParentNode(1).node);
    tree.remove(1);
    tree.displayFormattedTree();
  }

}
