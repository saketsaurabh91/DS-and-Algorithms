package ds.entities;

public class LinkedListTester {
  public static void main(String[] args) {

    DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
    doublyLinkedList.insertAtEnd("Saket");
    doublyLinkedList.insertAtEnd("End");
    doublyLinkedList.insertAtStart("Start");
    doublyLinkedList.removeItem("Saket");
    doublyLinkedList.displayListContents();
    doublyLinkedList.displayListContentsFromEnd();
  }
}
