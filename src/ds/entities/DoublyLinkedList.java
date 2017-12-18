package ds.entities;

public class DoublyLinkedList<T> {

  private int size;
  private Node<T> HEAD;
  private Node<T> TAIL;

  public DoublyLinkedList() {
    HEAD = null;
    TAIL = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  // ? vs T
  public void insertAtStart(T item) {

    Node<T> newNode = new Node<T>(item, null, null);
    Node<T> tmp = HEAD;
    HEAD = newNode;
    HEAD.next = tmp;

    if (isEmpty()) {
      TAIL = HEAD;
    } else {
      tmp.prev = HEAD;
    }
    size++;
  }
}
