package com.questions.linkedlist;


public class DLLNode {

  DLLNode previous;
  int data;
  DLLNode next;

  public DLLNode(DLLNode previous, int data, DLLNode next) {
    this.previous = previous;
    this.data = data;
    this.next = next;
  }
  
}
