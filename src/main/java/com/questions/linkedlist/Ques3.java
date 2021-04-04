package com.questions.linkedlist;


// 	Write a program to Detect loop in a linked list.
public class Ques3 {

  static boolean isLLContainsLoop(Node node) {
    Node currNode = node;
    Node futureNode = node;

    while (currNode != null && futureNode != null && futureNode.next != null) {
      currNode = currNode.next;
      futureNode = futureNode.next.next;
      // If both pointer will be at same position then it means we have a loop in LL
      if (currNode == futureNode) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
//    Node node = LinkedListUtil.getLinkedListWithLoop(5);
    Node node = LinkedListUtil.getLinkedList(5);
    System.out.println("IsLoop present:" + isLLContainsLoop(node));
  }
}
