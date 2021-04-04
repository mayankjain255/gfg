package com.questions.linkedlist;


// Intersection of two sorted Linked lists
public class Ques11 {

  static Node getIntersectionPoint(Node head1, Node head2) {
    Node head = null;
    Node currNode = null;
    while (head1 != null && head2 != null) {
      if (head1.data == head2.data) {
        if (head == null) {
          head = new Node(head1.data, null);
          currNode = head;
        }
        else {
          currNode.next = new Node(head1.data, null);
          currNode = currNode.next;
        }
        head1 = head1.next;
        head2 = head2.next;
      }
      else if (head1.data > head2.data) {
        head2 = head2.next;
      }
      else {
        head1 = head1.next;
      }
    }
    return head;
  }

  public static void main(String[] args) {
    Node node1 = LinkedListUtil.getLinkedList(8, 3);
    LinkedListUtil.printLinkedList(node1);
    Node node2 = LinkedListUtil.getLinkedList(16, 1);
    LinkedListUtil.printLinkedList(node2);
    Node node = getIntersectionPoint(node1, node2);
    LinkedListUtil.printLinkedList(node);

  }

}
