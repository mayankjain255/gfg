package com.questions.linkedlist;


// Reverse a linked list: https://www.geeksforgeeks.org/reverse-a-linked-list/
public class Ques1 {

  // TODO
  static Node reverseRecursive(Node node) {
    return null;
  }

/*  static Node reverseLLRecursive() {
    Node h1 = node;
    Node h2 = node.next;
    h1.next = null;
    reverseRecursive(h2);
  }*/

  // Iterative
  static Node reverseLLIterative(Node node) {
    Node h1 = node;
    Node h2 = node.next;
    h1.next = null;
    while (h2 != null) {
      Node currNode = h2;
      h2 = h2.next;
      currNode.next = h1;
      h1 = currNode;
    }
    return h1;
  }

  public static void main(String[] args) {
    Node node = LinkedListUtil.getLinkedList(5);
    LinkedListUtil.printLinkedList(node);
    node = reverseLLIterative(node);
    LinkedListUtil.printLinkedList(node);
  }
}
