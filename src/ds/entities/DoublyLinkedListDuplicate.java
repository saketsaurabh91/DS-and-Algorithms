package ds.entities;

public class DoublyLinkedListDuplicate<T> {

  private int size;
  private Node<T> HEAD;
  private Node<T> TAIL;

  public DoublyLinkedListDuplicate() {
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

  public void insertAtBeginning(Node<T> node) {
    if (HEAD == null) {
      HEAD = node;
      TAIL = node;
    }
    else{
      Node<T> temp = HEAD;
      HEAD = node;
      node.next = temp;
      temp.prev = node;
    }
    size ++;
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
