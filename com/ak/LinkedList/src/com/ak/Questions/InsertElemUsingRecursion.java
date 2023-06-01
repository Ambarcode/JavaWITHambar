package com.ak.Questions;

import com.ak.LinkedList.SinglyLinkedList;

public class InsertElemUsingRecursion {
    //Now we'll look how to insert an element using recursion

    private Node head;
    private Node tail;
    private int size;

    InsertElemUsingRecursion(){
        head=null;
        tail=null;
        size=0;
    }

    //Insert using Recursion

    void insert(int value , int pos){
        head=insertRec(value, pos, head);
    }
      private Node insertRec(int value , int index , Node node){
        if (index==0){
            Node node1=new Node(value,node);
            size++;
            return  node1;
        }
        node.next=insertRec(value,index--,node.next);
        return node;
     }

    private static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
        Node(int value , Node next){
            this.value=value;
            this.next=next;

        }
    }

}
