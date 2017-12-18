package ds.entities;

public class Node<T> {
  public T item;
  public Node<T> next;
  public Node<T> prev;

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
}
