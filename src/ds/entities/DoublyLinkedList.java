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

  public void insertAtEnd(T item) {
    Node<T> newNode = new Node<T>(item, null, null);
    Node<T> tmp = TAIL;
    TAIL = newNode;
    TAIL.prev = tmp;
    if (isEmpty()) {
      HEAD = TAIL;
    } else {
      tmp.next = TAIL;
    }
    size++;
  }

  public void removeFirst() {
    if (!isEmpty()) {
      HEAD = HEAD.next;
      size--;
      if (isEmpty()) {
        TAIL = null;
      } else {
        HEAD.prev = null;
      }
    }
  }

  public void removeLast() {
    if (!isEmpty()) {
      TAIL = TAIL.prev;
      size--;
      if (isEmpty()) {
        HEAD = null;
      } else {
        TAIL.next = null;
      }
    }
  }

  public void removeItem(T item) {
    if (!isEmpty()) {
      Node<T> node = returnItemNode(item);
      if (node == null) {
        return;
      }
      if (node.prev == null) {
        removeFirst();
      } else {
        if (node.next == null) {
          removeLast();
        } else {
          node.prev.next = node.next;
          node.next.prev = node.prev;
        }
      }
      size--;
    }
  }

  public Node<T> returnItemNode(T item) {
    Node<T> node = HEAD;
    while (node.next != null) {
      if (item.equals(node.item)) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public void displayListContents() {
    Node<T> node = HEAD;
    int i = 1;
    if (isEmpty()) {
      System.out.println("Empty list");
    } else {
      while (node.next != null) {
        System.out.println("Node number " + i + " is " + node);
        node = node.next;
        i++;
      }
      // to print last element or if list has only one node
      System.out.println("Node number " + i + " is " + node);
    }

    System.out.println("Size of the list -->" + size);
  }

  public void displayListContentsFromEnd() {
    Node<T> node = TAIL;
    int i = 1;
    if (isEmpty()) {
      System.out.println("Empty list");
    } else {
      while (node.prev != null) {
        System.out.println("Node number " + i + " is " + node);
        node = node.prev;
        i++;
      }
      // to print last element or if list has only one node
      System.out.println("Node number " + i + " is " + node);
    }

    System.out.println("Size of the list -->" + size);
  }
}
