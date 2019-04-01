package ds.entities.binary.tree;

public class BinaryTree<T> {

  public BinaryTreeNode<Integer> HEAD;
  int count;

  @SuppressWarnings("unchecked")
  public void add(Integer item) {
    if (HEAD == null) {
      HEAD = (BinaryTreeNode<Integer>) new BinaryTreeNode<T>((T) item);
    } else {
      addTo(HEAD, item);
    }
    count++;
  }

  public void addTo(BinaryTreeNode<Integer> node, Integer item) {
    if (item < node.item) {
      if (node.left == null) {
        node.left = new BinaryTreeNode<Integer>(item);
      } else {
        addTo(node.left, item);
      }
    } else {
      if (node.right == null) {
        node.right = new BinaryTreeNode<Integer>(item);
      } else {
        addTo(node.right, item);
      }
    }
    count++;
  }

  public void displayTree(BinaryTreeNode<Integer> node) {
    if (node == null) {
      return;
    }
    System.out.println(node.item);
    displayTree(node.left);
    displayTree(node.right);
  }

  public ParentAndChildNode findParentNode(Integer item) {
    ParentAndChildNode helper = new ParentAndChildNode();
    BinaryTreeNode<Integer> current = HEAD;
    BinaryTreeNode<Integer> parent = null;
    while (current != null) {
      if (item < current.item) {
        parent = current;
        current = current.left;
      } else if (item > current.item) {
        parent = current;
        current = current.right;
      } else {
        // parent = current;
        break;
      }
    }
    helper.node = current;
    helper.parent = parent;
    return helper;
  }

  public void displayFormattedTree() {
    System.out.println(HEAD.item);
    displayFormatTreeRec(HEAD.left, HEAD.right);
  }

  private void displayFormatTreeRec(BinaryTreeNode<Integer> left, BinaryTreeNode<Integer> right) {
    if (left == null && right == null) {
      return;
    }
    if (left != null) {
      System.out.println(left.item);
    }
    if (right != null) {
      System.out.println(right.item);
    }
    if (left != null) {
      displayFormatTreeRec(left.left, left.right);
    }
    if (right != null) {
      displayFormatTreeRec(right.left, right.right);
    }
  }

  public void remove(Integer item) {

    ParentAndChildNode helper = findParentNode(item);
    // case - when deleting leaf node
    if (helper.node.left == null && helper.node.right == null) {
      if (helper.parent.left.equals(helper.node)) {
        helper.parent.left = null;
      } else {
        helper.parent.right = null;
      }
    }
    
    //case - when node to be removed has no right child- promote the left child
    else if(helper.node.right == null && helper.node.left != null){
    //  helper.parent.
    }
    System.out.println("element removed");
    count--;
  }
}
