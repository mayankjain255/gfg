package com.questions.linkedlist;


import javafx.util.Pair;


// Add two numbers represented by linked lists.
// Question Link: https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
public class Ques10 {

  static Pair<Node, Integer> reverseLinkedList(Node node) {
    int size = 1;
    Node h1 = node;
    Node h2 = node.next;
    h1.next = null;
    while (h2 != null) {
      Node currNode = h2;
      h2 = h2.next;
      currNode.next = h1;
      h1 = currNode;
      size++;
    }
    return new Pair<>(h1, size);
  }

  static Node addData(Node node1, Node node2) {
    int carry = 0;
    Node currNode1 = node1;
    Node currNode2 = node2;
    while (currNode1 != null) {
      int sum = currNode2 == null ? currNode1.data + carry : currNode1.data + carry + currNode2.data;
      carry = sum / 10;
      currNode1.data = sum % 10;
      if (currNode1.next == null && carry > 0) {
        currNode1.next = new Node(carry, null);
        currNode1 = currNode1.next;
        carry = 0;
      }
      currNode1 = currNode1.next;
      currNode2 = currNode2 != null ? currNode2.next : null;
    }
    return node1;
  }

  static Node addLinkedLists(Node node1, Node node2) {
    Pair<Node, Integer> reversedNode1Data = reverseLinkedList(node1);
    Pair<Node, Integer> reversedNode2Data = reverseLinkedList(node2);
    Node ans = reversedNode1Data.getValue() > reversedNode2Data.getValue() ? addData(reversedNode1Data.getKey(), reversedNode2Data.getKey()) :
               addData(reversedNode1Data.getKey(), reversedNode1Data.getKey());
    return reverseLinkedList(ans).getKey();
  }

  public static void main(String[] args) {
    Node node1 = LinkedListUtil.getLinkedList(9);
    Node node2 = LinkedListUtil.getLinkedList(9);
//    Node node1 = new Node(9, new Node(9, new Node(9, new Node(9, new Node(9, null)))));
//    Node node2 = new Node(9, new Node(9, new Node(9, null)));
    LinkedListUtil.printLinkedList(node1);
    LinkedListUtil.printLinkedList(node2);
    Node node = addLinkedLists(node1, node2);
    LinkedListUtil.printLinkedList(node);
  }
}
