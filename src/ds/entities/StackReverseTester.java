package ds.entities;

import java.util.Stack;

public class StackReverseTester {

  public static void main(String[] args) {

    Stack<Integer> intStack = new Stack<>();
    intStack.push(1);
    intStack.push(2);
    intStack.push(3);

    reverseStack(intStack);
  }

  private static void reverseStack(Stack<Integer> intStack) {
    int data;
    if (intStack.isEmpty()) {
      return;
    }

    data = intStack.pop();
    reverseStack(intStack);

    addAtBottom(intStack, data);
  }

  private static void addAtBottom(Stack<Integer> intStack, int data) {

    int temp;

    if (intStack.isEmpty()) {
      intStack.push(data);
      return;
    }
    temp = intStack.pop();
    addAtBottom(intStack, data);
    intStack.push(temp);
  }

}
