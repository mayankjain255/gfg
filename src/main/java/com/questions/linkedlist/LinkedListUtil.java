package com.questions.linkedlist;


import java.util.Random;

import javafx.util.Pair;


public class LinkedListUtil {

  public static Node getLinkedListWithLoop(int size) {
    int counter = 1;
    Node node = new Node(counter, null);
    Node midNode = null;
    Node currentNode = node;
    for (int i = 1; i < size; i++) {
      counter++;
      currentNode.next = new Node(counter, null);
      currentNode = currentNode.next;
      if (size / 2 == i) {
        midNode = currentNode;
        System.out.println("Joining at mid: " + currentNode.data);
      }
    }
    currentNode.next = midNode;
    return node;
  }

  public static Node getCircularLinkedList(int size) {
    int counter = 1;
    Node node = new Node(counter, null);
    Node currentNode = node;
    for (int i = 1; i < size; i++) {
      counter++;
      currentNode.next = new Node(counter, null);
      currentNode = currentNode.next;
    }
    currentNode.next = node;
    return node;
  }

  public static Pair<Node, Node> getLinkedListWithStartAndEnd(int size, int startsWith) {
    int counter = startsWith;
    Node node = new Node(counter, null);
    Node currentNode = node;
    for (int i = 1; i < size; i++) {
      counter++;
      currentNode.next = new Node(counter, null);
      currentNode = currentNode.next;
    }
    return new Pair<>(node, currentNode);
  }

  public static Pair<Node, Node> getLinkedListWithStartAndEnd(int size) {
    return getLinkedListWithStartAndEnd(size, 1);
  }

  public static Node getLinkedList(int size) {
    return getLinkedListWithStartAndEnd(size).getKey();
  }

  public static Node getLinkedList(int size, int startsWith) {
    return getLinkedListWithStartAndEnd(size, startsWith).getKey();
  }

  public static Node getLinkedListRandom(int size) {
    Random random = new Random();
    Node node = new Node(random.nextInt(), null);
    Node currentNode = node;
    for (int i = 1; i < size; i++) {
      currentNode.next = new Node(random.nextInt(), null);
      currentNode = currentNode.next;
    }
    return node;
  }

  public static void printLinkedList(Node node) {
    if (node == null) {
      System.out.println("LinkedList is empty");
    }
    Node currNode = node;
    while (currNode != null) {
      System.out.print("Node: " + currNode.data + ", ");
      currNode = currNode.next;
    }
    System.out.println();
  }


}
