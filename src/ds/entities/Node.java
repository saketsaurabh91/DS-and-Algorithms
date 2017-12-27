package ds.entities;

public class Node<T> {

  public T item;
  public Node<T> prev;
  public Node<T> next;

  public Node() {
    next = null;
    prev = null;
    item = null;
  }

  public Node(T item, Node<T> n, Node<T> p) {
    this.item = item;
    next = n;
    prev = p;
  }

  @Override
  public String toString() {
    if (next == null && prev == null) {
      return "Node [item=" + item + ", prev=" + prev + ", next=" + next + "]";
    } else if (next == null && prev != null) {
      return "Node [item=" + item + ", prev=" + "notNull" + ", next=" + next + "]";
    } else if (next != null && prev == null) {
      return "Node [item=" + item + ", prev=" + prev + ", next=" + "notNull" + "]";
    } else {
      return "Node [item=" + item + ", prev=" + "notNull" + ", next=" + "notNull" + "]";
    }
  }


}
