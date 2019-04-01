package ds.entities.binary.tree;

public class BinaryTreeNode<T> {

  public T item;
  public BinaryTreeNode<T> left;
  public BinaryTreeNode<T> right;

  public BinaryTreeNode(T item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "BinaryTreeNode [item=" + item + ", left=" + left + ", right=" + right + "]";
  }

  @Override
  public boolean equals(Object obj) {
    @SuppressWarnings("unchecked")
    T item = ((BinaryTreeNode<T>) obj).item;
    return item.equals(this.item);
  }

  
}
