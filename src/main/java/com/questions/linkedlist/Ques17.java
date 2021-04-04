package com.questions.linkedlist;


import javafx.util.Pair;


// Split a Circular Linked List into two halves
public class Ques17 {

  static Pair<Node, Node> splitLL(Node node) {
    Pair<Node, Node> twoHalves;
    Node firstHead = node;
    Node secondHead = node;
    while ((secondHead.next != node && secondHead.next.next != node)) {
      firstHead = firstHead.next;
      secondHead = secondHead.next.next;
    }
    if (secondHead.next == node) {
      secondHead.next = null;
    }
    else {
      secondHead.next.next = null;
    }
    secondHead = firstHead.next;
    firstHead.next = null;
    twoHalves = new Pair<>(node, secondHead);
    return twoHalves;
  }

  public static void main(String[] args) {
    Node node = LinkedListUtil.getCircularLinkedList(1);
    Pair<Node, Node> twoHalves = splitLL(node);
    LinkedListUtil.printLinkedList(twoHalves.getKey());
    LinkedListUtil.printLinkedList(twoHalves.getValue());
  }

}
