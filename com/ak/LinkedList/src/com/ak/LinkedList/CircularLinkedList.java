package com.ak.LinkedList;

public class CircularLinkedList {

    Node head=null;
    Node tail=null;
    int size=0;

    //add first
    public void addFirst(int value){
        Node node =new Node(value);
        if (head==null){
            head=node;
            tail=node;
            node.next=node;
            size+=1;
            return;
        }
        node.next=head;
        head=node;
        tail.next=head;
        size+=1;
    }

    //add last
  public void addLast(int value){
        Node node=new Node(value);
        if (tail==null){ addFirst(value); return;}
        node.next=head;
        tail.next=node;
        tail=node;
        size+=1;
    }

    //display a circular linkedlist
   public void display(){
        Node temp=head;
        if (temp==null) {System.out.println("Empty list"); return;}
        do{
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }while (temp!=head);

       System.out.println(head.value);
    }

    public void delete(int val){
        Node node=head;
        if (node==null) return ;
        else {
            do{
                Node n=node.next;
                if (n.value==val){
                    node.next=n.next;
                    break;
                }
                node=node.next;
            }while (node!=head);
        }
    }
    private static class Node{
        int value;
        Node next;

        public Node(Node next) {
            this.next = next;
        }

        Node (int value) {
            this.value=value;
        }
    }


}
