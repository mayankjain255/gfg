package com.questions.linkedlist;


import javafx.util.Pair;


// Remove Duplicates in a sorted Linked List.
public class Ques6 {

  static void removeDuplicatesFromSortedLL(Node node) {
    Node currNode = node;
    while (currNode != null && currNode.next != null) {
      if (currNode.data == currNode.next.data) {
        currNode.next = currNode.next.next;
      }
      else {
        currNode = currNode.next;
      }
    }
  }

  public static void main(String[] args) {
    Pair<Node, Node> pair = LinkedListUtil.getLinkedListWithStartAndEnd(8);
    Node end = pair.getValue();
    end.next = new Node(9, new Node(9, new Node(9, new Node(9, new Node(10, new Node(11, new Node(11, new Node(11, new Node(11, null)))))))));
    LinkedListUtil.printLinkedList(pair.getKey());
    removeDuplicatesFromSortedLL(pair.getKey());
    LinkedListUtil.printLinkedList(pair.getKey());
  }
}
