package com.questions.linkedlist;


// Distance Formula 2(x + y) = x + y + z + y ............ x = z
// Reference: https://www.codingninjas.com/blog/2020/09/09/floyds-cycle-detection-algorithm/
public class Ques4 {

  static void removeLoopFromLL(Node node) {
    boolean loopDetected = false;
    Node currNode = node;
    Node futureNode = node;
    while (currNode != null && futureNode != null && futureNode.next != null) {
      if (currNode.next == futureNode.next.next) {
        loopDetected = true;
        break;
      }
      currNode = currNode.next;
      futureNode = futureNode.next.next;
    }
    if (loopDetected) {
      // Checking if our currNode is pointing to head node or you can say loop head is equal to head of LL
      if (node == currNode.next) {
        currNode.next = null;
      }
      else {
        futureNode = node;
        currNode = currNode.next;
        while (futureNode.next != currNode.next) {
          currNode = currNode.next;
          futureNode = futureNode.next;
        }
        currNode.next = null;
      }
    }
    else {
      System.out.println("No Loop Detected so original list is innocent :p ");
    }
  }

  public static void main(String[] args) {
    Node node = LinkedListUtil.getLinkedListWithLoop(7);
//    Node node = LinkedListUtil.getLinkedList(7);
    removeLoopFromLL(node);
    LinkedListUtil.printLinkedList(node);
  }
}
