package com.ak.LinkedList;

public class DoublyLinkedList {
    Node head;
    int size;

    public void insertFirst(int value){
        Node node =new Node(value);
        node.prev=null;
        node.next=head;
        if (head!=null) head.prev=node;
        head=node;
        size+=1;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value + " -> "  );
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void revDisplay(){
        Node temp=head;
        while(temp.next!=null) temp=temp.next;

        //now temp will point to the last node
        while (temp.prev!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.prev;
        }
        System.out.println("START");
    }

    public void insertLast(int value) {
        Node node = new Node(value);

        //for inserting the last element , we require a pointer pointing to the last element;
        Node tail = head;

        //but before this we have to check whether our linkedlist is empty or not
        if (tail == null)
            insertFirst(value);
        else {
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next=node;
            node.prev=tail;
            node.next=null;
        }
        size+=1;
        }

        public void insertAtPos(int value , int pos){
          if(pos==0) {insertFirst(value); return;}
          if(pos==size-1){insertLast(value); return;}

          if(pos<size) {
              Node temp=head;
              while (pos>1){
                  temp=temp.next;
                  pos--;
              }
              Node node = new Node(value);
              node.next = temp.next;
              node.prev = temp;
              temp.next = node;

              node.next.prev = node; //it will not give null pointer exception as we had already covered this case
          }
          else {
              System.out.println("Enter a valid position");
          }
        }
    private class Node{
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node prev, Node next) {
            this.prev = prev;
            this.next = next;
        }
    }
    }


