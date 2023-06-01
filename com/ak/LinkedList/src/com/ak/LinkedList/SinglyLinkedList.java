package com.ak.LinkedList;

public class SinglyLinkedList {

    //Single Side Love

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList(){
        head=null;
        size=0;
    }

    public void insertFirst(int value){
        //method for inserting the node in the starting
        Node node= new Node(value);
        node.next=head;
        head=node;

        //if the tail is empty i.e. it is the first node , then tail will also point to the first node i.e. same as head
        if(tail==null)
            tail=node;

        size+=1;
    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void insertLast(int value){
        Node node=new Node(value);
        if(tail==null){
            insertFirst(value);
        }
        else {
            tail.next=node;
            tail=node;
        }
        size+=1;
    }

    public void insertAtPos(int value , int pos) {
        //here position n means , we will insert the node after position n
        if (pos == 0) {
            insertFirst(value);
        } else if (pos == size) {
            insertLast(value);
        }
        else if(pos>size){
            System.out.println("Specify a valid position");
        }


        else {
            Node node = new Node(value);
            Node temp = head;
            while (pos > 1) {
                temp = temp.next;
                pos--;
            }
            node.next = temp.next;
            temp.next = node;
            size++;
        }
    }

    //Method to remove element from the starting of the linkedlist
    public int delFirst(){
        if (head==null) return -1;
        Node temp=head;
        int val=temp.value;
        head=head.next;
        temp=null;

        if (head==null) tail=null;
        size--;
        return val;
    }

    //Now we'll create a method , which return the reference pointer to that particular index
    Node get(int index){
        Node node =head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public int delLast(){
        if(size<=1) delFirst();
        Node secondLast=get(size-2);
       int val =secondLast.next.value;
       secondLast.next=null;
       tail=secondLast;

       return val;
    }
    //delete at a particular index
    public int delAtIndex(int index){
        if (index==0) delFirst();
        if (index==size-1) delLast();

        Node prev=get(index-1);
        Node curr=prev.next;
        prev.next=curr.next;
        curr.next=null;
        return curr.value;
    }

    //find a node correspond to its value
    Node find(int val){
        Node temp=head;
        while(temp!=null){
            if (temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
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
